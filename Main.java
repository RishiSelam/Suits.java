// Name : Rishi Selam
// PRN: 23070126107
// Batch: AIML B2

// Main.java
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Deck deck = new Deck();
        
        System.out.println("******** Creating Deck ********");
        deck.createDeck();
        System.out.println("******** Deck Created ********");
        
        int choice;
        do {
            System.out.println("\nMENU:");
            System.out.println("1. Display Deck");
            System.out.println("2. Shuffle Deck");
            System.out.println("3. Print a Card");
            System.out.println("4. Show Cards of Same Suit");
            System.out.println("5. Compare Cards by Rank");
            System.out.println("6. Find a Card");
            System.out.println("7. Deal 5 Cards");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch(choice) {
                case 1:
                    deck.displayDeck();
                    break;
                case 2:
                    deck.shuffleDeck();
                    break;
                case 3:
                    System.out.print("Enter index of card to print: ");
                    int index = sc.nextInt();
                    deck.printCard(index);
                    break;
                case 4:
                    System.out.print("Enter suit: ");
                    sc.nextLine(); // consume newline
                    String suit = sc.nextLine();
                    deck.sameCard(suit);
                    break;
                case 5:
                    System.out.print("Enter rank: ");
                    sc.nextLine(); // consume newline
                    String rank = sc.nextLine();
                    deck.compareCard(rank);
                    break;
                case 6:
                    System.out.print("Enter rank: ");
                    sc.nextLine(); // consume newline
                    String searchRank = sc.nextLine();
                    System.out.print("Enter suit: ");
                    String searchSuit = sc.nextLine();
                    deck.findCard(searchRank, searchSuit);
                    break;
                case 7:
                    deck.dealCard();
                    break;
                case 8:
                    System.out.println("Exiting...!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 8);
    }
}