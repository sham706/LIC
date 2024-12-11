package com.shamanth.DemoPojo.service;

import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;

import com.shamanth.DemoPojo.model.Prodect;

public class pojoToJson {

	public static void main(String[] args) throws SerializeException {
			
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		String[] NewSellers = {"Cangalore Models", "Chennai_Rains", "Gujarath Rails"};
		Prodect product = new Prodect("Apple", 2000, "Red", NewSellers);
		
		String json = jsonSerializer.serialize(product);
		System.out.println(json);
	}

	

}
