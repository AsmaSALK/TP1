package com.example.ensetbillingservice.services;

import com.example.ensetbillingservice.dto.InvoiceRequestDTO;
import com.example.ensetbillingservice.dto.InvoiceResponseDTO;

import java.util.List;

public interface InvoiService {
     InvoiceResponseDTO save(InvoiceRequestDTO invoiceRequestDTO);
     InvoiceResponseDTO getInvoice(String invoiceId);
     List<InvoiceResponseDTO> invoiceByCustomerId(String customerId);
     List<InvoiceResponseDTO> allInvoices();

}
