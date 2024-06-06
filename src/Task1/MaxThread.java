package Task1;

public class MaxThread extends Thread{
    int[] arrForMain;
    int maxNumb = 0;

    public MaxThread(int[] arrForMain) {
        this.arrForMain = arrForMain;
    }

    @Override
    public void run() {
        maxNumb = arrForMain[0];
        for (int i = 0; i < arrForMain.length; i++) {
            if (arrForMain[i] > maxNumb){
                maxNumb = arrForMain[i];
            }
        }
        System.out.println("Максимальное число введённое пользователем: " + maxNumb);
    }
}