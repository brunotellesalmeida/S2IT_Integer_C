package com.s2itintegerc.integerc;

public class NewNumber {

    private final int maxNumber = 1000;
    StringBuilder builder = new StringBuilder();

    private int getSizeOfTheBiggerArray(char[] numberA,char[] numberB){
        return (numberA.length > numberB.length) ? numberA.length : numberB.length;
    }


    public int generateC(int a, int b){
        char[] numberA = Integer.valueOf(a).toString().toCharArray();
        char[] numberB = Integer.valueOf(b).toString().toCharArray();

        for (int i = 0; i < getSizeOfTheBiggerArray(numberA,numberB); i++){
            if(numberA.length > i){
                builder.append(numberA[i]);
            }
            git remote add origin     if (numberB.length> i){
                builder.append(numberB[i]);
            }
        }
        return (Integer.valueOf(builder.toString()) <= maxNumber) ? Integer.valueOf(builder.toString()) : -1;
    }
}
