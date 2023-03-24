package transport;

public class Truck extends Transport<DriverC> {
    private LoadType loadType;

    public Truck(String brand, String model, double engineVolume, DriverC driver, LoadType loadType) {
        super(brand, model, engineVolume, driver);
        this.loadType = loadType;
    }

    @Override
    public void startMove() {
        System.out.println("Грузовик " + getBrand() + " начал движение");
    }

    @Override
    public void stopMove() {
        System.out.println("Грузовик " + getBrand() + " завершил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп грузовика");
    }

    @Override
    public void bestTimeLap() {
        int minLimit = 15;
        int maxLimit = 25;
        int bestTime = (int) (minLimit - (maxLimit - minLimit) * Math.random());
        System.out.println("Лучшее время за круг грузовика в минутах " + bestTime);
    }

    @Override
    public void maxSpeed() {
        int minLimit = 100;
        int maxLimit = 150;
        int maxSpeed = (int) (minLimit - (maxLimit - minLimit) * Math.random());
        System.out.println("Максимальная скорость грузовика " + maxSpeed);

    }

    public enum LoadType {
        N1(0F, 3.5F), N2(3.5F, 12F), N3(12F, 52F);
        private Float minLimit;
        private Float maxLimit;

        LoadType(Float minLimit, Float maxLimit) {
            this.minLimit = minLimit;
            this.maxLimit = maxLimit;
        }

        public float getMinLimit() {
           if (minLimit <= 3.5 || minLimit == null) {
               System.out.println("Грузоподъемность: до " + getMaxLimit() + " тонн");
           }
            return minLimit;
        }

        public void setMinLimit(Float minLimit) {
            this.minLimit = minLimit;
        }

        public float getMaxLimit() {
            if (maxLimit >= 12 || maxLimit == null) {
                System.out.println("Грузоподъемность: от " + getMinLimit() + " тонн");
            }
            return maxLimit;
        }

        public void setMaxLimit(Float maxLimit) {
            this.maxLimit = maxLimit;
        }

        @Override
        public String toString() {
            return "от " + getMinLimit() +
                    " тонн до " + getMaxLimit() + " тонн";
        }

    }
    @Override
    public void printType() {
        System.out.println("Грузоподъемность: "+ loadType);
    }

    @Override
    public void doDiagnostics() {
        System.out.println("Грузовик проходит диагностику");
    }
}