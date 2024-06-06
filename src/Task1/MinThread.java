package Task1;

public class MinThread extends Thread{
    int[] arrForMain;
    int minNumb = 0;

    public MinThread(int[] arrForMain) {
        this.arrForMain = arrForMain;
    }

    @Override
    public void run() {
        minNumb = arrForMain[0];
        for (int i = 0; i < arrForMain.length; i++) {
            if (arrForMain[i] < minNumb){
                minNumb = arrForMain[i];
            }
        }
        System.out.println("Минимальное число введённое пользователем: " + minNumb);
    }
}