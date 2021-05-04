package com.example.laboras_2;

public class elementsCalculator {



    public static int getCharsCount(String userInputText) {
        if(userInputText != null) {
            return userInputText.length();
        }
        return 0;
    }

    public static int getNumbersCount(String userInputText) {
        int count = 0;
        char[] symbolsArray = userInputText.toCharArray();
        for (char c: userInputText.toCharArray()) {
            if (Character.isDigit( c )) {
                count++;
            }
        }
        return count;
    }


    public static int getWordsCount(String userInputText) {
        int count = 0;
        char ch[] = new char[userInputText.length()];
        for(int i=0; i<userInputText.length(); i++) {
            ch[i] = userInputText.charAt(i);
            if ( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
                count++;
        }
        return count;
    }
}
