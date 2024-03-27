package cl.emilym.component.activity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment

abstract class UnifiedFragment: Fragment(), UnifiedView

abstract class UnifiedComposeFragment: UnifiedFragment(), UnifiedComposeView {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return ComposeView(requireContext()).apply {
            setContent {
                GlobalComposeProvider.hook(this@UnifiedComposeFragment) {
                    Root()
                }
            }
        }
    }
}