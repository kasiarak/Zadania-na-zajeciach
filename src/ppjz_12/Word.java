package ppjz_12;

public class Word {
    char[] tablica;
    int x;
    public Word(){
        this.tablica = new char[100];
        this.x = 0;
    }
    public void addChar(char y){
            tablica[x] = y;
            x++;
    }
    public void show(){
        for(int i = 0; i < x; i++){
            System.out.println(tablica[i]);
        }
    }
    public void length(){
        System.out.println(tablica.length);
    }

    public static void main(String[] args) {
        Word word = new Word();
        word.addChar('A');
        word.addChar('B');
        word.show();
        word.length();
    }
}
