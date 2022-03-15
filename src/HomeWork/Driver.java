package HomeWork;

public class Driver {
    private String woman;
    private String man;

    public Driver(String woman, String man) {
        this.woman = woman;
        this.man = man;
    }

    public Driver() {
        this.woman = "Mari";
        this.man = "Tom";
    }

    public void setWoman(String woman) {
        this.woman = woman;
    }

    public String getWoman() {
        return woman;
    }

    public void setMan(String man) {
        this.man = man;
    }

    public String getMan() {
        return man;
    }

    @Override
    public String toString(){
        return (woman + "\n"
                + man + "\n");
    }
}
