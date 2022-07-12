package VoteApp;

import java.util.Scanner;

public class VoteApp {
    String[] issues = { "World energy issue  ",
                        "Demographic issue   ",
                        "Ecological issue    ",
                        "The problem of wars ",
                        "Natural cataclysms  "};
    double avg;
    int min, max;
    int[][] marks = new int[5][10];
    Scanner in = new Scanner(System.in);

    int putMarks() {
        int k;
        while (true) {
            k = (int) ((Math.random()) * 10);
//            k = in.nextInt();
            if (!(k < 11 && k > 0))
                System.out.println("Attention! Out of range 1-10. Please try again: ");
            else break;
        }
        return k;
    }

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
                marks[i][j] = putMarks();
            }
        }
        System.out.println();
    }

    void arrayAndAverage() {
        System.out.println("Name of Issue       \tU1\tU2\tU3\tU4\tU5\tU6\tU7\t" +
                            "U8\tU9\tU10\t\t№ of marks\t\tAVG\t\tSum");
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total = 0;
            System.out.print(issues[i] + "\t");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + "\t");
                avg = avg + marks[i][j];
                total += marks[i][j];
            }
            avg = avg / marks[i].length;
            System.out.print("\t\t" + marks[i].length + ";\t");
            System.out.print("\t\t" + avg);
            System.out.println("\t\t" + total);
            avg = 0;
        }
    }

    void getMinAndMax() {
        int total = 0;
        max = 0;
        min = 101;
        int currentMinIssue = 0;
        int currentMaxIssue = 0;
        for (int i = 0; i < marks.length; i++) {
            total = 0;
            for (int j = 0; j < marks[i].length; j++) {
                total += marks[i][j];
            }
            if (total < min) {
                min = total; currentMinIssue = i; }
            if (total > max) {
                max = total; currentMaxIssue = i; }
        }
        System.out.println("The least important is issue: " + issues[currentMinIssue] +
                            " - with marks sum equal to " + min + ".");
        System.out.println("The most important is issue: " + issues[currentMaxIssue] +
                            " - with marks sum equal to " + max + ".");
    }
}