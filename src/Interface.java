
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;


public class Interface {

    public static void main(String[] args) {

        CardGenerator cardGen = new CardGenerator();

        System.out.println("Welcome to BlackJack!");
        System.out.print("Enter your name: ");
        Scanner stdin = new Scanner(System.in);
        String username = stdin.nextLine();
        System.out.println("Hello " + username + "!\nLet's play a game!");

        String userChoice;

        Integer CompResult = 0;
        Integer UserResult = 0;


        Card card = cardGen.takeCard();
        System.out.println("Dealer's visible card is: " + card);
        CompResult += card.getValue();

        System.out.print("Your cards: ");
        Card userCard1 = cardGen.takeCard();
        Card userCard2 = cardGen.takeCard();
        UserResult = userCard1.getValue() + userCard2.getValue();
        System.out.println(userCard1 + ", " + userCard2);

        System.out.println("What are you going to do?\n");
        System.out.println("(T) Take a card");
        System.out.println("(P) Pass");
        do {
            System.out.print("Your choice: ");
            userChoice = stdin.nextLine();
        } while(!userChoice.equals("T") && !userChoice.equals("P"));

        System.out.println(CardGenerator.getCards());
    }
}
