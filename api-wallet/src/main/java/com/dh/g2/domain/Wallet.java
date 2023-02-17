package com.dh.g2.domain;

import com.dh.g2.domain.enums.DocumentType;
import lombok.Builder;
import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "wallets")
@Value
@Builder
public class Wallet {

    @Id
    @Column(unique = true)
    String documentNumber;
    DocumentType documentType;

    String coinCode;

}
