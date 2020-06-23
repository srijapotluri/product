package com.rite.products.convertrite.respository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rite.products.convertrite.model.CloudTableId;
import com.rite.products.convertrite.model.XxrCloudTable;

@Repository
public interface XxrCloudTableRepository extends JpaRepository<XxrCloudTable, CloudTableId> {
	//@Query(value = "SELECT APPLICATION_ID,TABLE_ID,TABLE_NAME,USER_TABLE_NAME FROM XXR_SOURCE_CLOUD_TABLES", nativeQuery = true)
	//public List<XxrCloudTable> getAllCloudData();
}
