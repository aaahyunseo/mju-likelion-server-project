public class Main {
    public static void main(String[] args) {

        //부품 선택
        Cpu selectCpu = new Cpu("Intel",100000,"A",500,"사무용");
        Ram selectRam = new Ram("Samsung",200000,"B",1000);
        GraphicsCard selectGraphicsCard = new GraphicsCard("Nvidia",300000,"C","게임용");
        PowerSupplier selectPowerSupplier = new PowerSupplier("Cooler Master",150000,"D","출력");
        Cooler selectCooler = new Cooler("Thermaltake",60000,"E","냉각방식");
        Mouse selectMouse = new Mouse("Logitech",50000,"F");
        Keyboard selectKeyboard = new Keyboard("Razer",60000,"G","ANSI");
        Monitor selectMonitor = new Monitor("LG",300000,"H",70);

        //부품 조립
        Computer com = new Computer.ComputerBuilder()
                .cpu(selectCpu)
                .ram(selectRam)
                .graphicsCard(selectGraphicsCard)
                .powerSupplier(selectPowerSupplier)
                .cooler(selectCooler)
                .monitor(selectMonitor)
                .build();

        //컴퓨터 작동(com1)
        System.out.println("\n-----컴퓨터 부팅-----");
        com.boot();
        System.out.println("\n-----기능 구현-----");
        com.run();
        System.out.println("\n-----컴퓨터 종료-----");
        com.shutdown();
    }

}