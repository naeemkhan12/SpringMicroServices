package com.boot.repository;

import com.boot.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by naeem on 6/5/17.
 */
public interface ShipwreckRepository extends JpaRepository<Shipwreck,Long> {

}
