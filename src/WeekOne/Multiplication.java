package WeekOne;

public class Multiplication {

    public static void main(String[] args) {
        int[ ] j={1,3,2,6,1,2};
        //divisibleSumPairs(7,3,j);
       // System.out.println(3%3);
        //String something="";
      //  CharSequence c="abc".repeat(1000000000);
   //     System.out.println(10/3);
        System.out.println( repeatedString("abada",103));
   //     System.out.println(c);
      //  something.length();
    }

    static long gameOfTwoStacks(int x,int[] a,int[] b){
        int counterA =0;
        int counterB=0;
        int counter=0;
        while(counter<x){
            if(counterA<a.length && counterB<b.length){

            }

        }

        return 1;
    }
    static long repeatedString(String s, long n) {
        long count = 0;
        int frequency = 0;
        int inEach = 0;
        if (s.equals("a")) {
            System.out.println("here");
            return n;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                inEach++;
            }
        }
        System.out.println(inEach);

        while (count < n) {
            count += s.length();
        }
        System.out.println("count " + count);
        frequency = ((int) count / s.length()) * inEach;
        System.out.println("frequency " + frequency);
        if (count != n) {
            if (n % s.length() != 0) {
                s=s.substring(s.length()-(int) (count - n));
                System.out.println("hrr");
            } else
                s = s.substring(0, (int) (count - n) - 1);
        }


        System.out.println("new string "+s);
        // System.out.println(count);
        if(count!=n) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'a') {
                    frequency--;
                }
            }
        }

        return frequency;
    }
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int pairs = 0;
        System.out.println(k);
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                System.out.print(i +" "+ ar[i]+"  ");
                System.out.print(j+" "+ ar[j]+"  ");
             //   System.out.print(ar[i] + ar[j] )% k );
                System.out.println();
                if (i < j && ar[i] + ar[j] % k == 0) {

                    pairs++;
                }
                System.out.println(pairs);
            }
        }
        return pairs;
    }
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
