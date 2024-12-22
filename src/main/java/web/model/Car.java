package web.model;

public class Car {

    private String brand;
    private String series;
    private String country;

    public Car() {
    }

    public Car(String brand, String series, String country) {
        this.brand = brand;
        this.series = series;
        this.country = country;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", series=" + series +
                ", country='" + country + '\'' +
                '}';
    }
}
