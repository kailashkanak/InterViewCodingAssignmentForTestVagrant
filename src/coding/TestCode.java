package coding;



public class TestCode {

	public static void main(String[] args) {
		
		RecentlyPlayedSongsStore store = new RecentlyPlayedSongsStore(3);
		store.playSong("s1", "user1");
		store.playSong("s2", "user1");
		store.playSong("s3", "user1");
		
		System.out.println(store.getRecentlyPlayedSongs("user1"));
		
		store.playSong("s4", "user1");
		System.out.println(store.getRecentlyPlayedSongs("user1"));
		
		store.playSong("s2", "user1");
		System.out.println(store.getRecentlyPlayedSongs("user1"));
		
		store.playSong("s1", "user1");
		System.out.println(store.getRecentlyPlayedSongs("user1"));
	}

}
