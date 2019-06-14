package dev.jpa.mvn.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address implements Serializable {

	@Id
	@Column(name = "id")
	private Long id;
	@Column(name = "details")
	private String details;

	public Address() {
	}

	// ----------Constructor----------\\
	public Long getId() {
		return id;
	}

	public String getDetails() {
		return details;
	}

	// ------GETTER------\\
	public void setId(Long id) {
		this.id = id;
	}

	// ------SETTER------\\
	public void setDetails(String details) {
		this.details = details;
	}

	// -------------@Override----------------------\\
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [id=");
		builder.append(id);
		builder.append(", details=");
		builder.append(details);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(details, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Address)) {
			return false;
		}
		Address other = (Address) obj;
		return Objects.equals(details, other.details) && Objects.equals(id, other.id);
	}

}
