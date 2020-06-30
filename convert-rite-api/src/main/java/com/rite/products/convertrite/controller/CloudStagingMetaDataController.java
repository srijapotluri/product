package com.rite.products.convertrite.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rite.products.convertrite.model.XxrCloudTemplateColumns;
import com.rite.products.convertrite.model.XxrCloudTemplateHeader;
import com.rite.products.convertrite.po.CloudSourceColumnsPo;
import com.rite.products.convertrite.po.CloudTemplatePo;
import com.rite.products.convertrite.po.XxrCloudTemplatePo;
import com.rite.products.convertrite.service.XxrCloudService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController

public class CloudStagingMetaDataController {
	private static final Logger log = LoggerFactory.getLogger(CloudStagingMetaDataController.class);

	@Autowired
	XxrCloudService xxrCloudService;

	
	@ApiOperation(value = "For this Api no need to send any input parameters,Api returns cloudmetadata details")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successful Response"),
		  @ApiResponse(code = 500, message = "Server Side Error")
	})
	@SuppressWarnings("unchecked")
	@GetMapping("/getcloudtemplatemetadata")
	public ResponseEntity<XxrCloudTemplatePo> getCloudTemplateMetaData() {
		log.info("Start of getCloudTemplateMetaData Method in CloudStagingMetaDataController :::");
		XxrCloudTemplatePo cloudTemplatePo = new XxrCloudTemplatePo();
		try {
			cloudTemplatePo = xxrCloudService.getAllCloudData();
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseEntity(
					"Please contact System Administrator there is an error while processing the request",
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<XxrCloudTemplatePo>(cloudTemplatePo, new HttpHeaders(), HttpStatus.OK);
	}

	
	@ApiOperation(value = "This Api returns source and cloud cloumns,we has to provide sourcetemplateName and cloudtable names as query params")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successful Response"),
							@ApiResponse(code = 500, message = "Server Side Error"),
							@ApiResponse(code = 400, message = "Bad Request")
		})
	@SuppressWarnings("unchecked")
	@GetMapping("/getcloudsourcecolumns")
	public ResponseEntity<CloudSourceColumnsPo> getCloudSourceColumns(
			@RequestParam("sourceTemplateName") String sourceTemplateName,
			@RequestParam("cloudTableName") String cloudTableName) {

		log.info("Start of getCloudSourceColumns Method in Controller ###");
		log.info("sourceTemplateName:::::::" + sourceTemplateName + "CloudTableName:::::::" + cloudTableName);
		CloudSourceColumnsPo cloudSourceColumnsPo = new CloudSourceColumnsPo();
		try {
			if (sourceTemplateName != null  || cloudTableName != null)
				cloudSourceColumnsPo = xxrCloudService.getCloudSourceColumns(sourceTemplateName, cloudTableName);
			else
				 return new ResponseEntity("Missing SourceTemplateName or CloudTableName in the Request",HttpStatus.BAD_REQUEST);
				//log.error("Please send SourceTemplateName and CloudTableName in the URL");
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseEntity(
					"Please contact System Administrator there is an error while processing the request",
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<CloudSourceColumnsPo>(cloudSourceColumnsPo, new HttpHeaders(), HttpStatus.OK);

	}

	
	@ApiOperation(value = "This Api return already existing cloud templates based on user input data")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successful Response"),
			@ApiResponse(code = 500, message = "Server Side Error"),
			@ApiResponse(code = 400, message = "Bad Request")
	})
	@SuppressWarnings("unchecked")
	@PostMapping("/getcloudtemplates")
	public ResponseEntity<List<XxrCloudTemplateHeader>> getCloudTemplates(
			@RequestBody CloudTemplatePo cloudTemplatePo) {
		log.info("Start of getCloudTemplates Method in Controller ###");
		List<XxrCloudTemplateHeader> cloudTemplateHeaderList = new ArrayList<>();
		try {
			if (cloudTemplatePo.getObjectCode() != null)
				cloudTemplateHeaderList = xxrCloudService.getCloudTemplate(cloudTemplatePo);
			else
				return new ResponseEntity("Missing ObjectCode in Request Object", HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseEntity(
					"Please contact System Administrator there is an error while processing the request",
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<List<XxrCloudTemplateHeader>>(cloudTemplateHeaderList, new HttpHeaders(),
				HttpStatus.OK);
	}
	
	@ApiOperation(value = "This Api return Existing Cloud Template Columns data based on the TemplateId passed by user")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successful Response"),
			@ApiResponse(code = 500, message = "Server Side Error"),
			@ApiResponse(code = 400, message = "Bad Request")
	})
	@SuppressWarnings("unchecked")
	@GetMapping("/getcloudtemplatecolumns")
	public ResponseEntity<List<XxrCloudTemplateColumns>> getCloudTemplateColumns(
			@RequestParam("templateId") Long templateId) {
		log.info("Start of getCloudTemplateColumns Method in Controller ###");
		log.info("TemplateId:::::" + templateId);
		List<XxrCloudTemplateColumns> cloudTemplateColumnsList = new ArrayList<>();
		try {
			if (templateId != null)
				cloudTemplateColumnsList = xxrCloudService.getCloudTemplateColumns(templateId);
			else
				return new ResponseEntity("Missing TemplateId in Request", HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseEntity(
					"Please contact System Administrator there is an error while processing the request",
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<List<XxrCloudTemplateColumns>>(cloudTemplateColumnsList, HttpStatus.OK);
	}

}
