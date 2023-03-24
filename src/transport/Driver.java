package transport;

public abstract class Driver {
    private String FIO;
    private boolean availLicense;
    private int experience;

    public Driver(String FIO,
                  boolean availLicense,
                  int experience) {
        this.FIO = FIO;
        this.availLicense = availLicense;
        this.experience = experience;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public boolean isAvailLicense() {
        return availLicense;
    }

    public void setAvailLicense(boolean availLicense) {
            this.availLicense = availLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public abstract void startMove();
    public abstract void stopMove();
    public abstract void getFuel();
}
