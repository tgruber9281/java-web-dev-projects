public class Laptop extends Computer{
    private boolean isTouchScreen;
    private int screenSize;
    private boolean hasNumPad;
    private String name;
    public Laptop(String aBrand, boolean isPortable, int amountOfRAM, int aCpuSpeed,
                  boolean hasTouchScreen, int aScreenSize, boolean hasNumPad, String aName) {
        super(aBrand, isPortable, amountOfRAM, aCpuSpeed);
        isTouchScreen = hasTouchScreen;
        screenSize = aScreenSize;
        this.hasNumPad = hasNumPad;
        name = aName;
    }
    
    public boolean isTouchScreen() {
        return isTouchScreen;
    }
    
    public int getScreenSize() {
        return screenSize;
    }
    
    public boolean isHasNumPad() {
        return hasNumPad;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return "Laptop{" +
                "isTouchScreen=" + isTouchScreen +
                ", screenSize=" + screenSize +
                ", hasNumPad=" + hasNumPad +
                ", name='" + name + '\'' +
                '}';
    }
}
