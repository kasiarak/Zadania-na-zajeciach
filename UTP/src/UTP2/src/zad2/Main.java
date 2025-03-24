package zad2;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    Function<String, List<String>> flines = (String path) -> {
      ArrayList<String> lines = new ArrayList<>();
      try {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String line;
        while((line = bufferedReader.readLine()) != null) {
          lines.add(line);
        }
        bufferedReader.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
      return lines;
    };

    Function<List<String>, String> join = (List<String> lines) -> String.join("", lines);

    Function<String, List<Integer>> collectInts = (String s) -> {
      Pattern pattern = Pattern.compile("-?\\d+");
      Matcher matcher = pattern.matcher(s);

      ArrayList<Integer> list = new ArrayList<>();
      while (matcher.find()) {
        list.add(Integer.parseInt(matcher.group()));
      }

      return list;
    };

    Function<List<Integer>, Integer> sum = (List<Integer> numbers) -> {
      int x = 0;
      for(Integer number : numbers) {
        x += number;
      }
      return x;
    };

    String fname = System.getProperty("user.home") + "/LamComFile.txt";
    InputConverter<String> fileConv = new InputConverter<>(fname);
    List<String> lines = fileConv.convertBy(flines);
    String text = fileConv.convertBy(flines, join);
    List<Integer> ints = fileConv.convertBy(flines, join, collectInts);
    Integer sumints = fileConv.convertBy(flines, join, collectInts, sum);

    System.out.println(lines);
    System.out.println(text);
    System.out.println(ints);
    System.out.println(sumints);

    List<String> arglist = Arrays.asList(args);
    InputConverter<List<String>> slistConv = new InputConverter<>(arglist);
    sumints = slistConv.convertBy(join, collectInts, sum);
    System.out.println(sumints);
  }
}
