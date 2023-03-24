package transport;

public class DriverC extends Driver{
    public DriverC(String FIO, boolean availLicense, int experience) {
        super(FIO, availLicense, experience);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории С " +getFIO()+ " начал движение");
    }

    @Override
    public void stopMove() {
        System.out.println("Водитель категории С " +getFIO()+ " завершил движение");
    }

    @Override
    public void getFuel() {
        System.out.println("Водитель категории С " +getFIO()+ " заправляется");
    }
}
