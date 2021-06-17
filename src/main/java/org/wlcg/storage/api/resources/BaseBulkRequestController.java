package org.wlcg.storage.api.resources;

import java.net.URL;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.wlcg.storage.api.error.NotImplementedError;
import org.wlcg.storage.api.model.BulkRequestModel;
import org.wlcg.storage.api.model.BulkRequestStatusModel;
import org.wlcg.storage.api.model.ErrorModel;
import org.wlcg.storage.api.model.ListResponseModel;
import org.wlcg.storage.api.model.CreatedBulkRequestModel;
import org.wlcg.storage.api.model.RequestStatusType;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

public abstract class BaseBulkRequestController {

	@GetMapping
	@Operation(summary = "Returns requests currently active in the system, potentially filtering by request status")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ListResponseModel.class))),
			@ApiResponse(responseCode = "401", description = "User is not authenticated", content = @Content(schema = @Schema(implementation = ErrorModel.class))),
			@ApiResponse(responseCode = "403", description = "User is not authorized to list requests", content = @Content(schema = @Schema(implementation = ErrorModel.class))) })
	public ListResponseModel<URL> findRequests(@RequestParam(required = false) RequestStatusType[] status) {

		throw new NotImplementedError();
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	@Operation(summary = "Creates a request")
	public CreatedBulkRequestModel createRequest(@RequestBody BulkRequestModel request, HttpServletRequest httpRequest ,HttpServletResponse response) {
		CreatedBulkRequestModel responsePostBulkReq = new CreatedBulkRequestModel("93b1e2f1-9ec7-4720-8477-2b119cd6e652",request);
		responsePostBulkReq.setAccessURL(httpRequest.getServletPath() + "/" + responsePostBulkReq.getId());
		return responsePostBulkReq;
	}

	@GetMapping(value = "/{id}")
	@Operation(summary = "Returns the status of a request")
	public BulkRequestStatusModel getRequestStatus(@PathVariable String id) {
		throw new NotImplementedError();
	}

	@PostMapping(value = "/{id}/cancel")
	@Operation(summary = "Cancels a equest")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void cancelRequest(@PathVariable String id) {
		throw new NotImplementedError();
	}

	@DeleteMapping(value = "/{id}")
	@Operation(summary = "Deletes a request")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteRequest(@PathVariable String id) {

		throw new NotImplementedError();

	}

}
