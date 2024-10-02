package problems.tictactoe.model;

import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.List;

public class Board {
     public int size;
     public Piece [][] board;

     //constructor
     public Board(int size){
        this.size = size;
        board = new Piece[size][size];
     }

     public boolean addPiece(int row, int col, Piece piece){
         if(board[row][col] != null){
             return false;
         }
         board[row][col] = piece;
         return true;
     }

     public List<Pair<Integer, Integer>> getFreeCells(){
         List<Pair<Integer, Integer>> freeCells = new ArrayList<>();
         for(int i=0; i<size; i++){
             for(int j=0; j<size; j++){
                 if(board[i][j] == null){
                     Pair<Integer, Integer> newCell = Pair.of(i, j);
                     freeCells.add(newCell);
                 }
             }
         }
         return freeCells;
     }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (null != this.board[i][j])
                    System.out.print(this.board[i][j].pieceType.name() + "  ");
                else
                    System.out.print("   ");
                System.out.print(" |  ");
            }
            System.out.println();
        }
    }
}
