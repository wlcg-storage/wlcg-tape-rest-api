package org.wlcg.storage.api.model;

import io.swagger.v3.oas.annotations.media.Schema;

public class BulkRequestStatusModel {

  @Schema(description = "The bulk request id", required = true)
  String id;

  @Schema(description = "The target count", required = true)
  Integer numTargets;

  @Schema(description = "The number of processed targets", required = true)
  Integer numProcessed;

  @Schema(description = "The request json", required = true)
  BulkRequestModel request;



  public BulkRequestStatusModel() {
    // TODO Auto-generated constructor stub
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Integer getNumTargets() {
    return numTargets;
  }

  public void setNumTargets(Integer numTargets) {
    this.numTargets = numTargets;
  }

  public Integer getNumProcessed() {
    return numProcessed;
  }

  public void setNumProcessed(Integer numProcessed) {
    this.numProcessed = numProcessed;
  }

  public BulkRequestModel getRequest() {
    return request;
  }

  public void setRequest(BulkRequestModel request) {
    this.request = request;
    this.numTargets = request.getPaths().size();
  }
}
