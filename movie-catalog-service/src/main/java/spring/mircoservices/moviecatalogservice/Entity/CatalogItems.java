package spring.mircoservices.moviecatalogservice.Entity;

import java.util.ArrayList;
import java.util.List;

public class CatalogItems {
  List<CatalogItem> catalogItems;
  
  public CatalogItems(){
    this.catalogItems = new ArrayList<CatalogItem>();
  }

  public List<CatalogItem> getCatalogItems() {
    return catalogItems;
  }

  public void setCatalogItems(List<CatalogItem> catalogItems) {
    this.catalogItems = catalogItems;
  }
}
