public class Main {
    public static void main(String[] args) {
        System.out.println("-------Laptop characteristics-------");
        Laptop laptop = new Laptop("Macbook pro M1","Space Grey","no videocard");
        System.out.println(laptop.getInfo());
        System.out.println("-------Display-------");
        Display display = new Display(13.3,"M1 pro and M1 MAX","IPS");
        System.out.println(display.getInfo());
        System.out.println("-------USBport-------");
        USBport usBport = new USBport(3.1,"12L");
        System.out.println(usBport.getInfo());
        System.out.println("-------SSD-------");
        SSD ssd = new SSD("8gb","3");
        System.out.println(ssd.getInfo());
        System.out.println("-------operativMemory-------");
        OperativMemory operativMemory = new OperativMemory("256Gb","DIMM & SODIMM");
        System.out.println(operativMemory.getInfo());
        System.out.println("-------Keyboard-------");
        Keyboard keyboard = new Keyboard("YES","NO");
        System.out.println(keyboard.getInfo());



    }
}