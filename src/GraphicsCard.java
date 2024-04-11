public class GraphicsCard extends Part implements Requisite {
    private PurposeType purpose; //용도

    public GraphicsCard(String name, int price, ManufacturerType manufacturer, PurposeType purpose) {
        super(name, price, manufacturer);
        this.purpose = purpose;
    }

    //Graphics Card 기능
    @Override
    public void run() {
        System.out.println(name +" 화면을 렌더링합니다.");
    }

    @Override
    public void on() {
        System.out.println("Graphics Card ON");
    }

    @Override
    public void off() {
        System.out.println("Graphics Card OFF");
    }
}