package com.example.allcardmem.repository.card;

import com.example.allcardmem.model.card.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}