package App;
import java.util.Map;
import java.util.Scanner;

public class Deal {
    public static void main(String[] args) {
        Charts chart = new Charts();
        Scanner answerScanner = new Scanner(System.in);
        System.out.println("Type 1 for loose game, Type 2 for tight game");
        int gameType = answerScanner.nextInt();
        if (gameType == 1) {
            chart.createLooseChart();
        }
        else if (gameType == 2) {
            chart.createTightChart();
        }

        Map <String, String> myChart = chart.getChart();

        Deck deck = new Deck();
        deck.initializeDeck();
        deck.shuffleDeck();
        deck.initializeHand();
        String myHand = deck.getHand();
        System.out.println(myHand);
        System.out.println("Raise, call, or fold? Type quit to exit program");
        answerScanner.nextLine();
        String userAnswer = answerScanner.nextLine();
        
        int attempts = 0;
        int successful_attempts= 0;
        
        while (!userAnswer.equals("quit")) { 
            String trueAnswer = "";
            if (myChart.get(myHand) != null) {
                trueAnswer = myChart.get(myHand);
            }
            else {
                trueAnswer = "fold";

            }
            if (trueAnswer.equals(userAnswer)) {
                System.out.println("Correct!");
                attempts++;
                successful_attempts++;
            }
            else {
                System.out.println("Incorrect, correct answer was: " + trueAnswer);
                attempts++;
            }
            deck.shuffleDeck();
            deck.initializeHand();
            myHand = deck.getHand();
            System.out.println(myHand);
            System.out.println("Raise, call, or fold? Type quit to exit program");
            userAnswer = answerScanner.nextLine();
        }
        String score = String.valueOf(successful_attempts) + '/' + String.valueOf(attempts);
        System.out.println("Correct actions: " + score);
        answerScanner.close();
    }     
}
