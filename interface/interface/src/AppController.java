public class AppController {
  public static void main(String[] args) {
    var nokia = new Smartphone();
    nokia.playMusic();
    nokia.pauseMusic();
    nokia.stopMusic();
    nokia.playVideo();
    nokia.pauseVideo();
    nokia.stopVideo();

    var mp3 = new Jukebox();
    mp3.playMusic();
    mp3.pauseMusic();
    mp3.stopMusic();
  }
}
