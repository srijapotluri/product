package com.rite.products.convertrite.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rite.products.convertrite.model.CloudTableId;
import com.rite.products.convertrite.model.XxrCloudTable;

@Repository
public interface XxrCloudTableRepository extends JpaRepository<XxrCloudTable, CloudTableId> {
	/*
	 * @Query(value =
	 * "SELECT  t.templateName FROM XxrCloudTable c INNER JOIN SourceTemplateHeaders t "
	 * +
	 * "ON c.objectCode = t.saasobjectCode and c.parentObjectCode = t.saasParentObjectCode"
	 * ) public String[] getSourceTemplateHeaders();
	 */
	@Query(value = "SELECT c.cloudTableId.tableId FROM XxrCloudTable c "
			+ "WHERE c.cloudTableId.tableName =:tableName")
	public long getTableId(@Param("tableName") String tableName);

}
