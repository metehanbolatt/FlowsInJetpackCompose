package com.metehanbolat.flowsinjetpackcompose

import app.cash.turbine.test
import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test

class MainViewModelTest {

    private lateinit var viewModel: MainViewModel

    @Before
    fun setUp() {
        viewModel = MainViewModel()
    }

    @Test
    fun `countDownFlow, properly counts down from 5 to 0`() = runBlocking {
        viewModel.countDownFlow.test {
            for (i in 5 downTo 0) {
                val emission = awaitItem()
                assertThat(emission).isEqualTo(i)
            }
        }
    }
}