package com.tecnm.merida.market_backend.persistence;

import com.tecnm.merida.market_backend.domain.Purchase;
import com.tecnm.merida.market_backend.domain.repository.PurchaseRepository;
import com.tecnm.merida.market_backend.persistence.crud.CompraCrudRepository;
import com.tecnm.merida.market_backend.persistence.entity.Compra;
import com.tecnm.merida.market_backend.persistence.mapper.PurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CompraRepository implements PurchaseRepository {

    @Autowired
    private CompraCrudRepository compraCrudRepository;

    private PurchaseMapper mapper;

    @Override
    public List<Purchase> getAll(){
        return mapper.toPurchases((List<Compra>) compraCrudRepository.findAll());
    }

    @Override
    public Optional<List<Purchase>> getByClient(String clientId) {
        return compraCrudRepository.findByIdCliente(clientId)
                .map(mapper::toPurchases);
    }

    @Override
    public Purchase save (Purchase purchase) {
        Compra compra = mapper.toCompra(purchase);
        compra.getProductos().forEach(product -> product.setCompra(compra));
        return mapper.toPurchase(compraCrudRepository.save(compra));
    }

}
