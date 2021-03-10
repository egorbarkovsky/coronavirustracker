package com.wldrmnd.coronavirustracker.service

import com.wldrmnd.coronavirustracker.model.CoronavirusDTO
import com.wldrmnd.coronavirustracker.model.CountryStatisticsDTO
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.module.kotlin.readValue
import org.springframework.stereotype.Service
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper as jsonMapper

@Service
class DefaultTrackingService(val coronavirusDataProvider: CoronavirusDataProvider) : TrackingService {

    override fun getCountriesStats(): List<CountryStatisticsDTO> {

        val coronavirusData = coronavirusDataProvider.getCoronavirusData()
        val jsonMapper = jsonMapper()
        jsonMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
        val coronavirusDTO: CoronavirusDTO = jsonMapper.readValue(coronavirusData!!)

        return coronavirusDTO.countriesStats
    }

}
