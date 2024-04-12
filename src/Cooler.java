public class Cooler extends Part {
    private CoolerType coolingMethod;   //냉각방식

    public Cooler(String name, int price, ManufacturerType manufacturer, CoolerType coolingMethod) {
        super(name, price, manufacturer);
        this.coolingMethod = coolingMethod;
    }

    //cooler 기능
    @Override
    public void run(){
        System.out.println(name + " 냉각합니다.");
    }

    @Override
    public void on() {
        System.out.println("Cooler ON");
    }

    @Override
    public void off() {
        System.out.println("Cooler OFF");
    }
}