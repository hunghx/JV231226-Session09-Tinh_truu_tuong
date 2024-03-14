package ra.abtraction;

public interface Colorable {
    // thuộc tính -  hằng số
    public static final String DEFAULT_COLOR  = "FFF";
    String RED_COLOR  = "red";
    // phương thức trừu tượng
    void displayColor();
    // từ JAVA8 trở đi thì có hỗ trợ các phương thức ko phải trừu tượng
    // tu khóa static và từ khóa default
    static void print(){
        System.out.println("hellloworld");
    }
    default void makeColor(){
        System.out.println("deault COlor "+DEFAULT_COLOR);
    }
}
