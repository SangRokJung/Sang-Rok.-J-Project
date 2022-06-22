package hello0622;

public class box {
    //Boxing
    Integer ii = new Integer(10);
    //(Boxing을 static method인 valueOf로 처리하는)
    Integer iii = Integer.valueOf(10);

    //UnBoxing
    int i = ii.intValue();

    //Auto-Boxing
    Integer ii2 = 10;

    //Auto-UnBoxing
    int i2 = ii2;

    //Wrapper Class의 연산
    int b = ii++;

    //갑의 반환
    double d = ii2++;



    //아래 두 코드는 같은 코드입니다.
    Integer inO = new Integer(10);
    Integer inO2 = 10;
}
