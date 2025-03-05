// Deck.java
import java.util.*;

class Deck{
    ArrayList<Card> deck;

    public Deck(){
        this.deck = new ArrayList<>();
    }

    public void createDeck(){
        String[] ranks = {"2", "3", "4", "5","6", "7","8", "9","10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Clubs", "Diamonds", "Spades", "Hearts"};
        
        for (String rank : ranks){
            for (String suit : suits){
                deck.add(new Card(rank, suit));
            }
        }
    }

    public void displayDeck(){
        System.out.println("_________Deck_________");
        for (Card card : deck){
            System.out.println(card);
        }
    }

    public void shuffleDeck(){
        System.out.println("******* Shuffling Deck *******");
        Collections.shuffle(deck);
    }

    public void printCard(int index){
        if (index >= 0 && index < deck.size()){
            System.out.println("Card at index " + index + ": " + deck.get(index));
        } else {
            System.out.println("Invalid index!");
        }
    }

    public void sameCard(String suit){
        System.out.println("Cards of suit " + suit + ":");
        for (Card card : deck){
            if (card.suit.equalsIgnoreCase(suit)){
                System.out.println(card);
            }
        }
    }

    public void compareCard(String rank){
        System.out.println("Cards with rank " + rank + ":");
        for (Card card : deck){
            if (card.rank.equalsIgnoreCase(rank)){
                System.out.println(card);
            }
        }
    }

    public void findCard(String rank, String suit){
        for (Card card : deck){
            if (card.rank.equalsIgnoreCase(rank) && card.suit.equalsIgnoreCase(suit)){
                System.out.println("Card Found: " + card);
                return;
            }
        }
        System.out.println("Card Not Found");
    }

    public void dealCard(){
        System.out.println("Dealing 5 Random Cards:");
        Random rand = new Random();
        for (int i = 0; i < 5; i++){
            System.out.println(deck.get(rand.nextInt(deck.size())));
        }
    }
}