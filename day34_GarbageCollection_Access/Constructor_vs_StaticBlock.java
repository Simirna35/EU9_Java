package day34_GarbageCollection_Access;

public class Constructor_vs_StaticBlock {

    static {
        System.out.println("Static Block");
    }
    public Constructor_vs_StaticBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
    }
}
