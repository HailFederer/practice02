package tv;

public class WatchTV {
	
     public static void main( String[] args ) {
    	 
    	 TV tv = new TV( 7, 20, false);  	
         
         tv.status();			// 7, 20, off
         
         tv.power( true );
         tv.volume( 120 );
         tv.status();			// 7, 20, on
         
         tv.volume( false );
         tv.status();			// 7, 19, on
         
         tv.channel( 0 );
         tv.status();			// 7, 19, on
         
         tv.channel( true );
         tv.channel( true );
         tv.channel( true );
         tv.status();			// 10, 19, on

         tv.power( false );
         tv.status();			// 0, 0, off
     }
}
