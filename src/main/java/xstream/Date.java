package xstream;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Date")
public class Date {
	private String date;

	public Date(String date) {
		this.date = date;
	}

	public String getDate() {
		return date;
	}
	
}
