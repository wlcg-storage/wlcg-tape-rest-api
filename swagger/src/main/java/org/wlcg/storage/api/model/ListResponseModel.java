package org.wlcg.storage.api.model;

import java.util.ArrayList;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;

public class ListResponseModel<T> {
  
  @Schema(description = "The list of item to display = URL ?")
  private List<T> items;

  public ListResponseModel(){
    this.items = new ArrayList<T>();
  }
  
  public List<T> getItems() {
    return items;
  }

  public void setItems(List<T> items) {
    this.items = items;
  }
}
