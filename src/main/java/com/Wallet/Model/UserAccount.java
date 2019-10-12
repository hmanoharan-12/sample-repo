package com.Wallet.Model;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;



@Entity
public class UserAccount {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@NotNull
	private String userName;
	private String email;
	@Temporal(TemporalType.DATE)
    private Date dateCreated;
//	@OneToMany(mappedBy = "userAccount", fetch = FetchType.EAGER)
//    private Set <Transaction> transactions = new HashSet<>();
	
    
    public UserAccount() {
	}
   
    public UserAccount(String userName, String email, Date dateCreated) {
		super();
		this.userName = userName;
		this.email = email;
		this.dateCreated = dateCreated;
	}

	
	public UserAccount(int id, String userName, String email, Date dateCreated) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.dateCreated = dateCreated;
	}


   public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
//	public Set<Transaction> getTransactions() {
//		return transactions;
//	}
//	public void setTransactions(Set<Transaction> transactions) {
//		this.transactions = transactions;
//	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id,userName,email,dateCreated);
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserAccount other = (UserAccount) obj;
		if (!Objects.equals(this.id, other.id)) {
			return false;
		}
		return true;
		
		
		
		
	}
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder ("UserAccount{");
		sb.append("id=").append(id);
		sb.append(",username='").append(userName).append('\'');
		sb.append(",email='").append(email).append('\'');
		sb.append(",date='").append(dateCreated).append('\'');
		sb.append('}');
		return sb.toString();
		
	}
	
	
}
