package com.Bridgelabz.GamblingProgram;

public class GamblerUc2 {
    public static void main(String args[]) {
        int everydayStake = 100;
        int everygameBet = 1;
        int cashInHand = everydayStake;
        int gamble = (int) Math.floor((Math.random() * 10) % 2);
        switch (gamble) {
            case 1:
                System.out.println("You have Won");
                cashInHand = cashInHand + everygameBet;
                System.out.println("Total Stake :" + cashInHand);
                break;
            case 0:
                System.out.println("You have loss");
                cashInHand = cashInHand - everygameBet;
                System.out.println("Total Stake :" + cashInHand);
                break;
            default:
                System.out.println("play again");

        }
        if (gamble == 1) {
            System.out.println("Player has won");
        } else {
            System.out.println("Player has lost");
        }
    }
}