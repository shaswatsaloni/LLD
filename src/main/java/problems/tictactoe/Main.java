package problems.tictactoe;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Game Started");
        Tictactoe ticTacToe = new Tictactoe();
        ticTacToe.initializeGame();
        String result = ticTacToe.startGame();
        System.out.println("The winner of the game is: " + result);
    }
}