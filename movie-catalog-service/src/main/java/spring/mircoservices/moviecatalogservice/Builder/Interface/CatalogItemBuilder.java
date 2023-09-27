package spring.mircoservices.moviecatalogservice.Builder.Interface;

import spring.mircoservices.moviecatalogservice.Entity.CatalogItem;

public interface CatalogItemBuilder {
  public  CatalogItem buildCatalogItem(String movieName, String movieDescription, int movieRating);
}
