public class Part {
    //부품 공통 사항들

    protected String name; //부품명
    protected int price;   //가격
    protected String manufacturer;    //제조사

    public Part(String name, int price, String manufacturer) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
    }
}