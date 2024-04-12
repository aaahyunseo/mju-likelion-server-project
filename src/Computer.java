import java.util.ArrayList;
import java.util.List;

public class Computer {

    private Cpu cpu;    //필수
    private Ram ram;    //필수
    private GraphicsCard graphicsCard;  //필수
    private PowerSupplier powerSupplier;    //필수
    private static List<Part> AdditionalParts;   //부가적 부품들

    public Computer(Cpu cpu, Ram ram, GraphicsCard graphicsCard, PowerSupplier powerSupplier) {
        this.cpu = cpu;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.powerSupplier = powerSupplier;
    }

    //디자인패턴(builder pattern)
    public static class ComputerBuilder {
        private Cpu cpu;
        private Ram ram;
        private GraphicsCard graphicsCard;
        private PowerSupplier powerSupplier;
        private Cooler cooler;
        private Mouse mouse;
        private Keyboard keyboard;
        private Monitor monitor;

        public ComputerBuilder cpu(Cpu cpu) {
            this.cpu = cpu;
            return this;
        }
        public ComputerBuilder ram(Ram ram) {
            this.ram = ram;
            return this;
        }
        public ComputerBuilder graphicsCard(GraphicsCard graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }
        public ComputerBuilder powerSupplier(PowerSupplier powerSupplier) {
            this.powerSupplier = powerSupplier;
            return this;
        }
        public ComputerBuilder cooler(Cooler cooler) {
            this.cooler = cooler;
            return this;
        }
        public ComputerBuilder mouse(Mouse mouse) {
            this.mouse = mouse;
            return this;
        }
        public ComputerBuilder keyboard(Keyboard keyboard) {
            this.keyboard = keyboard;
            return this;
        }
        public ComputerBuilder monitor(Monitor monitor) {
            this.monitor = monitor;
            return this;
        }

        public Computer build() {
            Computer computer = new Computer(cpu, ram, graphicsCard, powerSupplier);
            AdditionalParts = new ArrayList<>();

            //부가적 부품들이 선택되었을 때만 리스트에 추가하기
            if(cooler != null){
                AdditionalParts.add(cooler);
            }
            if(mouse != null){
                AdditionalParts.add(mouse);
            }
            if(keyboard != null){
                AdditionalParts.add(keyboard);
            }
            if(monitor != null){
                AdditionalParts.add(monitor);
            }
            return computer;
        }
    }

    //컴퓨터 부팅 함수
    public void boot(){
        System.out.println("컴퓨터 부팅합니다.");
        cpu.on();
        ram.on();
        graphicsCard.on();
        powerSupplier.on();
        //선택 부품 부분
        for(Part part : AdditionalParts){
            part.on();
        }
    }

    //컴퓨터 종료 함수
    public void shutDown(){
        System.out.println("컴퓨터 종료합니다.");
        cpu.off();
        ram.off();
        graphicsCard.off();
        powerSupplier.off();
        //선택 부품 부분
        for(Part part : AdditionalParts){
            part.off();
        }
    }

    //부품 기능 실행 함수
    public void run(){
        System.out.println("컴퓨터의 기능을 전부 실행합니다.");
        cpu.run();
        ram.run();
        graphicsCard.run();
        powerSupplier.run();
        //선택 부품 부분
        for(Part part : AdditionalParts){
            part.run();
        }
    }

}