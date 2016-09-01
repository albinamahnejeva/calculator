/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer number1, number2, sum, res;
        String znak;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        number1 = scanner.nextInt();
        System.out.println("Введите второе число");
        number2 = scanner.nextInt();
        System.out.println("Введите действие (+ или -)");
        znak = scanner.next();
        switch (znak) {
            case "+":
                res = number1 + number2;

                break;
            case "-":
                res = number1 - number2;
                break;
            default:
                System.out.println("вы неправильно ввели цифры");
                res = null;

        }
        if (res != null) {

            System.out.println("Сумма чисел равна: " + res);
            sum = number1 + number2;
        }
    }
}
