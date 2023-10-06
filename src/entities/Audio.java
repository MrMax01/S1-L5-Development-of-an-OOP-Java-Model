package entities;

public class Audio extends MultimediaElement implements AudioInterface{

private int brightness;
private int duration;
public Audio (String title, int duration, int brightness){
    super(title);
    setDuration(duration);
    setBrightness(brightness);
}

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    @Override
    public void turnUpBrightness() {

    }

    @Override
    public void lowerBrightness() {

    }
}
