package com.equifax.dev.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.equifax.dev.model.dao.ProductoDao;
import com.equifax.dev.model.entities.Productos;

@RestController
@RequestMapping("/productosByClte")
public class ProductosController {
	
	@Autowired
	private ProductoDao productoDao;

	@GetMapping(value = "/{idCliente}")
	public ResponseEntity<List<Productos>> listar(@PathVariable("idCliente") Long idCliente) {
		List<Productos> prodList = new ArrayList<>();
		prodList = productoDao.findAllActiveProdByCliente(idCliente);
		return new ResponseEntity<List<Productos>>(prodList, HttpStatus.OK);
	}
}
