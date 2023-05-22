package com.zakaria.digitalbanking.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Customer {

    @Id
    private UUID id;
    private String name;
    private Date birthDate;
    private String email;
    private Date createdAt;
    @OneToMany(mappedBy = "customer")
    private List<BankAccount> bankAccounts;
}
