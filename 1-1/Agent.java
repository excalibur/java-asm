import java.lang.instrument.Instrumentation;


public class Agent {
  public static void premain(String args, Instrumentation inst) {
    Object obj = new Object();
    System.out.println("Bytes used by Object:"+ inst.getObjectSize(obj));
  }
  public static void main(String[] args) {
    System.out.println("main is over");
  }
}