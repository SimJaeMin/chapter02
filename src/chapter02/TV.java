package chapter02;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {// 불린형은 get이아니고 is
		return power;
	}
	public TV(int channel, int volume, boolean power){
		this.channel=channel;
		this.volume=volume;
		this.power=power;
	}
	public void status() {
		 System.out.println("TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]");;
	}
	public void power(boolean power){
		if(power==true){
			this.power=true;
		}
		else{
			this.power=false;
		}	
	}
	public void channel(int channel){
		if(channel>=1&&channel<=255){
			this.channel=channel;
		}
	}
	public void channel(boolean up){
		if(up==true){
			channel++;
			if(channel==256){
				channel=1;
			}
		}
		else{
			channel--;
			if(channel==0){
			channel=255;	
			}
			}
		
	}
	public void volume(int volume){
		if(volume>=0&&volume<=100){
			this.volume=volume;
		}
	}
	public void volume(boolean up){
		if(up==true){
			volume++;
			if(volume==101){
				volume=0;
			}
		}
		else{
			volume--;
			if(volume==-1){
				volume=100;
			}
		}		
	}
}
