public class Discount {

    private double percentage;

    public Discount(){}

    public Discount(double percentage) {

        this.percentage=percentage;
    }
    public void setDiscount(double percentage){
        this.percentage=percentage;
    }


    public double getPercentage() {
        return percentage;
    }
}
