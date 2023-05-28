package com.zakaria.digitalbanking.dtos;

import com.zakaria.digitalbanking.enums.AccountStatus;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class CurrentBankAccountDTO extends BankAccountDTO {

    private UUID id;
    private double balance;
    private Date createdAt;
    private AccountStatus status;
    private CustomerDTO customerDTO;
    private double overDraft;
}
