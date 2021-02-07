package com.company;

public class Arrays_additional_7 {

public static boolean isPalindrome(int number){
int num=reverse(number);
    if(number==num){
    return true;
    } else{
        return false;
    }
}

public static int reverse(int number){
    int reverseNumber=0;
    while(number!=0){
        int digit=number%10;
        reverseNumber=reverseNumber*10+digit;
        number=number/10;
    }
    return reverseNumber;
}

    public static void main(String[] args) {
       System.out.println(isPalindrome(11212));
    }
}
