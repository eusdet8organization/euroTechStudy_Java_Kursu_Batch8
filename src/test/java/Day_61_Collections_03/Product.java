package Day_61_Collections_03;

public class Product implements Comparable<Product> {

    private String name;
    private double price;

    public Product(String name, double price) {
        super();
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }

    /*
      * bu yöntem 3 türden bir int döndürür:
      * 1-pozitif sayı -> bu ürün başka bir üründen daha büyüktür
      * 2-sıfır -> bu Ürün ve başka bir ürün eşittir
      * 3-negatif sayı -> bu Ürün başka bir üründen daha küçüktür
     *
     */

    @Override
    public int compareTo(Product anotherProduct) {

        if (this.price > anotherProduct.price) {
            return 1;
        } else if (this.price == anotherProduct.price) {
            return 0;
        } else {
            return -1;
        }

    }
}
