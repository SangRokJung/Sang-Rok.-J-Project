package hello0620;

public class Ex8_13 {
    public static void main(String[] args) {
        try{
            install();
        }
        catch(InstallException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    static void install() throws InstallException{
        try{
            startInstall();     //설치 준비
            copyFiles();        //파일 복사
        }
        catch(SpaceException2 e){
            InstallException ie = new InstallException("설치중 예외 발생");
            ie.initCause(e);
        }
        catch(MemoryException2 e){
            InstallException mem = new InstallException("설치중 예외 발생");
            mem.initCause(e);
            throw mem;
        }
        finally{
            deleteTempFiles();  //프로그램 설치에 사용된 임시파일 삭제.
        }
    }

    static void startInstall() throws SpaceException2, MemoryException2 {
        if(!enoughSpace()){
            throw new SpaceException2("설치 공간 부족");
        }
        if(!enoughMemory()){
            throw new MemoryException2("메모리 부족");
        }
    }

    static void copyFiles(){
        //파일들을 복사하는 코드를 적는다.
    }
    static void deleteTempFiles(){
        //임시파일으 삭제하는 코드를 적는다.
    }
    static boolean enoughSpace(){
        //설치하는데 필요한 공간이 있는지 확인하는 코드를 적는다.
        return false;
    }
    static boolean enoughMemory(){
        return true;
    }
    
}
