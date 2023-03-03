public class Fruit {
    private String name;
    private float price;
    private float weight;



    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.setName("苹果");
        fruit.setPrice(1.98f);
        fruit.setWeight(5.0f);

        PackageFruit packageFruit = new PackageFruit();
        packageFruit.setName("精品苹果");
        packageFruit.setPrice(2.98f);
        packageFruit.setWeight(5.0f);
        packageFruit.setPackagesFee(((float)packageFruit.getPackagesFee()-(float) fruit.getPrice()));
        System.out.println(fruit.getName()+fruit.getWeight()+fruit.getPrice());
        System.out.println(packageFruit.getName()+
                packageFruit.getWeight()+
                packageFruit.getPrice()+
                packageFruit.getPackagesFee());

    }
}
class PackageFruit extends Fruit{
    private double packagesFee;

    public double getPackagesFee() {
        return packagesFee;
    }

    public void setPackagesFee(double packagesFee) {
        this.packagesFee = packagesFee;
    }
}
