package go;

public class MiniTv {
	
	public MiniTv() {
		
	}

	int channel = 0;
	
	public String channelPlus(int channel) {
		channel = channel +1;
		String msg = "채널 업 성공!";
		System.out.println(msg + channel);	
		return msg;
	}
	
	
	

	
	
}
