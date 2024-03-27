package cl.emilym.component.activity

import androidx.lifecycle.ViewModel

interface ViewModelHolder<T: ViewModel> {

    val viewModel: T

}