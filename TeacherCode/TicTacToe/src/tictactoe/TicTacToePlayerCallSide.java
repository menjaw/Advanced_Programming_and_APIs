/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author Menja
 */
public class TicTacToePlayerCallSide implements TicTacToePlayer {

    private TicTacToeConnection conn;
    
    public TicTacToePlayerCallSide(TicTacToeConnection conn) {
        this.conn = conn;
    }

    @Override
    public void startNewGame(int playerID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int takeTurn(TicTacToeBoard board, int[] validPositions) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void endGame(int result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
