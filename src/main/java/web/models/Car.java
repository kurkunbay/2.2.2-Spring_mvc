package web.models;

public class Car {
    private String marka;
    private String color;
    private int price;

    public Car() {
    }

    public Car(String marka, String color, int price) {
        this.marka = marka;
        this.color = color;
        this.price = price;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

