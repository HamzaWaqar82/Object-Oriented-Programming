public class A {
    public static void main(String[] args) {
        // We cannot use non-static properties inside static 
        // but we can do so by first creating the instance of that class and then refrencing to it. By this way we can use non-static properties inside static
        IPHONE6S first = new IPHONE6S();
        first.displaySpecs();
        System.out.println();
        first.upgrade(4, 128, "pink", true);
        System.out.println();
        first.displaySpecs();

        IPHONE6S secIphone6s = new IPHONE6S();
        secIphone6s.displaySpecs();
        System.out.println();
        secIphone6s.upgrade(8, 512, "Forest Green", true);
        System.out.println();
        secIphone6s.displaySpecs();
    }

}


class IPHONE6S {
    String name = "iphone 6s";
    int ram = 2;
    int rom = 64;
    String color = "Spasce Grey";
    float display = 4.7f;
    boolean fingerPrint = true;
    boolean faceID = false;

    void displaySpecs(){
        System.out.printf("Name: " + this.name + "\nRAM: " +this.ram+ "\nROM: " +this.rom +"\nColor: " +this.color + "\nDIsplay: " +  this.display + "\nFinger Print: " + this.fingerPrint + "\nFAce ID: " + this.faceID);
    }

    void upgrade(int upgradeRAMTO, int upgradeROMTO, String changeColorTO, boolean enableFaceID){
        this.ram = upgradeRAMTO;
        this.rom = upgradeROMTO;
        this.color = changeColorTO;
        this.faceID = enableFaceID;
    }
     
}