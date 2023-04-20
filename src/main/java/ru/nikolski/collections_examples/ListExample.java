package ru.nikolski.collections_examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
  private List<Card> cards;
  
  public ListExample(){
    cards = new ArrayList<Card>();
  }
  
  public void add(Card card) {
    cards.add(card);
  }

  public Card getByCardNumber(String cardNumber){
    for (Card card : cards) {
      if (card.getCardNumber().equals(cardNumber)) return card;
    }
    return null;
  }

  public void deleteByOwner(String owner){

    Iterator<Card> cardIterator = cards.iterator();
    while (cardIterator.hasNext()) {
      Card nextCard =  cardIterator.next();
      if (nextCard.getOwner().equals(owner)) cardIterator.remove();
    }

  }

  
}
