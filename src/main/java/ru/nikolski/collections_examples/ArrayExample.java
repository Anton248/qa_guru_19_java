package ru.nikolski.collections_examples;

public class ArrayExample {
  Card[] cards;
  
  public ArrayExample(int size) {
    cards = new Card[size];
  }
  
  public Card getByOwner(String owner) {
    Card card = null;
    for (int i=0; i < cards.length; i++) {
      if (cards[i].getOwner.equeals(owner)) {
        card = cards[i].getOwner();
        break;
      }
    }
    return card;
  }
  
}
