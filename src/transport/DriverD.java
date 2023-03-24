package transport;

public class DriverD extends Driver{
    public DriverD(String FIO, boolean availLicense, int experience) {
        super(FIO, availLicense, experience);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории D " +getFIO()+ " начал движение");
    }

    @Override
    public void stopMove() {
        System.out.println("Водитель категории D " +getFIO()+ " завершил движение");
    }

    @Override
    public void getFuel() {
        System.out.println("Водитель категории D " +getFIO()+ " заправляется");
    }
}
