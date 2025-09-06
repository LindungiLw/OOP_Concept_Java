package static_.material;

public class Data3 {
    public String name;
    public Data3(String name, Counter counter) {
        this.name = name;
        counter.count++;
    }

}
