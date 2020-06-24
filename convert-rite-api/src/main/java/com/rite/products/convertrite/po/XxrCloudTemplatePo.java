package com.rite.products.convertrite.po;

import java.util.List;

import com.rite.products.convertrite.model.XxrCloudTable;

public class XxrCloudTemplatePo {
	
	private List<XxrCloudTable> cloudTableMetaData;
	private String [] templateHeaders;
	public List<XxrCloudTable> getCloudTableMetaData() {
		return cloudTableMetaData;
	}
	public void setCloudTableMetaData(List<XxrCloudTable> cloudTableMetaData) {
		this.cloudTableMetaData = cloudTableMetaData;
	}
	public String[] getTemplateHeaders() {
		return templateHeaders;
	}
	public void setTemplateHeaders(String[] templateHeaders) {
		this.templateHeaders = templateHeaders;
	}
	
	

}
