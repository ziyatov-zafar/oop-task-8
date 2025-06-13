package converter;

public class BaseConverter {

    public static class KelvinConverter implements Converter {
        @Override
        public double convert(double celsius) {
            return celsius + 273.15;
        }
    }

    public static class FahrenheitConverter implements Converter {
        @Override
        public double convert(double celsius) {
            return (celsius * 9 / 5) + 32;
        }
    }

    public static class ReaumurConverter implements Converter {
        @Override
        public double convert(double celsius) {
            return celsius * 0.8;
        }
    }
}
