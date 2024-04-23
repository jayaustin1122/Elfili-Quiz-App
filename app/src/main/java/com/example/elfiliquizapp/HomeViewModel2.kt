import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.elfiliquizapp.R
import com.example.elfiliquizapp.model.Datas

class HomeViewModel2 : ViewModel() {

    private val _dataList = MutableLiveData<List<Datas>>()
    val dataList: LiveData<List<Datas>> = _dataList

    init {
        // Initialize your dataList here
        val initialList = listOf(

            Datas(R.drawable.chapter_1, R.string.kabanata_1, R.string.kabanata_1_content,),
            Datas(R.drawable.chapter_2, R.string.kabanata_2, R.string.kabanata_2_content),
            Datas(R.drawable.chapter_3, R.string.kabanata_3, R.string.kabanata_3_content),
            Datas(R.drawable.chapter_4, R.string.kabanata_4, R.string.kabanata_4_content),
            Datas(R.drawable.chapter_5, R.string.kabanata_5, R.string.kabanata_5_content),
            Datas(R.drawable.chapter_6, R.string.kabanata_6, R.string.kabanata_6_content),
            Datas(R.drawable.chapter_7, R.string.kabanata_7, R.string.kabanata_7_content),
            Datas(R.drawable.chapter_8, R.string.kabanata_8, R.string.kabanata_8_content),
            Datas(R.drawable.chapter_9, R.string.KABANATA_9, R.string.KABANATA_9_content),
            Datas(R.drawable.chapter_10, R.string.KABANATA_10, R.string.KABANATA_10_content),
            Datas(R.drawable.chapter_11, R.string.kabanata_11, R.string.kabanata_11_content),
            Datas(R.drawable.chapter_12, R.string.kabanata_12, R.string.kabanata_12_content),
            Datas(R.drawable.chapter_13, R.string.kabanata_13, R.string.kabanata_13_content),
            Datas(R.drawable.chapter_14, R.string.kabanata_14, R.string.kabanata_14_content),
            Datas(R.drawable.chapter_15, R.string.kabanata_15, R.string.kabanata_15_content),
            Datas(R.drawable.chapter_16, R.string.kabanata_16, R.string.kabanata_16_content),
            Datas(R.drawable.chapter_17, R.string.kabanata_17, R.string.kabanata_17_content),
            Datas(R.drawable.chapter_18, R.string.kabanata_18, R.string.kabanata_18_content),
            Datas(R.drawable.chapter_19, R.string.kabanata_19, R.string.kabanata_19_content),
            Datas(R.drawable.chapter_20, R.string.kabanata_20, R.string.kabanata_20_content),
            Datas(R.drawable.chapter_21, R.string.kabanata_21, R.string.kabanata_21_content),
            Datas(R.drawable.chapter_22, R.string.kabanata_22, R.string.kabanata_22_content),
            Datas(R.drawable.chapter_23,R.string.kabanata_23, R.string.kabanata_23_content),
        //    Datas(R.drawable.c, R.string.kabanata_2, R.string.),
            Datas(R.drawable.chapter_25,R.string.kabanata_25, R.string.kabanata_25_content),
            Datas(R.drawable.chapter_26,R.string.kabanata_26, R.string.kabanata_26_content),
            Datas(R.drawable.chapter_27, R.string.kabanata_27, R.string.kabanata_27_content),
            Datas(R.drawable.chapter_28, R.string.kabanata_28, R.string.kabanata_28_content),
            Datas(R.drawable.chapter_29, R.string.kabanata_29, R.string.kabanata_29_content),
            Datas(R.drawable.chapter_30, R.string.kabanata_30, R.string.kabanata_30_content),
          //  Datas(R.drawable.chapter_31, R.string.kabanata_31, R.string.kabanata_31_content),
            Datas(R.drawable.chapter_32, R.string.kabanata_32, R.string.kabanata_32_content),
            Datas(R.drawable.chapter_33, R.string.kabanata_33, R.string.kabanata_33_content),
            Datas(R.drawable.chapter_34, R.string.kabanata_34, R.string.kabanata_34_content),
            Datas(R.drawable.chapter_35, R.string.kabanata_35, R.string.kabanata_35_content),
            Datas(R.drawable.chapter_36, R.string.kabanata_36, R.string.kabanata_36_content),
            Datas(R.drawable.chapter_37, R.string.kabanata_37, R.string.kabanata_37_content),
            Datas(R.drawable.chapter_38, R.string.kabanata_38, R.string.kabanata_38_content),
            Datas(R.drawable.chapter_39, R.string.kabanata_39, R.string.kabanata_39_content),


            // Add more items as needed
        )
        _dataList.value = initialList
    }
    fun Datas.getAudioResId(): Int {
        return audioResId
    }
}
