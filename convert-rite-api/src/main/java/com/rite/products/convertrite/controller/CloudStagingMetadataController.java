package com.rite.products.convertrite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rite.products.convertrite.respository.XxrCloudTableRepository;
import com.rite.products.convertrite.model.XxrCloudTable;



@RestController
public class CloudStagingMetadataController {

	@Autowired
	XxrCloudTableRepository cloudTableRepo;
	
	@RequestMapping("/cloudStageData/xxrclouddata")
	    public ResponseEntity<List<XxrCloudTable>> getAllCloudData() {
	     //   List<XxrCloudTable> list = service.getCloudTableData();
		 List<XxrCloudTable> list = cloudTableRepo.findAll();
	 
	        return new ResponseEntity<List<XxrCloudTable>>(list, new HttpHeaders(), HttpStatus.OK);
	    }
}
