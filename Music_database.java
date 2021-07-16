package Group_Project;

import java.util.*;


public class Music_database {
	
	//private static final int Map = 0;
	//private static final int HashMap = 0;
	private Map<String,Object> m_data;
	
	//private Map<String,Double> rnb;
	//private Map<String,Double> rock;
	
	public Music_database(){
	}
	
	public Map<String,Object> getmap() {
		HashMap<String,Object> m_data = new HashMap<String,Object>();
		
		HashMap<String,Double> rnb = new HashMap<String,Double>();		
		rnb.put("Blueming",(double)3);
		rnb.put("Love poem",(double)4);
		rnb.put("HIP",(double)5);
		rnb.put("Santa Tell Me",(double)1);
		rnb.put("Obsession",(double)2);
		rnb.put("Trouble", (double)5);
		rnb.put("2002",(double)4);
		rnb.put("All I Want For Christmas is You",(double)2);
		rnb.put("Paris In The Rain",(double)1);
		rnb.put("bad guy",(double)2);
		m_data.put("R&B",rnb);
		
		HashMap<String,Double> rock = new HashMap<String,Double>();		
		rock.put("Blueming",(double)0);
		rock.put("Love poem",(double)1);
		rock.put("HIP",(double)5);
		rock.put("Santa Tell Me",(double)2);
		rock.put("Obsession",(double)1);
		rock.put("Trouble", (double)4);
		rock.put("2002",(double)4);
		rock.put("All I Want For Christmas is You",(double)3);
		rock.put("Paris In The Rain",(double)2);
		rock.put("bad guy",(double)3);
		m_data.put("ROCK",rock);
		
		Map<String,Double> ballad = new HashMap<String,Double>();		
		ballad.put("Blueming",(double)4);
		ballad.put("Love poem",(double)2);
		ballad.put("HIP",(double)3);
		ballad.put("Santa Tell Me",(double)4);
		ballad.put("Obsession",(double)5);
		ballad.put("Trouble", (double)5);
		ballad.put("2002",(double)1);
		ballad.put("All I Want For Christmas is You",(double)3);
		ballad.put("Paris In The Rain",(double)0);
		ballad.put("bad guy",(double)5);
		m_data.put("BALLAD",ballad);
		
		Map<String,Double> hiphop = new HashMap<String,Double>();		
		hiphop.put("Blueming",(double)1);
		hiphop.put("Love poem",(double)2);
		hiphop.put("HIP",(double)3);
		hiphop.put("Santa Tell Me",(double)2);
		hiphop.put("Obsession",(double)1);
		hiphop.put("Trouble", (double)4);
		hiphop.put("2002",(double)5);
		hiphop.put("All I Want For Christmas is You",(double)4);
		hiphop.put("Paris In The Rain",(double)3);
		hiphop.put("bad guy",(double)0);
		m_data.put("HIP-HOP",hiphop);
		
		Map<String,Double> cafe = new HashMap<String,Double>();		
		cafe.put("Blueming",(double)3);
		cafe.put("Love poem",(double)4);
		cafe.put("HIP",(double)5);
		cafe.put("Santa Tell Me",(double)1);
		cafe.put("Obsession",(double)2);
		cafe.put("Trouble", (double)3);
		cafe.put("2002",(double)4);
		cafe.put("All I Want For Christmas is You",(double)4);
		cafe.put("Paris In The Rain",(double)5);
		cafe.put("bad guy",(double)2);
		m_data.put("CAFE",cafe);
		
		Map<String,Double> club = new HashMap<String,Double>();		
		club.put("Blueming",(double)0);
		club.put("Love poem",(double)0);
		club.put("HIP",(double)1);
		club.put("Santa Tell Me",(double)2);
		club.put("Obsession",(double)3);
		club.put("Trouble", (double)4);
		club.put("2002",(double)4);
		club.put("All I Want For Christmas is You",(double)2);
		club.put("Paris In The Rain",(double)1);
		club.put("bad guy",(double)5);
		m_data.put("CLUB",club);
		
		Map<String,Double> sunny = new HashMap<String,Double>();		
		sunny.put("Blueming",(double)5);
		sunny.put("Love poem",(double)2);
		sunny.put("HIP",(double)3);
		sunny.put("Santa Tell Me",(double)4);
		sunny.put("Obsession",(double)5);
		sunny.put("Trouble", (double)0);
		sunny.put("2002",(double)0);
		sunny.put("All I Want For Christmas is You",(double)5);
		sunny.put("Paris In The Rain",(double)1);
		sunny.put("bad guy",(double)2);
		m_data.put("SUNNY",sunny);
		
		Map<String,Double> rainy = new HashMap<String,Double>();		
		rainy.put("Blueming",(double)3);
		rainy.put("Love poem",(double)2);
		rainy.put("HIP",(double)3);
		rainy.put("Santa Tell Me",(double)4);
		rainy.put("Obsession",(double)5);
		rainy.put("Trouble", (double)5);
		rainy.put("2002",(double)0);
		rainy.put("All I Want For Christmas is You",(double)1);
		rainy.put("Paris In The Rain",(double)1);
		rainy.put("bad guy",(double)2);
		m_data.put("RAINY",rainy);
		
		return (java.util.Map<String, Object>) m_data;
		
	}
	
	public Map<String,String> getSinger(){
		
		HashMap<String,String> m_singer = new HashMap<String,String>();
		
		m_singer.put("Blueming","IU");
		m_singer.put("Love poem","IU");
		m_singer.put("HIP","Mamamoo");
		m_singer.put("Santa Tell Me","Ariana Grande");
		m_singer.put("Obsession","BTS");
		m_singer.put("Trouble","EXO");
		m_singer.put("2002","Anne-Marie");
		m_singer.put("All I Want For Christmas is You","Mariah Carey");
		m_singer.put("Paris In The Rain","Lauv");
		m_singer.put("bad guy","Billie Eilish");
		
		
		return (java.util.Map<String, String>) m_singer;
	}
	
	
	
	

	public static void main(String[] args) {
		String[][] play = new String[10][10];
		play[0][0] = "SS"; 
		play[0][1] = "SS2";
		System.out.println(play[0][1]);
		
		
		
		// TODO Auto-generated method stub
		

	}

}
