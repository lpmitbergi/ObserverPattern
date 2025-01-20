public class ObserverPatternExample {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Display display1 = new Display("Display 1");
        Display display2 = new Display("Display 2");

        weatherStation.addObserver(display1);
        weatherStation.addObserver(display2);

        weatherStation.setTemperature(25);
        weatherStation.setTemperature(30);

        weatherStation.removeObserver(display1);
        weatherStation.setTemperature(20);
    }
}