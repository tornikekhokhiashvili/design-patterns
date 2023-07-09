package com.epam.rd.autocode.startegy.cards;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Fool implements CardDealingStrategy{
    @Override
    public Map<String, List<Card>> dealStacks(Deck deck, int players) {
        Map<String, List<Card>> map = new TreeMap<>();
        for (int i = 1; i <= players; i++) {
            List<Card> list = new LinkedList<>();
            list.add(deck.dealCard());
            map.put("Player " + i, list);
        }
        for (int j = 0; j < 5; j++) {
            for (int i = 1; i <= players; i++) {
                List<Card> list = map.get("Player " + i);
                list.add(deck.dealCard());
                map.put("Player " + i, list);
            }
        }
        List<Card> trump = new LinkedList<>();
        trump.add(deck.dealCard());
        map.put("Trump card", trump);
        map.put("Remaining", deck.restCards());
        return map;
    }
}
