package GUI.zadanie_06_01;

import java.util.Iterator;

public class Roll implements Iterable<Integer> {
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int sum = 0;
            int diceRolls[] = new int[3];
            int index = 0;
            @Override
            public boolean hasNext() {
                return sum != 11;
            }
            @Override
            public Integer next() {
                int roll = (int)(1+Math.random()*6);
                diceRolls[index] = roll;
                index++;
                if(index==3) index = 0;
                sum = 0;
                if(diceRolls[2] != 0){
                    for(int i = 0; i < diceRolls.length; i++){
                        sum += diceRolls[i];
                    }
                }
                if(sum!=11){
                    sum -= diceRolls[0];
                }
                return roll;
            }
        };
    }
}
