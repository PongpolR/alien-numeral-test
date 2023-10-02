package Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Input: ");
    String s = scanner.nextLine();  // input string


    List<Alien> list = new ArrayList<Alien>();
    for (int i = 0; i < s.length(); i++) {
      int value = 0;
      if (s.charAt(i) == 'A') {
        value = 1;
      } else if (s.charAt(i) == 'B') {
        value = 5;
      } else if (s.charAt(i) == 'Z') {
        value = 10;
      } else if (s.charAt(i) == 'L') {
        value = 50;
      } else if (s.charAt(i) == 'C') {
        value = 100;
      } else if (s.charAt(i) == 'D') {
        value = 500;
      } else if (s.charAt(i) == 'R') {
        value = 1000;
      }
      Alien alien = new Alien(""+s.charAt(i), value);
      list.add(alien);
      
    }

    int totalValue = 0;

    for (int i = 0; i < list.size(); i++) {
        if (i != list.size() - 1 && (list.get(i).getValue() < list.get(i+1).getValue())) {
          int valueCurrentIndex = list.get(i).getValue();
          int valueNextIndex = list.get(i+1).getValue();

          totalValue += valueNextIndex - valueCurrentIndex;

          i++;  // skip next index 

        } else {
          totalValue += list.get(i).getValue();
        }
        
    }

    System.out.println(totalValue);

  }
}