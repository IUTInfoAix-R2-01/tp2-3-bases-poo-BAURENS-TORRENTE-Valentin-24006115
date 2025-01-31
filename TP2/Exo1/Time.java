package Exo1;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time (int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour % 24;
		
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
			this.hour = hour % 60;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second % 60;
	}
	public void setTime (int hour, int minute, int second) {
		this.hour = hour % 24;
		this.minute = minute % 60;
		this.second = second % 60;
	}
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
	public Time nextSecond() {
		this.setSecond(++second);
		return this;
	}
	public Time previousSecond() {
		this.setSecond(--second);
		return this;
	}
	
}
