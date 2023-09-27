package spring.mircoservices.moviecatalogservice.Builder;

import org.springframework.stereotype.Component;

import spring.mircoservices.moviecatalogservice.Builder.Interface.CatalogItemBuilder;
import spring.mircoservices.moviecatalogservice.Entity.CatalogItem;

@Component
public class CatalogItemBuilderImpl implements CatalogItemBuilder{
  
  public CatalogItem buildCatalogItem(String movieName, String movieDescription, int movieRating){
      return new CatalogItem(movieName, movieDescription, movieRating);
  }
}
