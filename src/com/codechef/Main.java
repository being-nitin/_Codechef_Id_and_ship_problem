package com.codechef;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*
	  Write a program that takes in a letterclass ID of a ship and display the equivalent
	  string class description of the given ID. Use the table below.

      Class ID	Ship Class
      B or b	BattleShip
      C or c	Cruiser
      D or d	Destroyer
      F or f	Frigate

      Input
      The first line contains an integer T, the total number of testcases. Then T lines follow,
      each line contains a character.

      Output
      For each test case, display the Ship Class depending on ID, in a new line.

      Constraints
      1 ≤ T ≤ 1000
      Example
      Input

      3
      B
      c
      D

      Output
      BattleShip
      Cruiser
      Destroyer
	                 */
    Scanner sc = new Scanner(System.in);
    int t;
    char c;
    t = sc.nextInt();
    while(t-->0){
        c = sc.next().charAt(0);
        if(c=='b'||c=='B'){
            System.out.println("BattleShip");
        }
        else if(c=='d'||c=='D'){
            System.out.println("Destroyer");
        }
        else if(c=='c'||c=='C'){
            System.out.println("Cruiser");

        }
        else if(c=='f'||c=='F'){
            System.out.println("Frigate");
        }
        }
    }
}
