package org.wlcg.storage.api.model;

import io.swagger.v3.oas.annotations.media.Schema;

public class BulkRequestStatusModel {

  @Schema(description = "The bulk request id", required = true)
  String id;

  public BulkRequestStatusModel() {
    // TODO Auto-generated constructor stub
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
