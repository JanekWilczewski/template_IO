class Seismometer implements VibrationSensor{
    private String name;
    private double scale;

    public Seismometer(String name, double scale) {
        this.name = name;
        this.scale = scale;
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public double getScale() {
        return scale;
    }
}
