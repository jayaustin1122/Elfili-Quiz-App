import androidx.lifecycle.ViewModel

class DetailViewModel(
    val imageResId: Int,
    val author: String,
    val title: String,
    val content: String
) : ViewModel()
