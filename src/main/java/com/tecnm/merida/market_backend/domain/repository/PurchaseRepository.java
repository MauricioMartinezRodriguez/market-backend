package com.tecnm.merida.market_backend.domain.repository;

import com.tecnm.merida.market_backend.domain.Purchase;
import com.tecnm.merida.market_backend.persistence.entity.Compra;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {

    List<Purchase> getAll();
    Optional<List<Purchase>> getByClient(String clientId);
    Purchase save(Purchase purchase);
}
