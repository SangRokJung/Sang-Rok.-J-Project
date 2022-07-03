package hello0607;

public class MyTv {
    boolean isPowerOn = false;
    int channel;
    int volume;
    
    static final int MAX_VOLUME = 100;
    static final int MIN_VOLUME = 0;
    static final int MAX_CHANEL = 100;
    static final int MIN_CHANEL = 0;

    public void turnOnOff(){
        if(isPowerOn == true){
            isPowerOn = false;
        }
        else{
            isPowerOn = true;
        }
    }

    public void volumeUp(){
        if(volume == MAX_VOLUME){
            volume = MAX_VOLUME;
        }
        else{
            volume++;
        }
    }

    public void volumeDown(){
        if(volume == MIN_VOLUME){
            volume = MIN_VOLUME;
        }
        else{
            volume--;
        }
    }

    public void channelUp(){
        if(channel == MAX_CHANEL){
            channel = MAX_CHANEL;
        }
        else{
            channel++;
        }
    }

    public void channelDown(){
        if(channel == MIN_CHANEL){
            channel = MIN_CHANEL;
        }
        else{
            channel--;
        }
    }
}
