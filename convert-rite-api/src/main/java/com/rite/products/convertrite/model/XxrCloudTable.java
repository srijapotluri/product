package com.rite.products.convertrite.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "XXR_CLOUD_TABLES")
public class XxrCloudTable implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CloudTableId cloudTableId;
	
	@Column(name = "USER_TABLE_NAME")
	private String userTableName;
	
	@Column(name = "OBJECT_NAME")
	private String objectCode;
	
	@Column(name = "PARENT_OBJECT")
	private String parentObjectCode;
	
	
	/*
	 * private SourceTemplateHeaders sourceTemplateHeaders;
	 * 
	 * 
	 * public SourceTemplateHeaders getSourceTemplateHeaders() { return
	 * sourceTemplateHeaders; }
	 * 
	 * public void setSourceTemplateHeaders(SourceTemplateHeaders
	 * sourceTemplateHeaders) { this.sourceTemplateHeaders = sourceTemplateHeaders;
	 * }
	 */

	public String getObjectCode() {
		return objectCode;
	}

	public void setObjectCode(String objectCode) {
		this.objectCode = objectCode;
	}

	public String getParentObjectCode() {
		return parentObjectCode;
	}

	public void setParentObjectCode(String parentObjectCode) {
		this.parentObjectCode = parentObjectCode;
	}

	public CloudTableId getCloudTableId() {
		return cloudTableId;
	}

	public void setCloudTableId(CloudTableId cloudTableId) {
		this.cloudTableId = cloudTableId;
	}

	public String getUserTableName() {

		return userTableName;
	}

	public void setUserTableName(String userTableName) {

		this.userTableName = userTableName;
	}

}
