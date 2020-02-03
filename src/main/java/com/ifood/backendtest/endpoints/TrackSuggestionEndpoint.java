package com.ifood.backendtest.endpoints;

import com.ifood.backendtest.dto.CityDto;
import com.ifood.backendtest.service.OpenWeatherMapService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;

@CrossOrigin
@RestController
@RequestMapping("/1/track-suggestion")
public class TrackSuggestionEndpoint {

    private final OpenWeatherMapService openWeatherMapService;

    @Autowired
    public TrackSuggestionEndpoint(OpenWeatherMapService openWeatherMapService) {
        this.openWeatherMapService = openWeatherMapService;
    }

    @ApiOperation(value = "Return a track according to the temperature of the informed city.")
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Return tracks based on the temperature of the informed city."),
        @ApiResponse(code = 500, message = "Some error occurs during the process."),
    })
    @PostMapping(value = "get", produces="application/json")
    public ResponseEntity<Object> trackSuggestion(@RequestBody CityDto location) {
        return ResponseEntity.status(HttpStatus.OK).body(
            openWeatherMapService.requestWeatherByCity(location.getCityName())
        );
    }
}
