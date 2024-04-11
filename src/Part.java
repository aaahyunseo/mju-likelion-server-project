public class Part implements Requisite{
    //부품 공통 사항들

    protected String name; //부품명
    protected int price;   //가격
    protected ManufacturerType manufacturer;    //제조사

    public Part(String name, int price, ManufacturerType manufacturer) {
        this.name = name;
        this.price = price;
        this.manufacturer = ManufacturerType.valueOf(String.valueOf(manufacturer));
    }

    @Override
    public void on() {
    }

    @Override
    public void off() {
    }

    @Override
    public void run() {
    }
}