package org.wlcg.storage.api.model.fileinfo;

import org.wlcg.storage.api.model.BulkRequestModel;

import io.swagger.v3.oas.annotations.media.Schema;

public class FileInfoBulkRequestModel extends BulkRequestModel {
  
  @Schema(description = "Set to true if the user wants a synchronous response, false otherwise", required = false)
  private boolean synchronousResponse;
  
  public FileInfoBulkRequestModel() {
    super();
  }

  public boolean isSynchronousResponse() {
    return synchronousResponse;
  }

  public void setSynchronousResponse(boolean synchronousResponse) {
    this.synchronousResponse = synchronousResponse;
  }

  
}
