package com.mindtech.mindtech.service;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.mindtech.mindtech.model.Covid;

@Service
public class CovidApiService {

	private Environment env;

	@Autowired
	public void setEnv(Environment env) {
		this.env = env;
	}
	
	public List<Covid> gatherApiData(){
		List<Covid> accumulator = new ArrayList<Covid>();
		
		this.callApi();
		
		return accumulator;
	}
	
	protected String callApi() {
		
		HttpURLConnection connection;
		String buffer = "";
		
		try {
			URL apiUrl = new URL(this.env.getProperty("urls.covid-api-url"));
			
			connection = (HttpURLConnection) apiUrl.openConnection();
			
			connection.setDoOutput(true);
			
			connection.setRequestProperty("User-Agent", this.env.getProperty("urls.user-agent"));
			connection.setRequestMethod("GET");
			
			//Send request
		    DataOutputStream wr = new DataOutputStream (
		        connection.getOutputStream());
		    wr.writeBytes(buffer);
		    wr.close();
		    
		  //Get Response  
		    InputStream is = connection.getInputStream();
		    BufferedReader rd = new BufferedReader(new InputStreamReader(is));
		    StringBuilder response = new StringBuilder(); // or StringBuffer if Java version 5+
		    
		    String line;
		    while ((line = rd.readLine()) != null) {
		      response.append(line);
		      response.append('\r');
		    }
		    rd.close();
		    
		    return response.toString();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "";
	}
	
	
	
}
