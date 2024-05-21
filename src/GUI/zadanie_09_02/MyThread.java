package GUI.zadanie_09_02;

public class MyThread extends Thread{
    char znak;
    private boolean suspended = false;

    public MyThread(char znak) {
        this.znak = znak;
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                synchronized (this) {
                    while (suspended) {
                        wait();
                    }
                }
                System.out.print(znak);
                Thread.sleep(100 + (int) (Math.random() * 900));
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void suspendThread() {
        System.out.println("suspending " + this.znak);
        synchronized (this) {
            suspended = true;
        }
    }

    public void resumeThread() {
        System.out.println("\nResuming " + this.znak);
        synchronized (this) {
            suspended = false;
            notify();
        }
    }
}
