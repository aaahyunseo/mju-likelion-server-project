public class Mouse extends Part {
    public Mouse(String name, int price, ManufacturerType manufacturer) {
        super(name, price, manufacturer);
    }

    //마우스 기능
    @Override
    public void run(){
        System.out.println(name + " 클릭합니다.");
    }

    @Override
    public void on() {
        System.out.println("마우스 ON");
    }

    @Override
    public void off() {
        System.out.println("마우스 OFF");
    }
}