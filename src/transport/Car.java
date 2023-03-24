package transport;

public class Car extends Transport<DriverB> {
    private BodyType bodyType;

    public Car(String brand, String model, double engineVolume, DriverB driver, BodyType bodyType) {
        super(brand, model, engineVolume, driver);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void startMove() {
        System.out.println("Автомобиль " + getBrand() + " начал движение");
    }

    @Override
    public void stopMove() {
        System.out.println("Автомобиль " + getBrand() + " завершил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп автомобиля");
    }

    @Override
    public void bestTimeLap() {
        int minLimit = 15;
        int maxLimit = 25;
        int bestTime = (int) (minLimit - (maxLimit - minLimit) * Math.random());
        System.out.println("Лучшее время за круг автомобиля в минутах " + bestTime);
    }

    @Override
    public void maxSpeed() {
        int minLimit = 120;
        int maxLimit = 180;
        int maxSpeed = (int) (minLimit - (maxLimit - minLimit) * Math.random());
        System.out.println("Максимальная скорость автомобиля " + maxSpeed);
    }

    public enum BodyType {
        SEDAN("Седан"), HATCHBACK("Хэтчбэк"), CUPE("Купе"), UNIVERSAL("Универсал"),
        OFFROAD("Внедорожник"), CROSS("Кроссовер"), PICKUP("Пикап"), FURGON("Фургон"), MINIVAN("Минивен");

        private String bodyType;

        BodyType(String bodyType) {
            this.bodyType = bodyType;
        }

         public String getBodyType() {
             return bodyType;
         }

        public void setBodyType(String bodyType) {
            this.bodyType = bodyType;
        }
        @Override
        public String toString() {return "Тип кузова: " + getBodyType();}

    }

    public void printType() {
        System.out.println(bodyType);
    }

    @Override
    public void doDiagnostics() {
        System.out.println("Атомобиль проходит диагностику");
    }


}
