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

    //Variables
    int[][] board;
    int rows = 3;
    int columns = 3;

    //constructor
    public Implement_Board() {
        board = new int[rows][columns];
    }

    //Methods
    @Override
    public int getBoard(int index) {
        return 0;
    }

    @Override
    public void setValue(int row, int column, int value) {
        board[row][column] = value;
    }


}
