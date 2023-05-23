package com.zakaria.digitalbanking.mappers;

import com.zakaria.digitalbanking.dtos.CustomerDTO;
import com.zakaria.digitalbanking.entities.Customer;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerMapper {
    private ModelMapper modelMapper;
    public CustomerDTO fromCustomer(Customer customer) {
        return modelMapper.map(customer, CustomerDTO.class);
    }
    public Customer fromCustomerDto(CustomerDTO customerDTO) {
        return modelMapper.map(customerDTO, Customer.class);
    }
}
