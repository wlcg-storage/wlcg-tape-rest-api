package org.wlcg.storage.api.model;

import java.util.List;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;

public class BulkRequestStatusModel {

  @Schema(description = "The kind of bulk request (e.g., stage)", required = true)
  String kind;

  @Schema(description = "The bulk request uuid", required = true)
  String uuid;

  @Schema(description = "The bulk request status", required = true)
  RequestStatusType status;

  @Schema(description = "The target count", required = true)
  Integer numTargets;

  @Schema(description = "The number of processed targets", required = true)
  Integer numProcessed;

  @Schema(description = "The request json", required = true)
  BulkRequestModel request;

  @ArraySchema(minItems = 0,
      schema = @Schema(description = "The list of targers whose processing resulted in a failure"))
  List<FileStatusModel> failures;

  public BulkRequestStatusModel() {
    // TODO Auto-generated constructor stub
  }

  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
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
  }

  public List<FileStatusModel> getFailures() {
    return failures;
  }

  public void setFailures(List<FileStatusModel> failures) {
    this.failures = failures;
  }

  public RequestStatusType getStatus() {
    return status;
  }

  public void setStatus(RequestStatusType status) {
    this.status = status;
  }
}
