package com.rite.products.convertrite.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rite.products.convertrite.po.CloudSourceColumnsPo;
import com.rite.products.convertrite.po.XxrCloudTemplatePo;
import com.rite.products.convertrite.service.XxrCloudService;

@RestController
public class CloudStagingMetaDataController {
	private static final Logger log = LoggerFactory.getLogger(CloudStagingMetaDataController.class);

	@Autowired
	XxrCloudService xxrCloudService;

	@GetMapping("/loadxxrclouddata")
	public ResponseEntity<XxrCloudTemplatePo> getAllCloudData() {
		log.info("Start of getAllCloudData Method in CloudStagingMetaDataController :::");
		XxrCloudTemplatePo cloudTemplatePo = new XxrCloudTemplatePo();
		try {
			cloudTemplatePo = xxrCloudService.getAllCloudData();
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return new ResponseEntity<XxrCloudTemplatePo>(cloudTemplatePo, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/getcloudsourcecolumns")
	public CloudSourceColumnsPo getCloudSourceColumns(@RequestParam("sourceTemplateName") String sourceTemplateName,
			@RequestParam("cloudTableName") String cloudTableName) {

		log.info("Entering getCloudSourceColumns Method in Controller ###");
		log.info("sourceTemplateName" + sourceTemplateName + "CloudTableName" + cloudTableName);
		CloudSourceColumnsPo cloudSourceColumnsPo = new CloudSourceColumnsPo();
		try {
			if(sourceTemplateName!=null&&cloudTableName!=null)
			cloudSourceColumnsPo = xxrCloudService.getCloudSourceColumns(sourceTemplateName, cloudTableName);
			else
			log.error("Please send SourceTemplateName and CloudTableName in the URL");
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return cloudSourceColumnsPo;

	}

}
