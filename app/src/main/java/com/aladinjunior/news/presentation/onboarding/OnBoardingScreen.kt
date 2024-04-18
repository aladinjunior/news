package com.aladinjunior.news.presentation.onboarding

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import com.aladinjunior.news.presentation.onboarding.components.OnBoardingPage

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnBoardingScreen() {
    val pagerState = rememberPagerState {
        pages.size
    }
    
    val buttonState = remember {
        derivedStateOf { 
            when(pagerState.currentPage){
                0 -> listOf("", "Next")
                1 -> listOf("Back", "Next")
                2 -> listOf("Back", "Get Started")
                else -> listOf("", "")
                
            }
        }
    }
    
    HorizontalPager(state = pagerState) {index ->
        OnBoardingPage(page = pages[index])
    }
    
}