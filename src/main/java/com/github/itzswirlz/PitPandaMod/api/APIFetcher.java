package com.github.itzswirlz.PitPandaMod.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;

public class APIFetcher {
	public static void fetchPitPanda(String[] username) throws IOException, InterruptedException {
		URL url = new URL("https://pitpanda.rocks/api/players/" + username);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		BufferedReader reader;
		String line;
		StringBuffer responseContent = new StringBuffer();
		try {
			con.setRequestMethod("GET");
			con.setConnectTimeout(5000);
			con.setReadTimeout(5000);
			
			int status = con.getResponseCode();
			
			if (status > 299) {
				reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
				while((line = reader.readLine()) != null) {
					responseContent.append(line);
				}
				reader.close();
			} else {
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
				while((line = reader.readLine()) != null) {
					responseContent.append(line);
				}
				reader.close();
			}
			System.out.println(responseContent.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}
	
	public static void fetchUUID(String[] username) throws IOException, InterruptedException {
		String link = "https://api.mojang.com/users/profiles/minecraft/";
		String fullurl = link + username;
		URL url = new URL(fullurl);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		BufferedReader reader;
		String line;
		StringBuffer responseContent = new StringBuffer();
		try {
			con.setRequestMethod("GET");
			con.setConnectTimeout(5000);
			con.setReadTimeout(5000);
			
			int status = con.getResponseCode();
			
			if (status > 299) {
				reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
				while((line = reader.readLine()) != null) {
					responseContent.append(line);
				}
				reader.close();
			} else {
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
				while((line = reader.readLine()) != null) {
					responseContent.append(line);
				}
				reader.close();
			}
			System.out.println(username);
			System.out.println(url.toString());
			System.out.println(responseContent.toString());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
	}
}
