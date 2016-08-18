package com.poc;

import java.io.IOException;
import java.util.Collections;
import java.util.stream.Collectors;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class JsonParsing {
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		JsonArray nameList = null;
		JsonObject hasan = Json.createObjectBuilder().add("firstname", "hasan").add("lastname", "shaik").build();
		JsonObject anees = Json.createObjectBuilder().add("firstname", "anees").add("lastname", "hasan").build();
		nameList = Json.createArrayBuilder().add(hasan).add(anees).build();
		JsonObject finalObj = Json.createObjectBuilder().add("person", nameList).build();

		System.out.println(finalObj.getJsonArray("person").stream().map((s) -> ((JsonObject) s).getString("firstname"))
				.collect(Collectors.toList()));

		System.out.println(finalObj.getJsonArray("person").getJsonObject(0).getString("firstname"));

	}
}
