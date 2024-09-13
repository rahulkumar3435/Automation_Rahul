package AdvanceProblems;

import java.util.Objects;

public class PotBoilerCode {
	
	private int numb ;
	
	private String name;

	public int getNumb() {
		return numb;
	}

	public void setNumb(int numb) {
		this.numb = numb;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, numb);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PotBoilerCode other = (PotBoilerCode) obj;
		return Objects.equals(name, other.name) && numb == other.numb;
	}

	@Override
	public String toString() {
		return "Annk [numb=" + numb + ", name=" + name + "]";
	}

}
