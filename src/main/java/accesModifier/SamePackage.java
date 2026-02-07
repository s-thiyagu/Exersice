package accesModifier;

public class SamePackage extends PrivateVariables {

    {
      int a=10;
        System.out.println("hi da thambi instance block la irunthu ");
    }
    static {
        int a=10;
        System.out.println("vanten thambi static block la irunthu ");
    }
    public static void main(String[] args) {
        SamePackage pd=new SamePackage();
        SamePackage pdd=new SamePackage();
        pd.name="SelvaKumar";
//        pd.id=3;
        pd.off="mitrahSoft";
        pd.setId(3);
        pd.joinYear=2019;
        pd.PrintAll();
    }

    static void lanch(){
        int i = 100;
    }
}
