package dev.jpa.mvn.domain;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Address implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	@Column(name = "details", length = 512)
	private String details;
	@OneToMany(mappedBy = "address")
	private Set<Contact> contact;

	// ----------Constructor----------\\
	public Address() {
	}

	public Address(String details) {
		this.details = details;
	}

	// ------GETTER------\\
	public Long getId() {
		return id;
	}

	public String getDetails() {
		return details;
	}

	public Set<Contact> getContact() {
		return contact;
	}

	// ------SETTER------\\
	public void setId(Long id) {
		this.id = id;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public void setContact(Set<Contact> contact) {
		this.contact = contact;
	}

	// -------------@Override----------------------\\

	@Override
	public int hashCode() {
		return Objects.hash(details, id);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [id=");
		builder.append(id);
		builder.append(", details=");
		builder.append(details);
		builder.append(", contact=");
		builder.append(contact);
		builder.append("]");
		return builder.toString();
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
