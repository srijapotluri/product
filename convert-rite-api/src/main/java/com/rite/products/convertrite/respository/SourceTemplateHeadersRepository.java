package com.rite.products.convertrite.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rite.products.convertrite.model.SourceTemplateHeaders;

@Repository
public interface SourceTemplateHeadersRepository extends JpaRepository<SourceTemplateHeaders, Long> {

	@Query("SELECT h.templateId from SourceTemplateHeaders h"
			+ " where h.templateName =:templateName")
	public Long getTemplateId(@Param("templateName") String templateName);
	
	@Query ("SELECT h.templateName from SourceTemplateHeaders h where h.saasobjectCode IN :objectCode"
			+ " and h.saasParentObjectCode IN :objectCode")
	public String [] getTemplateHeaders(@Param("objectCode") String[] objectCode);
	

}
