package com.zakaria.digitalbanking.dtos;

import lombok.Data;

import java.util.UUID;

@Data
public class RequestCurrentAccount {

    private UUID customerId;
    private double balance;
    private double overDraft;
}
