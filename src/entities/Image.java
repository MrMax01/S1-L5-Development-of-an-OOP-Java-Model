package entities;

public class Image extends MultimediaElement implements ImageInterface{
    private int brightness;

    public Image(String title, int brightness){
        super(title);
        setBrightness(brightness);
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
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
    public void show(){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.brightness; i++) {
            builder.append('*');
        }
        String totalBrightness = builder.toString();
        System.out.println(getTitle()+totalBrightness);

        }
    }
}
