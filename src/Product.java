public class Product {
    private String name;
    private int price;
    private String description;
    public Product() {
    }
    public Product(String name, int price, String description) {
        setName(name);
        try {
            setPrice(price);
        } catch (PriceExceptions e) {
            System.out.print(e.getMessage());
            System.out.println(e.getWrongPrice());
        }
        setDescription(description);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException();
        }
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) throws PriceExceptions {
        if (price < 0 || price > 100000) {
            throw new PriceExceptions("Price less 0 or over 100000: ", price);
        } else {
            this.price = price;
        }
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        if (description == null) {
            throw new  NullPointerException();
        }
        this.description = description;
    }
    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
