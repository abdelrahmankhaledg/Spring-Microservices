package spring.mircoservices.moviecatalogservice.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.mircoservices.moviecatalogservice.Entity.CatalogItems;
import spring.mircoservices.moviecatalogservice.Service.CatalogService;


@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private CatalogService catalogService;


    @GetMapping("/{userId}")
    //@Bulkhead(name = "catalogItems")
    public CatalogItems getCatalogItems(@PathVariable String userId) {
        return catalogService.getCatalogItems(userId);
    }



}
