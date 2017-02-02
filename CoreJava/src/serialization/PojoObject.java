package serialization;

import java.io.Serializable;

public class PojoObject implements Serializable{

	private static final long serialVersionUID = 1L;

	private String name;
	private String surname;

	public PojoObject(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PojoObject [name=" + name + "]";
	}

}