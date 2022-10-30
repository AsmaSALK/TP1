package com.example.ensetbillingservice.services;

import com.example.ensetbillingservice.CustomerNotFoindException;
import com.example.ensetbillingservice.dto.InvoiceRequestDTO;
import com.example.ensetbillingservice.dto.InvoiceResponseDTO;
import com.example.ensetbillingservice.entities.Customer;
import com.example.ensetbillingservice.entities.Invoice;
import com.example.ensetbillingservice.mappers.InvoiceMapper;
import com.example.ensetbillingservice.openfeign.CustomerRestClient;
import com.example.ensetbillingservice.repository.InvoiceRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Transactional
public class InvoiServiceImpl implements InvoiService {

    private InvoiceRepository invoiceRepository;
    private InvoiceMapper invoiceMapper;
    private CustomerRestClient customerRestClient;

    public InvoiServiceImpl(InvoiceRepository invoiceRepository, InvoiceMapper invoiceMapper, CustomerRestClient customerRestClient) {
        this.invoiceRepository = invoiceRepository;
        this.invoiceMapper = invoiceMapper;
        this.customerRestClient = customerRestClient;
    }

    @Override
    public InvoiceResponseDTO save(InvoiceRequestDTO invoiceRequestDTO) {
          /*
        verification des l'integrité referenciel Invoice/Customer
         */
        Customer customer=null;
        try {
            customer=customerRestClient.getCustomer(invoiceRequestDTO.getCustomerId());
        }catch (Exception e) {
            throw new CustomerNotFoindException("Customer not found");
        }
        Invoice invoice=invoiceMapper.fromInvoiceDTO(invoiceRequestDTO);
        invoice.setId(UUID.randomUUID().toString());
        invoice.setDate(new Date());

        Invoice savedInvoice=invoiceRepository.save(invoice);
        savedInvoice.setCustomer(customer);
        return invoiceMapper.fromInvoice(savedInvoice);
    }

    @Override
    public InvoiceResponseDTO getInvoice(String invoiceId) {
        Invoice invoice=invoiceRepository.findById(invoiceId).get();
        Customer customer=customerRestClient.getCustomer(invoice.getCustomerId());
        invoice.setCustomer(customer);
        return invoiceMapper.fromInvoice(invoice);
    }

    @Override
    public List<InvoiceResponseDTO> invoiceByCustomerId(String customerId) {
        List<Invoice> invoices=invoiceRepository.findByCustomerId(customerId);
        for (Invoice invoice:invoices) {
            Customer customer=customerRestClient.getCustomer(invoice.getCustomerId());
            invoice.setCustomer(customer);
        }
        return invoices
                .stream()
                .map(invoice -> invoiceMapper.fromInvoice(invoice))
                .collect(Collectors.toList());
    }

    @Override
    public List<InvoiceResponseDTO> allInvoices() {
        List<Invoice> invoices=invoiceRepository.findAll();
        for (Invoice invoice:invoices) {
            Customer customer=customerRestClient.getCustomer(invoice.getCustomerId());
            invoice.setCustomer(customer);
        }
        return invoices
                .stream()
                .map(invoice -> invoiceMapper.fromInvoice(invoice))
                .collect(Collectors.toList());
    }
}













