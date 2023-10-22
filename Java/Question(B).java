// B.	Enter Roman Number as input and convert it to integer.
import java.util.HashMap;
import java.util.Map;

class Main {
    public static int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> romanMap = new HashMap<>();
        
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = romanMap.get(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            int current = romanMap.get(s.charAt(i));
            int previous = romanMap.get(s.charAt(i - 1));

            if (current <= previous) {
                result += current;
            } else {
                result += current - 2 * previous;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roman = sc.nextLine();
        
        int result = romanToInt(roman);
        System.out.println(result);
    }
}
