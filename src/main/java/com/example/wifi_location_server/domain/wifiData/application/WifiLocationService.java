package com.example.wifi_location_server.domain.wifiData.application;

import com.example.wifi_location_server.domain.wifiData.dto.WifiDataDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.example.wifi_location_server.domain.global.Constants.FAIL_RESPONSE;
import static com.example.wifi_location_server.domain.wifiData.dto.WifiDataDTO.*;

@Slf4j
@Service
@RequiredArgsConstructor
public class WifiLocationService {

    @Transactional(readOnly = true)
    public WifiDataResponseDTO getLocationService(WifiDataRequestDTO wifiDataRequestDTO) {
        // TODO 데이터 확인 후 로직 추가 예정
        log.info("getLocationService 호출");
        return null;
    }

    @Transactional
    public String insertWifiDataService(InsertDataDTO insertDataDTO) {
        // TODO 데이터 확인 후 로직 추가 예정
        log.info("insertWifiDataService 호출");
        return FAIL_RESPONSE;
    }
}
