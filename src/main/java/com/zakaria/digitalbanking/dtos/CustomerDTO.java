package com.zakaria.digitalbanking.dtos;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class CustomerDTO {

    private UUID id;
    private String name;
    private String email;
    private Date birthDate;
}
