package com.rite.products.convertrite.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rite.products.convertrite.model.XxrCloudTable;
import com.rite.products.convertrite.po.CloudSourceColumnsPo;
import com.rite.products.convertrite.po.XxrCloudTemplatePo;
import com.rite.products.convertrite.respository.SourceTemplateColumnsRepository;
import com.rite.products.convertrite.respository.SourceTemplateHeadersRepository;
import com.rite.products.convertrite.respository.XxrCloudColumnsRepository;
import com.rite.products.convertrite.respository.XxrCloudTableRepository;

@Service
public class XxrColudServiceImpl implements XxrCloudService {

	private static final Logger log = LoggerFactory.getLogger(XxrColudServiceImpl.class);

	@Autowired
	XxrCloudTableRepository xxrCloudTableRepository;
	@Autowired
	SourceTemplateHeadersRepository sourceTemplateHeadersRepository;
	@Autowired
	XxrCloudColumnsRepository xxrCloudColumnsRepository;
	@Autowired
	SourceTemplateColumnsRepository sourceTemplateColumnsRepository;

	public XxrCloudTemplatePo getAllCloudData() {
		log.info("Start of getAllCloudData in Service Layer ###");
		List<XxrCloudTable> cloudDataList = new ArrayList<>();
		String[] templateHeaders;
		XxrCloudTemplatePo cloudTemplatePo = new XxrCloudTemplatePo();
		try {
			cloudDataList = xxrCloudTableRepository.findAll();
			templateHeaders = xxrCloudTableRepository.getSourceTemplateHeaders();

			cloudTemplatePo.setCloudTableMetaData(cloudDataList);
			cloudTemplatePo.setTemplateHeaders(templateHeaders);

		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return cloudTemplatePo;
	}

	public CloudSourceColumnsPo getCloudSourceColumns(String sourceTemplateName, String cloudTableName) {
		log.info("Entering getCloudSourceColumns Method in Service Layer ####");
		CloudSourceColumnsPo cloudSourceColumnsPo = new CloudSourceColumnsPo();

		try {
			long tableId = xxrCloudTableRepository.getTableId(cloudTableName);
			long templateId = sourceTemplateHeadersRepository.getTemplateId(sourceTemplateName);
			log.info("tableId::::::" + tableId + "templateId::::" + templateId);

			String[] cloudColumns = xxrCloudColumnsRepository.getColumnName(tableId);
			String[] sourceColumns = sourceTemplateColumnsRepository.getColumnNames(templateId);
			cloudSourceColumnsPo.setCloudColumns(cloudColumns);
			cloudSourceColumnsPo.setSourceColumns(sourceColumns);

		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return cloudSourceColumnsPo;
	}
}
