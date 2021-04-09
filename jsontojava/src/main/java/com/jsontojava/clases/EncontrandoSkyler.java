package com.jsontojava.clases;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EncontrandoSkyler {

	public static void main(String[] args) throws Exception {
	
				String url = "https://breakingbadapi.com/api/characters/";
				String jsonStr="";
				ObjectMapper om=new ObjectMapper();
				
				try {
					jsonStr = peticionHttpGet(url);
					List<Character> ch = om.readValue(jsonStr, new TypeReference<List<Character>>(){});
					System.out.println("Ejercicio 2_1");
					for (int i=0; i<ch.size(); i++) 
					{ 
						//Ejercicio1
						if (ch.get(i).getName().contentEquals("Skyler White")) {
							System.out.println("Cumpleaños de Skyler White " + ch.get(i).getBirthday());
							System.out.println("*************************************************");
						}
						
					}

				} catch (JsonMappingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (JsonProcessingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

	public static String peticionHttpGet(String urlParaVisitar) throws Exception {
		
		StringBuilder resultado = new StringBuilder();
		
		URL url = new URL(urlParaVisitar);
		HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
		conexion.setRequestMethod("GET");
		
		BufferedReader rd = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
		String linea;

		while ((linea = rd.readLine()) != null) {
			resultado.append(linea);
		}
		
		rd.close();
		
		return resultado.toString();
	}
}
