
public class MyTV {

	boolean isPowerOn = false;
	int channel;
	int volume;
	final int MAIN_CHANNEL = 99;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	//���� Ű�� ���� �޼ҵ�
	void turnOnOFF() {
		if (isPowerOn = true) {
			isPowerOn = false;	
		}else {
			isPowerOn = true;		
		}	
	}
	
	//���� Ű���, ���̱�
	void volumeUp() {
		for ( volume = 0; volume < MAX_VOLUME; volume++) {		
		} 
	}

	void volumeDown() {
		for ( volume = 0; volume > MIN_VOLUME; volume--) {
			
		}
	}

	//ä�� Ű���, ���̱�
	void channelUp() {
		for ( channel = 0;  channel < MAX_CHANNEL; channel++) {		
		}
		if (channel > MAX_CHANNEL) {
			channel = MAIN_CHANNEL;
		}
	}
	void channelDown() {
		for ( channel = 0;  channel > MIN_CHANNEL; channel--) {		
		}
		if (channel < MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		}
		if (channel <= MAX_CHANNEL) {
			channel = MAIN_CHANNEL;
		}
	
	}
}

