public class Smartphone implements MusicPlayer, VideoPlayer {
  @Override
  public void playMusic() {
    System.out.println("Playing music");
    System.out.println("------------------------");
  }

  @Override
  public void pauseMusic() {
    System.out.println("Pausing music");
    System.out.println("------------------------");
  }

  @Override
  public void stopMusic() {
    System.out.println("Stopping music");
    System.out.println("------------------------");
  }

  @Override
  public void playVideo() {
    System.out.println("Playing video");
    System.out.println("------------------------");
  }

  @Override
  public void pauseVideo() {
    System.out.println("Pausing video");
    System.out.println("------------------------");
  }

  @Override
  public void stopVideo() {
    System.out.println("Stopping video");
    System.out.println("------------------------");
  }
 }

