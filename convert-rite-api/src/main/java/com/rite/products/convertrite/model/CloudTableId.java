package com.rite.products.convertrite.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CloudTableId implements Serializable{
	
	
	//private int applicationId;
	
	private long tableId;

	/*
	 * public int getApplicationId() { return applicationId; } public void
	 * setApplicationId(int applicationId) { this.applicationId = applicationId; }
	 */
	public long getTableId() {
		return tableId;
	}
	public void setTableId(long tableId) {
		this.tableId = tableId;
	}
    

}
