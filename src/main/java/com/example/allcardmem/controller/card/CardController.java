package com.example.allcardmem.controller.card;

import com.example.allcardmem.model.card.Card;
import com.example.allcardmem.repository.card.CardRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/card")
public class CardController {
    CardRepository cardRepository;

    @GetMapping
    public List<Card> list(){
        return cardRepository.findAll();
    }
    @GetMapping("/{id}")
    public Card getId(@PathVariable Long id){
        return cardRepository.getOne(id);
    }
    @PostMapping
    public Card addCard(@RequestBody Card card){
        return cardRepository.save(card);
    }
    @PutMapping("/{id}")
    public Card update(@PathVariable Long id, @RequestBody Card newCard) {
        Card oldCard = cardRepository.getById(id);
        oldCard.setName(newCard.getName());
        oldCard.setExpirationMonth(newCard.getExpirationMonth());
        oldCard.setExpirationYear(newCard.getExpirationYear());
        return cardRepository.save(oldCard);
    }
    @DeleteMapping("/{id}")
    public String deleteId(@PathVariable Long id){
        cardRepository.deleteById(id);
        return "Delete id" + id;
    }
    @DeleteMapping
    public String deleteAll(){
        cardRepository.deleteAll();
        return "Delete all";
    }
}