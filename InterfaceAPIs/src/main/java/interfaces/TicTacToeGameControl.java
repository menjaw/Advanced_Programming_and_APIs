/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import game.BoardImplementation;

/**
 *
 * @author Menja
 */
public interface TicTacToeGameControl {

    /**
     * Loads the game. This method has to be run before any of the others
     *
     * @param p1
     * @param p2
     */
    public void startGame(int p1, int p2);

    public void pauseGame();

    /**
     * The game ends if: - the board is full - one of the players have 3 in a
     * row
     */
    public void endGame();
    
    public int[] getValidPosition(BoardImplementation board);
}
