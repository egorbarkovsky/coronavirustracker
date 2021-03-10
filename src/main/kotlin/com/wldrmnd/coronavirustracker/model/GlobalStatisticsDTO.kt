package com.wldrmnd.coronavirustracker.model

import com.fasterxml.jackson.annotation.JsonProperty

data class GlobalStatisticsDTO(

    @JsonProperty("NewConfirmed") val newConfirmed: Int,
    @JsonProperty("TotalConfirmed") val totalConfirmed: Int,
    @JsonProperty("NewDeaths") val newDeaths: Int,
    @JsonProperty("TotalDeaths") val totalDeaths: Int,
    @JsonProperty("NewRecovered") val newRecovered: Int,
    @JsonProperty("TotalRecovered") val totalRecovered: Int,
    @JsonProperty("Date") val date: String
)
