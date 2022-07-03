package hello0606;

public class Student {
    public String name;
    public int ban;
    public int no;
    public int kor;
    public int eng;
    public int math;

    Student(){
        name = "이름없음";
        ban = 0;
        no = 0;
        kor = 0;
        eng = 0;
        math = 0;
    }

    Student(String _name, int _ban, int _no, int _kor, int _eng, int _math) {
        name = _name;
        ban = _ban;
        no = _no;
        kor = _kor;
        eng = _eng;
        math = _math;
    }

    public int getTotal(){
        return kor + eng + math;
    }

    public double getAverage(){
        return (kor + eng + math) / 3;
    }
}
