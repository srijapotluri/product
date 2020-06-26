package com.rite.products.convertrite.service;

import org.springframework.stereotype.Service;

import com.rite.products.convertrite.po.CloudSourceColumnsPo;
import com.rite.products.convertrite.po.XxrCloudTemplatePo;

@Service
public interface XxrCloudService {
	XxrCloudTemplatePo getAllCloudData();

	CloudSourceColumnsPo getCloudSourceColumns(String sourceTemplateName, String cloudTableName);
}
