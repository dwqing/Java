public class muxi03 {
    private String name;
    private int age;

    public muxi03(String mname, int mage) {
        age = mage;
        name = mname;
    }

    public String getName() {
        return name;
    }

    public String setName(String rename) {
        return name = rename;
    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        muxi03 p = new muxi03("小米", 23);
        System.out.println(p.getName());
        System.out.println(p.setName("小李"));
        System.out.println(p.getName());
        System.out.println(p.getAge());

    }
}
