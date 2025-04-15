public class AppController {
  public static void main(String[] args) {
    var musicPlayer = new MusicPlayer(){
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
    };

    musicPlayer.play();
    musicPlayer.pause();
    musicPlayer.stop();
  }
}
