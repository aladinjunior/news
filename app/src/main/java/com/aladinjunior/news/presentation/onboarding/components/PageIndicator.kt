package com.aladinjunior.news.presentation.onboarding.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import com.aladinjunior.news.presentation.Dimens.PageIndicatorSize
import com.aladinjunior.news.ui.theme.BlueGray

@Composable
fun PageIndicator(
    modifier: Modifier = Modifier,
    pageSize: Int,
    selectedPage: Int,
    selectedPageColor: Color = MaterialTheme.colorScheme.primary,
    unselectedPageColor: Color = BlueGray
) {
    
    Row(modifier = modifier, horizontalArrangement = Arrangement.SpaceBetween) {
        repeat(pageSize) { page ->
            Box(modifier = Modifier
                .size(PageIndicatorSize)
                .clip(CircleShape)
                .background(color = if (page == selectedPage) selectedPageColor else unselectedPageColor))
        }
    }
    
}
