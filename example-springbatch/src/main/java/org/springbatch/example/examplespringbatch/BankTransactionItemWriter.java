package org.springbatch.example.examplespringbatch;

import org.springbatch.example.examplespringbatch.dao.BankTransactionRepository;
import org.springbatch.example.examplespringbatch.models.BankTransaction;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BankTransactionItemWriter implements ItemWriter<BankTransaction> {

    @Autowired
    BankTransactionRepository bankTransactionRepository;

    @Override
    public void write(List<? extends BankTransaction> list) throws Exception {
        bankTransactionRepository.saveAll(list);
    }

}
