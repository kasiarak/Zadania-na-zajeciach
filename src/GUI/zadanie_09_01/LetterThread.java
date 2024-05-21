package GUI.zadanie_09_01;

public class LetterThread implements Runnable{
    char znak;

    public LetterThread(char znak) {
        this.znak = znak;
    }

    @Override
    public void run() {
        try{
            while (true){
                System.out.print(znak);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            throw new RuntimeException();
        }
    }
}
