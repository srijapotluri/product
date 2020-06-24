package com.rite.products.convertrite.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rite.products.convertrite.model.SourceTemplateColumns;
@Repository
public interface SourceTemplateColumnsRepository extends JpaRepository<SourceTemplateColumns,Long>{
	
	@Query("select s.columnName from SourceTemplateColumns s "
			+ "where s.templateId =:templateId")
	public String[] getColumnNames(@Param("templateId") long templateId);

}
