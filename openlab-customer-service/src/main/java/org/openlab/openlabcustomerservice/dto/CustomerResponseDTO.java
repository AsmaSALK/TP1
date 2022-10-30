package org.openlab.openlabcustomerservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
@Data
@NoArgsConstructor @AllArgsConstructor
public class CustomerResponseDTO {

    private String id;
    private String name;
    private String email;
}
