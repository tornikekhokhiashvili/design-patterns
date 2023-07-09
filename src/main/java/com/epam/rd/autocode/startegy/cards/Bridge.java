package com.epam.rd.autocode.startegy.cards;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Bridge implements CardDealingStrategy {
    @Override
    public Map<String, List<Card>> dealStacks(Deck deck, int players) {
        Map<String, List<Card>> map = new TreeMap<>();
        for (int i = 1; i <= players; i++) {
            List<Card> list = new LinkedList<>();
            list.add(deck.dealCard());
            map.put("Player " + i, list);
        }
        for (int j = 0; j < 12; j++) {
            for (int i = 1; i <= players; i++) {
                List<Card> list = map.get("Player " + i);
                list.add(deck.dealCard());
                map.put("Player " + i, list);
            }
        }
        return map;
    }
}
