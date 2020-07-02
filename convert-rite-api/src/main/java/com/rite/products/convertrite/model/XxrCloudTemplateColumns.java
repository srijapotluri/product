package com.rite.products.convertrite.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="XXR_CLOUD_TEMPLATE_COLUMNS")
public class XxrCloudTemplateColumns {
	
	@Column(name="TEMPLATE_ID")
	private long templateId;
	@Id
	@Column(name="COLUMN_ID")
	private long columnId;
	@Column(name="COLUMN_NAME")
	private String columnName;
	@Column(name="SOURCE_COLUMN_NAME")
	private String sourceColumnName;
	@Column(name="MAPPING_TYPE")
	private String mappingType;
	@Column(name="MAPPING_SET_NAME")
	private String mappingSetName;
	@Column(name="MAPPING_VALUE")
	private Integer mappingValue;
	@Column(name="DISPLAY_SEQ")
	private Integer seq;
	@Column(name="START_DATE")
	private Date startDate;
	
	public long getColumnId() {
		return columnId;
	}
	public void setColumnId(long columnId) {
		this.columnId = columnId;
	}
	public Integer getMappingValue() {
		return mappingValue;
	}
	public void setMappingValue(Integer mappingValue) {
		this.mappingValue = mappingValue;
	}
	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	@Column(name="END_DATE")
	private Date endDate;
	
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
	public String getSourceColumnName() {
		return sourceColumnName;
	}
	public void setSourceColumnName(String sourceColumnName) {
		this.sourceColumnName = sourceColumnName;
	}
	public String getMappingType() {
		return mappingType;
	}
	public void setMappingType(String mappingType) {
		this.mappingType = mappingType;
	}
	public String getMappingSetName() {
		return mappingSetName;
	}
	public void setMappingSetName(String mappingSetName) {
		this.mappingSetName = mappingSetName;
	}
	
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	

}
