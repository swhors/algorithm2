public class BridgeOverTruck {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int currentw = 0;

        int carpos = 1;
        int movpos = 0;
        int firpos = 0;

        currentw += truck_weights[0];
        while (carpos < truck_weights.length) {
            if (currentw < weight) {
                if (movpos == bridge_length) {
                    movpos--;
                    currentw -= truck_weights[firpos];
                    firpos++;
                    answer++;
                } else {
                    movpos++;
                }
                currentw += truck_weights[carpos];
                carpos++;
            } else {
                currentw -= truck_weights[--carpos];
                movpos++;
            }
        }

        return answer;
    }

    public static void main(String [] args) {
        /*
         2	10	[7,4,5,6]	8
         100	100	[10]	101
         100	100	[10,10,10,10,10,10,10,10,10,10]	110
        */
        int [] brs = {2,100,100};
        int [] ws = {10,100,100};
        int [][] tws = {{7,4,5,6},
                {10},
                {10,10,10,10,10,10,10,10,10,10}};
        int [] req = {8,101, 110};
        BridgeOverTruck bot = new BridgeOverTruck();
        for (int i = 0;i < 3;i++) {
            int result = bot.solution(brs[0], ws[0], tws[0]);
            System.out.println(String.valueOf(result) + ":" + String.valueOf(req[i]));
        }
    }
}
