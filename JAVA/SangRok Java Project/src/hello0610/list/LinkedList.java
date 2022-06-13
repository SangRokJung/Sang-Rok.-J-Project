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
    
    // 처음 노드 삭제
    public Object removeFirst(){
        // 첫번째 노를 temp로 지정하고 head의 값을 두번째 노드로 변경합니다.
        Node temp = head;
        head = temp.next;
        // 데이터를 삭제하기 전에 리턴할 겂을 임시 변수에 담습니다.
        Object returnData = temp.data;
        temp = null;
        size--;
        return returnData;
    }

    // 중간 데이터 삭제
    public Object remove(int k){
        if(k == 0){
            return removeFirst();
        }
        // k-1번째 노드를 temp값으로 지정합니다.
        Node temp = node(k-1);
        // 삭제 노드를 todoDeleted에 기록해 둡니다.
        // 삭제 노드를 지금 제거하면 삭제 앞 노드와 삭제 뒤 노드를 연결 할 수 없습니다.
        Node todoDeleted = temp.next;
        // 삭제 앞 노드의 다음 노드로 삭제 뒤 노드를 지정합니다.
        temp.next = temp.next.next;
        // 삭제된 데이터를 리턴하기 위해서 returnData에 데이터를 저장합니다.
        Object returnData = todoDeleted.data;
        if(todoDeleted == tail){
            tail = temp;
        }
        // cur.next를 삭제 합니다.
        todoDeleted = null;
        size--;
        return returnData;
    }

    //엘리먼트의 크기
    public int size(){
        return size;
    }

    //엘리먼트 가져오기
    public Object get(int k){
        Node temp = node(k);
        return temp.data;
    }

    //특정한 엘리먼트 값을 가진 인덱스 가져오기
    public int indexOf(Object data){
        //탐색 대상이 되는 노드를 temp로 지정합니다.
        Node temp = head;
        //탐색 대상이 몇번째 엘리먼트에 있는지를 의미하는 변수로 index를 선언합니다.
        int index = 0;
        //탐색과 탐색 대상의 값을 비교합니다.
        while(temp.data != data){
            temp = temp.next;
            index++;
            //temp의 값이 null이라는 것은 더 이상 탐색 대상이 없다는 것
            if(temp == null){
                return -1;
            }
        }
        return index;
    }
}
