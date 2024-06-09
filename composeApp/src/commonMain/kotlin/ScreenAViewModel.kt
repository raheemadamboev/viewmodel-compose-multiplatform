import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlin.time.Duration.Companion.seconds

class ScreenAViewModel(
    name: String
) : ViewModel() {

    private val _text = MutableStateFlow(name)
    val text: StateFlow<String> = _text.asStateFlow()

    private val _timer = MutableStateFlow(0)
    val timer: StateFlow<Int> = _timer.asStateFlow()

    init {
        startTimer()
    }

    private fun startTimer() {
        viewModelScope.launch {
            while (isActive) {
                delay(1.seconds)
                _timer.update { it + 1 }
            }
        }
    }
}