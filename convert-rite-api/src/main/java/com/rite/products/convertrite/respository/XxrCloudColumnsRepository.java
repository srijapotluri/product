package com.rite.products.convertrite.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rite.products.convertrite.model.XxrCloudColumns;
@Repository
public interface XxrCloudColumnsRepository extends JpaRepository<XxrCloudColumns,Long>{
	
	@Query("select x.columnName from XxrCloudColumns x "
			+ "where x.tableId =:tableId")
	public String[] getColumnName(@Param("tableId") long tableId);

}
