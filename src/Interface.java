package java;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Interface {

    private static Map<Integer, Card> cards = new HashMap<>();

    static {
        cards.put(1, new Card("2", 2));
        cards.put(2, new Card("3", 3));
        cards.put(3, new Card("4", 4));
        cards.put(4, new Card("5", 5));
        cards.put(5, new Card("6", 6));
        cards.put(6, new Card("7", 7));
        cards.put(7, new Card("8", 8));
        cards.put(8, new Card("9", 9));
        cards.put(9, new Card("10", 10));
        cards.put(10, new Card("J", 10));
        cards.put(11, new Card("Q", 10));
        cards.put(12, new Card("K", 10));
        cards.put(13, new Card("A", 11));
        cards.put(14, new Card("A", 1));
    }

    public static void main(String[] args) {

        System.out.println("Welcome to BlackJack!");
        System.out.print("Enter your name: ");
        Scanner stdin = new Scanner(System.in);
        String username = stdin.nextLine();
        System.out.println("Hello " + username + "!\nLet's play a game!");

        String userChoice;

        Random cardGenerator = new Random();

        Integer CompResult = 0;
        Integer UserResult = 0;


        System.out.println("Dealer's visible card " + cards.get((cardGenerator.nextInt(11)+2)));




    }
}
