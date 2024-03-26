package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class CtEts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ctets_id;
	
	private List<String> mf_on;
	
	private int mf_issue;
	
	private int mf_reissue;
	
	private String country_curr;
	
	public int getCtets_id() {
		return ctets_id;
	}

	public void setCtets_id(int ctets_id) {
		this.ctets_id = ctets_id;
	}

	public List<String> getMf_on() {
		return mf_on;
	}

	public void setMf_on(List<String> mf_on) {
		this.mf_on = mf_on;
	}

	public int getMf_issue() {
		return mf_issue;
	}

	public void setMf_issue(int mf_issue) {
		this.mf_issue = mf_issue;
	}

	public int getMf_reissue() {
		return mf_reissue;
	}

	public void setMf_reissue(int mf_reissue) {
		this.mf_reissue = mf_reissue;
	}

	public String getCountry_curr() {
		return country_curr;
	}

	public void setCountry_curr(String country_curr) {
		this.country_curr = country_curr;
	}

	public List<String> getApplicable_on() {
		return applicable_on;
	}

	public void setApplicable_on(List<String> applicable_on) {
		this.applicable_on = applicable_on;
	}

	public long getTf_issue() {
		return tf_issue;
	}

	public void setTf_issue(long tf_issue) {
		this.tf_issue = tf_issue;
	}

	public long getTf_reissue() {
		return tf_reissue;
	}

	public void setTf_reissue(long tf_reissue) {
		this.tf_reissue = tf_reissue;
	}

	public CtEts(int ctets_id, List<String> mf_on, int mf_issue, int mf_reissue, String country_curr,
			List<String> applicable_on, long tf_issue, long tf_reissue) {
		super();
		this.ctets_id = ctets_id;
		this.mf_on = mf_on;
		this.mf_issue = mf_issue;
		this.mf_reissue = mf_reissue;
		this.country_curr = country_curr;
		this.applicable_on = applicable_on;
		this.tf_issue = tf_issue;
		this.tf_reissue = tf_reissue;
	}

	public CtEts() {
		super();
		// TODO Auto-generated constructor stub
	}

	private List<String> applicable_on;
	
	private long tf_issue;
	
	private long tf_reissue;

	
}
