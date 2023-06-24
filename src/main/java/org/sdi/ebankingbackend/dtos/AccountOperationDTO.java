package org.sdi.ebankingbackend.dtos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sdi.ebankingbackend.entities.AccountOperation;
import org.sdi.ebankingbackend.entities.BankAccount;
import org.sdi.ebankingbackend.enums.OperationType;

import java.util.Date;
import java.util.List;


@Data
public class AccountOperationDTO {
    private Long id;
    private Date operationDate;
    private double amount;
    private OperationType type;




}
