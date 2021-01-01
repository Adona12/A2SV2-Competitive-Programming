public class SumNegaiveOnly {
    public static void main(String[] args) {
        System.out.println(sumNegaiveOnly("-1","8"));
    }
public static String sumNegaiveOnly(String firstNum,String secondNum){
    int length=firstNum.length()>secondNum.length()?firstNum.length()-1:secondNum.length()-1;
    if(firstNum.charAt(0)=='-'&& secondNum.charAt(0)=='-'){
        return "-"+sumPositiveOnly(firstNum,secondNum);
    }
    else if(firstNum.charAt(0)=='-'&& secondNum.charAt(0)!='-'){
        return sumNegative(firstNum.substring(1),secondNum);
    }
    else if(firstNum.charAt(0)!='-'&& secondNum.charAt(0)=='-'){

       return  sumNegative(firstNum,secondNum.substring(1));
    }
    else if(!(firstNum.charAt(0)=='-') && !(secondNum.charAt(0)=='-')){
     return sumPositiveOnly(firstNum,secondNum);
    }

return "";

}
public static String sumNegative(String firstNum,String secondNum) {
    String answer = "";
    int larger = 0;
    String higher;
    String lower;
    if (firstNum.length() == secondNum.length()) {
        for (int i = 0; i < firstNum.length(); i++) {
            if (Integer.parseInt(String.valueOf(firstNum.charAt(i))) > Integer.parseInt(String.valueOf(firstNum.charAt(i)))) {
                larger = 1;
            } else if (Integer.parseInt(String.valueOf(firstNum.charAt(i))) > Integer.parseInt(String.valueOf(firstNum.charAt(i)))) {
                larger = 2;
            }
        }
        if (larger == 0) {
            return "0";
        }
    } else {
        higher = larger == 1 ? firstNum : secondNum;
        lower = larger != 1 ? firstNum : secondNum;
        if (higher.length() != lower.length()) {
            for (int i = 0; i < higher.length() - lower.length(); i++) {
               lower="0"+lower;
            }
        }

        for (int i = 0; i < higher.length(); i++) {
            int x=Integer.parseInt(String.valueOf(higher.charAt(i)));
            int y=Integer.parseInt(String.valueOf(lower.charAt(i)));
            if (x >= y) {
                answer+=(x-y);
            }
            else{
               int back=i-1;
                while(true){
                    if(Integer.parseInt(String.valueOf(higher.charAt(back)))>0){
                        higher.replace(higher.substring(0,back+1),higher.substring(0,back)+(Integer.parseInt(String.valueOf(lower.charAt(i)))-1));
                        break;
                    }
                    else{
                        int previousNum=Integer.parseInt("1"+String.valueOf(higher.charAt(back)))-1;
                        higher.replace(higher.substring(0,back+1),higher.substring(0,back)+previousNum);
                        back--;
                    }
                }
                x=Integer.parseInt(String.valueOf(higher.charAt(i)));
                y=Integer.parseInt(String.valueOf(lower.charAt(i)));
                answer+=(x-y);
            }
        }

    }
    return answer;
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
