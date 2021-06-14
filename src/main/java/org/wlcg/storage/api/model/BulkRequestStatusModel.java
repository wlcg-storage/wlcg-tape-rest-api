package org.wlcg.storage.api.model;

import java.util.List;

public class BulkRequestStatusModel {

  String kind;
  String uuid;

  RequestStatusType status;

  Integer numTargets;
  Integer numProcessed;

  BulkRequestModel request;

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
