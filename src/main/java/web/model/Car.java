package web.model;

public class Car {
    String producer;
    String model;
    int yearOfIssue;

    public Car(String producer, String model, int yearOfIssue) {
        this.producer = producer;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }
}
