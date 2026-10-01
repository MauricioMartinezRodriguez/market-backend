package com.tecnm.merida.market_backend.persistence;

import com.tecnm.merida.market_backend.persistence.crud.ProductoCrudRepository;
import com.tecnm.merida.market_backend.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    //SELEC * FROM productos
    public List<Producto> getAll(){
        //Vamos a "castear"
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
