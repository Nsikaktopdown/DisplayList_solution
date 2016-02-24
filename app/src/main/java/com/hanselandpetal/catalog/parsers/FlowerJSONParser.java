package com.hanselandpetal.catalog.parsers;

import com.hanselandpetal.catalog.model.Flower;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class FlowerJSONParser {
	
	public static List<Flower> parseFeed(String content) {
	
		try {
			JSONArray ar = new JSONArray(content);
			List<Flower> flowerList = new ArrayList<>();
			
			for (int i = 0; i < ar.length(); i++) {
				
				JSONObject obj = ar.getJSONObject(i);
				Flower flower = new Flower();


				flower.setName(obj.getString("name"));
				flower.setLocation(obj.getString("location"));
				flower.setId(obj.getInt("id"));


				flowerList.add(flower);
			}
			
			return flowerList;
		} catch (JSONException e) {
			e.printStackTrace();
			return null;
		}
		
	}
}
