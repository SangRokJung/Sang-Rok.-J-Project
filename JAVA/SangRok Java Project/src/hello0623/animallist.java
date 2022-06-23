package hello0623;

import java.util.Scanner;

public class animallist {
    public static Node getLastNode(){

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int menu = 0;

        String name;
        int age;
        Node newNode;
        Node head;

        do{
            System.out.println("메뉴를 선택하세요");
            System.out.println("1. 입원할 동물 입력");
            System.out.println("2. 장비 등록");
            System.out.println("3. 종료");
            menu = scan.nextInt();

            switch(menu) {
                case 1 : 
                    System.out.println("입원할 동물 이름을 입력하세요");
                    name = scan.nextLine();

                    System.out.println("입원할 동물 나이를 입력하세요");
                    age = scan.nextInt();

                    lc.insertNode(age, String);

                    break;

                    

                case 2 : 
                    System.out.println("장비명을 입력하세요");
                    System.out.println("장비 년도를 입력하세요");
                    break;

                default :
                    System.out.println("프로그램을 종료합니다.");
            }
        }
        while(menu != 3);

    }

    // public static Node findAnimal(){
    //     return null;
    // }
    // public static Node findEquerment(){
    //     return null;
    // }

    // public static boolean deleteAnimal(Node header){
    //     return true;
    // }
    
    // Node a1 = new Node("바둑이", 3);
    // Node a2 = new Node("누렁이", 2);
    // Node a3 = new Node("백구", 1);
    // Node a4 = new Node("오랭이", 5);
    // Node a5 = new Node("국국이", 8);

    // Node e1 = new Node("주사기", 2012);
    // Node e2 = new Node("재새동기", 2010);
    // Node e3 = new Node("밥통", 2002);

    // a1.setNext(a2);
    // a2.setNext(a3);
    // a3.setNext(a4);
    // a4.setNext(a5);
    // a5.setNext(null);

    // e1.setNext(e2);
    // e2.setNext(e3);
    // e3.setNext(null);
}
