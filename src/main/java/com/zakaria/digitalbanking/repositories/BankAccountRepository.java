package com.zakaria.digitalbanking.repositories;

import com.zakaria.digitalbanking.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BankAccountRepository extends JpaRepository<BankAccount, UUID> {
}
