package GUI.zadanie_07_02;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, List<Purchase>> map = new HashMap<>();
        try{
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader("C:\\Users\\annar\\PurchaseList.txt")
            );
            String line;
            while((line = bufferedReader.readLine()) != null) {
                String arr[] = {"","",""};
                int indeks = 0;
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == ' ') {
                        indeks++;
                    } else {
                        arr[indeks] += line.charAt(i);
                    }
                }
                if(map.containsKey(arr[0])){
                    map.get(arr[0]).add(new Purchase(arr[1], arr[2]));
                }else{
                    List<Purchase> list = new ArrayList<>();
                    list.add(new Purchase(arr[1], arr[2]));
                    map.put(arr[0], list);
                }
            }
        }catch(FileNotFoundException e){
            throw new RuntimeException(e);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        try (FileWriter fileWriter = new FileWriter("C:\\Users\\annar\\PurchaseList2.txt")) {
            for(String key : map.keySet()){
                int purchases = 0;
                int totalPrice = 0;
                List<Purchase> list = map.get(key);
                List<String> uniquePurchases = new ArrayList<>();
                for(int j = 0; j < list.size(); j++){
                    totalPrice += Integer.parseInt(list.get(j).getPrice());
                    if(!uniquePurchases.contains(list.get(j).getName())){
                        uniquePurchases.add(list.get(j).getName());
                    }
                }
                fileWriter.write(key + " " + list.size() + " " + uniquePurchases.size() + " " + totalPrice);
                fileWriter.write("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
