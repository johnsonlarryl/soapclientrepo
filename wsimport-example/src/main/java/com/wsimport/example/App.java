package com.wsimport.example;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import net.webservicex.GlobalWeather;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
			 URL url = new URL("http://www.webservicex.net/globalweather.asmx?WSDL");
			 QName qname = new QName("http://www.webserviceX.NET", "GlobalWeather");			
			 GlobalWeather service = new GlobalWeather(url, qname);
			 String response = service.getGlobalWeatherSoap().getCitiesByCountry("US");
			 System.out.println(response);
		
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}        
    }
}
