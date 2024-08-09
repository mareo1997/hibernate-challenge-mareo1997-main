

package com.revature.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * A bean must implement Serializable, Comparable
 * and override hashCode() and equals().
 */
@Entity
@Table(name="POKEMONTYPE")
public class PokemonType implements Serializable, Comparable {
	/**
	 * Compatibility with Java 2.x 
	 */
	private static final long serialVersionUID = -2783359867056908045L;
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="element")
	private String element;
	
	public PokemonType() {}

	public PokemonType(String element) {
		this.element = element;
	}
	
	public PokemonType(int id, String element) {
		super();
		this.id = id;
		this.element = element;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	@Override
	public String toString() {
		return "PokemonType [id=" + id + ", element=" + element + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((element == null) ? 0 : element.hashCode());
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PokemonType other = (PokemonType) obj;
		if (element == null) {
			if (other.element != null)
				return false;
		} else if (!element.equals(other.element))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
