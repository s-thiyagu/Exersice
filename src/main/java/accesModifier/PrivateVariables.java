package accesModifier;


public class PrivateVariables {
    private int id;
    private int i;
    public String name;
    protected String off;
    int joinYear;

    public int getId() {
        return id;
    }

    public int getJoinYear() {
        return joinYear;
    }

    public void setJoinYear(int joinYear) {
        this.joinYear = joinYear;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOff() {
        return off;
    }

    public void setOff(String off) {
        this.off = off;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void PrintAll() {
        System.out.println("name = "+name+" id = "+id+" office = "+off+" joinYear = "+joinYear);
    }
    public void setAll(int id,String name,String off,int joinYear){
        this.name = name;
        this.off = off;
        this.id = id;
        this.joinYear = joinYear;
    }

    @Override
    public String toString() {
        return "PrivateVariables{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", off='" + off + '\'' +
                ", joinYear=" + joinYear +
                '}';
    }

    public static void main(String args[]){
        PrivateVariables pc =new PrivateVariables();
        pc.id=2;
        pc.name="Thiyagu";
        pc.off="mitrahSoft";
        pc.joinYear=2019;
        pc.PrintAll();
        System.out.println(pc);
    }

}
