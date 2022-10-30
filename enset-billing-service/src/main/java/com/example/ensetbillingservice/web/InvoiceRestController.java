package com.example.ensetbillingservice.web;

import com.example.ensetbillingservice.dto.InvoiceRequestDTO;
import com.example.ensetbillingservice.dto.InvoiceResponseDTO;
import com.example.ensetbillingservice.services.InvoiService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class InvoiceRestController {
    private InvoiService invoiService;

    public InvoiceRestController(InvoiService invoiService) {
        this.invoiService = invoiService;
    }
    @GetMapping(path = "/invoices/{id}")
    public InvoiceResponseDTO getInvoice( @PathVariable(name = "id") String invoiceId){
        return invoiService.getInvoice(invoiceId);

    }
    @GetMapping(path = "/invoicesByCustomer/{customerId}")
    public List<InvoiceResponseDTO> getInvoicesByCustomer(@PathVariable String customerId){
        return invoiService.invoiceByCustomerId(customerId);
    }

    @PostMapping(path = "/invoices")
    public InvoiceResponseDTO save(@RequestBody InvoiceRequestDTO invoiceRequestDTO){
        return invoiService.save(invoiceRequestDTO);
    }
    @GetMapping(path = "/invoices")
    public List<InvoiceResponseDTO> allInvoices(){
        return invoiService.allInvoices();
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity exceptionHundler(Exception e){
        return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
