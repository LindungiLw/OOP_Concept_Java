package static_;

public class Data3 {
    public String name;
    public Data3(String name, Counter counter) {
        this.name = name;
        counter.count++;
    }

}
