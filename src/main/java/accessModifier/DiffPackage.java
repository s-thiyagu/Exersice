package accessModifier;

import accesModifier.PrivateVariables;

public class DiffPackage {
    public static void main(String[] args) {
        PrivateVariables pe=new PrivateVariables();
        pe.name="Vijay";
//        pe.id=4;
        pe.setOff("Mitrahsoft");
//        pe.joinYear=2019;
        pe.setId(4);
        pe.setJoinYear(2018);
//        pe.setOff("MitrahSoft");
        pe.PrintAll();
    }
}
