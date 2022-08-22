package hello0822;

public class bootcamp {
    
    public String name = "";
    public int age = 0;
    public String major = "";
    public String job = "";
    public String MBTI = "";
    public String hobby = "";
    public String lang = "";
    public String address = "";

    public bootcamp() {
        this.name = "none";
        this.age = 0;
        this.major = "none";
        this.job = "none";
        this.MBTI = "none";
        this.hobby = "none";
        this.lang = "none";
        this.address = "none";
    }

    public bootcamp(String name, int age, String major, String job, String MBTI, String hobby, String lang, String address) {
        this.name = name;
        this.age = age;
        this.major = major;
        this.job = job;
        this.MBTI = MBTI;
        this.hobby = hobby;
        this.lang = lang;
        this.address = address;
    }

    public String toString() {
        return "name : " + name + "\nage : " + age + "\nmajor : " + major + "\njob : " + job + "\nMBTI : " + MBTI + "\nhobby : " + hobby + "\nlang : " + lang + "\naddress : " + address;
    }

    public static void main(String[] args) {
        bootcamp bt = new bootcamp("정상록", 25, "SongWriting", "Student", "ESTJ", "Workout", "Java", "GeumchunGoo");
        System.out.println(bt);
    }
}
