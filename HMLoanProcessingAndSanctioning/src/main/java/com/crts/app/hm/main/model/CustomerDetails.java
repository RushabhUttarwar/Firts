package com.crts.app.hm.main.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class CustomerDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	
	@OneToOne(cascade = CascadeType.ALL)
	private FamilyDetails customerFamily;
	
	@OneToOne(cascade = CascadeType.ALL)
	private PersonalDetails customerPersonal;

	@OneToMany(cascade = CascadeType.ALL)
	private List<PreviousLoanDetails> customerPreviousLoans;
	
	@OneToOne(cascade = CascadeType.ALL)
	private DocumentDetails customerDocs;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerBankDetails bankDetails;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public FamilyDetails getCustomerFamily() {
		return customerFamily;
	}
	public void setCustomerFamily(FamilyDetails customerFamily) {
		this.customerFamily = customerFamily;
	}
	public PersonalDetails getCustomerPersonal() {
		return customerPersonal;
	}
	public void setCustomerPersonal(PersonalDetails customerPersonal) {
		this.customerPersonal = customerPersonal;
	}
	
	public List<PreviousLoanDetails> getCustomerPreviousLoans() {
		return customerPreviousLoans;
	}
	public void setCustomerPreviousLoans(List<PreviousLoanDetails> customerPreviousLoans) {
		this.customerPreviousLoans = customerPreviousLoans;
	}
	public DocumentDetails getCustomerDocs() {
		return customerDocs;
	}
	public void setCustomerDocs(DocumentDetails customerDocs) {
		this.customerDocs = customerDocs;
	}
	public CustomerBankDetails getBankDetails() {
		return bankDetails;
	}
	public void setBankDetails(CustomerBankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}
	@Override
	public String toString() {
		return "CustomerDetails [customerId=" + customerId + ", customerFamily=" + customerFamily
				+ ", customerPersonal=" + customerPersonal + ", customerPreviousLoans=" + customerPreviousLoans
				+ ", customerDocs=" + customerDocs + ", bankDetails=" + bankDetails + "]";
	}
	
	
	

}
