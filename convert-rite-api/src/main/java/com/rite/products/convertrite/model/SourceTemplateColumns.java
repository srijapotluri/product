package com.rite.products.convertrite.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "XXR_SOURCE_TEMPLATE_COLUMNS")
public class SourceTemplateColumns {
	
	@Id
	private long templateId;
	
	@Column(name="COLUMN_NAME")
	private String columnName;

	public long getTemplateId() {
		return templateId;
	}

	public void setTemplateId(long templateId) {
		this.templateId = templateId;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	
	

}
