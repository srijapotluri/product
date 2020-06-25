package com.rite.products.convertrite.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rite.products.convertrite.model.CloudMetaData;
@Repository
public interface CloudMetaDataRepository extends JpaRepository<CloudMetaData,String>{
	
	@Query("select c.value from CloudMetaData c where c.columnId=:columnId")
	public String[] getValues(@Param("columnId") String columnId);

}
