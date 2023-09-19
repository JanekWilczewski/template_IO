class SMSAlarmListener implements AlarmListener {
    @Override
    public void onTemperatureAlarm(String sensorName, double temperature) {
        System.out.println("Wysyłanie powiadomienia SMS dla sensora: " + sensorName + ", Temperatura: " + temperature);
    }

    @Override
    public void onHumidityAlarm(String sensorName, double humidity) {
        System.out.println("Wysyłanie powiadomienia SMS dla sensora: " + sensorName + ", Wilgotnosc: " + humidity);
    }

    @Override
    public void onVibrationAlarm(String sensorName, double vibration) {
        System.out.println("Wysyłanie powiadomienia SMS dla sensora: " + sensorName + ", Trzesienie: " + vibration + " w skali Richtera");
    }
}
