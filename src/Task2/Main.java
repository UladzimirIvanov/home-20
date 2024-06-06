package Task2;

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

        System.out.println();

        SelectionSortThread selectionSortThread = new SelectionSortThread(userArr);
        InsertionSortThread insertionSortThread = new InsertionSortThread(userArr);
        BubbleSortThread bubbleSortThread = new BubbleSortThread(userArr);

        selectionSortThread.start();
        selectionSortThread.join();
        insertionSortThread.start();
        insertionSortThread.join();
        bubbleSortThread.start();
        bubbleSortThread.join();
    }
}
