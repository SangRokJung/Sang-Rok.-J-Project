package hello0630.Exercise;

public class SutdaCard {
    int num;
    boolean isKwang;

    public SutdaCard(){
        this(1, true);
    }

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public boolean equals(Object obj) {
        try{
            if((this.num == ((SutdaCard)obj).num) && (this.isKwang == ((SutdaCard)obj).isKwang)){
                return true;
            }
            else{
                return false;
            }

        }
        catch(Exception e){
            return false;
        }
    }

    public String toString() {
        return num + (isKwang ? "K": "");
    }
}
