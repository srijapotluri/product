package com.rite.products.convertrite.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "XXR_SOURCE_TEMPLATE_COLUMNS")
public class SourceTemplateColumns implements Serializable {
	
	private static final long serialVersionUID = 1L;

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
