package com.epam.rd.autocode.startegy.cards;

public class CardDealingStrategies {
    public static CardDealingStrategy texasHoldemCardDealingStrategy() {
        return new TexasHoldem();
    }

    public static CardDealingStrategy classicPokerCardDealingStrategy() {
        return new ClassicPoker();
    }

    public static CardDealingStrategy bridgeCardDealingStrategy(){
        return new Bridge();
    }

    public static CardDealingStrategy foolCardDealingStrategy(){
        return new Fool();
    }

}
