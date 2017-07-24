package htmlrequest;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.util.Scanner;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import bnm.Leu;
import xstream.ValCurs;
import xstream.Valute;

public class HtmlRequest {
	
	public Leu check(String date, String proxy, int port) {
		Leu leu = new Leu();
		for(Valute v : readXml(getXML(date, proxy, port)).getValute()){
			switch (v.getCharCode()){
			case "USD" : leu.setUsd(new BigDecimal(v.getValue()));System.out.print("Created\n");break;
    		case "EUR" : leu.setEur(new BigDecimal(v.getValue()));System.out.print("Created\n");break;
    		case "RON" : leu.setRon(new BigDecimal(v.getValue()));System.out.print("Created\n");break;
    		case "UAH" : leu.setUah(new BigDecimal(v.getValue()));System.out.print("Created\n");break;
    		case "RUB" : leu.setRub(new BigDecimal(v.getValue()));System.out.print("Created\n");break;
			}
		}
		return leu;
	}

	@SuppressWarnings("static-access")
	private String getXML(String date, String sproxy, int port) {
		// proxy 123.241.243.217 8088
		//133.242.237.206 88
		Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(sproxy, port));
		String xml = "";
		try {
			HttpURLConnection conn = (HttpURLConnection) new URL(
					"http://bnm.md/ro/official_exchange_rates?get_xml=1&date="+date).openConnection(proxy);
			conn.setRequestMethod("GET");
			if (conn.HTTP_OK == 200) {
				Scanner scanner = new Scanner(conn.getInputStream());
				while (scanner.hasNext())
					xml += scanner.nextLine();
				scanner.close();
			}
			conn.disconnect();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("xml readed: "+xml);
		return xml;
	}

	private ValCurs readXml(String xml) {

		XStream xstream = new XStream(new StaxDriver());

        xstream.processAnnotations(ValCurs.class);

		ValCurs val = (ValCurs) xstream.fromXML(xml);
		for (Valute v : val.getValute()) {
			System.out.println(v.toString());
		}
		return val;

	}

}
