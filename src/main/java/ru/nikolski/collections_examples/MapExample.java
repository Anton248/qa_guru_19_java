package ru.nikolski.collections_examples;

import java.util.*;

public class MapExample {

    private HashMap<String, Card> cards;

    public MapExample() {
        cards = new HashMap<String, Card>();
    }

    public void addCard (Card card){
        cards.put(card.getCardNumber(), card);
    }

    public List<Card> getCardsByOwner(String owner) {
        ArrayList<Card> cardList = new ArrayList<>();
        for (Map.Entry<String, Card> entry : cards.entrySet()) {
            if (entry.getValue().getOwner().equals(owner)) {
                cardList.add(entry.getValue());
            }
        }
        return cardList;
    }

    public void deleteByOwner(String owner) {
        Iterator<Map.Entry<String, Card>> cardsIterator = cards.entrySet().iterator();
        while (cardsIterator.hasNext()) {
            Map.Entry<String, Card> card = cardsIterator.next();
            if (card.getValue().getOwner().equals(owner)) cardsIterator.remove();
        }
    }




}
