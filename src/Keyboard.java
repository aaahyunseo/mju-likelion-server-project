public class Keyboard extends Part implements Requisite {
    private KeyType arrangement;    //키배열

    public Keyboard(String name, int price, ManufacturerType manufacturer, KeyType arrangement) {
        super(name, price, manufacturer);
        this.arrangement = arrangement;
    }

    //키보드 기능
    @Override
    public void run(){
        System.out.println(name + " 타이핑합니다.");
    }

    @Override
    public void on() {
        System.out.println("키보드 ON");
    }

    @Override
    public void off() {
        System.out.println("키보드 OFF");
    }
}