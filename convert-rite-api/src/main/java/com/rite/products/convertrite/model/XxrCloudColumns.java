package com.rite.products.convertrite.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="XXR_CLOUD_COLUMNS")
public class XxrCloudColumns {

	@Id
	private long tableId;

	@Column(name="COLUMN_NAME")
	private String columnName;

	public long getTableId() {
		return tableId;
	}

	public void setTableId(long tableId) {
		this.tableId = tableId;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

}
