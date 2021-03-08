package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Card {
        private Suit suit;
        private Value value;

        public Card(Suit suit, Value value) {
            this.suit = suit;
            this.value = value;
        }
        public static void main(String[] args) {
        //Stream<Suit> suitStream = Stream.of(Suit.values());
        //Stream<Value> valueStream = Stream.of(Value.values());
        List<Card> cards = Stream.of(Suit.values())
                .flatMap(s -> Stream.of(Value.values()).map((v) -> new Card(s, v)))
                .collect(Collectors.toList());
            System.out.println(cards.toString());
        }

    @Override
    public String toString() {
        return suit + " "
                + value;
    }
}
