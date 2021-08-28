package com.example.allcardmem.repository.cardholder;

import com.example.allcardmem.model.cardholder.CardHolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardHolderRepository extends JpaRepository<CardHolder, Long> {
}