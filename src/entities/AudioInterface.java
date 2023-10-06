package entities;

public interface AudioInterface {
      int MAX_VOLUME=5;
      int MAX_DURATION=5;
      public void turnUpVolume();
      public void turnDownVolume();
      public void play();
}
