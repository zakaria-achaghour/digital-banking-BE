package com.zakaria.digitalbanking.dtos;

import com.zakaria.digitalbanking.enums.OperationType;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class AccountOperationDTO {

    private UUID id;
    private Date operationDate;
    private double amount;
    private OperationType type;
    private String description;
}
