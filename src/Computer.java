public class Computer {

    private Cpu cpu;    //필수
    private Ram ram;    //필수
    private GraphicsCard graphicsCard;  //필수
    private PowerSupplier powerSupplier;    //필수
    private Cooler cooler;  //선택
    private Mouse mouse;    //선택
    private Keyboard keyboard;  //선택
    private Monitor monitor;    //선택

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
            computer.cooler = this.cooler;
            computer.mouse = this.mouse;
            computer.keyboard = this.keyboard;
            computer.monitor = this.monitor;
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
        try{
            cooler.on();
        }catch (NullPointerException e){
            System.out.println("Cooler 없음.");
        }
        try{
            mouse.on();
        }catch (NullPointerException e){
            System.out.println("Mouse 없음");
        }
        try{
            keyboard.on();
        }catch (NullPointerException e){
            System.out.println("Keyboard 없음");
        }
        try{
            monitor.on();
        }catch (NullPointerException e){
            System.out.println("Monitor 없음");
        }
    }

    //컴퓨터 종료 함수
    public void shutdown(){
        System.out.println("컴퓨터 종료합니다.");
        cpu.off();
        ram.off();
        graphicsCard.off();
        powerSupplier.off();
        //선택 부품 부분
        try{
            cooler.off();
        }catch (NullPointerException e){
            //cooler 부품 없음.
        }
        try{
            mouse.off();
        }catch (NullPointerException e){
            //mouse 부품 없음.
        }
        try{
            keyboard.off();
        }catch (NullPointerException e){
            //keyboard 부품 없음.
        }
        try{
            monitor.off();
        }catch (NullPointerException e){
            //monitor 부품 없음.
        }
    }

    //부품 기능 실행 함수
    public void run(){
        System.out.println("컴퓨터의 기능을 전부 실행합니다.");
        cpu.ProcessInstruction();
        ram.readData();
        graphicsCard.render();
        powerSupplier.supplyPower();
        //선택 부품 부분
        try{
            cooler.cool();
        }catch (NullPointerException e){
            //cooler 부품 없음.
        }
        try{
            mouse.click();
        }catch (NullPointerException e){
            //mouse 부품 없음.
        }
        try{
            keyboard.type();
        }catch (NullPointerException e){
            //keyboard 부품 없음.
        }
        try{
            monitor.display();
        }catch (NullPointerException e){
            //monitor 부품 없음.
        }

    }

}