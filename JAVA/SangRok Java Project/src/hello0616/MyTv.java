package hello0616;

public class MyTv {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANEL = 100;
    final int MIN_CHANEL = 0;


    public int setChannel(int channel) {
        if(channel < MIN_CHANEL || channel > MAX_CHANEL){
            return -1;
        }

        this.prevChannel = this.channel;
        this.channel = channel;
        
        return this.channel;
        
    }
    public int getChannel(){
        return channel;
    }



    public int setVolume(int volume) {
        if(volume < MIN_VOLUME || volume > MAX_VOLUME){
            return -1;
        }

        this.volume = volume;
        return this.volume;
    }

    public int getVolume(){
        return volume; 
    }

    public void gotoPrevChannel(){
        setChannel(prevChannel);
    }

}
