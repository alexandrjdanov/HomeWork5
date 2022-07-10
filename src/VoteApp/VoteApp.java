package VoteApp;

import java.util.Scanner;

public class VoteApp {
    String[] issues = {"World energy issue",
            "Demographic issue",
            "Ecological issue",
            "The problem of wars",
            "Natural cataclysms"};
    double avg;
    int min, max;
    int[][] marks = new int[5][10];
    Scanner in = new Scanner(System.in);

    void showIssuesAndVote() {
        System.out.println("Top 5 critical global issues:\n");
        for (int i = 0; i < issues.length; i++) System.out.println((i + 1) + ". " + issues[i]);
        System.out.println("\nPlease rate each issue on a scale of 1-10\n" +
                "(1 being a minor issue, 10 being a disaster).");

        for (int i = 0; i < marks.length; i++) {
            System.out.println();
            System.out.println("Let rate " + (issues[i]) + ": ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print((j + 1) + " person your turn: ");
                int k = in.nextInt();
                marks[i][j] = k;
            }
        }
        System.out.println();
    }

    void arrayAndAverage() {
        for (int i = 0; i < marks.length; i++) {
            System.out.print(issues[i] + "\t\t");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + "\t");
                avg = avg + marks[i][j];
            }
            avg = avg / marks[i].length;
            System.out.print("Number of marks: " + marks[i].length + ";\t");
            System.out.println("Average mark of this row is: " + avg);
            avg = 0;
        }
    }

    int getMinAndMax() {
        int total = 0;
        max = 0;
        min = 101;

        int i;
        for (i = 0; i < marks.length; i++) {
            total = 0;
            for (int j = 0; j < marks[i].length; j++) {
                total = total + marks[i][j];
            }
            System.out.println("The sum of " + issues[i] + " marks is: " + total);
            if (total < min) min = total;
            if (total > max) max = total;
        }
        System.out.println();
        System.out.println("Minimum sum is " + min);
        System.out.println("Maximum sum is " + max);
        return total;
    }
}

