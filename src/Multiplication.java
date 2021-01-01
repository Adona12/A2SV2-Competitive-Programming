public class Multiplication {
    public static void multiplication(String num1, String num2) {
        String previous = "";
        for (int i = num1.length() - 1; i >= 0; i--) {
            String line = "";
            int carry = 0;
            int val = 0;

            for (int j = num2.length() - 1; j >= 0; j--) {
                int temp = Integer.parseInt(String.valueOf(num1.charAt(i))) * Integer.parseInt(String.valueOf(num2.charAt(j))) + carry;
                if (j == 0) {
                    val = temp;
                } else {
                    if (temp >= 0) {
                        carry = temp / 10;
                    } else {
                        carry = 0;
                    }
                    val = temp % 10;
                }
                line = val + line;


            }
            previous = addition(previous, line + "0".repeat(num1.length() - i - 1));
        }
        System.out.println(previous);
    }
    public static String addition(String firstNumber, String secondNumber) {
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
