import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // task 1

        int money[] = new int[30];
        for (int i = 0; i < money.length; i++) {
            if (i % 2 == 0) {
                money[i] = i + 121000;
            } else if (i % 5 == 0) {
                money[i] = i + 125000;
            } else if (i % 7 == 0) {
                money[i] = i + 185000;
            } else {
                money[i] = i + 165000;
            }


        }

        int sum = 0;
        for (int i = 0; i < money.length; i++) {
            sum += money[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        int min = money[0];

        for (int i = 0; i < money.length; i++) {
            if (money[i] < min) {
                min = money[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");

        int max = money[0];

        for (int i = 0; i < money.length; i++) {
            if (money[i] > max) {
                max = money[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");

        int averageSum = 0;
        for (int i = 0; i < money.length; i++) {
            averageSum += money[i];
        }
        System.out.println("Средняя сумма трат за месяц составила " + averageSum / money.length + " рублей");

        System.out.println();

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int arrayLength = reverseFullName.length;
        int halfOfArrayLength = arrayLength / 2;
        int save;
        for (int i = 0; i < halfOfArrayLength; i++) {
            save = reverseFullName[i];
            reverseFullName[i] = reverseFullName[arrayLength - i - 1];
            reverseFullName[arrayLength - i - 1] = (char) save;
        }
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }
        }
    }


