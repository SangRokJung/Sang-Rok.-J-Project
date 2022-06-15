package hello0615;

public class Outer {
    private int outerIv = 0;
    static  int outerCv = 0;
    
    class InstanceIneer{
        //외부 클래스의 privte맴버도 접근 가능
        int iiv     = outerIv;
        int iiv2    = outerCv;
    }

    static class StaticInner{
        //스태틱 클래스는 외부 클래스의 인스턴스 맴버에 접근 불가능.
        static int scv = outerCv;
    }

    public void myMethod(){
        int lv          = 0;
        final int LV    = 0;

        class LocalInner{
            int liv     = outerIv;
            int liv2    = outerCv;
            int liv4    = LV;
        }
    }
}
