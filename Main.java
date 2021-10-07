package com.company;
import javax.swing.*;

public class Main extends JFrame{
            Main(){
                super("Snake Game");
                add(new Board());
                pack();

                setLocationRelativeTo(null);// setTitle("Snake Game");
                setResizable(false);

            }

            public static void main(String[] args){
                new Main().setVisible(true);
            }
        }



