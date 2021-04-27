import java.nio.channels.Channel;

public class Example7 {
	public static void main(String[] args) {
		MyTV tv = new MyTV();
		
		tv.channel = 100;
		tv.volume = 0;
		System.out.println("Channel : " + tv.channel+", "+"Volume : "+tv.volume);
		
		tv.channelDown();
		tv.volumeDown();
		System.out.println("Channel : " + tv.channel+", "+"Volume : "+tv.volume);
		
		tv.volume = 100;
		tv.channelUp();
		tv.volumeUp();
		System.out.println("Channel : " + tv.channel+", "+"Volume : "+tv.volume);
		
	}

}
