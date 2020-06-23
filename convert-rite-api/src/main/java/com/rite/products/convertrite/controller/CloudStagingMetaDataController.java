package com.rite.products.convertrite.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rite.products.convertrite.model.XxrCloudTable;
import com.rite.products.convertrite.service.XxrCloudService;

@RestController
public class CloudStagingMetaDataController {
	private static final Logger log = LoggerFactory.getLogger(CloudStagingMetaDataController.class);

	@Autowired
	XxrCloudService xxrCloudService;

	@GetMapping("/loadxxrclouddata")
	public ResponseEntity<List<XxrCloudTable>> getAllCloudData() {
		log.info("Start of getAllCloudData in CloudStagingMetaDataController :::");
		List<XxrCloudTable> list = xxrCloudService.getAllCloudData();
		return new ResponseEntity<List<XxrCloudTable>>(list, new HttpHeaders(), HttpStatus.OK);
	}

}
