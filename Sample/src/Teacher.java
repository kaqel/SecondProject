import java.util.Date;

public class Teacher {
    private String name;
    private String address;
    private String major;
    private Date birthDate;

    public Teacher(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
