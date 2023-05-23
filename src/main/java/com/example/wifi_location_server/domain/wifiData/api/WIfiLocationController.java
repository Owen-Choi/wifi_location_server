package com.example.wifi_location_server.domain.wifiData.api;

import com.example.wifi_location_server.domain.global.Constants;
import com.example.wifi_location_server.domain.wifiData.application.WifiLocationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.example.wifi_location_server.domain.wifiData.dto.WifiDataDTO.*;

@Slf4j
@RestController
@RequestMapping("/wifi")
@RequiredArgsConstructor
public class WIfiLocationController {

    private final WifiLocationService wifiLocationService;

    @PostMapping("/location")
    public ResponseEntity<WifiDataResponseDTO> getLocation(@RequestBody WifiDataRequestDTO wifiDataRequestDTO) {
        return new ResponseEntity<>(wifiLocationService.getLocationService(wifiDataRequestDTO), HttpStatus.OK);
    }

    @PostMapping("/insert/data")
    public ResponseEntity<String> insertData(@RequestBody InsertDataDTO dataDTO) {
        return new ResponseEntity<>(wifiLocationService.insertWifiDataService(dataDTO), HttpStatus.CREATED);
    }
}
