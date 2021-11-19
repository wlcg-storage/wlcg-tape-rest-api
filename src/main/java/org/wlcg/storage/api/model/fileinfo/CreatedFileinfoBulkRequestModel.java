package org.wlcg.storage.api.model.fileinfo;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Fileinfo bulk request created after POST submission")
public class CreatedFileinfoBulkRequestModel {
  @Schema(description = "Identifier of the bulk request")
  private String id;
 
  @Schema(description = "Submitted request object")
  private FileInfoBulkRequestModel request;
  
  @Schema(description = "The access URL that can be used by the user to access the bulk request")
  private String accessURL;

  public CreatedFileinfoBulkRequestModel(String id, FileInfoBulkRequestModel request) {
    this.request = request;
    this.id = id;
  }
  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FileInfoBulkRequestModel getRequest() {
    return request;
  }

  public void setRequest(FileInfoBulkRequestModel request) {
    this.request = request;
  }

  public String getAccessURL() {
    return accessURL;
  }

  public void setAccessURL(String accessURL) {
    this.accessURL = accessURL;
  }
  
  
}
