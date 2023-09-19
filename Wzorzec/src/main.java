

public class main {
    public static void main(String[] args) {

        EnvironmentMonitor monitor = new EnvironmentMonitor(30.0, 60.0, 2.0);

        monitor.addTemperatureSensor(new Thermometer("Bieszczady", 25.5));
        monitor.addTemperatureSensor(new Thermometer("Płock", 28.3));
        monitor.addHumiditySensor(new Hygrometer("Tatry", 65.0));
        monitor.addvibrationSensors(new Seismometer("Japonia", 3.0));

        monitor.addAlarmListener(new SMSAlarmListener());

        monitor.monitor();
    }
}