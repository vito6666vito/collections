package transport;

public class DriverB extends Driver{
    public DriverB(String FIO, boolean availLicense, int experience) {
        super(FIO, availLicense, experience);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории В " +getFIO()+ " начал движение");
    }

    @Override
    public void stopMove() {
        System.out.println("Водитель категории В " +getFIO()+ " завершил движение");
    }

    @Override
    public void getFuel() {
        System.out.println("Водитель категории В " +getFIO()+ " заправляется");
    }
}
