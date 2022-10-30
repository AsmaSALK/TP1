package org.openlab.openlabcustomerservice.services;

import lombok.AllArgsConstructor;
import org.openlab.openlabcustomerservice.dto.CustomerRequestDTO;
import org.openlab.openlabcustomerservice.dto.CustomerResponseDTO;
import org.openlab.openlabcustomerservice.entities.Customer;
import org.openlab.openlabcustomerservice.mappers.CustomerMapper;
import org.openlab.openlabcustomerservice.repositories.CustomerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Transactional @AllArgsConstructor
public class CustomerServiceImpl implements CustomerService{
    private CustomerRepository customerRepository;
    private CustomerMapper customerMapper;
    @Override
    public CustomerResponseDTO save(CustomerRequestDTO customerRequestDTO) {
        Customer customer=customerMapper.customerRequestDTOToCustomer(customerRequestDTO);
        Customer savedCutomer =customerRepository.save(customer);

        CustomerResponseDTO customerResponseDTO =customerMapper.customerToCustomerResponseDTO(savedCutomer);

        return customerResponseDTO;
    }

    @Override
    public CustomerResponseDTO getCustomer(String id) {
        Customer customer =customerRepository.findById(id).get();
        return customerMapper.customerToCustomerResponseDTO(customer);
    }

    @Override
    public CustomerResponseDTO update(CustomerRequestDTO customerRequestDTO) {
        Customer customer=customerMapper.customerRequestDTOToCustomer(customerRequestDTO);
        Customer updatedCustomer=customerRepository.save(customer);
        return customerMapper.customerToCustomerResponseDTO(updatedCustomer);
    }

    @Override
    public List<CustomerResponseDTO> listCustomers() {
        List <Customer> customers=customerRepository.findAll();
        List<CustomerResponseDTO> customerResponseDTOS=customers.stream()
                .map(cust->customerMapper.customerToCustomerResponseDTO(cust))
                .collect(Collectors.toList());
        return customerResponseDTOS;
    }
}
