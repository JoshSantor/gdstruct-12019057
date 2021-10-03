package com.joshsantor;

import java.util.Objects;

public class Cards {
    private String cardName;
    private String cardType;

    public Cards(String cardName, String cardType) {
        this.cardName = cardName;
        this.cardType = cardType;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return
                "Card Name : " + cardName +
                ", Card Type : " + cardType
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cards cards = (Cards) o;
        return Objects.equals(cardName, cards.cardName) && Objects.equals(cardType, cards.cardType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardName, cardType);
    }
}
