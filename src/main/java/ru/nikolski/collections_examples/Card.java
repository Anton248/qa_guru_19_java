package ru.nikolski.collections_examples;

public class Card {
  private String accountNumber;
  private String cardSystem;
  private String owner;
  private String cardNumber;
  private String cvv;

  public Card(String accountNumber, String cardSystem, String owner, String cardNumber, String cvv) {
    this.accountNumber = accountNumber;
    this.cardSystem = cardSystem;
    this.owner = owner;
    this.cardNumber = cardNumber;
    this.cvv = cvv;
  }

  public String getAccountNumber(){
  return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getCardSystem() {
    return cardSystem;
  }

  public void setCardSystem(String cardSystem) {
    this.cardSystem = cardSystem;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public String getCvv() {
    return cvv;
  }

  public void setCvv(String cvv) {
    this.cvv = cvv;
  }
}
