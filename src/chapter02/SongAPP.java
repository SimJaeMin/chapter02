package chapter02;

public class SongAPP {
	public static void main(String args[]){
		Song song = new Song();
		song.setTitle("좋은날");
		song.setArtist("아이유");
		song.setAlburm("Real");
		song.setComposer("이민수");
		song.setYear(2010);
		song.setTrack(3);
        song.show();
        Song song1 =new Song(null,"에일리",null,"첫눈처럼 너에게 가겠다",0,2017);
        System.out.println(song1);// 객체 참조변수를 호출하면 toString()
        Song song2 =new Song("크러쉬","Beautiful");
        song2.show();
        Song song3 =new Song("어반자카파","소원");
        song3.show();

	}

}
