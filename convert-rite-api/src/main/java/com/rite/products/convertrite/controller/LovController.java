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

import com.rite.products.convertrite.po.LovPo;
import com.rite.products.convertrite.po.XxrCloudTemplatePo;
import com.rite.products.convertrite.service.XxrCloudService;
import com.rite.products.convertrite.service.XxrColudServiceImpl;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@RestController
public class LovController {
	
	private static final Logger log = LoggerFactory.getLogger(LovController.class);
	
	@Autowired
	XxrCloudService xxrCloudService;
	
	@ApiOperation(value = "This API will return lov values,pass following values {BU,PODID,OBJECTCODE,PARENTOBJECTCODE} in array to fetch values")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successful Response"),
		  @ApiResponse(code = 500, message = "Server Side Error")
	})
	@GetMapping("/getlovvalues")
	public ResponseEntity<LovPo> getLovValues(@RequestParam("lovValues") String [] lovValues) {
		LovPo cloudLovPo=new LovPo();
		try {
			if(lovValues.length!=0)
			cloudLovPo=xxrCloudService.getCloudLovValues(lovValues);
			else
				return new ResponseEntity(
						"Pass atleast one Lov Value which you want to fetch",
						HttpStatus.BAD_REQUEST);
		}catch(Exception e) {
			log.error(e.getMessage());
			return new ResponseEntity(
					"Please contact System Administrator there is an error while processing the request",
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<LovPo>(cloudLovPo, new HttpHeaders(), HttpStatus.OK);	
	}

}
