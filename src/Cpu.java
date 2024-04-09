public class Cpu extends Part implements Power {

    private int speed;  //속도
    private String purpose; //용도

    public Cpu(String name, int price, String manufacturer, int speed, String purpose) {
        super(name, price, manufacturer);
        this.speed = speed;
        this.purpose = purpose;
    }

    //CPU 기능
    public void ProcessInstruction() {
        System.out.println(name +" 명령어를 처리합니다.");
    }

    @Override
    public void on() {
        System.out.println("CPU ON");
    }

    @Override
    public void off() {
        System.out.println("CPU OFF");
    }
}