package com.example.wifi_location_server.domain.wifiData.model;

import com.example.wifi_location_server.domain.wifiData.dto.WifiDataDTO;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static com.example.wifi_location_server.domain.wifiData.dto.WifiDataDTO.*;

@Entity
public class WifiData {

    @Id
    @Column(name = "wifi_id")
    @GeneratedValue
    private Long id;

    private String location;

    @OneToMany(mappedBy = "wifiData", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<WifiSignal> wifiSignals = new ArrayList<>();

}
