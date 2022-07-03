package hello0609;

public class univFriend extends friend {
    private String major;

    public univFriend(){
    }

    public univFriend(String _name, String _phone, String _major) {
        super(_name, _phone);
        major = _major;
    }

    public void print(){
        super.print();
        System.out.println("부서 : " + major);
    }
}
