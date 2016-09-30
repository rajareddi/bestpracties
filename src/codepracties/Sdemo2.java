package codepracties;

import java.io.Serializable;

public  class Sdemo2 implements Serializable {
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	int i;
	String name;

}