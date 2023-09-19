class Thermometer implements TemperatureSensor {
    private String name;
    private double temperature;

    public Thermometer(String name, double temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getTemperature() {
        return temperature;
    }
}