public class Cooler extends Part implements Power{
    private String coolingMethod;   //냉각방식

    public Cooler(String name, int price, String manufacturer, String coolingMethod) {
        super(name, price, manufacturer);
        this.coolingMethod = coolingMethod;
    }

    //cooler 기능
    public void cool(){
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