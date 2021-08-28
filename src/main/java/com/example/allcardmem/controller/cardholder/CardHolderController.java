package com.example.allcardmem.controller.cardholder;

import com.example.allcardmem.model.card.Card;
import com.example.allcardmem.model.cardholder.CardHolder;
import com.example.allcardmem.repository.cardholder.CardHolderRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/cardholder")
public class CardHolderController {
    CardHolderRepository cardHolderRepository;

    @GetMapping
    public List<CardHolder> list(){
        return cardHolderRepository.findAll();
    }
    @GetMapping("/{id}")
    public CardHolder getId(@PathVariable Long id){
        System.out.println("!!!!" + id);
        return cardHolderRepository.getById(4L);
    }
    @PostMapping
    public CardHolder addCardHolder(@RequestBody CardHolder cardHolder){
       return cardHolderRepository.save(cardHolder);
    }

    @PutMapping("/{id}")
    public CardHolder update(@PathVariable Long id, @RequestBody CardHolder newCardHolder) {
        CardHolder oldCardHolder = cardHolderRepository.getById(id);
        oldCardHolder.setCardNumber(newCardHolder.getCardNumber());
        oldCardHolder.setMemberId(newCardHolder.getMemberId());

        return cardHolderRepository.save(oldCardHolder);
    }
    @DeleteMapping("/{id}")
    public String deleteId(@PathVariable Long id){
        cardHolderRepository.deleteById(id);
        return "Delete = " + id;
    }
    @DeleteMapping
    public String deleteAll(){
        cardHolderRepository.deleteAll();
        return "Delete all";
    }


}
