package com.wldrmnd.coronavirustracker.service

import com.wldrmnd.coronavirustracker.model.CountryStatisticsDTO

interface TrackingService {

    fun getCountriesStats(): List<CountryStatisticsDTO>
}
