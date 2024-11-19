package com.Banking.BankingDB.Repository;

import com.Banking.BankingDB.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
