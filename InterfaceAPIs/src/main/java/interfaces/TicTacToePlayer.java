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
public interface TicTacToePlayer {

    public void newGame(int p1, int p2);

    public void nextTurn(TicTacToeBoard board, int [] validPosition);
    
    public void endGame(int result);

    //Messages
    public void winner();

    public void looser();

}
