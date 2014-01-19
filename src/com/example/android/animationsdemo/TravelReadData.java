package com.example.android.animationsdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TravelReadData {

	public static HashMap<String, TravelMetadata> getData() {
		HashMap<String, TravelMetadata> data = new HashMap<String, TravelMetadata>();
		data.put("image1", new TravelMetadata("image1", "Austin", "Music"));
		data.put("image2", new TravelMetadata("image2", "Seattle", "Coffee"));
		data.put("image3", new TravelMetadata("image3", "Singapore", "Food"));
		data.put("image4", new TravelMetadata("image4", "Washington", "Museum"));
		data.put("edit_chicago_active_1" , new TravelMetadata("edit_chicago_active_1" , "Chicago" , "Active"));
		data.put("edit_chicago_arts_0" , new TravelMetadata("edit_chicago_arts_0" , "Chicago" , "Arts"));
		data.put("edit_chicago_arts_1" , new TravelMetadata("edit_chicago_arts_1" , "Chicago" , "Arts"));
		data.put("edit_chicago_nightlife_0" , new TravelMetadata("edit_chicago_nightlife_0" , "Chicago" , "Nightlife"));
		data.put("edit_chicago_nightlife_1" , new TravelMetadata("edit_chicago_nightlife_1" , "Chicago" , "Nightlife"));
		data.put("edit_chicago_restaurants_0" , new TravelMetadata("edit_chicago_restaurants_0" , "Chicago" , "Restaurants"));
		data.put("edit_chicago_restaurants_1" , new TravelMetadata("edit_chicago_restaurants_1" , "Chicago" , "Restaurants"));
		data.put("edit_chicago_shopping_0" , new TravelMetadata("edit_chicago_shopping_0" , "Chicago" , "Shopping"));
		data.put("edit_chicago_shopping_1" , new TravelMetadata("edit_chicago_shopping_1" , "Chicago" , "Shopping"));
		data.put("edit_seattle_active_0" , new TravelMetadata("edit_seattle_active_0" , "Seattle" , "Active"));
		data.put("edit_seattle_active_1" , new TravelMetadata("edit_seattle_active_1" , "Seattle" , "Active"));
		data.put("edit_seattle_arts_0" , new TravelMetadata("edit_seattle_arts_0" , "Seattle" , "Arts"));
		data.put("edit_seattle_arts_1" , new TravelMetadata("edit_seattle_arts_1" , "Seattle" , "Arts"));
		data.put("edit_seattle_nightlife_0" , new TravelMetadata("edit_seattle_nightlife_0" , "Seattle" , "Nightlife"));
		data.put("edit_seattle_nightlife_1" , new TravelMetadata("edit_seattle_nightlife_1" , "Seattle" , "Nightlife"));
		data.put("edit_seattle_restaurants_0" , new TravelMetadata("edit_seattle_restaurants_0" , "Seattle" , "Restaurants"));
		data.put("edit_seattle_restaurants_1" , new TravelMetadata("edit_seattle_restaurants_1" , "Seattle" , "Restaurants"));
		data.put("edit_seattle_shopping_0" , new TravelMetadata("edit_seattle_shopping_0" , "Seattle" , "Shopping"));
		data.put("edit_seattle_shopping_1" , new TravelMetadata("edit_seattle_shopping_1" , "Seattle" , "Shopping"));
		data.put("edit_vegas_active_0" , new TravelMetadata("edit_vegas_active_0" , "Vegas" , "Active"));
		data.put("edit_vegas_active_1" , new TravelMetadata("edit_vegas_active_1" , "Vegas" , "Active"));
		data.put("edit_vegas_arts_0" , new TravelMetadata("edit_vegas_arts_0" , "Vegas" , "Arts"));
		data.put("edit_vegas_arts_1" , new TravelMetadata("edit_vegas_arts_1" , "Vegas" , "Arts"));
		data.put("edit_vegas_nightlife_0" , new TravelMetadata("edit_vegas_nightlife_0" , "Vegas" , "Nightlife"));
		data.put("edit_vegas_nightlife_1" , new TravelMetadata("edit_vegas_nightlife_1" , "Vegas" , "Nightlife"));
		data.put("edit_vegas_restaurants_0" , new TravelMetadata("edit_vegas_restaurants_0" , "Vegas" , "Restaurants"));
		data.put("edit_vegas_restaurants_1" , new TravelMetadata("edit_vegas_restaurants_1" , "Vegas" , "Restaurants"));
		data.put("edit_vegas_shopping_0" , new TravelMetadata("edit_vegas_shopping_0" , "Vegas" , "Shopping"));
		data.put("edit_vegas_shopping_1" , new TravelMetadata("edit_vegas_shopping_1" , "Vegas" , "Shopping"));

		return data;
	}
	
	static List<TravelMetadata> data = new ArrayList<TravelMetadata>();

	public static List<TravelMetadata> getData1() {
		data.add(new TravelMetadata("place1", "Chicago", "Active"));
		data.add(new TravelMetadata("place2", "Chicago", "Arts"));
		data.add( new TravelMetadata("place3", "Chicago", "Nightlife"));
		data.add( new TravelMetadata("place4", "Chicago", "Restaurant"));
		data.add( new TravelMetadata("place9", "Chicago", "Shopping"));
		data.add( new TravelMetadata("place5", "Seattle", "Active"));
		data.add( new TravelMetadata("place6", "Seattle", "Arts"));
		data.add( new TravelMetadata("place7", "Seattle", "Nightlife"));
		data.add( new TravelMetadata("place8", "Seattle", "Restaurant"));
		data.add( new TravelMetadata("place10", "Seattle", "Shopping"));
		data.add( new TravelMetadata("place11", "Vegas", "Active"));
		data.add( new TravelMetadata("place12", "Vegas", "Arts"));
		data.add( new TravelMetadata("place13", "Vegas", "Nightlife"));
		data.add( new TravelMetadata("place14", "Vegas", "Restaurant"));
		data.add( new TravelMetadata("place15", "Vegas", "Shopping"));
		return data;
	}
	
	public static TravelMetadata getDataByIndex(int index) {
		return data.get(index);
	}

}
