package com.equifax.dev.model.dao;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.equifax.dev.model.entities.Productos;
import com.equifax.dev.utils.DaoUtils;

@Component
public class ProductoDaoImpl extends GeneralDao implements ProductoDao {

	@Autowired
	DaoUtils eUtils;

	@SuppressWarnings("unchecked")
	public List<Productos> findAllActiveProdByCliente(Long cliId) {
		String hqlQuery = eUtils.getQByName("pdoCte.getAllActivesByCteId");
		String active = "1";
		try {
			List<Productos> list = (List<Productos>) findByHQuery(hqlQuery, new Object[]{cliId, active});
			return list;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return Collections.EMPTY_LIST;
		}
		
	}

}
