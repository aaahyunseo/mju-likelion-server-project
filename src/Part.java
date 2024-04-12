public class Part implements ComputerFunction {
    //부품 공통 사항들

    protected String name; //부품명
    protected int price;   //가격
    protected ManufacturerType manufacturer;    //제조사
    //부품 별로 제조사 type 설정하는 건 해결하지 못했습니다...

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