package problems.tictactoe;
import java.util.*;

import org.apache.commons.lang3.tuple.Pair;
import problems.tictactoe.model.*;

public class Tictactoe {
    Deque<Player> players;
    Board boardGame;

    //constructor
     Tictactoe(){
        initializeGame();
    }

    public void initializeGame(){
        //creating players
        players = new LinkedList<>();

        //Player1
        PieceX pieceX = new PieceX();
        Player player1 = new Player(1, "Player1", pieceX);
        //Player2
        PieceO pieceO = new PieceO();
        Player player2 = new Player(2, "Player2", pieceO);

        players.add(player1);
        players.add(player2);

        //initialization
        boardGame = new Board(3);
    }

    public String startGame(){
        boolean noWinner = true;
        String winnerName = null;
        while(noWinner){
            //take out the first player in the list and put it in the back
            Player playerTurn = players.removeFirst();

            //print the board
            boardGame.printBoard();
            //get free spaces
            List<Pair<Integer, Integer>> freeCells = boardGame.getFreeCells();
            //first check if there are no empty spaces
            if(freeCells.isEmpty()){
                noWinner = false;
                continue;
            }

            //if there are empty cells, play the game

            //to get the input
            System.out.println("Player:" + playerTurn.getName() + "Enter the row and the column (comma seperated): ");
            Scanner input = new Scanner(System.in);
            String s = input.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.parseInt(values[0]);
            int inputColumn = Integer.parseInt(values[1]);

            //place it on the board
            boolean pieceAdded = boardGame.addPiece(inputRow, inputColumn, playerTurn.getPiece());
            //if not added successfully
            if(!pieceAdded){
               //player has to choose another cell
               System.out.println("The position is already filled, try another one");
               players.addFirst(playerTurn);
               continue;
            }
            players.addLast(playerTurn);

            //check if the player wins
            boolean winner = isWinner(inputRow, inputColumn, playerTurn.getPiece().pieceType);
            if(winner){
                winnerName = playerTurn.getName();
                boardGame.printBoard();
                noWinner = false;
            }
        }
        return winnerName;
    }

    public boolean isWinner(int row, int col, PieceType piece){
        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //check the row
        for(int i=0; i < boardGame.size; i++){
            if(boardGame.board[row][i] == null || boardGame.board[row][i].pieceType != piece){
                rowMatch = false;
                break;
            }
        }

        //check the col
        for(int i=0; i < boardGame.size; i++){
            if(boardGame.board[i][col] == null || boardGame.board[i][col].pieceType != piece){
                colMatch = false;
                break;
            }
        }

        //check the diagonal
        for(int i = 0, j = 0; i < boardGame.size; i++ , j++){
            if(boardGame.board[i][j] == null || boardGame.board[i][j].pieceType != piece){
                diagonalMatch = false;
                break;
            }
        }

        //check the antiDiagonal
        for(int i = 0, j = boardGame.size-1; i < boardGame.size; i++ , j--){
            if(boardGame.board[i][j] == null || boardGame.board[i][j].pieceType != piece){
                antiDiagonalMatch = false;
                break;
            }
        }
        return rowMatch||colMatch||diagonalMatch||antiDiagonalMatch;
    }
}
