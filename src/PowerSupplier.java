public class PowerSupplier extends Part implements Requisite {
    private String output; //출력

    public PowerSupplier(String name, int price, ManufacturerType manufacturer, String output) {
        super(name, price, manufacturer);
        this.output = output;
    }

    //POWER Supplier 기능
    @Override
    public void run(){
        System.out.println(name + " 전원을 공급합니다.");
    }

    @Override
    public void on() {
        System.out.println("POWER Supplier ON");
    }

    @Override
    public void off() {
        System.out.println("POWER Supplier OFF");
    }
}