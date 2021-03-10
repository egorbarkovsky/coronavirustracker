package com.wldrmnd.coronavirustracker.model

import com.fasterxml.jackson.annotation.JsonProperty

data class CoronavirusDTO(

        @JsonProperty("Global") val globalStats: GlobalStatisticsDTO,
        @JsonProperty("Countries") val countriesStats: List<CountryStatisticsDTO>,
        @JsonProperty("Date") val date: String
)
