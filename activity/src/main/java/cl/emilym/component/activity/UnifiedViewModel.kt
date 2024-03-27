package cl.emilym.component.activity

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

abstract class UnifiedViewModel: ViewModel() {

    abstract val savedStateHandle: SavedStateHandle

}