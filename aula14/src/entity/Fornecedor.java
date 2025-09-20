package entity;

import java.io.Serializable;
import java.util.Objects;

public class Fornecedor implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cnpj;
	private String razaoSocial;
	
	
	
	public Fornecedor(String cnpj, String razaoSocial) {
		super();
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}


	@Override
	public String toString() {
		return "Fornecedor [cnpj=" + cnpj + ", razaoSocial=" + razaoSocial + "]";
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getRazaoSocial() {
		return razaoSocial;
	}


	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}


	@Override
	public int hashCode() {
		return Objects.hash(cnpj, razaoSocial);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fornecedor other = (Fornecedor) obj;
		return Objects.equals(razaoSocial, other.razaoSocial);
	}
	
	

}
