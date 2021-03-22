package com.company;

public class Main {

    public static void main(String[] args) {
        int myArray[] = {-2, -6, 5, 12};
        int sum = 0; //вводим переменную суммы
        for (int i = 0; i < myArray.length; i++) {  // цикл
            if (myArray[i] > 0) { //условие для отсеивания отрицательных значений
                sum += myArray[i]; //сумма
            }
        }
            System.out.println(sum); //вывод на экран


    }
}

