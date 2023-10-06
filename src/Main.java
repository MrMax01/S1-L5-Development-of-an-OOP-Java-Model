import entities.Audio;
import entities.Image;
import entities.MultimediaElement;
import entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MultimediaElement[] playList= new MultimediaElement[5];
        for (int i = 0; i < playList.length; i++) {
            askTypeOfMedia(in,);
        }

    in.close();
    }
    public static void askTypeOfMedia(Scanner in){

        System.out.println("SCEGLI QUALE MEDIA CARICARE INSERENDO IL NUMERO CORRISPONDENTE:");
        System.out.println("1. IMAGE");
        System.out.println("2. AUDIO");
        System.out.println("3. VIDEO");
        int choise= in.nextInt();
        checkChoiseMade(choise, in);
    }
    public static void checkChoiseMade(int choise, Scanner in){
        switch (choise){
            case 1:{

                break;
            }
            case 2:{
                //crea audio
            }
            case 3:{
                //crea video;
                break;
            }
            default:
                System.out.println("ERRORE! LE SELEZIONI POSSIBILI SONO SOLO 1,2 o 3");
                askTypeOfMedia(in);
                break;
        }

    }

}
