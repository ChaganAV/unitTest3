package com.example.model;

public class Calculation {
    /**
     * "Метод проверяет,
     * является ли целое число записанное в переменную n,
     * чётным (true) либо нечётным (false).
     * @param num
     * @return
     */
    public boolean evenOddNumber(int num){
        if(num % 2 == 0)
            return true;
        else
            return false;
    }
}
