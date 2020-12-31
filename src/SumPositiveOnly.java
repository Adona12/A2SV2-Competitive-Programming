public class SumPositiveOnly {
    public static void main(String[] args) {

    }

public static String sumPositiveOnly(String firstNumber,String secondNumber){
    String answer = "";
    int carry = 0;
    int count1 = firstNumber.length() - 1;
    int count2 = secondNumber.length() - 1;
    while (true) {
        if (count1 < 0 && count2 < 0) {
            break;
        } else {
            int val;
            int x = 0;
            if (count1 >= 0 && count2 >= 0) {
                x = Integer.parseInt(Character.toString(firstNumber.charAt(count1))) + Integer.parseInt(Character.toString(secondNumber.charAt(count2))) + carry;
            }
            if (count1 == 0 && count2 == 0) {
                val = x;
            } else {
                if (count1 < 0 && count2 >= 0) {
                    x = Integer.parseInt(Character.toString(secondNumber.charAt(count2))) + carry;
                } else if (count1 >= 0 && count2 < 0) {
                    x = Integer.parseInt(Character.toString(firstNumber.charAt(count1))) + carry;
                }
                if ((count1 == 0 && count2 == 0) || (count1 == 0 && count2 < 0) || (count2 == 0 && count1 < 0)) {
                    val = x;
                } else {
                    if (x >= 10) {
                        carry = x / 10;
                        val = x % 10;
                    } else {
                        carry = 0;
                        val = x;
                    }
                }
            }
            answer = val + answer;
        }
        count1--;
        count2--;
    }
    //  System.out.println(answer);
    return answer;

}
}
