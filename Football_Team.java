/* Problem Description

You are given the scores of a football league among a set of teams. You need to find the winner of the league and print the 
name of winner and points earned by the team. Each team gets 3 points for a win, 1 point for a draw and 0 for a loss. The name 
of the teams is represented as upper case character viz. A B...Z.

* Constraints

There will only be one team which gets the highest points

* Input

There are many lines in the input.

The first line contains an integer, N, representing number of teams in the league. The next (N*(N-1))/2 lines contain three 
space separated strings <Team1, Team2, Score>
Here, Team1 is the name of the home team. Team2 is the name of the away team. Score represents the score of the match, (M-N), 
where M represents the score of the home team and N represents the score of the away team.

* Output

The output should have two lines. 

The first line should contain a character representing the name of the leader team. The second line containing an integer 
representing the points won by the leader team.

* Time Limit

1

Example 1

Input :

3
A B 2-1
B C 5-6
C A 2-1

Output :

C
6

Explanation:

A has won 1 match : 3 points
B has won 0 match: 0 points
C has won 2 match : 6 points

*/

import java.util.*;

public class Football_Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine(); // Number of players
        int com = n*(n-1)/2;
        Player[] match = new Player[com];
        for (int i = 0; i < com; i++) {
            char t1 = sc.next().charAt(0); // Opener
            char t2 = sc.next().charAt(0); // 2nd player
            String score = sc.nextLine(); // Score chart
            match[i] = new Player(t1, t2, score);
        }
        int point[] = new int[n];
        for (int i = 0; i < n; i++) {
            point[i] = 0;
        }
        for (int i = 0; i < com; i++) {
            String[] num = match[i].score.trim().split("-");
            int c = Integer.parseInt(num[0]) - Integer.parseInt(num[1]);
            if (c > 0) {
                char ch = match[i].a;
                point[(int) ch - 65] += 3;
            } 
            else if (c < 0) 
            {
                char ch = match[i].b;
                point[(int) ch - 65] += 3;
            } 
            else 
            {
                char ch1 = match[i].a;
                point[(int) ch1 - 65] += 1;
                char ch2 = match[i].b;
                point[(int) ch2 - 65] += 1;
            }
        }
        int max = point[0];
        char Ch = 'A';
        for (int i = 1; i < n; i++) {
            if (point[i] > max) {
                max = point[i];
                Ch = (char) (i + 65);
            }
        }
        System.out.println(Ch);
        System.out.println(max);
    }
}

class Player {
    char a;
    char b;
    String score;

    public Player(char a, char b, String score) 
    {
        this.a = a;
        this.b = b;
        this.score = score;
    }
}
