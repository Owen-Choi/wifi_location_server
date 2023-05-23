package com.example.wifi_location_server.domain.wifiData.model;

import javax.persistence.*;

@Entity
public class WifiSignal {

    @Id
    @GeneratedValue
    private Long id;

    private Double Rssi;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "wifi_id")
    private WifiData wifiData;

}
