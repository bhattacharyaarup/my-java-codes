import sun.audio.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
class BackMusic extends JFrame{

public void startBGMusic() { //Plays the background music
//make a new AudioPlayer.
	AudioPlayer myBackgroundPlayer = AudioPlayer.player;

	ContinuousAudioDataStream myLoop = null;
//use a try block in case the file doesn’t exist.
	try {
		AudioStream myBackgroundMusic = new AudioStream(new FileInputStream(new File(getClass().getResource("theme.wav").toURI())));
		AudioData myData = myBackgroundMusic.getData();
		myLoop = new ContinuousAudioDataStream(myData);
	}
	catch(Exception error) {JOptionPane.showMessageDialog(null, "Invalid file!");}

// play background music.
	myBackgroundPlayer.start(myLoop);
}
public static void main(String args[])
{
	BackMusic obj=new BackMusic();
	obj.setSize(100,100);
	obj.setVisible(true);
	obj.startBGMusic();
}
}