public class Computer extends AbstractEntity{
    private String brand;
    private boolean portable;
    private int ram;
    private int cpuSpeedGHZ;
    
    
    public Computer(String aBrand, boolean isPortable, int amountOfRAM, int aCpuSpeed) {
        brand = aBrand;
        portable = isPortable;
        ram = amountOfRAM;
        cpuSpeedGHZ = aCpuSpeed;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public boolean isPortable() {
        return portable;
    }
    
    public int getRam() {
        return ram;
    }
    
    public int getCpuSpeedGHZ() {
        return cpuSpeedGHZ;
    }
}
