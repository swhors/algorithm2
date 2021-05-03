import java.util.*;


public class TestCols {
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
    
    public static void testStarArray() {
        /*
        [0]	0
        [5,2,3,3,5,3]	4
        [0,3,3,0,7,2,0,2,2,0]	8
         */
        int [][] arrays = {{0},
                {5,2,3,3,5,3},
                {0,3,3,0,7,2,0,2,2,0}};
        int answers[] = {0,4,8};
        TestCols startArray = new TestCols();
        int pos = 0;
        for (int [] array:arrays) {
            System.out.println(String.valueOf(answers[pos++]) + ':'
                                       + String.valueOf(startArray.solution(array)));
        }
        
    }
    
    public Integer[] solution3(int [] nums) {
        Set<Integer> intSet = new HashSet<>();
        
        Arrays.sort(nums);
    
        for (Integer i : nums)
            intSet.add(i);
        
        Object [] ordered = intSet.toArray();
        Set<Integer> answers = new HashSet<>();
        for (int i0 = 0;i0 < ordered.length-1;i0++) {
            for(int i1= i0+1; i1 < ordered.length;i1++) {
                answers.add((Integer)ordered[i0] + (Integer)ordered[i1]);
            }
        }
        Integer [] answer = new Integer[answers.size()];
        answers.toArray(answer);
        return answer;
    }
    
    public static void testTwoNumsSum() {
        int [][] numArrays = {{1,2,3,4,5,6,7}};
        TestCols testCols = new TestCols();

        for (int i = 0;i < numArrays.length;i++) {
            Integer[] result = testCols.solution3(numArrays[i]);
            System.out.println(result + ":" + numArrays[i]);
        }
    }
    
    public String solution2(String sentence) {
        String newSentence = "";
        char [] sentencebuf = sentence.toCharArray();
        int [] status = new int[sentence.length()];
        status[0] = 0;
        int firstPos = 0;
        for (int i = 1;i < sentence.length() - 1;) {
            if (sentencebuf[firstPos] == sentencebuf[i+1]) {
                status[i-1] = 0;
                status[i] = 1;
                status[i+1] = 0;
                i += 2;
            } else {
//                firstPos = ((i-firstPos) > 1?i: firstPos);
                status[i-1] = 0;
                status[i] = 0;
                status[i+1] =1;
                i ++;
            }
        }
        for(int i = 0; i < sentence.length();i++) {
            if (status[i] == 1) newSentence += sentencebuf[i];
        }
        return newSentence;
    }
    
    public static void testSpam() {
        String [] sentences = {"aHaEaLaLaOadWORLDd", "aHELLOWORLDa", "HaEaLaLaOWbObRbLbD"};
        String [] answers = {"HELLOWORLD", "HELLOWORLD", "HELLOWORLD"};
        TestCols testCols = new TestCols();
        
        for (int i = 0;i < sentences.length;i++) {
            String result = testCols.solution2(sentences[i]);
            System.out.println(result + ":" + answers[i]);
        }
    }
    public static void hashMapTest() {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("mymy", "samsung");
        hashMap.put("yoyo", "lg");
        hashMap.put("aha", "daewoo");
    
        List<Map.Entry<String, String>> listEntries =
                new ArrayList<Map.Entry<String, String>>(hashMap.entrySet());
    
        Collections.sort(listEntries, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
    
        for (Map.Entry<String, String> entity : listEntries) {
            System.out.println(entity.getKey() + " = " + entity.getValue());
        }
    
        Object[] keys = hashMap.keySet().toArray();
        for (Object key : keys) {
            System.out.println("Try for "  + ".");
            while (hashMap.containsKey(key)) {
                System.out.println(key + " = " + hashMap.get(key));
                hashMap.remove(key);
            }
            System.out.println("Can't found for " + key + ".");
        }
    }
    
    public static void main(String []args) {
//        testTwoNumsSum();
//        testStarArray();
        testSpam();
//        hashMapTest();
    }
}
