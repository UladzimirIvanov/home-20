package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа через пробел");
        String[] userInput = scanner.nextLine().split(" ");
        int[] userArr = new int[userInput.length];

        for (int i = 0; i < userInput.length; i++) {
            userArr[i] = Integer.parseInt(userInput[i]);
        }

        MinThread minThread = new MinThread(userArr);
        MaxThread maxThread = new MaxThread(userArr);
        minThread.start();
        maxThread.start();

    }
}