package com.rite.products.convertrite.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="XXR_SOURCE_CLOUD_TABLES")
public class XxrCloudTable {
	@Id
	@Column(name="APPLICATION_ID")
	private int applicationId;
	@Column(name="TABLE_ID")
	private long tableId;
	@Column(name="TABLE_NAME")
	private String tableName;
	@Column(name="USER_TABLE_NAME")
	private String userTableName;
}
