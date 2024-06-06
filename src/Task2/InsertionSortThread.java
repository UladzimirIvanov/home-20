package Task2;

public class InsertionSortThread extends Thread {
    int[] arrForMain;

    public InsertionSortThread(int[] arrForMain) {
        this.arrForMain = arrForMain;
    }

    @Override
    public void run() {
        System.out.println("Сортировка вставками:");
        for (int i = 1; i < arrForMain.length; i++) {
            int current = arrForMain[i];
            int j = i - 1;
            while (j >= 0 && current < arrForMain[j]) {
                arrForMain[j + 1] = arrForMain[j];
                j--;
            }
            arrForMain[j + 1] = current;
        }

        for (int i = 0; i < arrForMain.length; i++) {
            System.out.print(arrForMain[i] + " ");
        }
        System.out.println();
    }
}