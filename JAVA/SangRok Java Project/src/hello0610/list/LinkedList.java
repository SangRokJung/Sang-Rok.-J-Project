package hello0610.list;

public class LinkedList {
    //전체 노드의 필드
    // 노드의 시작지점
    private Node head;
    // 노드의 끝 지점
    private Node tail;
    // 리스트의 사이즈
    private int size = 0;



    //노드
    private class Node {
        //하나의 노드는 데이터, 다음 데이터의 정보를 가진다.
        //데이터가 저장될 필드
        private Object data;
        //다음 노드를 가리키는 필드
        private Node next;

        //constructor
        public Node(Object input){
            this.data = input;
            this.next = null;
        }

        //출력 기능
        public String toString(){
            return String.valueOf(this.data);
        }

    }


    //시작 지점 노드 추가 기능
    public void addFirst(Object input){
        // 새로운 노드 생성
        Node newNode = new Node(input);
        //새로운 노드의 다음 노드를 헤드로 지정.
        newNode.next = head;
        //헤드를 새로운 노드로 지정합니다.
        head = newNode;
        size++;
        //헤드의 다음 노드가 없다면 테일도 헤드로 설정합니다.
        if(head.next == null){
            tail = head;
        }
    }

    //끝 지점 노드 추가 기능
    public void addLast(Object input){
        // 노드 생성
        Node newNode = new Node(input);
        // 노드가 비어있다면 첫 노드를 생성합니다.
        if(size == 0){
            addFirst(input);
        }
        else{
            // 마지막 노드의 다음 노드로 새로운 노드를 지정합니다.
            tail.next = newNode;
            // 마지막 노드를 새로운 노드로 갱신합니다.
            tail = newNode;
            size++;
        }
    }

    //특정 위치의 노드를 찾는 기능
    Node node(int index){
        Node x = head;

        for(int i = 0; i < index; i++){
            x = x.next;
        }

        return x;
    }

    public void add(int k, Object input){
        //첫번째 위치에 추가라면 실행.
        if(k ==0){
            addFirst(input);
        }
        else{
            Node temp1 = node(k-1);
            Node temp2 = temp1.next;
            Node newNode = new Node(input);
            temp1.next = newNode;
            newNode.next = temp2;
            size++;
            if(newNode.next == null){
                tail = newNode;
            }
        }
    }

    public String toString(){
        if(head == null){
            return "[]";
        }
        Node temp = head;
        String str = "[";

        while(temp.next != null){
            str += temp.data + ", ";
            temp = temp.next;
        }
        str += temp.data;

        return str + "]";
    }
    
    public Object removeFirst(){

        Node temp = head;
    }

}
