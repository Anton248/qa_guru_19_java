package ru.nikolski.collections_examples;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetExample {
    LinkedHashSet<Card> cards;

    public SetExample() {
        cards = new LinkedHashSet<Card>();
    }

    public void addCard(Card card){
        cards.add(card);
    }

    public void printAnyFirstCardAndAllFirstCardsByOwner(String owner){

        Iterator<Card> cardsIterator = cards.iterator();
        Card card;
        do {
            card = cardsIterator.next();
            System.out.println(card.getCardNumber() + " : " + card.getOwner());
        } while (card.getOwner().equals(owner));

    }
}
