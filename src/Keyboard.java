public class Keyboard extends Part implements Power{
    private String arrangement;    //키배열

    public Keyboard(String name, int price, String manufacturer, String arrangement) {
        super(name, price, manufacturer);
        this.arrangement = arrangement;
    }

    //키보드 기능
    public void type(){
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