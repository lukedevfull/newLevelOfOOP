public class Jukebox implements MusicPlayer {
  @Override
  public void playMusic() {
    System.out.println("Playing music on " + this.getClass().getName());
    System.out.println("------------------------");
  }

  @Override
  public void pauseMusic() {
    System.out.println("Pausing music on " + this.getClass().getName());
    System.out.println("------------------------");
  }

  @Override
  public void stopMusic() {
    System.out.println("Stopping music on " + this.getClass().getName());
    System.out.println("------------------------");
  }
 }

