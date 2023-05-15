package org.wlcg.storage.api.model.stage;

import java.util.ArrayList;
import java.util.List;

import org.wlcg.storage.api.model.BulkRequestStatusModel;
import org.wlcg.storage.api.model.FileStatusModel;
import org.wlcg.storage.api.model.RequestStatusType;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;

public class StageBulkRequestStatusModel extends BulkRequestStatusModel {
  
  @ArraySchema(minItems = 0,
      schema = @Schema(description = "The list of targers whose processing resulted in a failure"))
  private List<FileStatusModel> failures;
  
  @ArraySchema(minItems = 0,
      schema = @Schema(description = "The paths of the files that succesfully got staged"))
  private List<String> pathsStaged;
  
  @Schema(description = "The submitted request")
  private StageBulkRequestModel request;

  public StageBulkRequestStatusModel(){
    this.request = new StageBulkRequestModel();
    this.pathsStaged = new ArrayList<String>();
  }
  
  @Schema(description = "The bulk request status", required = true)
  RequestStatusType status;
  
  public RequestStatusType getStatus() {
    return this.status;
  }

  public void setStatus(RequestStatusType status) {
    this.status = status;
  }
  
  public void setRequest(StageBulkRequestModel request) {
    this.request = request;
  }
  
  public StageBulkRequestModel getRequest() {
    return this.request;
  }
  
  public List<FileStatusModel> getFailures() {
    return failures;
  }

  public void setFailures(List<FileStatusModel> failures) {
    this.failures = failures;
  }

  public List<String> getPathsStaged() {
    return pathsStaged;
  }

  public void setPathsStaged(List<String> pathsStaged) {
    this.pathsStaged = pathsStaged;
  }
}
