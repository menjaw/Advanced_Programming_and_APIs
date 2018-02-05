/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;

import interfaces.Board;

/**
 *
 * @author Menja
 */
public class Implement_Board implements Board {

    public static void main(String[] args) {
        System.out.println();
    }
    //Variables
    int[][] board = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    //Methods
    @Override
    public void getBoard(int index) {
        // print out the array
        for (int row = 0; row < board.length; row++) {
            System.out.print("Row " + row + ": ");
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public void setValue(int index, int value) {
        board[index][index] = value;
    }

//        int rows = 3;
//    int columns = 3;
//    //Constructor to initilize board
//    public Implement_Board() {
//        board = new int[rows][columns];
//    }
//   @Override
//    public int getBoard(int index) {
//
//        return board[rows][columns];
//    }
}
