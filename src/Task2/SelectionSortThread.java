package Task2;

public class SelectionSortThread extends Thread {
    int[] arrForMain;

    public SelectionSortThread(int[] arrForMain) {
        this.arrForMain = arrForMain;
    }

    @Override
    public void run() {
        System.out.println("Сортировка выбором:");
        for (int i = 0; i < arrForMain.length; i++) {
            int minValue = arrForMain[i];
            int minId = i;
            for (int j = i + 1; j < arrForMain.length; j++) {
                if (arrForMain[j] < minValue){
                    minValue = arrForMain[j];
                    minId = j;
                }
            }
            int temp = arrForMain[i];
            arrForMain[i] = minValue;
            arrForMain[minId] = temp;
            System.out.print(arrForMain[i] + " ");
        }
        System.out.println();
    }
}