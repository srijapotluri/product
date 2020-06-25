package com.rite.products.convertrite.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="V_CONVERTRITE_CLOUDMETADATA")
public class CloudMetaData {
	@Id
	@Column(name="COLUMNID")
	private String columnId;
	
	@Column(name="VALUE")
	private String value;
	

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getColumnId() {
		return columnId;
	}

	public void setColumnId(String columnId) {
		this.columnId = columnId;
	}
	
	

}
