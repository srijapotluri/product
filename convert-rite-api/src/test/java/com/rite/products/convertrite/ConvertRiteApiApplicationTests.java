package com.rite.products.convertrite;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rite.products.convertrite.model.CloudTableId;
import com.rite.products.convertrite.model.XxrCloudTable;
import com.rite.products.convertrite.model.XxrCloudTemplateColumns;
import com.rite.products.convertrite.respository.XxrCloudTableRepository;
import com.rite.products.convertrite.respository.XxrCloudTemplateColumnsRepository;
import com.rite.products.convertrite.service.XxrColudServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest

public class ConvertRiteApiApplicationTests {

	private static final Logger log = LoggerFactory.getLogger(ConvertRiteApiApplicationTests.class);
	@InjectMocks
	private XxrColudServiceImpl xxrColudServiceImpl;
	@Mock
	private XxrCloudTableRepository xxrCloudTableRepository;
	
	@Mock
	XxrCloudTemplateColumnsRepository xxrCloudTemplateColumnsRepository;

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
		//obj1.setObjectCode("SUPPLIER");
		//obj1.setParentObjectCode("SUPPLIER");
		obj1.setUserTableName("POZ_SUPPLIERS_INT");

		list.add(obj1);

		when(xxrCloudTableRepository.findAll()).thenReturn(list);
		try {
		//List<XxrCloudTable> listCloudTable = xxrColudServiceImpl.getAllCloudData();
		}
		catch(Exception e) {
			 assertThat(e.getMessage().equals("Name must not be null"));
		}	

	}
	@Test
	public void getCloudTemplateColumns() throws Exception {
		List<XxrCloudTemplateColumns> cloudTemplateColumnsList = new ArrayList<>();
		
		XxrCloudTemplateColumns xxrCloudTemplateColumns=new XxrCloudTemplateColumns();
		xxrCloudTemplateColumns.setTemplateId(1);
		xxrCloudTemplateColumns.setColumnName("REMIT_ADVICE_DELIVERY_METHOD");
		xxrCloudTemplateColumns.setSourceColumnName("INVOICE_AMOUNT_LIMIT");
		xxrCloudTemplateColumns.setStartDate(new Date(30-06-2020));
		xxrCloudTemplateColumns.setEndDate(new Date(03-07-2020));
		xxrCloudTemplateColumns.setSeq(101);
		xxrCloudTemplateColumns.setMappingType("Constant");
		xxrCloudTemplateColumns.setMappingValue(200);
		xxrCloudTemplateColumns.setMappingSetName("SET NAME");
		
		XxrCloudTemplateColumns xxrCloudTemplateColumn=new XxrCloudTemplateColumns();
		xxrCloudTemplateColumn.setTemplateId(1);
		xxrCloudTemplateColumn.setColumnName("REMIT_ADVICE_DELIVERY_METHOD1");
		xxrCloudTemplateColumn.setSourceColumnName("INVOICE_AMOUNT_LIMIT1");
		xxrCloudTemplateColumn.setStartDate(new Date(30-06-2020));
		xxrCloudTemplateColumn.setEndDate(new Date(03-07-2020));
		xxrCloudTemplateColumn.setSeq(101);
		xxrCloudTemplateColumn.setMappingType("Constant");
		xxrCloudTemplateColumn.setMappingValue(200);
		xxrCloudTemplateColumn.setMappingSetName("SET NAME");
		
		cloudTemplateColumnsList.add(xxrCloudTemplateColumns);
		cloudTemplateColumnsList.add(xxrCloudTemplateColumn);
		
		when(xxrCloudTemplateColumnsRepository.getCloudTemplateColumns(1)).thenReturn(cloudTemplateColumnsList);
		
		cloudTemplateColumnsList = xxrColudServiceImpl.getCloudTemplateColumns(1);
		
	}
}
