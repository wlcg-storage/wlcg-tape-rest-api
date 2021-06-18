package org.wlcg.storage.api.model;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;

public class ListResponseModel<T> {

  @Schema(description = "The type of bulk-request")
  private String type;

  @Schema(description = "The list of item to display = URL ?")
  private List<T> items;

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public List<T> getItems() {
    return items;
  }

  public void setItems(List<T> items) {
    this.items = items;
  }
}
