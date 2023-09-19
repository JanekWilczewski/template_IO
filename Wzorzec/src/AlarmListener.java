interface AlarmListener {
    void onTemperatureAlarm(String sensorName, double temperature);
    void onHumidityAlarm(String sensorName, double humidity);

    void onVibrationAlarm(String sensorName, double vibration);
}