package hello0620;

public class person {
    private String name;

    public person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    //finalize formula
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("call destructor " + name);
    }
}
