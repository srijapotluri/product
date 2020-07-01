package com.rite.products.convertrite.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rite.products.convertrite.model.XxrCloudTemplateColumns;
import com.rite.products.convertrite.model.XxrCloudTemplateHeader;
import com.rite.products.convertrite.po.CloudSourceColumnsPo;
import com.rite.products.convertrite.po.CloudTemplatePo;
import com.rite.products.convertrite.po.XxrCloudTemplatePo;

@Service
public interface XxrCloudService {
	
	XxrCloudTemplatePo getAllCloudData() throws Exception;

	CloudSourceColumnsPo getCloudSourceColumns(String sourceTemplateName, String cloudTableName) throws Exception;

	List<XxrCloudTemplateHeader> getCloudTemplate(CloudTemplatePo cloudTemplatePo) throws Exception;

	List<XxrCloudTemplateColumns> getCloudTemplateColumns(long templateId) throws Exception;

}
