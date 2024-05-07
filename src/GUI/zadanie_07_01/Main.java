package GUI.zadanie_07_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] arr = {
                "salon A", "Mercedes", "130000",
                "salon B", "Mercedes", "120000",
                "salon C", "Ford", "110000",
                "salon B", "Opel", "90000",
                "salon C", "Honda", "95000",
                "salon A", "Ford", "105000",
                "salon A", "Renault", "75000"
        };
        Map<String, List<Car>> map = new HashMap<>();
        for(int i = 0; i < arr.length; i+=3){
            if(map.containsKey(arr[i])){
                map.get(arr[i]).add(new Car(arr[i+1], arr[i+2]));
            }else{
                List<Car> list = new ArrayList<>();
                list.add(new Car(arr[i+1],arr[i+2]));
                map.put(arr[i], list);
            }
        }
        for (String key : map.keySet()) {
            List<Car> list = map.get(key);
            System.out.print(key + " = ");
            for (Car car : list) {
                System.out.print(car + " ");
            }
            System.out.print("\n");
        }
        String key = "";
        int index = 0;
        int lowestPrice = Integer.parseInt(map.get("salon A").get(0).cena);
        for (String keySet : map.keySet()) {
            List<Car> list = map.get(keySet);
            for (Car car : list) {
                if(Integer.parseInt(car.cena)<lowestPrice){
                    lowestPrice = Integer.parseInt(car.cena);
                    key = keySet;
                    index = list.indexOf(car);
                }
            }
        }
       System.out.println(map.get(key).get(index));
    }
}
