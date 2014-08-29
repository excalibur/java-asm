import sizeof.agent.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
public class A {
   
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

        System.out.println("StringBuilder size is:" + SizeOfAgent.fullSizeOf(sb));
        System.out.println("boolean size is:" + SizeOfAgent.fullSizeOf(falseBoolean));
        System.out.println("int size is:" + SizeOfAgent.fullSizeOf(zeroInt));
        System.out.println("Long size is:" + SizeOfAgent.fullSizeOf(zeroLong));
        System.out.println("Long size is:" + SizeOfAgent.fullSizeOf(zeroLongP));
        System.out.println("Long size is:" + SizeOfAgent.fullSizeOf(maxLong));
        System.out.println("Long size is:" + SizeOfAgent.fullSizeOf(minLongP));
        System.out.println("String size is:" + SizeOfAgent.fullSizeOf(emptyString));
        System.out.println("String size is:" + SizeOfAgent.fullSizeOf(string));
        System.out.println("String[]  size is:" + SizeOfAgent.fullSizeOf(strings));
        System.out.println("String[]  size is:" + SizeOfAgent.fullSizeOf(moreStrings));
        System.out.println("List<String>  size is:" + SizeOfAgent.fullSizeOf(someStrings));
        System.out.println("EmptyClass size is:" + SizeOfAgent.fullSizeOf(empty));
        System.out.println("BigDecimal size is:" + SizeOfAgent.fullSizeOf(bd));
        System.out.println("Calendar size is:" + SizeOfAgent.fullSizeOf(calendar));
        System.out.println(SizeOfAgent.fullSizeOf(new Object()));
    }
}