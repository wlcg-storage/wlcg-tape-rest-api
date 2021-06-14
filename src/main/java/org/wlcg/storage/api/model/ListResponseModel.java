package org.wlcg.storage.api.model;

import java.util.List;

public class ListResponseModel<T> {

  private String kind;

  private List<T> items;

  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public List<T> getItems() {
    return items;
  }

  public void setItems(List<T> items) {
    this.items = items;
  }
}
