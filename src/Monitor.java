public class Monitor extends Part implements Requisite {
    private int size;   //모니터 크기

    public Monitor(String name, int price, ManufacturerType manufacturer, int size) {
        super(name, price, manufacturer);
        this.size = size;
    }

    //Monitor 기능
    @Override
    public void run(){
        System.out.println(name + " 화면을 출력합니다.");
    }

    @Override
    public void on() {
        System.out.println("Monitor ON");
    }

    @Override
    public void off() {
        System.out.println("Monitor OFF");
    }
}