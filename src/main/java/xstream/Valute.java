package xstream;

import com.thoughtworks.xstream.annotations.XStreamAlias;
@XStreamAlias("Valute")
public class Valute {
	private Id id;
	private String NumCode;
	private String CharCode;
	private String Nominal;
	private String Name;
	private String Value;

	public Valute( String numCode, String charCode, String nominal, String name, String value) {
		this.NumCode = numCode;
		this.CharCode = charCode;
		this.Nominal = nominal;
		this.Name = name;
		this.Value = value;
	}

	
	@Override
	public String toString() {
		return "Valute [id=" + id + ", numCode=" + NumCode + ", charCode=" + CharCode + ", nominal=" + Nominal
				+ ", name=" + Name + ", value=" + Value + "]";
	}


	public String getCharCode() {
		return CharCode;
	}


	public String getValue() {
		return Value;
	}

}
