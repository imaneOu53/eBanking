package org.sdi.ebankingbackend.dtos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sdi.ebankingbackend.entities.AccountOperation;
import org.sdi.ebankingbackend.entities.BankAccount;
import org.sdi.ebankingbackend.entities.Customer;
import org.sdi.ebankingbackend.enums.AccountStatus;

import java.util.Date;
import java.util.List;

 @Data
public class SavingBankAccountDTO extends BankAccountDTO {

    private String id;
    private double balance;
    private Date createdAt;
    private AccountStatus status;
    private CustomerDTO customerDTO;
    private double interestRate;

}
