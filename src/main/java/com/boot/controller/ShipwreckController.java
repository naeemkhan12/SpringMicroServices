package com.boot.controller;

import com.boot.model.Shipwreck;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by naeem on 6/3/17.
 */
@RestController
@RequestMapping("api/v1/")
public class ShipwreckController {

    @RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
    public List<Shipwreck> list(){
        return ShipwreckStub.list();

    }
    @RequestMapping(value = "shipwrecks", method = RequestMethod.POST)
    public Shipwreck create(@RequestBody Shipwreck shipwreck){
            return ShipwreckStub.create(shipwreck);
    }
    @RequestMapping(value = "shipwrecks/{id}",method = RequestMethod.GET)
    public Shipwreck get(@PathVariable long id){
        return ShipwreckStub.get(id);
    }
    @RequestMapping(value = "shipwrecks/{id}",method = RequestMethod.PUT)
    public Shipwreck update(@PathVariable long id , @RequestBody Shipwreck shipwreck){
        return ShipwreckStub.update(id,shipwreck);
    }
    @RequestMapping(value = "shipwrecks/{id}",method = RequestMethod.DELETE)
    public Shipwreck delete(@PathVariable long id){
        return ShipwreckStub.delete(id);
    }
}
