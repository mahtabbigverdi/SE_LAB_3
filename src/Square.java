public class Square extends Shape{
    private double width;

    Square(double width) {
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double computeArea() {
        if (this.width < 0)
            return -1;
        return this.width * this.width;
    }

}
