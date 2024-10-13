package GUI.zadanie_03_01;

import java.util.Comparator;

public class MyColorCompar implements Comparator<MyColor> {

    ColComponent colComponent;
    public MyColorCompar(ColComponent colComponent){
        this.colComponent = colComponent;
    }

    @Override
    public int compare(MyColor o1, MyColor o2) {
        switch (this.colComponent){
            case RED ->{
                return o1.getRed() - o2.getRed();
            }
            case BLUE ->{
                return o1.getBlue() - o2.getBlue();
            }
            case GREEN->{
                return o1.getGreen() - o2.getGreen();
            }
            default->{
                return o1.getSuma() - o2.getSuma();
            }
        }
    }
}
