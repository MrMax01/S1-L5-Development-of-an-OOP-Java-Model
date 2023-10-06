package entities;

public class Audio extends MultimediaElement implements AudioInterface{

private int volume;
private int duration;
public Audio (String title, int duration, int volume){
    super(title);
    setDuration(duration);
    setVolume(volume);
}

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void turnUpVolume() {
        if(this.volume++ <= MAX_VOLUME){
            this.volume++;
        }else{
            System.out.println("VOLUME MASSIMO RAGGIUNTO!:"+this.volume);
        }
    }

    @Override
    public void lowerVolume() {
        if(this.volume-- >= 0){
            this.volume--;
        }else{
            System.out.println("VOLUME MINIMO RAGGIUNTO:"+ this.volume);
        }
    }

    @Override
    public void play() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.volume ; i++) {
            builder.append('!');
        }
        String totalVolume = builder.toString();

        for (int i = 0; i < this.duration; i++) {
            System.out.println(getTitle()+totalVolume);
        }
    }
}
