package Test;
public class Alien {
  private String symbol = "";
  private int value = 0;

  public Alien(String  c, int v) {
    symbol = c;
    value = v;
  }

  public String toString(){
    return symbol + " " + value;
  }

  public String getSymbol() {
    return symbol;
  }
  
  public int getValue() {
    return value;
  }
}
