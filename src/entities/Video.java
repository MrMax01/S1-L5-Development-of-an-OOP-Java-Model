package entities;

public class Video extends Audio implements ImageInterface{
    private int brightness;



    public Video(String title, int duration, int volume, int brightness) {
        super(title, duration, volume);
        setBrightness(brightness);
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        if(brightness>=0 && brightness<=MAX_BRIGHTNESS){
            this.brightness = brightness;

        }else{
            System.out.println("brithess deve essere un valore positivo minore di "+MAX_BRIGHTNESS);
        }
    }

    @Override
    public void turnUpBrightness() {
        if(this.brightness+1 >= 0){
            this.brightness++;
            System.out.println("LIVELLO LUMINOSITA':"+this.brightness);
        }else{
            System.out.println("LUMINOSITA' MASSIMA RAGGIUNTA:"+ this.brightness);
        }
    }

    @Override
    public void turnDownBrightness() {
        if(this.brightness-1 >= 0){
            this.brightness--;
            System.out.println("LIVELLO LUMINOSITA':"+this.brightness);
        }else{
            System.out.println("LUMINOSITA' MINIMA RAGGIUNTA:"+ this.brightness);
        }
    }



    @Override
    public void play() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < getVolume() ; i++) {
            builder.append('!');
        }
        String totalVolume = builder.toString();
        StringBuilder builderForBrightness = new StringBuilder();
        for (int i = 0; i < this.brightness ; i++) {
            builderForBrightness.append('*');
        }
        String totalBrightness = builderForBrightness.toString();

        for (int i = 0; i < getDuration(); i++) {
            System.out.println(getTitle()+totalVolume+totalBrightness);
        }
    }
}


