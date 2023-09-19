import java.util.ArrayList;
import java.util.List;
public class EnvironmentMonitor {
    private List<TemperatureSensor> temperatureSensors;
    private List<HumiditySensor> humiditySensors;

    private List<VibrationSensor> vibrationSensors;
    private List<AlarmListener> alarmListeners;
    private double temperatureThreshold;
    private double humidityThreshold;
    private double vibrationThreshold;

    public EnvironmentMonitor(double temperatureThreshold, double humidityThreshold, double vibrationThreshold) {
        this.temperatureSensors = new ArrayList<>();
        this.humiditySensors = new ArrayList<>();
        this.vibrationSensors = new ArrayList<>();
        this.alarmListeners = new ArrayList<>();
        this.temperatureThreshold = temperatureThreshold;
        this.humidityThreshold = humidityThreshold;
        this.vibrationThreshold = vibrationThreshold;
    }

    public void addTemperatureSensor(TemperatureSensor sensor) {
        temperatureSensors.add(sensor);
    }

    public void addHumiditySensor(HumiditySensor sensor) {
        humiditySensors.add(sensor);
    }

    public void addvibrationSensors(VibrationSensor sensor) {
        vibrationSensors.add(sensor);
    }


    public void addAlarmListener(AlarmListener listener) {
        alarmListeners.add(listener);
    }

    public void monitor() {
        for (TemperatureSensor sensor : temperatureSensors) {
            double temperature = sensor.getTemperature();
            System.out.println("Sensor: " + sensor.getName() + ", Temperatura: " + temperature);

            if (temperature > temperatureThreshold) {
                notifyTemperatureAlarmListeners(sensor.getName(), temperature);
            }
        }

        for (HumiditySensor sensor : humiditySensors) {
            double humidity = sensor.getHumidity();
            System.out.println("Sensor: " + sensor.getName() + ", Wigotnosc: " + humidity);

            if (humidity > humidityThreshold) {
                notifyHumidityAlarmListeners(sensor.getName(), humidity);
            }
        }

        for (VibrationSensor sensor : vibrationSensors) {
            double vibration = sensor.getScale();
            System.out.println("Sensor: " + sensor.getName() + ", Trzesienie: " + vibration + " w skali Richtera");

            if (vibration > vibrationThreshold) {
                notifyVibrationAlarmListeners(sensor.getName(), vibration);
            }
        }
    }

    private void notifyTemperatureAlarmListeners(String sensorName, double temperature) {
        for (AlarmListener listener : alarmListeners) {
            listener.onTemperatureAlarm(sensorName, temperature);
        }
    }

    private void notifyHumidityAlarmListeners(String sensorName, double humidity) {
        for (AlarmListener listener : alarmListeners) {
            listener.onHumidityAlarm(sensorName, humidity);
        }
    }

    private void notifyVibrationAlarmListeners(String sensorName, double vibration) {
        for (AlarmListener listener : alarmListeners) {
            listener.onVibrationAlarm(sensorName, vibration);
        }
    }

}
