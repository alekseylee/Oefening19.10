package intec.brussel.extracasino;

import java.util.Scanner;
public class MainApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean stay = false;

        System.out.println("What nickName would you like to have?");
        String pAnswer = scanner.nextLine();
        Player player1 = new Player(pAnswer);
        System.out.println("What nickName would you like to have?");
        String pAnswer2 = scanner.nextLine();
        Player player2 = new Player(pAnswer2);
        System.out.println("What nickName would you like to have?");
        String pAnswer3 = scanner.nextLine();
        Player player3 = new Player(pAnswer3);
        Player dealer = new Player("Dealer");


        System.out.println("Would you like to start a new game player1?  'Yes/No' :");
        pAnswer = scanner.nextLine();

        if (pAnswer.equalsIgnoreCase("Yes")) {

            DeckOfCard deck1 = new DeckOfCard();
            Card card1 = new Card(Face.ACE, Suit.CLUBS);
            deck1.shuffleDeck();

            player1.addCard(deck1.dealNextCard());
            player1.addCard(deck1.dealNextCard());
            player1.getPlayerHand(true);
            System.out.println(" ");
            dealer.addCard(deck1.dealNextCard());
            dealer.addCard(deck1.dealNextCard());
            dealer.getPlayerHand(false);

            //PLAYER1
            do {
                System.out.println("Would " + player1.getNickName() + " like to bust or stay? 'Bust/Stay'");
                pAnswer = scanner.nextLine();
                //BUST
                if (pAnswer.equalsIgnoreCase("Bust")) {
                    player1.addCard(deck1.dealNextCard());
                    System.out.println(player1.getHandSum());
                    if (player1.getHandSum() > 23) {
                        System.out.println("You busted and got a total of " + player1.getHandSum() + ". Dealer wins this time! ");
                        System.exit(0);
                    }
                }
                //STAY
                if (pAnswer.equalsIgnoreCase("stay")) {
                    System.out.println("You have chosen to stay. Your hand: " + player1.getHandSum());
                }

            } while (pAnswer.equalsIgnoreCase("Bust"));

            System.out.println("Would you like to start a new game player2?  'Yes/No' :");
            pAnswer = scanner.nextLine();

            if (pAnswer2.equalsIgnoreCase("Yes")) {

                DeckOfCard deck2 = new DeckOfCard();
                Card card2 = new Card(Face.ACE, Suit.CLUBS);
                deck2.shuffleDeck();

                player2.addCard(deck2.dealNextCard());
                player2.addCard(deck2.dealNextCard());
                player2.getPlayerHand(true);
                System.out.println(" ");
                dealer.addCard(deck2.dealNextCard());
                dealer.addCard(deck2.dealNextCard());
                dealer.getPlayerHand(false);

                //PLAYER2
                do {
                    System.out.println("Would " + player2.getNickName() + " like to bust or stay? 'Bust/Stay'");
                    pAnswer2 = scanner.nextLine();
                    //BUST
                    if (pAnswer2.equalsIgnoreCase("Bust")) {
                        player2.addCard(deck1.dealNextCard());
                        System.out.println(player1.getHandSum());
                        if (player2.getHandSum() > 23) {
                            System.out.println("You busted and got a total of " + player2.getHandSum() + ". Dealer wins this time! ");
                            System.exit(0);
                        }
                    }
                    //STAY
                    if (pAnswer2.equalsIgnoreCase("stay")) {
                        System.out.println("You have chosen to stay. Your hand: " + player2.getHandSum());
                    }

                } while (pAnswer2.equalsIgnoreCase("Bust"));

                System.out.println("Would you like to start a new game player3?  'Yes/No' :");
                pAnswer3 = scanner.nextLine();

                if (pAnswer3.equalsIgnoreCase("Yes")) {

                    DeckOfCard deck3 = new DeckOfCard();
                    Card card3 = new Card(Face.ACE, Suit.CLUBS);
                    deck3.shuffleDeck();

                    player3.addCard(deck3.dealNextCard());
                    player3.addCard(deck3.dealNextCard());
                    player3.getPlayerHand(true);
                    System.out.println(" ");
                    dealer.addCard(deck3.dealNextCard());
                    dealer.addCard(deck3.dealNextCard());
                    dealer.getPlayerHand(false);

                    //PLAYER 3
                    do {
                        System.out.println("Would " + player3.getNickName() + " like to bust or stay? 'Bust/Stay'");
                        pAnswer3 = scanner.nextLine();
                        //BUST
                        if (pAnswer3.equalsIgnoreCase("Bust")) {
                            player3.addCard(deck3.dealNextCard());
                            System.out.println(player3.getHandSum());
                            if (player3.getHandSum() > 23) {
                                System.out.println("You busted and got a total of " + player3.getHandSum() + ". Dealer wins this time! ");
                                System.exit(0);
                            }
                        }
                        //STAY
                        if (pAnswer3.equalsIgnoreCase("stay")) {
                            System.out.println("You have chosen to stay. Your hand: " + player3.getHandSum());
                        }

                    } while (pAnswer3.equalsIgnoreCase("Bust"));

                    //DEALER
                    stay = false;

                    do {
                        System.out.println("");
                        System.out.println("- Dealers turn -");
                        //DRAW CARD
                        if (dealer.getHandSum() <= 16) {
                            dealer.addCard(deck1.dealNextCard());
                            if (dealer.getHandSum() == 15) {
                                System.out.println("Dealer won.");
                                System.exit(0);
                            }
                            if (dealer.getHandSum() > 23) {
                                System.out.println("Dealer busted and got a total of " + dealer.getHandSum() + ". " + player1.getNickName() + " wins this time!");
                                System.out.println("Dealer busted and got a total of " + dealer.getHandSum() + ". " + player2.getNickName() + " wins this time!");
                                System.out.println("Dealer busted and got a total of " + dealer.getHandSum() + ". " + player3.getNickName() + " wins this time!");
                                System.exit(0);
                            }
                        } else {
                            System.out.println("Dealer has chosen to stay!");
                            int totalDealerSum = dealer.getHandSum();
                            int totalPlayer1Sum = player1.getHandSum();
                            int totalPlayer2Sum = player2.getHandSum();
                            int totalPlayer3Sum = player2.getHandSum();

                            if (totalDealerSum > totalPlayer1Sum || totalDealerSum > totalPlayer2Sum || totalDealerSum > totalPlayer3Sum) {
                                System.out.println("Both players has decided to stay. The winner is " + dealer.getNickName() + " with a total of " + totalDealerSum + ".");
                            } else {
                                System.out.println("Both players has decided to stay. The winner is " + player1.getNickName() + " with a total of " + totalPlayer1Sum + ".");
                                System.out.println("Both players has decided to stay. The winner is " + player1.getNickName() + " with a total of " + totalPlayer2Sum + ".");
                                System.out.println("Both players has decided to stay. The winner is " + player1.getNickName() + " with a total of " + totalPlayer3Sum + ".");
                            }
                            stay = false;
                        }

                    } while (stay);
                }
            }
        }
    }
}