package com.rite.products.convertrite.respository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rite.products.convertrite.model.XxrCloudTable;

@Repository
public interface XxrCloudTableRepository extends JpaRepository<XxrCloudTable,Integer>{

	//List<XxrCloudTable> getXxrCloudTableData();
}
