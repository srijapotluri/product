package com.rite.products.convertrite.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rite.products.convertrite.model.XxrCloudTemplateColumns;

@Repository
public interface XxrCloudTemplateColumnsRepository extends JpaRepository<XxrCloudTemplateColumns,Long>{
	
	@Query("select x from XxrCloudTemplateColumns x where x.templateId =:templateId")
	public List<XxrCloudTemplateColumns> getCloudTemplateColumns(@Param("templateId") long templateId);

}
