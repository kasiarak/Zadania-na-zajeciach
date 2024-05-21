package GUI.zadanie_09_02;

public class Main {
    public static void main(String[] args) {
        MyThread[] threads = new MyThread[5];
        for(int i = 0; i < threads.length; i++){
            threads[i] = new MyThread((char)('a' + i));
        }
        for(Thread thread : threads){
            thread.start();
        }
        for(int i = 0; i < threads.length; i++){
            try {
                if(i == 0) threads[i].suspendThread();
                else{
                    threads[i-1].resumeThread();
                    threads[i].suspendThread();
                }
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        for(MyThread thread : threads){
            thread.interrupt();
            System.out.println("Thread " + thread.znak + " exits");
        }
    }
}
