package Task2;

public class BubbleSortThread extends Thread {
    int[] arrForMain;

    public BubbleSortThread(int[] arrForMain) {
        this.arrForMain = arrForMain;
    }

    @Override
    public void run() {
        System.out.println("Сортировка пузырьком");
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arrForMain.length - 1; i++) {
                if (arrForMain[i] > arrForMain[i + 1]) {
                    temp = arrForMain[i];
                    arrForMain[i] = arrForMain[i + 1];
                    arrForMain[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        for (int i = 0; i < arrForMain.length; i++) {
            System.out.print(arrForMain[i] + " ");
        }
        System.out.println();
    }
}
