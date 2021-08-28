package com.example.allcardmem.model.cardholder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardHolder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String memberId;
    private String cardNumber;
}