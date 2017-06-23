package com.intellimed.soapclient;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;


// "C:\Program Files\Java\jdk1.8.0_121\wsimport" -keep -s src http://www.webservicex.net/geoipservice.asmx?WSDL

public class IPLocationFinder {
	public static void main(String[] args){
		if (args.length != 1){
			System.out.println("You need to supply only one IP Address");
		} else {
			String ipAddress = args[0];
			GeoIPService geoIpService =  new GeoIPService();
			GeoIPServiceSoap geoIPServiceSoap = geoIpService.getGeoIPServiceSoap();
			GeoIP geoIp = geoIPServiceSoap.getGeoIP(ipAddress);
			System.out.println(geoIp.getCountryName());
			
		}
		
	}
}
