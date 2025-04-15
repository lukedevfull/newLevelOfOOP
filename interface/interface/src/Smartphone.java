public class Smartphone implements MusicPlayer, VideoPlayer {
  @Override
  public void play() {
    System.out.println("Playing music");
  }

  @Override
  public void pause() {
    System.out.println("Pausing music");
  }

  @Override
  public void stop() {
    System.out.println("Stopping music");
  }
 }

