class PublicServant{
    String appellation;
    int age;
    public void handleAffairs(){
        System.out.println("公务员处理日常事物");
    }

}
class President extends PublicServant{
    @Override
    public void handleAffairs() {
        super.handleAffairs();
        System.out.println("总统掌握方针，政策");
    }
}
public class Demo78 {
    public static void main(String[] args) {
        President president =new President();

        president.appellation = "总统";
        president.age = 55;
        if (president instanceof PublicServant){
            president.handleAffairs();
        }
    }
}
