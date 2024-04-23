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

            Datas(R.drawable.chapter_1, R.string.kabanata_1, R.string.kabanata_1_content,R.raw.kabanataone),
            Datas(R.drawable.chapter_2, R.string.kabanata_2, R.string.kabanata_2_content,R.raw.kabanata_2),
            Datas(R.drawable.chapter_3, R.string.kabanata_3, R.string.kabanata_3_content,R.raw.kabanata_3),
            Datas(R.drawable.chapter_4, R.string.kabanata_4, R.string.kabanata_4_content,R.raw.kabanata_4),
            Datas(R.drawable.chapter_5, R.string.kabanata_5, R.string.kabanata_5_content,R.raw.kabanata_5),
            Datas(R.drawable.chapter_6, R.string.kabanata_6, R.string.kabanata_6_content,R.raw.kabanata_6),
            Datas(R.drawable.chapter_7, R.string.kabanata_7, R.string.kabanata_7_content,R.raw.kabanata_7),
            Datas(R.drawable.chapter_8, R.string.kabanata_8, R.string.kabanata_8_content,R.raw.kabanata_8),
            Datas(R.drawable.chapter_9, R.string.KABANATA_9, R.string.KABANATA_9_content,R.raw.kabanata_9),
            Datas(R.drawable.chapter_10, R.string.KABANATA_10, R.string.KABANATA_10_content,R.raw.kabanata_10),
            Datas(R.drawable.chapter_11, R.string.kabanata_11, R.string.kabanata_11_content,R.raw.kabanata_11),
            Datas(R.drawable.chapter_12, R.string.kabanata_12, R.string.kabanata_12_content,R.raw.kabanata_12),
            Datas(R.drawable.chapter_13, R.string.kabanata_13, R.string.kabanata_13_content,R.raw.kabanata_13),
            Datas(R.drawable.chapter_14, R.string.kabanata_14, R.string.kabanata_14_content,R.raw.kabanata_14),
            Datas(R.drawable.chapter_15, R.string.kabanata_15, R.string.kabanata_15_content,R.raw.kabanata_15),
            Datas(R.drawable.chapter_16, R.string.kabanata_16, R.string.kabanata_16_content,R.raw.kabanata_16),
            Datas(R.drawable.chapter_17, R.string.kabanata_17, R.string.kabanata_17_content,R.raw.kabanata_17),
            Datas(R.drawable.chapter_18, R.string.kabanata_18, R.string.kabanata_18_content,R.raw.kabanata_18),
            Datas(R.drawable.chapter_19, R.string.kabanata_19, R.string.kabanata_19_content,R.raw.kabanata_19),
            Datas(R.drawable.chapter_20, R.string.kabanata_20, R.string.kabanata_20_content,R.raw.kabanata_20),
            Datas(R.drawable.chapter_21, R.string.kabanata_21, R.string.kabanata_21_content,R.raw.kabanata_21),
            Datas(R.drawable.chapter_22, R.string.kabanata_22, R.string.kabanata_22_content,R.raw.kabanata_22),
            Datas(R.drawable.chapter_23,R.string.kabanata_23, R.string.kabanata_23_content,R.raw.kabanata_23),
        //    Datas(R.drawable.c, R.string.kabanata_2, R.string.,R.raw.kabanata_24),
            Datas(R.drawable.chapter_25,R.string.kabanata_25, R.string.kabanata_25_content,R.raw.kabanata_25),
            Datas(R.drawable.chapter_26,R.string.kabanata_26, R.string.kabanata_26_content,R.raw.kabanata_26),
            Datas(R.drawable.chapter_27, R.string.kabanata_27, R.string.kabanata_27_content,R.raw.kabanata_27),
            Datas(R.drawable.chapter_28, R.string.kabanata_28, R.string.kabanata_28_content,R.raw.kabanata_28),
            Datas(R.drawable.chapter_29, R.string.kabanata_29, R.string.kabanata_29_content,R.raw.kabanata_29),
            Datas(R.drawable.chapter_30, R.string.kabanata_30, R.string.kabanata_30_content,R.raw.kabanata_30),
          //  Datas(R.drawable.chapter_31, R.string.kabanata_31, R.string.kabanata_31_content,R.raw.kabanata_31),
            Datas(R.drawable.chapter_32, R.string.kabanata_32, R.string.kabanata_32_content,R.raw.kabanata_32),
            Datas(R.drawable.chapter_33, R.string.kabanata_33, R.string.kabanata_33_content,R.raw.kabanata_33),
            Datas(R.drawable.chapter_34, R.string.kabanata_34, R.string.kabanata_34_content,R.raw.kabanata_34),
            Datas(R.drawable.chapter_35, R.string.kabanata_35, R.string.kabanata_35_content,R.raw.kabanata_35),
            Datas(R.drawable.chapter_36, R.string.kabanata_36, R.string.kabanata_36_content,R.raw.kabanata_36),
            Datas(R.drawable.chapter_37, R.string.kabanata_37, R.string.kabanata_37_content,R.raw.kabanata_37),
            Datas(R.drawable.chapter_38, R.string.kabanata_38, R.string.kabanata_38_content,R.raw.kabanata_38),
            Datas(R.drawable.chapter_39, R.string.kabanata_39, R.string.kabanata_39_content,R.raw.kabanata_39),


            // Add more items as needed
        )
        _dataList.value = initialList
    }
    fun Datas.getAudioResId(): Int {
        return audioResId
    }
}
