package com.example.ensetbillingservice;

import com.example.ensetbillingservice.dto.InvoiceRequestDTO;
import com.example.ensetbillingservice.services.InvoiService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
@EnableFeignClients
public class EnsetBillingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnsetBillingServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(InvoiService invoiService){
        return args -> {
            invoiService.save(new InvoiceRequestDTO(BigDecimal.valueOf(98000),"C01"));
            invoiService.save(new InvoiceRequestDTO(BigDecimal.valueOf(54300),"C01"));
            invoiService.save(new InvoiceRequestDTO(BigDecimal.valueOf(12300),"C02"));
        };
    }

}
