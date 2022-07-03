package hello0609;

public class compFriend extends friend {
    private String depatmant;

    public compFriend(){
    }

    public compFriend(String _name, String _phone,  String _depatmant) {
        super(_name, _phone);
        depatmant = _depatmant;
    }

    public void print(){
        super.print();
        System.out.println("전공 : " + depatmant);
    }
}
