/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Menja
 */
public interface TicTacToeBoard {

    /**
     * The board consists of 9 squares (3 in a row)
     *
     */
    public void getBoard();

    /**
     * Checks if the board is empty
     * @param index
     */
    public void getIndex(int index);
    public void isFieldEmpty();
    public void isBoardEmpty();

    public void placePiece();

    public void clearBoard();
}
