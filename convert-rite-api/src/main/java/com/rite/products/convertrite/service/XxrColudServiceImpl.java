package com.rite.products.convertrite.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rite.products.convertrite.model.XxrCloudTable;
import com.rite.products.convertrite.respository.XxrCloudTableRepository;

@Service
public class XxrColudServiceImpl implements XxrCloudService {

	private static final Logger log = LoggerFactory.getLogger(XxrColudServiceImpl.class);

	@Autowired
	XxrCloudTableRepository xxrCloudTableRepository;

	public List<XxrCloudTable> getAllCloudData() {
		log.info("Start of getAllCloudData in Service Layer ###");
		List<XxrCloudTable> cloudDataList=new ArrayList<>();
		try {
			cloudDataList = xxrCloudTableRepository.findAll();

		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return cloudDataList;
	}
}
