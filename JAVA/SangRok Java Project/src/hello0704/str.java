package hello0704;

public class str {
    String strr;

    // constructor
    public str(){
        this.strr = null;
    }
    public str(String strr){
        this.strr = strr;
    }

    // getter
    public String getStr(){
        return this.strr;
    }

    // setter
    public void setStr(String str){
        this.strr = str;
    }

    // toString()
    @Override
    public String toString(){
        return "str [" + strr + "]";
    }

    // equals()
    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        return (this.strr == ((str)obj).strr);
    }

    // hashCode()
    @Override
    public int hashCode() {
        int hashStr = strr.hashCode();
        return (int)((hashStr) / 1000);
    }
}
