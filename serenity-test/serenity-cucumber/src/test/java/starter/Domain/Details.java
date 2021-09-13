package starter.Domain;

import java.util.Objects;

public class Details {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Details details = (Details) o;
        return Objects.equals(registrationNo, details.registrationNo) &&
                Objects.equals(make, details.make) &&
                Objects.equals(model, details.model) &&
                Objects.equals(color, details.color) &&
                Objects.equals(year, details.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registrationNo, make, model, color, year);
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Details{" +
                "registrationNo='" + registrationNo + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    private final String registrationNo;
    private final String make;
    private final String model;
    private final String color;
    private final String year;

    public Details(String registrationNo, String make, String model, String color, String year) {
        this.registrationNo = registrationNo;
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }
}
