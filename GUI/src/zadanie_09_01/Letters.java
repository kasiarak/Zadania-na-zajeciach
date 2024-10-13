package GUI.zadanie_09_01;

import java.sql.Array;
import java.util.Arrays;
import java.util.Iterator;

public class Letters implements Iterable<Thread>{
    Thread[] threads;
    public Letters(String znaki){
        threads = new Thread[znaki.length()];
        for(int i = 0; i < znaki.length(); i++){
            threads[i] = new Thread(new LetterThread(znaki.charAt(i)));
        }
    }
    public void start() {
        for(Thread thread : threads){
            thread.start();
        }
    }
    public void stop(){
        for(Thread thread : threads){
            thread.interrupt();
        }
    }

    @Override
    public Iterator<Thread> iterator() {
        return Arrays.stream(threads).iterator();
    }
}
