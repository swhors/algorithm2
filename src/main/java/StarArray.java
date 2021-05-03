public class StarArray {

    public int solution(int[] a) {
        if (a.length < 2) return 0;
        int starMaxlen = (a.length % 2 == 0 ? a.length : a.length - 1);
        for (int starCurLen = starMaxlen; starCurLen > 1; starCurLen -= 2) {
            for (int firstPos = 0; firstPos < firstPos - starCurLen; firstPos++) {

            }
        }
        int answer = -1;
        return answer;
    }

    public static void main(String []args) {
        /*
        [0]	0
                [5,2,3,3,5,3]	4
                [0,3,3,0,7,2,0,2,2,0]	8

         */
        int [][] arrays = {{0},
                {5,2,3,3,5,3},
                {0,3,3,0,7,2,0,2,2,0}};
        int answers[] = {0,4,8};
        StarArray starArray = new StarArray();
        int pos = 0;
        for (int [] array:arrays) {
            System.out.println(String.valueOf(answers[pos++]) + ':'
                    + String.valueOf(starArray.solution(array)));
        }
    }
}
