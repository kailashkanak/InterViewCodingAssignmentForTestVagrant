A simple Java class for managing recently played songs by users with a test class.

The RecentlyPlayedStore class is a Java implementation for managing a user's recently played songs. 
Create an instance of the RecentlyPlayedStore: - 

RecentlyPlayedStore store = new RecentlyPlayedStore(3); 

Add songs to the store for a user using the playSong method. 
	store.playSong("User1", "S1"); 
	store.playSong("User1", "S2"); 
	store.playSong("User1", "S3"); 

Retrieve the recently played songs for a user using the getRecentlyPlayedSongs method 

List user1RecentlyPlayedSongs = store.getRecentlyPlayedSongs("User1"); 

The store automatically manages the number of songs to keep based on the specified capacity. 


