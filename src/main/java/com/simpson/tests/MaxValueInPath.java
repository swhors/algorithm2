import java.util.*;

class MaxValueInPath {
    static int getMax(int y, int x, int[][] triangle) {
        if (y == (triangle.length-1)) {
            return triangle[y][x];
        }
        int left = triangle[y][x] + getMax(y + 1, x, triangle);
        int right = triangle[y][x] + getMax(y + 1, x + 1, triangle);
        return (left > right ? left : right);
    }
    static public int solution(int[][] triangle) {
        int answer = getMax(0,0, triangle);
        return answer;
    }

    static public int solution1(int[][] triangle) {
        int y0 = triangle.length;
        for(int y1 = y0-2; y1 >= 0; y1--) {
            for(int x1 = 0; x1 < triangle[y1].length; x1++) {
                triangle[y1][x1] = triangle[y1][x1] +
                        (triangle[y1+1][x1] > triangle[y1+1][x1+1]?
                                triangle[y1+1][x1]:triangle[y1+1][x1+1]);
            }
        }

        return triangle[0][0];
    }

    public static void main(String [] args) {
    //[[7], [3, 8], [8, 1, 0], [2, 7, 4, 4], [4, 5, 2, 6, 5]]	30
        int [][] triangle = {{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};
        System.out.println("answer = " + solution(triangle));
        System.out.println("answer = " + solution1(triangle));
    }
}