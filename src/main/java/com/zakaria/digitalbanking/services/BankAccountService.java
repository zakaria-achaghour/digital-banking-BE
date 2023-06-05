package com.zakaria.digitalbanking.services;

import com.zakaria.digitalbanking.dtos.*;
import com.zakaria.digitalbanking.exceptions.BalanceNotSufficientException;
import com.zakaria.digitalbanking.exceptions.BankAccountNotFoundException;
import com.zakaria.digitalbanking.exceptions.CustomerNotFoundException;

import java.util.List;
import java.util.UUID;

public interface BankAccountService {
    CustomerDTO saveCustomer(CustomerDTO customerDTO);
    CurrentBankAccountDTO saveCurrentBankAccount(double initialBalance, double overDraft, UUID customerId) throws CustomerNotFoundException;
    SavingBankAccountDTO saveSavingBankAccount(double initialBalance, double interestRate, UUID customerId) throws CustomerNotFoundException;
    List<CustomerDTO> listCustomers();
    List<CustomerDTO> searchCustomers(String keyword);
    BankAccountDTO getBankAccount(UUID accountId) throws BankAccountNotFoundException;
    void debit(UUID accountId, double amount, String description) throws BankAccountNotFoundException, BalanceNotSufficientException;
    void credit(UUID accountId, double amount, String description) throws BankAccountNotFoundException;
    void transfer(UUID accountIdSource, UUID accountIdDestination, double amount) throws
            BankAccountNotFoundException, BalanceNotSufficientException;
    List<BankAccountDTO> bankAccountList();
    CustomerDTO getCustomer(UUID customerId) throws CustomerNotFoundException;
    CustomerDTO updateCustomer(CustomerDTO customerDTO);
    void deleteCustomer(UUID customerId);
    List<AccountOperationDTO> accountHistory(UUID accountId);
    AccountHistoryDTO getAccountHistory(UUID accountId, int page, int size) throws BankAccountNotFoundException;

}
