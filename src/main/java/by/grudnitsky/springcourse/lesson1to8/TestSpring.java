package by.grudnitsky.springcourse.lesson1to8;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);


        System.out.println(classicalMusic.getSong());

        /*MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        //firstMusicPlayer.playMusic();

        boolean comparison = firstMusicPlayer == secondMusicPlayer;

        System.out.println(comparison);

        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());

        firstMusicPlayer.setVolume(10);

        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());*/

        context.close();
    }
}