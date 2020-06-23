package com.rite.products.convertrite;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rite.products.convertrite.controller.CloudStagingMetaDataController;
import com.rite.products.convertrite.model.CloudTableId;
import com.rite.products.convertrite.model.XxrCloudTable;
import com.rite.products.convertrite.respository.XxrCloudTableRepository;
import com.rite.products.convertrite.service.XxrColudServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConvertRiteApiApplicationTests {

	private static final Logger log = LoggerFactory.getLogger(ConvertRiteApiApplicationTests.class);
	@InjectMocks
	private XxrColudServiceImpl xxrColudServiceImpl;
	@Mock
	private XxrCloudTableRepository xxrCloudTableRepository;

	@Test
	public void contextLoads() {

	}

	@Test
	public void getAllCloudData() {
		List<XxrCloudTable> list = new ArrayList<XxrCloudTable>();

		XxrCloudTable obj1 = new XxrCloudTable();
		CloudTableId cloudTableId = new CloudTableId();
		cloudTableId.setTableId(5233);
		cloudTableId.setTableName("POZ_SUPPLIERS_INT");
		obj1.setCloudTableId(cloudTableId);
		obj1.setObjectCode("SUPPLIER");
		obj1.setParentObjectCode("SUPPLIER");
		obj1.setUserTableName("POZ_SUPPLIERS_INT");

		list.add(obj1);

		when(xxrCloudTableRepository.findAll()).thenReturn(list);
		
		List<XxrCloudTable> listCloudTable = xxrColudServiceImpl.getAllCloudData();
		
		//when(listCloudTable==null).thenThrow(new Exception());

	}
}
