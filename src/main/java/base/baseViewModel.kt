package base

import androidx.lifecycle.ViewModel
import injection.DaggerViewModelInjector
import injection.ViewModelInjector
import injection.module.NetworkModule
import ui.post.PostListViewModel

abstract class BaseViewModel: ViewModel(){
    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
        }
    }
}
