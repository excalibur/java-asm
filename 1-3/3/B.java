import sizeof.agent.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
public class B {
   
    public static void main(String [] args) {
		final StringBuilder sb = new StringBuilder(1000);
		final boolean falseBoolean = false;
		final int zeroInt = 0;
		final double zeroDouble = 0.0;
		final Long zeroLong = 0L;
		final long zeroLongP = 0L;
		final Long maxLong = Long.MAX_VALUE;
		final Long minLong = Long.MIN_VALUE;
		final long maxLongP = Long.MAX_VALUE;
		final long minLongP = Long.MIN_VALUE;
		final String emptyString = "";
		final String string = "ToBeOrNotToBeThatIsTheQuestion";
		final String[] strings = {emptyString, string, "Dustin"};
		final String[] moreStrings = new String[1000];
		final List<String> someStrings = new ArrayList<String>();
		final EmptyClass empty = new EmptyClass();
		final BigDecimal bd = new BigDecimal("999999999999999999.99999999");
		final Calendar calendar = Calendar.getInstance();

        System.out.println("StringBuilder size is:" + SizeOfAgent.sizeOf(sb));
        System.out.println("boolean size is:" + SizeOfAgent.sizeOf(falseBoolean));
        System.out.println("int size is:" + SizeOfAgent.sizeOf(zeroInt));
        System.out.println("Long size is:" + SizeOfAgent.sizeOf(zeroLong));
        System.out.println("Long size is:" + SizeOfAgent.sizeOf(zeroLongP));
        System.out.println("Long size is:" + SizeOfAgent.sizeOf(maxLong));
        System.out.println("Long size is:" + SizeOfAgent.sizeOf(minLongP));
        System.out.println("String size is:" + SizeOfAgent.sizeOf(emptyString));
        System.out.println("String size is:" + SizeOfAgent.sizeOf(string));
        System.out.println("String[]  size is:" + SizeOfAgent.sizeOf(strings));
        System.out.println("String[]  size is:" + SizeOfAgent.sizeOf(moreStrings));
        System.out.println("List<String>  size is:" + SizeOfAgent.sizeOf(someStrings));
        System.out.println("EmptyClass size is:" + SizeOfAgent.sizeOf(empty));
        System.out.println("BigDecimal size is:" + SizeOfAgent.sizeOf(bd));
        System.out.println("Calendar size is:" + SizeOfAgent.sizeOf(calendar));
        System.out.println(SizeOfAgent.sizeOf(new Object()));
    }
}