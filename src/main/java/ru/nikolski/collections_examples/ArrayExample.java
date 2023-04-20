package ru.nikolski.collections_examples;

public class ArrayExample {
  Card[] cards;
  
  public ArrayExample(int size) {
    cards = new Card[size];
  }
  
  public Card getByCardNumber(String cardNumber) {
    for (int i=0; i < cards.length; i++) {
      if (cards[i].getCardNumber().equals(cardNumber)) {
        return cards[i];
      }
    }
    return null;
  }


}
