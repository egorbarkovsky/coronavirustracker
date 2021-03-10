package com.wldrmnd.coronavirustracker.service

import cloud.folium.mpr.test.random.randomStr
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.reset
import com.nhaarman.mockito_kotlin.whenever
import io.kotest.matchers.shouldBe
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.springframework.web.client.RestTemplate

internal class CoronavirusDataProviderSpec : Spek({

    describe("Coronavirus Tracker Data Provider Check") {

        val mockRest = mock<RestTemplate>()
        val sut = CoronavirusDataProvider(mockRest)

        beforeEachTest {
            reset(mockRest)
        }


        on("usage") {

            val DATA_PROVIDER_URL = CoronavirusDataProvider.DATA_PROVIDER_URL

            val randomStringObject = randomStr()

            whenever(mockRest.getForObject(DATA_PROVIDER_URL, String::class.java))
                .thenReturn(randomStringObject)

            val result = sut.getCoronavirusData()

            it("returns random String object") {
                result shouldBe randomStringObject
            }
        }
    }
})
