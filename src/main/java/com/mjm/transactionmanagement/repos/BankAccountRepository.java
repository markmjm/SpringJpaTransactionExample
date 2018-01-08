package com.mjm.transactionmanagement.repos;

import com.mjm.transactionmanagement.entities.BankAccount;
import org.springframework.data.repository.CrudRepository;

public interface BankAccountRepository extends CrudRepository<BankAccount, Integer> {
}
