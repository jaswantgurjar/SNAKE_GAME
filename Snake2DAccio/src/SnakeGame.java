import javax.swing.*;
import java.awt.*;

public class SnakeGame extends JFrame {
   //Board = board ;
    Board board = new Board(); //object of Board class
    SnakeGame(){  //constructor of SnakeGame class
        //board = new Board();
        add(board); // added board to frame788
        pack(); //packs the particular parent class to children class
        setResizable(false);//resize of JFrame is not possible
        setVisible(true); //particular JFrame will be visible

        setTitle("Snake Game");



    }
    public static void main(String[] args){

        SnakeGame snakeGame= new SnakeGame(); // //intialize sanke game object


    }
}