package GUI.zadanie_08_01;

import GUI.zadanie_07_02.Purchase;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<String, Student>();
        ArrayList<Student> students = new ArrayList<>();
        Path path = Path.of("C:\\Users\\annar\\inputData.txt");
        try{
            Files.lines(path).forEach(line -> {
                String arr[] = {"","",""};
                int indeks = 0;
                for(int i = 0; i < line.length(); i++){
                    if(line.charAt(i) == ' '){
                        indeks++;
                    }else arr[indeks] += line.charAt(i);
                }
                students.add(new Student(arr[0], arr[1], arr[2]));
            });
        }catch(FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<String> grupy = new ArrayList<>();
        for(int i =0; i < students.size(); i++){
            String imie = null;
            String grupa = students.get(i).grupa;
            if(!grupy.contains(grupa)){
                int najlepszyWynik = 0;
                for(int j = 0; j < students.size(); j++){
                    if(students.get(j).grupa.equals(grupa)){
                        if(Integer.parseInt(students.get(j).wynik) > najlepszyWynik){
                            najlepszyWynik = Integer.parseInt(students.get(j).wynik);
                            imie = students.get(j).imie;
                        }
                    }
                }
                map.put(grupa, new Student(imie,grupa, String.valueOf(najlepszyWynik)));
                grupy.add(grupa);
            }
        }
        for(String key : map.keySet()){
            System.out.println("Group " + key + " -> " + map.get(key));
        }
    }
}
