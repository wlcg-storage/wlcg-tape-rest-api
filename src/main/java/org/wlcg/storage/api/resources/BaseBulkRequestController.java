package org.wlcg.storage.api.resources;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.wlcg.storage.api.error.NotImplementedError;

import org.wlcg.storage.api.model.error.ErrorModel;
import org.wlcg.storage.api.model.error.InvalidRequestErrorModel;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@ApiResponses(value = {
    @ApiResponse(responseCode = "401", description = "User is not authenticated", content = @Content(schema = @Schema(implementation = ErrorModel.class))),
    @ApiResponse(responseCode = "403", description = "User is not authorized to list requests", content = @Content(schema = @Schema(implementation = ErrorModel.class))),
    @ApiResponse(responseCode = "400", description = "Bad request from the user", content = @Content(schema = @Schema(implementation = InvalidRequestErrorModel.class)))
})
public abstract class BaseBulkRequestController {

	@DeleteMapping(value = "/{id}")
	@Operation(summary = "Deletes a request")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteRequest(@PathVariable String id) {
		throw new NotImplementedError();
	}

}
