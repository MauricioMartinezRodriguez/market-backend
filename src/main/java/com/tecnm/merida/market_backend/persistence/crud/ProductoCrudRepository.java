package com.tecnm.merida.market_backend.persistence.crud;

import com.tecnm.merida.market_backend.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
}
