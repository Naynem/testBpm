package xstream;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ID")
public class Id {
	private String id;

	public Id(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
	
}
