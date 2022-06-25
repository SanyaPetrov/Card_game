import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Card {

    final static int HEARTS = 0;
    final static int PEAKS = 1;
    final static int SQUARE = 2;
    final static int CROSSES = 3;
    private static final String[] types = new String[]{"HEARTS", "PEAKS", "SQUARE", "CROSSES"};

    final static int SIX = 10;
    final static int SEVEN = 11;
    final static int EIGHT = 12;
    final static int NINE = 13;
    final static int TEN = 14;
    final static int JACK = 15;
    final static int QUEEN = 16;
    final static int KING = 17;
    final static int ACE = 18;
    private static final String[] ranks = new String[]{"6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    private int type;
    private int rank;

    public Card() {};

    public Card (int type, int value) {
        if ((type < 0 || type > 3) || (value < 10 || value > 18)) {
            throw new IllegalArgumentException("Неверные параметры масти или ранга карт!");
        }
        this.type = type;
        this.rank = value;
    }

    public int getType() {
        return type;
    }

    public int getValue() {
        return rank;
    }

    @Override
    public String toString () {
        return types[type] + " " + ranks[rank - 10];
    }


    public static void main(String[] args) {
        Deck newDeck = new Deck();
        newDeck.Shuffle();
        newDeck.Deal(7);
    }
}

