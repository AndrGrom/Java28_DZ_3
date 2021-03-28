package com.company;

public class Main {

    public static void main(String[] args) {

        int month = 3;
        // if
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Зима");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Весна");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Лето");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Осень");
        } else {
            System.out.println("Не правильное число");
        }

        // Switch

    switch (month) {
        case 12:
        case 1:
        case 2:
            System.out.println("Зима");
            break;
        case 3:
        case 4:
        case 5:
            System.out.println("Весна");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println("Лето");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println("Осень");
            break;
        default: System.out.println("Не правильное число");
    }

        // массив

        int[] array = new int[] {1,2,3,4,5,6,7,8,9,10,11,12};

        for (int i = array.length; i > 0; i--) {
            System.out.print(i +" ");
        }

        // массив 2

        int[][] squareArray = new int[3][4];
        squareArray[0][0] = 1;
        squareArray[0][1] = 2;
        squareArray[0][2] = 3;
        squareArray[0][3] = 4;
        squareArray[1][0] = 5;
        squareArray[1][1] = 6;
        squareArray[1][2] = 7;
        squareArray[1][3] = 8;
        squareArray[2][0] = 9;
        squareArray[2][1] = 10;
        squareArray[2][2] = 11;
        squareArray[2][3] = 12;
        System.out.println(" ");

        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray[i].length; j++) {
                System.out.print(squareArray[i][j] +"["+ i +"]["+ j +"]   ");
            }
            System.out.println("");
        }

    }
}
