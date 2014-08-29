import sizeof.agent.*;

public class C {
    private int x;
    private int y;

    public static void main(String [] args) {
        System.out.println(SizeOfAgent.fullSizeOf(new C()));
        System.out.println(SizeOfAgent.fullSizeOf(new Object()));
    }
}