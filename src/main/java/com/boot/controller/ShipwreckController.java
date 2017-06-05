package com.boot.controller;

import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by naeem on 6/3/17.
 */
@RestController
@RequestMapping("api/v1/")
public class ShipwreckController {
    @Autowired
    private ShipwreckRepository shipwreckRepository;


    @RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
    public List<Shipwreck> list(){
//        return ShipwreckStub.list();
        return shipwreckRepository.findAll();

    }
    @RequestMapping(value = "shipwrecks", method = RequestMethod.POST)
    public Shipwreck create(@RequestBody Shipwreck shipwreck){
//            return ShipwreckStub.create(shipwreck);
        return shipwreckRepository.saveAndFlush(shipwreck);
    }
    @RequestMapping(value = "shipwrecks/{id}",method = RequestMethod.GET)
    public Shipwreck get(@PathVariable long id)
    {
//        return ShipwreckStub.get(id);
        return shipwreckRepository.findOne(id);
    }
    @RequestMapping(value = "shipwrecks/{id}",method = RequestMethod.PUT)
    public Shipwreck update(@PathVariable long id , @RequestBody Shipwreck shipwreck){
//        return ShipwreckStub.update(id,shipwreck);
        Shipwreck existeningShipwreck = shipwreckRepository.findOne(id);
        BeanUtils.copyProperties(shipwreck,existeningShipwreck);
        return shipwreckRepository.saveAndFlush(existeningShipwreck);
    }
    @RequestMapping(value = "shipwrecks/{id}",method = RequestMethod.DELETE)
    public Shipwreck delete(@PathVariable long id){

//        return ShipwreckStub.delete(id);
        Shipwreck existeningShipwreck = shipwreckRepository.findOne(id);
        shipwreckRepository.delete(existeningShipwreck);
        return existeningShipwreck;

    }
}
