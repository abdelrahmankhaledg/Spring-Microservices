package spring.microservices.springmovieinfo.Entity;

public class MovieSummary {
  private String title;
  private String overview;
  private String id;

  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getOverview() {
    return overview;
  }
  public void setOverview(String overview) {
    this.overview = overview;
  }
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
}
