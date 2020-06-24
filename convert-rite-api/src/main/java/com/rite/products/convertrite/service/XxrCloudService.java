package com.rite.products.convertrite.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rite.products.convertrite.model.XxrCloudTable;
@Service
public interface XxrCloudService {
	List<XxrCloudTable> getAllCloudData();
}
