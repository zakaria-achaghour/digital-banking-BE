package com.zakaria.digitalbanking.repositories;

import com.zakaria.digitalbanking.entities.AccountOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface AccountOperationRepository extends JpaRepository<AccountOperation, UUID> {
    List<AccountOperation> findByBankAccountId(UUID accountId);
    Page<AccountOperation> findByBankAccountIdOOrderByDateOperationDesc(UUID accountId, Pageable pageable);
}
