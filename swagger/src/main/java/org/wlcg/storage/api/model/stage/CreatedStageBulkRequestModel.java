package org.wlcg.storage.api.model.stage;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Stage bulk request created after POST submission")
public class CreatedStageBulkRequestModel {
  @Schema(description = "Identifier of the bulk request")
  private String id;
 
  @Schema(description = "Submitted request object")
  private StageBulkRequestModel request;
  
  @Schema(description = "The access URL that can be used by the user to access the bulk request")
  private String accessURL;
  
  public CreatedStageBulkRequestModel(String id,StageBulkRequestModel request) {
    this.id = id;
    this.request = request;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public StageBulkRequestModel getRequest() {
    return request;
  }

  public void setRequest(StageBulkRequestModel request) {
    this.request = request;
  }

  public String getAccessURL() {
    return accessURL;
  }

  public void setAccessURL(String accessURL) {
    this.accessURL = accessURL;
  }
  
  
}
