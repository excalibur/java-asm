import sizeof.agent.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
public class D {
   
    public static void main(String [] args) {
		boolean a = true;
        byte b = 1;
        short c = 1;
        char d = 'c';
        int e = 1;
        float f = 1.1F;
        long g = 1L;
        double h = 1.1;


        System.out.println("boolean size is:" + SizeOfAgent.sizeOf(a));
        System.out.println("byte size is:" + SizeOfAgent.sizeOf(b));
        System.out.println("short size is:" + SizeOfAgent.sizeOf(c));
        System.out.println("char size is:" + SizeOfAgent.sizeOf(d));
        System.out.println("int size is:" + SizeOfAgent.sizeOf(e));
        System.out.println("float size is:" + SizeOfAgent.sizeOf(f));
        System.out.println("long size is:" + SizeOfAgent.sizeOf(g));
        System.out.println("double size is:" + SizeOfAgent.sizeOf(h));
       
    }
}