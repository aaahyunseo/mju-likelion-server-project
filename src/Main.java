public class Main {
    public static void main(String[] args) {

        //부품 선택
        Cpu selectCpu = new Cpu("Cpu",100000, ManufacturerType.INTEL,500, PurposeType.OFFICE);
        Ram selectRam = new Ram("Ram",200000, ManufacturerType.SAMSUNG,1000);
        GraphicsCard selectGraphicsCard = new GraphicsCard("GraphicsCard",300000, ManufacturerType.AMD, PurposeType.GAME);
        PowerSupplier selectPowerSupplier = new PowerSupplier("PowerSupplier",150000, ManufacturerType.COOLER_MASTER,"출력");
        Cooler selectCooler = new Cooler("Cooler",60000, ManufacturerType.COOLER_MASTER, CoolerType.AIR);
        Mouse selectMouse = new Mouse("Mouse",50000, ManufacturerType.LOGITECH);
        Keyboard selectKeyboard = new Keyboard("Keyboard",60000, ManufacturerType.LOGITECH, KeyType.ANSI);
        Monitor selectMonitor = new Monitor("Monitor",300000, ManufacturerType.LG,70);

        //부품 조립
        Computer com = new Computer.ComputerBuilder()
                .cpu(selectCpu)
                .ram(selectRam)
                .graphicsCard(selectGraphicsCard)
                .powerSupplier(selectPowerSupplier)
                .cooler(selectCooler)
                .monitor(selectMonitor)
                .build();

        //컴퓨터 작동(com)
        System.out.println("\n-----컴퓨터 부팅-----");
        com.boot();
        System.out.println("\n-----기능 구현-----");
        com.run();
        System.out.println("\n-----컴퓨터 종료-----");
        com.shutDown();
    }

}