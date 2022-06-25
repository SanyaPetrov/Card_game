import java.util.ArrayList;
import java.util.Collections;

public class Deck extends Card {

    final private int defaultPlayerCardCount = 6;
    ArrayList<Card> cardDeck = new ArrayList<>();
    ArrayList<Card> firstPlayerHand = new ArrayList<>();
    ArrayList<Card> secondPlayerHand = new ArrayList<>();
    ArrayList<Card> thirdPlayerHand = new ArrayList<>();
    ArrayList<Card> fourthPlayerHand = new ArrayList<>();
    ArrayList<Card> fifthPlayerHand = new ArrayList<>();
    ArrayList<Card> sixthPlayerHand = new ArrayList<>();

    public Deck()
    {
        int[] types = new int[] {Card.HEARTS, Card.PEAKS, Card.SQUARE, Card.CROSSES};
        int[] ranks = new int[] {Card.SIX, Card.SEVEN, Card.EIGHT, Card.NINE, Card.TEN, Card.JACK, Card.QUEEN, Card.KING, Card.ACE};
        for (int type : types) {
            for (int rank : ranks) {
                cardDeck.add(new Card(type, rank));
            }
        }
        System.out.println(cardDeck.toString());
    }

    public void Shuffle() {
        Collections.shuffle(cardDeck);
        System.out.println("Перемешенная колода: " + cardDeck.toString());
    }

    public void Deal (int playersCount) {
        if (playersCount < 0 || playersCount > 6) {
            throw new IllegalArgumentException("Количество игроков должно быть от 1 до 6!");
        }
        switch (playersCount) {
            case (1):{
                while (firstPlayerHand.size() < 6) {
                    firstPlayerHand.add(cardDeck.get(cardDeck.size() - 1));
                    cardDeck.remove(cardDeck.size() - 1);
                }
                System.out.println("Карты первого игрока: " + firstPlayerHand.toString());
            }
            case (2):{
                while (firstPlayerHand.size() < 6 & secondPlayerHand.size() < 6) {
                    firstPlayerHand.add(cardDeck.get(cardDeck.size() - 1));
                    cardDeck.remove(cardDeck.size() - 1);
                    secondPlayerHand.add(cardDeck.get(cardDeck.size() - 1));
                    cardDeck.remove(cardDeck.size() - 1);
                }
                System.out.println("Карты первого игрока: " + firstPlayerHand.toString());
                System.out.println("Карты второго игрока: " + secondPlayerHand.toString());
            }
            case (3):{
                while (firstPlayerHand.size() < 6 & secondPlayerHand.size() < 6 & thirdPlayerHand.size() < 6) {
                    firstPlayerHand.add(cardDeck.get(cardDeck.size() - 1));
                    cardDeck.remove(cardDeck.size() - 1);
                    secondPlayerHand.add(cardDeck.get(cardDeck.size() - 1));
                    cardDeck.remove(cardDeck.size() - 1);
                    thirdPlayerHand.add(cardDeck.get(cardDeck.size() - 1));
                    cardDeck.remove(cardDeck.size() - 1);
                }
                System.out.println("Карты первого игрока: " + firstPlayerHand.toString());
                System.out.println("Карты второго игрока: " + secondPlayerHand.toString());
                System.out.println("Карты третьего игрока " + thirdPlayerHand.toString());
            }
        }


    }


}
