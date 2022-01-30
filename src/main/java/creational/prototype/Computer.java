package creational.prototype;

public class Computer implements Cloneable {
    private String os;
    private String office;
    private String antivirus;
    private String other;

    public Computer(String os, String office, String antivirus, String other) {
        super();
        this.os = os;
        this.office = office;
        this.antivirus = antivirus;
        this.other = other;
    }

    @Override
    protected Computer clone() {
        try {
            return (Computer) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString(){
        return "Computer: os: " + this.os + " office: " + this.office + " antivirus: " + antivirus + " other: " + other;
    }

    public void setOther(String other){
        this.other = other;
    }
}
