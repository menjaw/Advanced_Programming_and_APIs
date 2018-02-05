/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import interfaces.TicTacToeGameControl;

/**
 *
 * @author Menja
 */
public class GameControlImplementation implements TicTacToeGameControl {

    @Override
    public void startGame(int p1, int p2) {
        BoardImplementation board = new BoardImplementation();
        boolean gameOver = false;

        while (!gameOver) {
            // int[] validPosition = get
        }
    }

    @Override
    public void pauseGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void endGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int[] getValidPosition() {
        return null;
    }

    @Override
    public int[] getValidPosition(BoardImplementation board) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
