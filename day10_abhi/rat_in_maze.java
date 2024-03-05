package day10_abhi;

import java.util.*;

class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> ans = new ArrayList<>();
        int[][] temp = new int[n][n];

        if (m[0][0] == 1)
            traverse(m, ans, n - 1, 0, 0, "", temp);
        return ans;

    }

    public static void traverse(int[][] m, ArrayList<String> ans, int n, int x, int y, String s, int[][] temp) {
        if (x == n && y == n) {
            ans.add(s);
            return;
        }

        if (x - 1 >= 0 && m[x - 1][y] == 1 && temp[x - 1][y] == 0) {
            temp[x][y] = 1;
            traverse(m, ans, n, x - 1, y, s + 'U', temp);
            temp[x][y] = 0;

        }

        if (x + 1 <= n && m[x + 1][y] == 1 && temp[x + 1][y] == 0) {
            temp[x][y] = 1;
            traverse(m, ans, n, x + 1, y, s + 'D', temp);
            temp[x][y] = 0;
        }

        if (y - 1 >= 0 && m[x][y - 1] == 1 && temp[x][y - 1] == 0) {
            temp[x][y] = 1;
            traverse(m, ans, n, x, y - 1, s + 'L', temp);
            temp[x][y] = 0;
        }

        if (y + 1 <= n && m[x][y + 1] == 1 && temp[x][y + 1] == 0) {
            temp[x][y] = 1;
            traverse(m, ans, n, x, y + 1, s + 'R', temp);
            temp[x][y] = 0;
        }
    }
}