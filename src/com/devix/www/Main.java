package com.devix.www;

public class Main {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello how are you");
        int length = stringBuffer.length();
        int count = 0;

        for (int i = 0; i < length; i++) {
            if (stringBuffer.charAt(i) != 'h') continue;
            count++;
            stringBuffer.setCharAt(i, 'h');
        }
        System.out.println("Found " + count + " h's in the string.");
        System.out.println(stringBuffer);
    }
}
