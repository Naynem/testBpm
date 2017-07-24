package xstream;

import java.util.ArrayList;
import java.util.List;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("ValCurs")
public class ValCurs {
	private Date date;
	@XStreamImplicit
	private List<Valute> valute = new ArrayList<Valute>();
	private Name name;

	@Override
	public String toString() {
		return "ValCurs [date=" + date + "]";
	}
	
	public void add(Valute valute){
		this.valute.add(valute);
	}
	public List<Valute> getValute() {
		return valute;
	}

	public Date getDate() {
		return date;
	}

	public Name getName() {
		return name;
	}

}
