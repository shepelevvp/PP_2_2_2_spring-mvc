package web.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Car {

    @NotEmpty(message = "Brand should not be empfy")
    @Size(min=1, max=50, message = "Brand should be between 1 and 50 characters")
    private String brand;

    @NotEmpty(message = "Series should not be empfy")
    @Size(min=1, max=50, message = "Series should be between 1 and 50 characters")
    private String series;

    @NotEmpty(message = "Country should not be empfy")
    @Size(min=1, max=50, message = "Country should be between 1 and 50 characters")
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
