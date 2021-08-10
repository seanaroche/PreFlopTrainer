package App;

public class Deck {
    private final int cardsPerPlayer = 2;
    private String[] suits = {
        "Clubs", "Diamonds", "Hearts", "Spades"
    };
    private String[] cardValues = {
        "2", "3", "4", "5", "6", "7", "8", "9", "T",
        "J", "Q", "K", "A"
    };
    private int deckSize = suits.length * cardValues.length;
    private int[] deck = new int[deckSize];
    private String hand_final = "";

    public void initializeDeck() {
        for (int i = 0; i < deckSize; i++) {
            deck[i] = i;
        }
    }
    
    public void shuffleDeck() {
        for (int i = 0; i < deckSize; i++) {
            int card = i + (int) (Math.random() * (deckSize-i));
            int temp = deck[i];
            deck[i] = deck[card];
            deck[card] = temp;
        }
    }

    public int[] getDeck() {
        return deck;
    }

    public void initializeHand() {
        String suit_one = "";
        String suit_two = "";
        String value_one = "";
        String value_two = "";

        for (int i = 0; i < cardsPerPlayer; i++) {
            String suit = suits[deck[i] / 13];
            String value = cardValues[deck[i] % 13];
            if (i == 0) {
                suit_one = suit;
                value_one = value;
            }
            if (i == 1) {
                suit_two = suit;
                value_two = value;
            }
        }

        if (!value_one.equals(value_two)) {
            for (int i = 0; i < cardValues.length; i++) {
                if (value_two.equals(cardValues[i])) {
                    break;
                }
                else if (value_one.equals(cardValues[i])) {
                    String temp = value_one;
                    value_one = value_two;
                    value_two = temp;
                    break;
                }
            }
            
            hand_final = value_one + value_two;

            if (suit_one.equals(suit_two)) {
                hand_final = hand_final + "s";
            }
            else {
                hand_final = hand_final + 'o';
            }
            }    
    }

    public String getHand() {
        return hand_final;
    }
}