package com.Banking.BankingDB.Dto;

import lombok.*;

@Data
@AllArgsConstructor
public class AccountDto {
    private Long id;
    private String accountHolderName;
    private double balance;
}
