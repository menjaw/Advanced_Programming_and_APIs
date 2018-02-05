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
public interface Player {

    public void startNewGame(int playerId);

    public int playersTurn(Board board, int[] validPositions);

    public void gameOver(int result);
}
