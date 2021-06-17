package org.wlcg.storage.api.model;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Bulk request created after POST submission")
public class CreatedBulkRequestModel {
	
	@Schema(description = "Identifier of the bulk request")
	protected String id;
	
	@Schema(description = "Submitted request object")
	protected BulkRequestModel request;
	
	@Schema(description = "The access URL that can be used by the user to access the bulk request")
	protected String accessURL;
	
	@Schema(description = "The number of paths submitted by the user in this bulk request")
	protected long numTargets;
	
	public CreatedBulkRequestModel(String id,BulkRequestModel request) {
		this.setId(id);
		this.setRequest(request);
		this.setNumTargets(request.getPaths().size());
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BulkRequestModel getRequest() {
		return request;
	}

	public void setRequest(BulkRequestModel request) {
		this.request = request;
	}

	public long getNumTargets() {
		return numTargets;
	}

	public void setNumTargets(long numTargets) {
		this.numTargets = numTargets;
	}
	
	public String getAccessURL() {
		return accessURL;
	}

	public void setAccessURL(String accessURL) {
		this.accessURL = accessURL;
	}
}
