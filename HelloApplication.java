package com.example.calculator;
import java.io.IOException;
import java.util.Scanner;
class  calc {
    static Scanner scanner = new Scanner(System.in);
    static String number1, number2, roma;
    static String result;
    static String convertNumToRoman(int numArabian) throws IOException {

        if (numArabian <= 0) {
            throw new IOException();
        }
        else {
            String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                    "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                    "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                    "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                    "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                    "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                    "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
            return roman[numArabian];
        }}
    static String romanToNumber(String roman) throws IOException {
        return switch (roman) {
            case "I" -> "1";
            case "II" -> "2";
            case "III" -> "3";
            case "IV" -> "4";
            case "V" -> "5";
            case "VI" -> "6";
            case "VII" -> "7";
            case "VIII" -> "8";
            case "IX" -> "9";
            case "X" -> "10";
            default -> throw new IOException();
        };
    }
    public static class Main {
        public static String calc(String input) throws IOException {
            int num1;
            int num2;
            char operand;
            int results = 0;
            String results2;
            String[] str = input.split(" ");
            String str1 = str[0];
            String str2 = str[1];
            String str3 = str[2];
            String str01 = str1.trim();
            String str02 = str2.trim();
            String str03 = str3.trim();
            num1 = Integer.parseInt(str01);
            num2 = Integer.parseInt(str03);
            operand = str02.charAt(0);
            if (operand == '+') {
                results = num1 + num2;
            } else if (operand == '-') {
                results = num1 - num2;
            } else if (operand == '*') {
                results = num1 * num2;
            } else if (operand == '/') {
                results = num1 / num2;
            } else {
                throw new IOException("");
            }
            results2 = String.valueOf(results);
            return results2;
        }
        public static void main(String[] args) throws IOException {
            String[] roman1 = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "0"};
            String[] arab = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "0"};
            System.out.println("Введите выражение от 1 до 10 (1 + 2) или (I + II)");
            String inputUser = scanner.nextLine();
            String[] str = inputUser.split(" ");
            String str1 = str[0];
            String str2 = str[1];
            String str3 = str[2];
            String str01 = str1.trim();
            String str02 = str2.trim();
            String str03 = str3.trim();
            for (int i = 0; i<arab.length; i++)
                for  (int n = 0; n<roman1.length; n++)
                {
                    if (str01.equals(roman1[i]) && (str03.equals(arab[n]))) {
                        throw new IOException();
                    }
                    if (str01.equals(arab[i]) && (str03.equals(roman1[n]))) {
                        throw new IOException();
                    }
                    if (str01.equals(roman1[i]) && (str03.equals(roman1[n]))) {
                        number1 = romanToNumber(str1);
                        number2 = romanToNumber(str3);
                        roma = (number1 + " " + str2 + " " + number2);
                        int len;
                        len = roma.length();
                        if (len > 7) {
                            throw new IOException();
                        }
                        inputUser = roma;
                        result = calc(inputUser);
                        String resultArabian = convertNumToRoman(Integer.parseInt(result));
                        System.out.println(resultArabian);
                        System.exit(0);
                    }
                    if (str01.equals(arab[i]) && str03.equals(arab[n])) {
                        String ara;
                        ara = inputUser;
                        int len2;
                        len2 = ara.length();
                        if (len2 > 7) {
                            throw new IOException();
                        }
                        result = calc(inputUser);
                        System.out.println(result);
                        System.exit(0);
                    }
                } throw new IOException();
        }
    }
}



