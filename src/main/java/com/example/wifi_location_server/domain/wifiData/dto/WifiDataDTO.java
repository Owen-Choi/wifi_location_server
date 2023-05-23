package com.example.wifi_location_server.domain.wifiData.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class WifiDataDTO {

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class WifiDataRequestDTO{
        // 네비게이션 사용자가 현재 위치에서 얻은 wifi 신호를 넘겨주는데,
        // 그 데이터를 받아줄 DTO
        // TODO 데이터 확인 후 로직 추가 예정
        // 필드가 아예 없으면 애노테이션이 충돌나서 실행이 안됨. 임시로 값을 채워넣겠음
        private Double RSSI;

    }

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class WifiDataResponseDTO{
        // TODO 데이터 확인 후 로직 추가 예정
        private String locationName;
    }

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class InsertDataDTO{
        // TODO 데이터 확인 후 로직 추가 예정
        private Double RSSI;
    }
}
