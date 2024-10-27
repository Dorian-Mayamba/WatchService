package uk.movie.WatchService.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import uk.movie.WatchService.entities.Watch;
import uk.movie.WatchService.services.WatchService;

import java.util.List;

@RestController
@RequestMapping("/watch")
@RequiredArgsConstructor
public class WatchController {
    private final WatchService watchService;

    @Operation(summary = "Get watch method")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Get the list of watches",
                    content = { @Content(mediaType = "application/json",
                            array = @ArraySchema(
                                    schema = @Schema(implementation = Watch.class)
                            ))
                    }
            ),
            @ApiResponse(responseCode = "500", description = "An error has occurred",
                    content = @Content),
    })
    @GetMapping("/movie/{movieId}")
    @ResponseStatus(HttpStatus.OK)
    public List<Watch> findWatchListByMovieId(@PathVariable Long movieId){
        return watchService.findByMovieId(movieId);
    }


    @Operation(summary = "Get watch method")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Get the list of watches",
                    content = { @Content(mediaType = "application/json",
                            array = @ArraySchema(
                                    schema = @Schema(implementation = Watch.class)
                            ))
                    }
            ),
            @ApiResponse(responseCode = "500", description = "An error has occurred",
                    content = @Content),
    })
    @GetMapping("/user/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public List<Watch> findWatchListByUserId(@PathVariable Long userId){
        return watchService.findByUserId(userId);
    }

    @Operation(summary = "Create review method")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "500", description = "An error has occurred",
                    content = @Content),
    })
    @PostMapping("{movieId}/{userId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void AddOrRemoveWatch(@PathVariable Long movieId,
                                 @PathVariable Long userId){
        watchService.addOrRemoveWatch(movieId, userId);
    }

}
