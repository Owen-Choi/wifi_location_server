package com.example.wifi_location_server.domain.wifiData.dao;

import com.example.wifi_location_server.domain.wifiData.model.WifiData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WifiLocationRepository extends JpaRepository<WifiData, Long> {
    Optional<WifiData> findById(Long id);
}
