package chapter02;

public class Song {
	private String title;
	private String artist;
	private String alburm;
	private String composer;
	private int year;
	private int track;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlburm() {
		return alburm;
	}
	public void setAlburm(String alburm) {
		this.alburm = alburm;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	void show(){
		System.out.println("노래의 제목은 "+title+ ","+"가수는"+ artist+
				           "앨범은 "+alburm+"작고가는 "+composer+"발표된 연도는"
				           +year+"트랙번호는"+track);
	}
	

}
