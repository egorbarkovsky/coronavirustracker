package com.wldrmnd.coronavirustracker.service

import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class CoronavirusDataProvider(val restTemplate: RestTemplate) {

    fun getCoronavirusData(): String? = restTemplate.getForObject(DATA_PROVIDER_URL, String::class.java)

    companion object {
        val DATA_PROVIDER_URL: String = "https://api.covid19api.com/summary"
    }

}

