class Hygrometer implements HumiditySensor {
    private String name;
    private double humidity;

    public Hygrometer(String name, double humidity) {
        this.name = name;
        this.humidity = humidity;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getHumidity() {
        return humidity;
    }
}
