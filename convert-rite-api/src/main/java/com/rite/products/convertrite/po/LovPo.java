package com.rite.products.convertrite.po;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class LovPo {
	
	@JsonInclude(Include.NON_NULL)
	private String[] pod;
	@JsonInclude(Include.NON_NULL)
	private String[] bu;
	@JsonInclude(Include.NON_NULL)
	private String[] objectCodes;
	@JsonInclude(Include.NON_NULL)
	private String[] parentObjectCode;
	
	public String[] getPod() {
		return pod;
	}
	public void setPod(String[] pod) {
		this.pod = pod;
	}
	public String[] getObjectCodes() {
		return objectCodes;
	}
	public void setObjectCodes(String[] objectCodes) {
		this.objectCodes = objectCodes;
	}
	public String[] getParentObjectCode() {
		return parentObjectCode;
	}
	public void setParentObjectCode(String[] parentObjectCode) {
		this.parentObjectCode = parentObjectCode;
	}
	public String[] getBu() {
		return bu;
	}
	public void setBu(String[] bu) {
		this.bu = bu;
	}
	
	

}
