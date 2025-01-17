package com.codelabs.basicstatecodelab

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Checkbox
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun WellnessTaskItem(
    taskName: String,
    checked: Boolean,
    onChecked: (Boolean) -> Unit,
    onClose: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier, verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = taskName, modifier = modifier
                .weight(1f)
                .padding(start = 16.dp)
        )
        Checkbox(checked = checked, onCheckedChange = onChecked)
        IconButton(onClick = onClose) {
            Icon(Icons.Default.Close, contentDescription = "close")
        }
    }
}

