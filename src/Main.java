import entities.Audio;
import entities.Image;
import entities.MultimediaElement;
import entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MultimediaElement[] playList= new MultimediaElement[5];
        int off=-1;

        for (int i = 0; i < playList.length; i++) {
            playList[i]= askTypeOfMedia(in, i);
        }
        while(off!=0){


            int choise=0;
            //Questo do while controlla se l'utente inserisce i dati corretamente senza che incappi in errori
            do{

                if(choise<0 || choise>5){
                    System.out.println("ERRORE!DIGITARE UN NUMERO TRA QUELLI DISPONIBILI");

                }else{
                    System.out.println("SCESGLI UN FILE MULTIMEDIALE DA RIPRODURRE/MOSTRARE");
                    for (int i = 0; i < playList.length; i++) {
                        System.out.println((i+1)+". "+playList[i].getTitle());
                    }

                }


                while(!in.hasNextInt()) {
                    System.out.println("ERRORE!DIGITARE UN NUMERO TRA QUELLI DISPONIBILI:");

                    in.nextLine();
                }
                choise= Integer.parseInt(in.nextLine());
                }while(choise<0 || choise>5);
                if(choise ==0){
                    off=0;
                }
                if(playList[choise-1] instanceof Image){
                    ((Image) playList[choise-1]).show();
                }else if(playList[choise-1] instanceof Video){
                    ((Video) playList[choise-1]).play();
                }else{
                    ((Audio)playList[choise-1]).play();
                }


            }
        in.close();
    }
    public static MultimediaElement askTypeOfMedia(Scanner in, int i){
       int choise=0;
//Questo do while controlla se l'utente inserisce i dati corretamente senza che incappi in errori
        do{

            if(choise<0 || choise>3){
                System.out.println("ERRORE!DIGITARE UN NUMERO TRA 1, 2 e 3:");

            }else{
                System.out.println("MEDIA FILE N°"+(i+1));
                System.out.println("SCEGLI QUALE MEDIA CARICARE INSERENDO IL NUMERO CORRISPONDENTE:");
                System.out.println("1. IMAGE");
                System.out.println("2. AUDIO");
                System.out.println("3. VIDEO");
            }


            while(!in.hasNextInt() ) {
                System.out.println("SCEGLI QUALE MEDIA CARICARE INSERENDO IL NUMERO CORRISPONDENTE:");

                in.nextLine();
            }


            choise= Integer.parseInt(in.nextLine());


        }while(choise<0 || choise>3);
        return checkChoiseMade(choise, in);
    }
    public static MultimediaElement checkChoiseMade(int choise, Scanner in){
        MultimediaElement media= null;
        switch (choise){
            case 1:{
                   media= createImage(in);
                break;
            }
            case 2:{
                media= createAudio(in);
                break;
            }
            case 3: {
                media= createVideo(in);
                break;
            }
        }
        return media;

    }
    public static Image createImage( Scanner in){

        int brightness=0;
        String title;
        System.out.println("DIGITARE TITOLO DELL'IMMAGINE:");
        title= in.nextLine();

        do{

            if(brightness<0 || brightness>5){
                System.out.println("ERRORE!IMPOSTA LIVELLO DI LUMINOSITA' DA 0 a 5:");
            }else{
                System.out.println("IMPOSTA LIVELLO DI LUMINOSITA' DA 0 a 5:");
            }


            while(!in.hasNextInt()) {
                System.out.println("ERRORE!IMPOSTA LIVELLO DI LUMINOSITA' DA 0 a 5:");

                in.nextLine();
            }
            brightness= Integer.parseInt(in.nextLine());
        }while(brightness<0 || brightness>5);
      return new Image(title, brightness);

    }

    public static Audio createAudio(Scanner in){
        int volume=0;
        int duration =0;
        String title;
        System.out.println("DIGITARE TITOLO DELL'AUDIO:");
        title= in.nextLine();

        do{

            if(duration<0 || duration>5){
                System.out.println("ERRORE! L'AUDIO PUO' DURARE MASSIMO 5");
            }else{
                System.out.println("QUANTO DURA IL TUO FILE AUDIO(digitare un numero da 0 a 5)?:");
            }


            while(!in.hasNextInt()) {
                System.out.println("ERRORE! L'AUDIO PUO' DURARE MASSIMO 5:");

                in.nextLine();
            }
            duration= Integer.parseInt(in.nextLine());
        }while(duration<0 || duration>5);

        do{

            if(volume<0 || volume>5){
                System.out.println("ERRORE! IL VOLUME PUO' ESSERE IMPOSTATO AD UN MASSIMO 5");
            }else{
                System.out.println("IMPOSTA IL VOLUME(digitare un numero da 0 a 5):");
            }


            while(!in.hasNextInt()) {
                System.out.println(" ERRORE! IL VOLUME PUO' ESSERE IMPOSTATO AD UN MASSIMO 5(no parole)");

                in.nextLine();
            }
            volume= Integer.parseInt(in.nextLine());
        }while(volume<0 || volume>5);
        return new Audio(title,duration, volume);
    }
    public static Video createVideo(Scanner in){
        int brightness=0;
        int volume=0;
        int duration =0;
        String title;
        System.out.println("DIGITARE TITOLO DEL VIDEO:");
        title= in.nextLine();

        do{

            if(brightness<0 || brightness>5){
                System.out.println("ERRORE!IMPOSTA LIVELLO DI LUMINOSITA' DA 0 a 5:");
            }else{
                System.out.println("IMPOSTA LIVELLO DI LUMINOSITA' DA 0 a 5:");
            }


            while(!in.hasNextInt()) {
                System.out.println("ERRORE!IMPOSTA LIVELLO DI LUMINOSITA' DA 0 a 5:");

                in.nextLine();
            }
            brightness= Integer.parseInt(in.nextLine());
        }while(brightness<0 || brightness>5);

        do{

            if(duration<0 || duration>5){
                System.out.println("ERRORE! L'AUDIO PUO' DURARE MASSIMO 5");
            }else{
                System.out.println("QUANTO DURA IL TUO FILE AUDIO(digitare un numero da 0 a 5)?:");
            }


            while(!in.hasNextInt()) {
                System.out.println("ERRORE! L'AUDIO PUO' DURARE MASSIMO 5:");

                in.nextLine();
            }
            duration= Integer.parseInt(in.nextLine());
        }while(duration<0 || duration>5);

        do{

            if(volume<0 || volume>5){
                System.out.println("ERRORE! IL VOLUME PUO' ESSERE IMPOSTATO AD UN MASSIMO 5");
            }else{
                System.out.println("IMPOSTA IL VOLUME(digitare un numero da 0 a 5):");
            }


            while(!in.hasNextInt()) {
                System.out.println(" ERRORE! IL VOLUME PUO' ESSERE IMPOSTATO AD UN MASSIMO 5(no parole)");

                in.nextLine();
            }
            volume= Integer.parseInt(in.nextLine());
        }while(volume<0 || volume>5);
    return new Video(title, duration, volume, brightness);

    }
}
