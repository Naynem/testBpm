package xstream;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("name")
public class Name {
	private String name;

	public Name(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
