package tv;

public class TV {

	private int channel;
	private int volume;
	private boolean power;
	
	// 채널, 볼륨, 전원 정보로 TV객체 생성
	public TV(int channel, int volume, boolean power) {
		
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	// TV 상태 출력
	void status(){
		
			System.out.println(toString());	// 오버라이딩 된 toString 메서드를 통해 TV 상태 출력
	}
	
	// 전원 on/off
	void power(boolean onOff){
		
		if(onOff != this.power){	// 전원 입력 정보가 전원 상태와 같지 않을 때만 실행
		
			this.power = onOff;		// 전원을 켜거나 끔
			
			// 전원을 끌 때 채널과 볼륨을 모두 0으로 셋팅
			if(onOff == false){
				this.channel = 0;
				this.volume = 0;
			}
		}
	}
	
	// 채널을 번호로 입력
	void channel(int channel){
		
		if(channel<1 || channel>255)		// 1보다 작거나 255보다 큰 채널을 입력했을 시, 아무변화 없음
			return;
		else if(channel != this.channel)		// 적절한 채널 번호 입력 시, 해당 채널로 이동
			this.channel = channel;
	}
	
	// 채널을 방향키로 조절
	void channel(boolean upDown){
		
		if(channel==1 && upDown==false)			// 채널이 1일 때 내리는 버튼을 누르면 255로 이동
			this.channel = 255;
		else if(channel==255 && upDown==true)	// 채널이 255일 때 올리는 버튼을 누르면 1로 이동
			this.channel = 1;
		else if(upDown==false)							// 채널을 내림 
			this.channel = this.channel-1;
		else														// 채널을 올림
			this.channel = this.channel+1;
	}
	
	// 볼륨을 번호로 입력
	void volume(int volume){
		
		if(volume<0 || volume>100)			// 0보다 작거나 100보다 큰 볼륨 입력 시, 아무변화 없음
			return;
		else if(volume != this.volume)		// 적절한 볼륨 값 입력 시, 입력 값으로 볼륨 조절
			this.volume = volume;
	}
	
	// 볼륨을 방향키로 조절
	void volume(boolean upDown){
		
		if(volume==0 && upDown==false)			// 볼륨이 0일 때 내리는 버튼 누르면 아무변화 없음
			return;
		else if(volume==100 && upDown==true)	// 볼륨이 100일 때 올리는 버튼 누르면 아무변화 없음
			return;
		else if(upDown==false)							// 볼륨을 내림
			this.volume = this.volume-1;
		else														// 볼륨을 올림
			this.volume = this.volume+1;
	}
	
	
	
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}
	
	@Override
	public String toString() {
	
		return "채널 : "+channel+"번\n"+"볼륨 : "+volume+"\n"+"전원on/off : "+(this.power==true?"on":"off")+"\n";
	}
}
















