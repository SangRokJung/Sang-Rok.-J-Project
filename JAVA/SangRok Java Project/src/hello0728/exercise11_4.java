package hello0728;

import java.util.*;


// 다음에 제시된 class를 완성하여, ArrayList에 담긴 Student instance들이 반과 번호로 오름
// 차순 정렬되게 하시오. (반이 같은 경우 번호를 비교해서 정렬한다.)

class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal(){
        return kor + eng + math;
    }

    float getAverage(){
        return (int)(getTotal() / 3f * 10 + 0.5 / 10f);
    }

    public String toString(){
        return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + 
        ", " + getTotal() + ", " + getAverage();
    }
}

class BanNoAscending implements Comparator {
    public int compare(Object o1, Object o2) {
        //반과 번호로 오름차순 되게 정렬 (반이 같은 경우 번호를 비교해서 정렬)
        if(o1 instanceof Student && o2 instanceof Student){
            Student tmp1 = (Student)o1;
            Student tmp2 = (Student)o2;

            int result = tmp1.ban - tmp2.ban;

            if(result == 0){
                return tmp1.no - tmp2.no;
            }
            else{
                return result;
            }
        }
        else{
            return -1;
        }
    }
}

public class exercise11_4 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student("이재명", 2, 1, 80, 90, 80));
        list.add(new Student("윤석열", 2, 2, 60, 50, 40));
        list.add(new Student("안철수", 1, 3, 100, 100, 20));
        list.add(new Student("최우석", 1, 1, 90, 40, 80));
        list.add(new Student("정우석", 1, 2, 100, 80, 90));

        Collections.sort(list, new BanNoAscending());
        Iterator it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
