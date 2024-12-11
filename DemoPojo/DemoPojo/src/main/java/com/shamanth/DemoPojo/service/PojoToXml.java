package com.shamanth.DemoPojo.service;
import org.apache.juneau.html.HtmlSerializer;
import org.apache.juneau.json.JsonParser;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.parser.ParseException;
import org.apache.juneau.serializer.SerializeException;
import org.apache.juneau.xml.XmlSerializer;

import com.shamanth.DemoPojo.model.Prodect;

public class PojoToXml {

	public static void main(String[] args) throws SerializeException, ParseException {
		
		String[] sellers = {"Ram moters", "Shiva electronics"};
		
		Prodect product = new Prodect("Shamanth", 500, "Red", sellers);
		
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		
		String json = jsonSerializer.serialize(product);
		System.out.println(json);
		
		XmlSerializer xmlSerializer = XmlSerializer.DEFAULT_NS_SQ_READABLE;
		String xml = xmlSerializer.serialize(product);
		System.out.println(xml);
		
		HtmlSerializer htmlSerializer = HtmlSerializer.DEFAULT_SQ_READABLE;
		String htmls = htmlSerializer.serialize(product);
		System.out.println(htmls);
		
		JsonParser jsonParser = JsonParser.DEFAULT;
		String backToObj = "{\r\n"
				+ "	\"colour\": \"Red\",\r\n"
				+ "	\"name\": \"Shamanth\",\r\n"
				+ "	\"price\": 500,\r\n"
				+ "	\"sellerNames\": [\r\n"
				+ "		\"Ram moters\",\r\n"
				+ "		\"Shiva electronics\"\r\n"
				+ "	]\r\n"
				+ "}";
		Prodect pro = jsonParser.parse(backToObj, Prodect.class);
		System.out.println(pro);
		
	}

}
