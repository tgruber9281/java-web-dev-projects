public class Smartphone extends Computer{
    String name;
    int screenSize;
    boolean hasHeadPhoneJack;
    boolean hasWirelessCharging;
    public Smartphone(String aBrand, boolean isPortable, int amountOfRAM, int aCpuSpeed,
                      String aName, int aScreenSize, boolean hasHeadPhoneJack, boolean hasWirelessCharging) {
        super(aBrand, isPortable, amountOfRAM, aCpuSpeed);
        name = aName;
        screenSize = aScreenSize;
        this.hasHeadPhoneJack = hasHeadPhoneJack;
        this.hasWirelessCharging = hasWirelessCharging;
    }
    
    public String getName() {
        return name;
    }
    
    public int getScreenSize() {
        return screenSize;
    }
    
    public boolean isHasHeadPhoneJack() {
        return hasHeadPhoneJack;
    }
    
    public boolean isHasWirelessCharging() {
        return hasWirelessCharging;
    }
}
