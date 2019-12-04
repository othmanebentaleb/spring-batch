package org.springbatch.example.examplespringbatch.dao;

import org.springbatch.example.examplespringbatch.models.BankTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankTransactionRepository extends JpaRepository<BankTransaction, Long> {
}
