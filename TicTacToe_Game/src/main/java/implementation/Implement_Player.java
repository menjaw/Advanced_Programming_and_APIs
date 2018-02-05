/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;

import interfaces.Board;
import interfaces.Player;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Menja
 */
public class Implement_Player implements Player {

    @Override
    public void startNewGame(int playerId) {
        String welcome = "Welcome to a new game of Tic Tac Toe player " + playerId;
        System.out.println(welcome);
    }

    @Override
    public int playersTurn(Board board, int[] validPositions) {
        //print board
        System.out.println(board);
        System.out.println(Arrays.toString(validPositions));

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        return input;
    }

    @Override
    public void gameOver(int result) {
        System.out.println("The game is over!" + "\n" + " the result is: " + result);
    }

}
