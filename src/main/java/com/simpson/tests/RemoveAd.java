
public class RemoveAd {
	/*
	"HaEaLaLaObWORLDb"	"HELLO WORLD"
	"SpIpGpOpNpGJqOqA"	"SIGONG JOA"
	"AxAxAxAoBoBoB"	"invalid"
	 */
	public String solution(String sentence) {
		String answer = "";
		char [] chars = sentence.toCharArray();
		int [] signals = new int[chars.length];
		int firstPos = 0;
		signals[0] = 1;
		for (int i = 1;i < chars.length -1;i++) {
		    if (chars[i-1] == chars[i+1]) {
				signals[ i - 1 ] = 0;
				signals[ i ] = 1;
				signals[ i + 1 ] = 0;
				if (chars[firstPos] != chars[i-1]) {
					firstPos = i - 1;
				}
		    } else {
		    	if (signals[i-1] == 0) {
					signals[i] = 1;
					signals[i+1] = 0;
				} else {
					signals[i-1] = 1;
					signals[i] = (chars[firstPos] == chars[i]?0:1);
					signals[i+1] = 1;
				}
				//if (chars[firstPos]firstPos)
			}
			System.out.print(i + " " + signals[i] +"\n");
		}
		for (int i = 0; i < chars.length; i++) {
			if (signals[i] == 1)
				answer += chars[i];
		}
		return answer;
	}
	
	public static void main(String [] args) {
		String [] userWritings = {"HaEaLaLaObWORLDb", "SpIpGpOpNpGJqOqA", "AxAxAxAoBoBoB"};
		String [] answers = {"HELLO WORLD", "SIGONG JOA", "invalid"};
		RemoveAd removeAd = new RemoveAd();
		for (int i = 0;i < userWritings.length; i++) {
			String result = removeAd.solution(userWritings[i]);
			System.out.println(answers[i] + " = " + result);
		}
	}
}
