package org.wlcg.storage.api.model.unpin;

import io.swagger.v3.oas.annotations.media.Schema;

public class CreatedUnpinBulkRequestModel {
  @Schema(description = "Unpin request coming from the user")
  private UnpinBulkRequestModel request;
  @Schema(description = "Submitted request object")
  private String id;
  @Schema(description = "The access URL that can be used by the user to access the bulk request")
  private String accessURL;
  
  public CreatedUnpinBulkRequestModel(String id, UnpinBulkRequestModel request) {
    this.id = id;
    this.request = request;
  }

  public UnpinBulkRequestModel getRequest() {
    return request;
  }

  public void setRequest(UnpinBulkRequestModel request) {
    this.request = request;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getAccessURL() {
    return accessURL;
  }

  public void setAccessURL(String accessURL) {
    this.accessURL = accessURL;
  }
}
