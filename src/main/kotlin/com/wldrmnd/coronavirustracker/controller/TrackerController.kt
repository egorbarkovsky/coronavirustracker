package com.wldrmnd.coronavirustracker.controller

import com.wldrmnd.coronavirustracker.model.CountryStatisticsDTO
import com.wldrmnd.coronavirustracker.service.TrackingService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TrackerController(val trackingService: TrackingService) {

    @GetMapping("/statistics")
    fun getCountriesStats(): List<CountryStatisticsDTO> = trackingService.getCountriesStats()
}
