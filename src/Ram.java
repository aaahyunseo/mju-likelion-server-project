public class Ram extends Part {
    private int capacity;   //용량

    public Ram(String name, int price, ManufacturerType manufacturer, int capacity) {
        super(name, price, manufacturer);
        this.capacity = capacity;
    }

    //Ram기능
    @Override
    public void run() {
        System.out.println(name +" 데이터를 읽습니다.");
    }

    @Override
    public void on() {
        System.out.println("Ram ON");
    }

    @Override
    public void off() {
        System.out.println("Ram OFF");
    }
}