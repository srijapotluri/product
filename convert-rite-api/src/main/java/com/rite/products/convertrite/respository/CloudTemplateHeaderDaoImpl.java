package com.rite.products.convertrite.respository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rite.products.convertrite.model.XxrCloudTemplateHeader;
import com.rite.products.convertrite.po.CloudTemplatePo;

@Repository
public class CloudTemplateHeaderDaoImpl {

	@Autowired
	EntityManagerFactory em;
	private static final Logger log = LoggerFactory.getLogger(CloudTemplateHeaderDaoImpl.class);
	@SuppressWarnings("unchecked")
	public List<XxrCloudTemplateHeader> getCloudTemplate(CloudTemplatePo cloudTemplatePo) {

		List<XxrCloudTemplateHeader> list = new ArrayList<>();
		try {
			StringBuilder sqlBuilder = new StringBuilder().append("select x from XxrCloudTemplateHeader x");

			if (!isNullOrEmpty(cloudTemplatePo.getObjectCode()))
				sqlBuilder.append(" where x.objectCode = :objectCode");
			if (cloudTemplatePo.getPodId() != null)
				sqlBuilder.append(" and x.podId = :podId");
			if (cloudTemplatePo.getBu()!=null)
				sqlBuilder.append(" and x.bu = :bu");
			if (!isNullOrEmpty(cloudTemplatePo.getBuSpecific()))
				sqlBuilder.append(" and x.buSpecific = :buSpecific");
			if (!isNullOrEmpty(cloudTemplatePo.getCloudDataTableName()))
				sqlBuilder.append(" and x.cloudDataTableName = :cloudDataTableName");
			if (!isNullOrEmpty(cloudTemplatePo.getParentObjectCode()))
				sqlBuilder.append(" and x.parentObjectCode = :parentObjectCode");
			if (!isNullOrEmpty(cloudTemplatePo.getProjectName()))
				sqlBuilder.append(" and x.projectName = :projectName");
			if (!isNullOrEmpty(cloudTemplatePo.getSourceHeaderTemplate()))
				sqlBuilder.append(" and x.sourceHeaderTemplate = :sourceHeaderTemplate");
			if (!isNullOrEmpty(cloudTemplatePo.getTableName()))
				sqlBuilder.append(" and x.tableName LIKE :tableName");
			if (!isNullOrEmpty(cloudTemplatePo.getTemplateName()))
				sqlBuilder.append(" and x.templateName LIKE :templateName");
			if (!isNullOrEmpty(cloudTemplatePo.getTemplateType()))
				sqlBuilder.append(" and x.templateType = :templateType");
			if (!isNullOrEmpty(cloudTemplatePo.getViewName()))
				sqlBuilder.append(" and x.viewName LIKE :viewName");
			String sql = sqlBuilder.toString();

			EntityManager en = em.createEntityManager();
			Query query = en.createQuery(sql);
			
			if (!isNullOrEmpty(cloudTemplatePo.getObjectCode()))
				query.setParameter("objectCode", cloudTemplatePo.getObjectCode());
			if (cloudTemplatePo.getPodId() != null)
				query.setParameter("podId", cloudTemplatePo.getPodId());
			if (cloudTemplatePo.getBu() != null)
				query.setParameter("bu", cloudTemplatePo.getBu());
			if (!isNullOrEmpty(cloudTemplatePo.getBuSpecific()))
				query.setParameter("buSpecific", cloudTemplatePo.getBuSpecific());
			if (!isNullOrEmpty(cloudTemplatePo.getCloudDataTableName()))
				query.setParameter("cloudDataTableName", cloudTemplatePo.getCloudDataTableName());
			if (!isNullOrEmpty(cloudTemplatePo.getParentObjectCode()))
				query.setParameter("parentObjectCode", cloudTemplatePo.getParentObjectCode());
			if (!isNullOrEmpty(cloudTemplatePo.getProjectName()))
				query.setParameter("projectName", cloudTemplatePo.getProjectName());
			if (!isNullOrEmpty(cloudTemplatePo.getSourceHeaderTemplate()))
				query.setParameter("sourceHeaderTemplate", cloudTemplatePo.getSourceHeaderTemplate());
			if (!isNullOrEmpty(cloudTemplatePo.getTableName()))
				query.setParameter("tableName", "%" + cloudTemplatePo.getTableName() + "%");
			if (!isNullOrEmpty(cloudTemplatePo.getTemplateName()))
				query.setParameter("templateName", "%" + cloudTemplatePo.getTemplateName() + "%");
			if (!isNullOrEmpty(cloudTemplatePo.getTemplateType()))
				query.setParameter("templateType", cloudTemplatePo.getTemplateType());
			if (!isNullOrEmpty(cloudTemplatePo.getViewName()))
				query.setParameter("viewName", "%" + cloudTemplatePo.getViewName() + "%");

			list = query.getResultList();
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return list;
	}

	private boolean isNullOrEmpty(String string) {
		return string == null || string.isEmpty();
	}

}
