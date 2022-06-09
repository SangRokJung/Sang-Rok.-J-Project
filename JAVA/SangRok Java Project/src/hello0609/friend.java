package hello0609;

/**
 * friend
 */
public class friend {
    private String name;
    private String phone;

    public friend(){
    }

    public friend(String _name, String _phone) {
        name = _name;
        phone = _phone;
    }

    public void print(){
        System.out.println("이름 : " + name);
        System.out.println("번호 : " + phone);
    }


    public static void main(String[] args) {
        // compFriend c1 = new compFriend("박준형", "SW개발팀", "010-4548-4811");
        // c1.print();
        // System.out.println(c1);

        friend[] Friend = new friend[6];
        int Count = 0;
        Friend[Count++] = new compFriend("박준형", "010-4548-4811", "SW개발팀");
        Friend[Count++] = new compFriend("김준형", "010-2518-4811", "SW개발팀");
        Friend[Count++] = new compFriend("오준형", "010-7541-4811", "SW개발팀");
        Friend[Count++] = new univFriend("박정민", "010-4548-4811", "CS");
        Friend[Count++] = new univFriend("김정민", "010-2518-4811", "CS");
        Friend[Count++] = new univFriend("오정민", "010-7541-4811", "CS");


        for(int i=0; i<Count; i++){
            Friend[i].print();
            System.out.println("");
        }

    }

}