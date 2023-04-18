package ru.nikolski.collections_examples;

public class ListExample {
  private List<Card> cards;
  
  public ListExample(){
    cards = new ArrayList<Card>();
  }
  
  public void put(Card card) {
    cards.put(card);
  }
  
}
