package com.example.ensetbillingservice.mappers;

import com.example.ensetbillingservice.dto.InvoiceRequestDTO;
import com.example.ensetbillingservice.dto.InvoiceResponseDTO;
import com.example.ensetbillingservice.entities.Invoice;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InvoiceMapper {
    Invoice fromInvoiceDTO(InvoiceRequestDTO invoiceRequestDTO);
    InvoiceResponseDTO fromInvoice(Invoice invoice);

}
