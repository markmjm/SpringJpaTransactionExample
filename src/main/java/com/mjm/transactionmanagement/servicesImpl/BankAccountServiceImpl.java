package com.mjm.transactionmanagement.servicesImpl;


import com.mjm.transactionmanagement.entities.BankAccount;
import com.mjm.transactionmanagement.repos.BankAccountRepository;
import com.mjm.transactionmanagement.servicesInft.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BankAccountServiceImpl implements BankAccountService{

    @Autowired
    private BankAccountRepository repository;

    @Override
    @Transactional
    public void transfer(int amount) {
        BankAccount clientAccount1 = repository.findOne(1);
        clientAccount1.setBal(clientAccount1.getBal() - amount);
        repository.save(clientAccount1);

        BankAccount clientAccount2 = repository.findOne(2);
        clientAccount2.setBal(clientAccount2.getBal() + amount);
        repository.save(clientAccount2);
    }
}
