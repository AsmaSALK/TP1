package com.example.ensetbillingservice.mappers;

import com.example.ensetbillingservice.dto.InvoiceRequestDTO;
import com.example.ensetbillingservice.dto.InvoiceResponseDTO;
import com.example.ensetbillingservice.entities.Invoice;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-30T18:22:33+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18.0.1.1 (Oracle Corporation)"
)
@Component
public class InvoiceMapperImpl implements InvoiceMapper {

    @Override
    public Invoice fromInvoiceDTO(InvoiceRequestDTO invoiceRequestDTO) {
        if ( invoiceRequestDTO == null ) {
            return null;
        }

        Invoice invoice = new Invoice();

        invoice.setAmount( invoiceRequestDTO.getAmount() );
        invoice.setCustomerId( invoiceRequestDTO.getCustomerId() );

        return invoice;
    }

    @Override
    public InvoiceResponseDTO fromInvoice(Invoice invoice) {
        if ( invoice == null ) {
            return null;
        }

        InvoiceResponseDTO invoiceResponseDTO = new InvoiceResponseDTO();

        invoiceResponseDTO.setId( invoice.getId() );
        invoiceResponseDTO.setDate( invoice.getDate() );
        invoiceResponseDTO.setAmount( invoice.getAmount() );
        invoiceResponseDTO.setCustomer( invoice.getCustomer() );

        return invoiceResponseDTO;
    }
}
