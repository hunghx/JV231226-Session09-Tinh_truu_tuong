package ra.abtraction;

public abstract class Shape { // lớp từu tượng
    // thuộc tính
    private int side;
    private String color;
    private boolean isFill;
    // constructors
    public Shape() {
    }

    public Shape(int side, String color, boolean isFill) {
        this.side = side;
        this.color = color;
        this.isFill = isFill;
    }
    // getter setter
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFill() {
        return isFill;
    }

    public void setFill(boolean fill) {
        isFill = fill;
    }

    // các phuong thức khác
    public void displayInfo(){
        System.out.println("side = "+side+" | color = "+color +" | isFill = "+isFill);
    }

    // các phương thức trừu tượng

    public abstract double getArea();// tính diện
    public abstract double getPerimeter(); // tinnh chu vi
}
