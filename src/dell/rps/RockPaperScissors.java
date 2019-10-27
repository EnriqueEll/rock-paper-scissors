package dell.rps;

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String arg[]){
        RockPaperScissors game = new RockPaperScissors();
        game.run();
    }

    private void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let play Rock, Paper & Scissors");

        while (true){
            System.out.println("Player 1:");
            String player1trow = scanner.nextLine();
            System.out.println("Player 2:");
            String player2trow = scanner.nextLine();

            switch (player1trow) {
                case "Rock":
                    switch (player2trow) {
                        case "Paper":
                            System.out.println("Player 2 Wins!");
                            break;
                        case "Scissors":
                            System.out.println("Player 1 Wins!");
                            break;
                        case "Rock":
                            System.out.println("Tie!");
                            break;
                    }
                    break;
                case "Paper":
                    switch (player2trow) {
                        case "Paper":
                            System.out.println("Tie!");
                            break;
                        case "Scissors":
                            System.out.println("Player 2 Wins!");
                            break;
                        case "Rock":
                            System.out.println("Player 1 Wins!");
                            break;
                    }
                    break;
                case "Scissors":
                    switch (player2trow) {
                        case "Paper":
                            System.out.println("Player 1 Wins!");
                            break;
                        case "Scissors":
                            System.out.println("Tie!");
                            break;
                        case "Rock":
                            System.out.println("Player 2 Wins!");
                            break;
                    }
                    break;
            }
        }
    }
}