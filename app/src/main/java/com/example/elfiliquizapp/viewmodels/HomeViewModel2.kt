package com.example.elfiliquizapp.viewmodels

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.elfiliquizapp.R
import com.example.elfiliquizapp.model.Datas
import com.example.elfiliquizapp.table.QuizQuestion


class HomeViewModel2 : ViewModel(){

    val _dataList = MutableLiveData<List<Datas>>()
    val dataList: LiveData<List<Datas>> = _dataList
    private val originalDataList: MutableList<Datas> = mutableListOf()

    init {
        // Initialize your dataList here
        val initialList = listOf(

            Datas(0,R.drawable.chapter_1, R.string.kabanata_1, R.string.kabanata_1_content,
                  R.raw.kabanataone, quizQuestions = listOf(
                QuizQuestion(
                    question = "Sino ang may-akda ng El Filibusterismo?",
                    options = listOf("Andres Bonifacio", "Marcelo H. Del Pilar", "Jose Rizal", "Emilio Aguinaldo"),
                    correctAnswer = 2 //
                ),
                QuizQuestion(
                    question = "Ano ang naging pangalan ni  Crisostomo Ibarra matapos ang kanyang pagbabalik sa Pilipinas?",
                    options = listOf("Simoun", "Elias", "Basilio", "Padre Florentino"),
                    correctAnswer = 0 //
                ),
                QuizQuestion(
                    question = "Ano ang trabaho ni Crisostomo Ibarra sa Kabanata 1 ng El Filibusterismo?",
                    options = listOf("Magsasaka", "Magsasalita", "Mangangalakal", "Mang-aawit"),
                    correctAnswer = 2
                ),
                QuizQuestion(
                    question = "Anong uri ng sasakyan ang ginamit ng mga prayle upang makarating sa ibang bayan?",
                    options = listOf("Karwahe", "Kalesa", "Barko", "Tren"),
                    correctAnswer = 2 //
                ),
                QuizQuestion(
                    question = "Sino ang donyang nandidiri sa mga pato?",
                    options = listOf("Donya Victorina", "Donya Consolacion", "Donya Maria", "Donya Penchang"),
                    correctAnswer = 0 //
                )
            ),
            false),

        Datas(1,R.drawable.chapter_2, R.string.kabanata_2, R.string.kabanata_2_content,
                R.raw.kabanata_2, quizQuestions = listOf(
                QuizQuestion(
                    question = "Ang pagkagalit ni Isagani kay Simoun dahil sa pagsasabing di bumili ng alahas ang kaniyang mga kababayan dahil sa kahirapan nito.",
                    options = listOf("1", "2", "3", "4", "5"),
                    correctAnswer = 2 //
                ),
                QuizQuestion(
                    question = "Ang pag-uusap ng tatlong lalaki sa ilalim ng kubyerta",
                    options = listOf("1", "2", "3", "4", "5"),
                    correctAnswer = 0 //
                ),
                QuizQuestion(
                    question = "Ang pagtatanong ni Kapitan Basilio ukol sa plano ng mga mag-aaral sa Akademya ng Wikang Kastila.",
                    options = listOf("1", "2", "3", "4", "5"),
                    correctAnswer = 1 //
                ),
                QuizQuestion(
                    question = "Ang pag-alis ni Simoun at napagtanto ni Isagani na ang umalis ay tagapayo ng Kapitan Heneral.",
                    options = listOf("1", "2", "3", "4", "5"),
                    correctAnswer = 4 //
                ),
                QuizQuestion(
                    question = "Ang pagbigkas ni Basilio ng tula na ginawa ni Isagani.",
                    options = listOf("1", "2", "3", "4", "5"),
                    correctAnswer = 3 //
                )
            ),
            false),

            Datas(2,R.drawable.chapter_3, R.string.kabanata_3, R.string.kabanata_3_content,
                R.raw.kabanata_3, quizQuestions = listOf(
                    QuizQuestion(
                        question = "Ang mga Alamat ni Doña Geronima ay isinalaysay ni _____",
                        options = listOf("Padre Salvi", "Padre Florentino", "Padre Sibyla"),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "Inihanda ng ____ ang kweba upang tirhan ng babae.",
                        options = listOf("Paring Dominiko", "Paring Franciscano", "Arsobispo"),
                        correctAnswer = 2 //
                    ),
                    QuizQuestion(
                        question = "Ang tinirhan ng mga Espiritu bago dumating ang mga kastila",
                        options = listOf("Malapad na bato", "Bahay Kubo", "Simbahan"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Ang nagtanong kung saan nalibing ang taong nagngangalang Guevarra, Navarra o Ibarra.",
                        options = listOf("Padre Sibyla", "Don Custodio", "Ben Zayb"),
                        correctAnswer = 2 //
                    ),
                    QuizQuestion(
                        question = "Inaakalang nahilo si ___ dahil sa lawak ng Ilog Pasig.",
                        options = listOf("Ben Zayb", "Don Custodio", "Simoun"),
                        correctAnswer = 2 //
                    )
                    ),
                false),
            Datas(3,R.drawable.chapter_4, R.string.kabanata_4, R.string.kabanata_4_content,
                R.raw.kabanata_4, quizQuestions = listOf(
                    QuizQuestion(
                        question = "Nagkaroon ng sinasakang lupa ni Kabesang Tales dahil pinamanahan siya ni Tata Selo.",
                        options = listOf("TAMA", "MALI"),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "Ang lupain ni Kabesang Tales ay inangkin ng isang korporasyon ng mga pari.",
                        options = listOf("TAMA", "MALI"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Nang umabot sa dalawang daang piso ang buwis, si Kabesang Tales ay di na tumutol.",
                        options = listOf("TAMA", "MALI"),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "Ang buong angkan ni Kabesang Tales ay nagkasakit ng malarya, namatay ang kanyang asawa at pati na ang isa sa kanyang mga anak.",
                        options = listOf("TAMA", "MALI"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Sa El Filibusterismo makikilala ang matandang mangangahoy na ang pangalan ay Selo.",
                        options = listOf("TAMA", "MALI"),
                        correctAnswer = 0 //
                    )
                ),
                false),
            Datas(4,R.drawable.chapter_5, R.string.kabanata_5, R.string.kabanata_5_content,
                R.raw.kabanata_5, quizQuestions = listOf(
                    QuizQuestion(
                        question = "Piliin ang letra ng wastong sagot sa bawat bilang.\n\nHinarang ng Guardia Civil ang kutsero dahil nakalimutan nito ang kanyang _______.",
                        options = listOf("Sedula", "Lisensya", "Ilaw ng kalesa" ),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Ang santong nabuhay nang matagal dahil walang Guardia Civil ay si ________'?",
                        options = listOf("Melchor", "Baltazar", "Matusalem"),
                        correctAnswer = 2 //
                    ),
                    QuizQuestion(
                        question = "Ang tinutukoy na hari ng mga Indio ay si _________",
                        options = listOf("Bernardo Carpio", "Gaspar", "Rolando"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "4. Ang tanging malungkot sa prusisyon dahil napapagitnaan ng mga Guardia Civil",
                        options = listOf("San Jose", "Mahal na Birhen", "Matusalem"),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "Ang tanging bahay na nakita niyang masaya ay bahay ni ",
                        options = listOf("Kapitan Basilio", "Kapitan Tiago", "Simoun"),
                        correctAnswer = 0 //
                    )

                ),
                false),
            Datas(5,R.drawable.chapter_6, R.string.kabanata_6, R.string.kabanata_6_content,
            R.raw.kabanata_6, quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mga Katanungan: Piliin ang letra ng tamang sagot upang mabuo ang diwa ng pangungusap.\n\nLaging bumabalik sa isipan ni Basilio ang mga pangyayari sa kanyang _______ ",
                        options = listOf("ama", "ina", "kapatid" ),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "Ang mga pangyayari ay naganap ____ taon na ang nakalilipas.",
                        options = listOf("13", "10", "15"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Namasukan bilang ______   si Basilio upang makapag-aral. ",
                        options = listOf("mistiko", "guro", "katulong"),
                        correctAnswer = 2 //
                    ),
                    QuizQuestion(
                        question = "Si Kapitan Tiago ay namimighati dahil si Maria Clara ay pumasok sa __________",
                        options = listOf("kumbento", "beateryo", "paaralan"),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "Si Basilio ay unang nag-aral sa ______",
                        options = listOf("Unibersidad ng Santo Tomas", "San Juan De Letran Manila", "Ateneo"),
                        correctAnswer = 1 //                 )
                    )
                    ),
                false),
            Datas(6,R.drawable.chapter_7, R.string.kabanata_7, R.string.kabanata_7_content,
        R.raw.kabanata_7, quizQuestions = listOf(
                    QuizQuestion(
                        question = "Suriin ang ugnayan ng mga kaisipan at punan ng tamang sagot ang bawat patlang. \n\nBasilio - medisina; Simoun – _______",
                        options = listOf("A. mag-aalahas", "B. Simoun", "C. Pilipino", "D. Basilio"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Kapitan Heneral - Simoun; Sisa- ________",
                        options = listOf("A. mag-aalahas", "B. Simoun", "C. Pilipino", "D. Basilio"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "manlulupig - Kastila; napaaalipin ___________",
                                options = listOf("A. mag-aalahas", "B. Simoun", "C. Pilipino", "D. Basilio"),
                    correctAnswer = 2 //
                ),
                QuizQuestion(
                    question = "Basilio - pagdalaw sa ina; - _________ paghukay sa kayamanan",
                    options = listOf("A. mag-aalahas", "B. Simoun", "C. Pilipino", "D. Basilio"),
                    correctAnswer = 1 //
                ),
                QuizQuestion(
                    question = "__________- paghihimagsik; kapayapaan – Basilio",
                    options = listOf("A. mag-aalahas", "B. Simoun", "C. Pilipino", "D. Basilio"),
                    correctAnswer = 1 //
                )

            ),
                false),
            Datas(7,R.drawable.chapter_8, R.string.kabanata_8, R.string.kabanata_8_content,
            R.raw.kabanata_8, quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mga Katanungan. Piliin ang pinakamalapit na salitang katumbas ng mga salungguhit.\n\nNagpunta sa batalan",
                        options = listOf("kusina", "lababo", "salas" ),
                        correctAnswer = 2 //
                    ),
                    QuizQuestion(
                        question = "Dali-daling kinuha ni Huli ang kanyang tampipi",
                        options = listOf("basket", "maleta", "kahon"),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "Salabat para sa almusal",
                        options = listOf("tsokolate", "inumin", "tinapay"),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "Alatiit ng kawayan",
                        options = listOf("galaw", "tunog", "anyo"),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "5. Pawang bulyaw ang kanilang natatanggap.",
                        options = listOf("tawag", "sigaw", "anyaya"),
                        correctAnswer = 1 //
                    )

                ),
                false),
            Datas(8,R.drawable.chapter_9, R.string.KABANATA_9, R.string.KABANATA_9_content,
        R.raw.kabanata_9, quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mga Katanungan. Suriin ang mga sumusunod na pahayag. Isulat sa patlang ang O kung ito ay opinyon at K kung ito ay katotohanan.\n\nAng mga pari ay lubusang nanalo sa usaping ipinaglalaban ni Kabesang Tales.",
                        options = listOf("O", "K"),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "Nagpasalamat si Hermana Penchang sapagkat madaling natuto si Huli sa kanyang mga tinuturong dasal.",
                        options = listOf("O", "K"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Nang malaman ng lahat ang nangyari kay Kabesang Tales lahat ay nahabag sa kanyang naging kasawian.",
                        options = listOf("O", "K"),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "Sa mga karanasan ni Kabesang Tales naging manhid na siya sa mga pangyayari.",
                        options = listOf("O", "K"),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "Ang lahat ng di-marunong magdasal ay makasalanan",
                        options = listOf("O", "K"),
                        correctAnswer = 0 //
                    )

                ),
                false),
            Datas(9,R.drawable.chapter_10, R.string.KABANATA_10, R.string.KABANATA_10_content,
        R.raw.kabanata_10, quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mga Katnungan. Piliin ang tamang sagot sa bawat bilang.\n" +
                                "// A. limampu\n" +
                                "// B. Birhen ng Antipolo\n" +
                                "// C. Padre Clemente\n" +
                                "// D. Apatnapu\n" +
                                "// E. sagpang\n" +
                                "// F. laket\n\nAng nayong nakapagitan sa Tiani at San Diego.",
                        options = listOf("limampu", "Birhen ng Antipolo", "Padre Clemente", "Apatnapu", "sagpang", "laket"),
                        correctAnswer = 4 //
                    ),
                    QuizQuestion(
                        question = "Ang bilang ng araw ng indulhensya kapag binasa ang pulyetong Tandang Basyong Macunat.",
                        options = listOf("limampu", "Birhen ng Antipolo", "Padre Clemente", "Apatnapu", "sagpang", "laket"),
                        correctAnswer = 3 //
                    ),
                    QuizQuestion(
                        question = "Ang ipinalit sa ninakaw ni Kabesang Tales.",
                        options = listOf("limampu", "Birhen ng Antipolo", "Padre Clemente", "Apatnapu", "sagpang", "laket"),
                        correctAnswer = 5 //
                    ),
                    QuizQuestion(
                        question = "Ang prayleng tagapamahala ng korporasyon ng mga prayle.",
                        options = listOf("limampu", "Birhen ng Antipolo", "Padre Clemente", "Apatnapu", "sagpang", "laket"),
                        correctAnswer = 2 //
                    ),
                    QuizQuestion(
                        question = "Ang pinaglalaanan ng singsing na binili ni Hermana Penchang.",
                        options = listOf("limampu", "Birhen ng Antipolo", "Padre Clemente", "Apatnapu", "sagpang", "laket"),
                        correctAnswer = 1 //
                    )

                ),
                false),
            Datas(10,R.drawable.chapter_11, R.string.kabanata_11, R.string.kabanata_11_content,
        R.raw.kabanata_11, quizQuestions = listOf(
                    QuizQuestion(
                        question = "Isulat ang TAMA kung ang mga sumusunod na pahayag ay wasto at MALI naman kung ito ay mali.\n\nAng Kapitan Heneral ay nagpunta sa Calamba kasama ang ilang kawani at prayle para mangaso.",
                        options = listOf("TAMA", "MALI"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Walang nahuli kahit anong hayop dahil sa dala nilang banda ng musiko.",
                        options = listOf("TAMA", "MALI"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Naging masigla ang Kapitan Heneral dahil sa kanyang pagkakapanalo sa sugal.",
                        options = listOf("TAMA", "MALI"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Inis na inis si Padre Sibyla sa tuwing mamali ang tira ng baraha ng mga kalaban ng Kapitan Heneral.",
                        options = listOf("TAMA", "MALI"),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "Ang Kapitan Heneral ay lihim na nag-aalala dahil wala pa silang makitang hayop kahit isa.",
                        options = listOf("TAMA", "MALI"),
                        correctAnswer = 0 //
                    )

                ),
                false),
            Datas(11,R.drawable.chapter_12, R.string.kabanata_12, R.string.kabanata_12_content,
        R.raw.kabanata_12, quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mga Katanungan. Hanapin ang titik ng tamang sagot sa bawat bilang.\n" +
                                " A. Juanito Pelaez\n" +
                                " B. Paaralang Munisipal\n" +
                                " C. Padre Irene\n" +
                                " D. Padre Camorra\n" +
                                " E. Paulita\n" +
                                " F. Placido Penitente\n\nAng matalinong mag-aaral na nagnanais na tumigil sa kanyang pag- aaral.",
                        options = listOf("A. Juanito Pelaez", "B. Paaralang Munisipal", "C. Padre Irene", "D. Padre Camorra", "E. Paulita", "F. Placido Penitente"),
                        correctAnswer = 5 //
                    ),
                    QuizQuestion(
                        question = "Ang mag-aaral na paborito ng mga prayle.",
                        options = listOf("A. Juanito Pelaez", "B. Paaralang Munisipal", "C. Padre Irene", "D. Padre Camorra", "E. Paulita", "F. Placido Penitente"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Ang prayleng nakakasama ng mga mag-aaral sa panghaharana.",
                        options = listOf("A. Juanito Pelaez", "B. Paaralang Munisipal", "C. Padre Irene", "D. Padre Camorra", "E. Paulita", "F. Placido Penitente"),
                        correctAnswer = 3 //
                    ),
                    QuizQuestion(
                        question = "Pinapasukang paaralan ng mga kababaihan.",
                        options = listOf("A. Juanito Pelaez", "B. Paaralang Munisipal", "C. Padre Irene", "D. Padre Camorra", "E. Paulita", "F. Placido Penitente"),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "Ang sakay ng karwaheng higit na pinagkakaguluhan ng mga kalalakihan.",
                        options = listOf("A. Juanito Pelaez", "B. Paaralang Munisipal", "C. Padre Irene", "D. Padre Camorra", "E. Paulita", "F. Placido Penitente"),
                        correctAnswer = 4 //
                    )

                ),
                false),
            Datas(12,R.drawable.chapter_13, R.string.kabanata_13, R.string.kabanata_13_content,
        R.raw.kabanata_13, quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mga Katanungan. Isulat ang Tama kung wasto ang ipinapapahayag at Mali kung di tama ipinahahayag ng bawat pangungusap.\n\nAng silid-aralan sa pisika ay naglalaman ng kagamitang pang-agham na maaaring gamitin sa lahat ng pagkakataon ng mga mag-aaral.",
                        options = listOf("TAMA", "MALI"),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "Ang bilang na dalawang daan at limampung mag-aaral, ang di pagkakaunawaan at ang katamaran ang mga dahilan kung bakit wala pang sayantist ang lahing Pilipino.",
                        options = listOf("TAMA", "MALI"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Si Padre Millon, ang guro sa kemistri ay kilala sa pagtuturo dahil sa kanyang kahusayan.",
                        options = listOf("TAMA", "MALI"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Marami ang nakapupuna sa kanya na kinagigiliwan niya ang kanyang itinuturo.",
                        options = listOf("TAMA", "MALI"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Ang araling tinatalakay sa loob ng silid-aralan ay ukol sa salamin.",
                        options = listOf("TAMA", "MALI"),
                        correctAnswer = 1 //
                    )

                ),
                false),
            Datas(13,R.drawable.chapter_14, R.string.kabanata_14, R.string.kabanata_14_content,
        R.raw.kabanata_14, quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mga Katanungan. Isulat ang T kung tama ang ipinapahayag ng pangungusap at M kung mali.\n\nAng Intsik ay umalis kaagad na hindi man lamang pinapansin ang huling hampas ng baston sa kanya.",
                        options = listOf("TAMA", "MALI"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Sabay-sabay na nagsidating ang mga inanyayahan ni Macaraig.",
                        options = listOf("TAMA", "MALI"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Pinapunta sila ni Macaraig para ibalita ang mga nangyari sa Los Baños.",
                        options = listOf("TAMA", "MALI"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Si Ginoong Pasta ay isang Kastila at naging kamag-aral ni Padre Florentino.",
                        options = listOf("TAMA", "MALI"),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "Napagkasunduan nilang si Juanito Pelaez ang makikipag- usap kay Ginoong Pasta.",
                        options = listOf("TAMA", "MALI"),
                        correctAnswer = 1 //
                    )

                ),
                false),
            Datas(14,R.drawable.chapter_15, R.string.kabanata_15, R.string.kabanata_15_content,
        R.raw.kabanata_15, quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mga Katanungan. Hanapin ang titik ng tamang sagot sa bawat bilang.\n\nDahil sa tagal ng paghihintay nagkaroon ng pagkakataon na ___________ si G. Pasta.",
                        options = listOf("tanungin", "pagmasdan", "paghandaan" ),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Nagmaang-maangan si G. Pasta nang marinig niya ang tungkol sa __________.",
                        options = listOf("salaysay ni Isagani", "panukala ng mga mag-aaral", "mga pangyayari sa paaralan"),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "Ang kasabihang, Ang hindi umiiyak ay hindi nakasususo, ang hindi humihiling ay hindi pinagkakalooban buhat sa mga ___________",
                                options = listOf("Kastila", "Indio", "Pari"),
                    correctAnswer = 0 //
                ),
                QuizQuestion(
                    question = "Alam ni G. Pasta na hindi lamang si Padre Irene ang nasa panig ng mga estudyante kundi maging si _________",
                    options = listOf("Padre Fernandez", "Padre Camorra", "Padre Salvi"),
                    correctAnswer = 0 //
                ),
                QuizQuestion(
                    question = "Pinakiharapan nang mabuti ni G. Pasta si Isagani dahil ito ay kaibigan ni ____________",
                    options = listOf("Padre Florentino", "Don Custodio", "Simoun"),
                    correctAnswer = 0 //
                )

            ),
                false),
            Datas(15,R.drawable.chapter_16, R.string.kabanata_16, R.string.kabanata_16_content,
        R.raw.kabanata_16, quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mga Katanungan. Hanapin ang titik ng tamang sagot sa bawat bilang.\n\nAnong dahilan kung bakit nagpasya si Simoun na dalawin si Basilio?",
                        options = listOf("Para kumuha ng payo sa kanya", "Upang tulungan siya sa kanyang misyon", "Dahil sa utang na loob niya kay Basilio"),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "Anong naging epekto ng pagdalaw ni Simoun kay Basilio sa kanyang pag-iisip? ",
                        options = listOf("Nagdulot ito ng takot at pangamba", "Nagbigay ito ng inspirasyon at lakas ng loob", "Nagdulot ito ng galit at poot"),
                        correctAnswer = 2 //
                    ),
                    QuizQuestion(
                        question = "Ano ang layunin ni Simoun sa kanyang pakikipag-usap kay Basilio? ",
                        options = listOf("Pakiusap na sumali sa kanyang pag-aalsa", "Pagbabanta sa kanyang buhay", "Pagbubukas ng puso ni Basilio sa kanyang mga plano"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Bakit hindi pumayag si Basilio sa alok ni Simoun? ",
                        options = listOf("Dahil sa kanyang takot sa pagkamatay", "Dahil sa kanyang tapat na pagmamahal sa bayan", "Dahil sa kanyang pagiging masugid na alagad ng simbahan"),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "Anong pangyayari sa Kabanata 16 ang nagpapakita ng pagpapasya at pagkakaroon ng paninindigan ni Basilio? ",
                        options = listOf("Pagtanggi sa alok ni Simoun", "Pagtawag sa tulong ng mga kaibigan", "Pag-iiwas sa mga taong may masamang intensyon"),
                        correctAnswer = 0 //
                    )

                ),
                false),
            Datas(16,R.drawable.chapter_17, R.string.kabanata_17, R.string.kabanata_17_content,
        R.raw.kabanata_17, quizQuestions = listOf(
                    QuizQuestion(
                        question = " Mga Katanungan. Hanapin ang titik ng tamang sagot sa bawat bilang.\n" +
                                "// A. Antipolo\n" +
                                "// B. Juanito\n" +
                                "// C. Padre Camorra\n" +
                                "// D. Enero\n" +
                                "// E. Payat na Prayle\n" +
                                "// F. Pilipinas\n" +
                                "// G. Disyembre\n\nAng buwan nang idaos ang perya sa Quiapo.",
                        options = listOf("A. Antipolo", "B. Juanito", "C. Padre Camorra", "D. Enero", "E. Payat na Prayle", "F. Pilipinas", "G. Disyembre"),
                        correctAnswer = 6 //
                    ),
                    QuizQuestion(
                        question = "Ang naging kaagaw ni Isagani para sa kanyang pagtingin kay Paulita.",
                        options = listOf("A. Antipolo", "B. Juanito", "C. Padre Camorra", "D. Enero", "E. Payat na Prayle", "F. Pilipinas", "G. Disyembre"),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "Ang kahalintulad ni Padre Camorra sa kanyang kaanyuan.",
                        options = listOf("A. Antipolo", "B. Juanito", "C. Padre Camorra", "D. Enero", "E. Payat na Prayle", "F. Pilipinas", "G. Disyembre"),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "Ang lugar kung saan inilalarawan ang mga prayle na malinis at kagalang- galang",
                        options = listOf("A. Antipolo", "B. Juanito", "C. Padre Camorra", "D. Enero", "E. Payat na Prayle", "F. Pilipinas", "G. Disyembre"),
                        correctAnswer = 5 //
                    ),
                    QuizQuestion(
                        question = "Ang nais pagbayarin sa tiket na palabas ni Mr. Leeds.",
                        options = listOf("A. Antipolo", "B. Juanito", "C. Padre Camorra", "D. Enero", "E. Payat na Prayle", "F. Pilipinas", "G. Disyembre"),
                        correctAnswer = 2 //
                    )

                ),
                false),
            Datas(17,R.drawable.chapter_18, R.string.kabanata_18, R.string.kabanata_18_content,
        R.raw.kabanata_18, quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mga Katanungan. Hanapin ang titik ng tamang sagot sa bawat bilang.\n" +
                                " A. Isa man ay walang huminga\n" +
                                " B. Ihahayag ang inyong kataksilan\n" +
                                " C. Buhat sa piramide ni Khufu\n" +
                                " D. May matang nakapako sa kaniya\n" +
                                " E. Salaming gagamitin sa pandaraya\n\n\nAng hinahanap ni Ben Zayb.",
                        options = listOf("A. Isa man ay walang huminga", "B. Ihahayag ang inyong kataksilan", "C. Buhat sa piramide ni Khufu", "D. May matang nakapako sa kaniya", "E. Salaming gagamitin sa pandaraya"),
                        correctAnswer = 4 //
                    ),
                    QuizQuestion(
                        question = "Inilabas ang isang kahon.",
                        options = listOf("A. Isa man ay walang huminga", "B. Ihahayag ang inyong kataksilan", "C. Buhat sa piramide ni Khufu", "D. May matang nakapako sa kaniya", "E. Salaming gagamitin sa pandaraya"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Ang panlilinlang ay naging tagumpay.",
                        options = listOf("A. Isa man ay walang huminga", "B. Ihahayag ang inyong kataksilan", "C. Buhat sa piramide ni Khufu", "D. May matang nakapako sa kaniya", "E. Salaming gagamitin sa pandaraya"),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "Parang nakakita ng multo si Padre Salvi.",
                        options = listOf("A. Isa man ay walang huminga", "B. Ihahayag ang inyong kataksilan", "C. Buhat sa piramide ni Khufu", "D. May matang nakapako sa kaniya", "E. Salaming gagamitin sa pandaraya"),
                        correctAnswer = 3 //
                    ),
                    QuizQuestion(
                        question = "Ang espinghe ay nagbalik.",
                        options = listOf("A. Isa man ay walang huminga", "B. Ihahayag ang inyong kataksilan", "C. Buhat sa piramide ni Khufu", "D. May matang nakapako sa kaniya", "E. Salaming gagamitin sa pandaraya"),
                        correctAnswer = 2 //
                    )

                ),
                false),
            Datas(18,R.drawable.chapter_19, R.string.kabanata_19, R.string.kabanata_19_content,
        R.raw.kabanata_19, quizQuestions = listOf(
                    QuizQuestion(
                        question = "Piliin ang letra ng tamang sagot sa bawat pangungusap.\n\nSa tulay ng España nakita ni Placido ang isang sasakyan na sakay sina  ____________",
                        options = listOf("Padre Sibyla at Don Custodio", "Padre Fernandez at Simoun", "Padre Irene at Simoun"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Ang kaibigang tinutukoy ni Kabesang Andang na may anak sa seminaryo ay si _______",
                        options = listOf("Kapitana Simona", "Hermana Penchang", "Kapitana Tika"),
                        correctAnswer =  2 //
                    ),
                    QuizQuestion(
                        question = "3. Hihingi ng tulong si Kabesang Andang kay _________",
                        options = listOf("Kapitan Heneral", "Vice Rector ng Unibersidad", "Procurador ng mga Agustino"),
                        correctAnswer = 2 //
                    ),
                    QuizQuestion(
                        question = "4. Ang tinutukoy na eksperto sa tekniko ng pulbura ay si ",
                        options = listOf("Tenyente ng Guardia Civil ", "   ", "Maestro sa Tiani Kastilang sakitin"),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "Pinahinto ni Simoun ang isang sasakyang walang laman at nagpahatid sa",
                        options = listOf("Tiyani", "Lamayan", "Escolta Trozo"),
                        correctAnswer = 2 //
                    )

                ),
                false),
            Datas(19,R.drawable.chapter_20, R.string.kabanata_20, R.string.kabanata_20_content,
        R.raw.kabanata_20, quizQuestions = listOf(
        QuizQuestion(
            question =  "KABANATA 20 : Mga Katanungan. Piliin ang letra ng tamang sagot sa bawat pangungusap.\n A. Obras Pias \nB. Don Custodio \nC. Liberal \nD. Buena Tinta \nE. Padre Sibyla \nF. Sakit sa atay\n\nAng tinutukoy na pinakamasipag sa buong daigdig",
            options = listOf("A. Obras Pias", "B. Don Custodio", "C. Liberal", "D. Buena Tinta", "E. Padre Sibyla", "F. Sakit sa atay"),
            correctAnswer = 1 //
        ),
                    QuizQuestion(
                        question = "Ang tawag sa kumikilos lamang kapag nalathala sa pahayagan ang kanyang mga proyekto.",
                        options = listOf("A. Obras Pias", "B. Don Custodio", "C. Liberal", "D. Buena Tinta", "E. Padre Sibyla", "F. Sakit sa atay"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Ang naging suliranin ni Don Custodio sa kanyang kalusugan.",
                        options = listOf("A. Obras Pias", "B. Don Custodio", "C. Liberal", "D. Buena Tinta", "E. Padre Sibyla", "F. Sakit sa atay"),
                        correctAnswer = 5 //
                    ),
                    QuizQuestion(
                        question = "Ang pumili kay Don Custodio upang bigyan ng solusyon ang Akademya ng Wikang Kastila.",
                        options = listOf("A. Obras Pias", "B. Don Custodio", "C. Liberal", "D. Buena Tinta", "E. Padre Sibyla", "F. Sakit sa atay"),
                        correctAnswer = 4 //
                    ),
                    QuizQuestion(
                        question = "Ang sinalihang samahan ni Don Custodio matapos na magalit sa samahang Conservados.",
                        options = listOf("A. Obras Pias", "B. Don Custodio", "C. Liberal", "D. Buena Tinta", "E. Padre Sibyla", "F. Sakit sa atay"),
                        correctAnswer = 2 //
                    )

                ),
                false),
            Datas(20,R.drawable.chapter_21, R.string.kabanata_21, R.string.kabanata_21_content,
        R.raw.kabanata_21, quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mga Katanungan. Isulat ang T kung tama o wasto at M kung mali ang isinasaad ng mga salungguhit na salita o lupon ng mga salita sa bawat bilang.\n\nSi Camaroncocido ay isang Kastilang hindi nagpapahalaga sa pagiging Kastila.",
                        options = listOf("TAMA", "MALI"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Si Tiyo Kiko ay isang kayumangging lalaki na matanda at katulad ni Camaroncocido, iisa ang kanilang hanapbuhay, ang pagiging kutsero.",
                        options = listOf("TAMA", "MALI"),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "Dalawa ang anyo ng lipunan sa Maynila. Una, iyo'y ibig manood upang malaman kung bakit bawal. Ikalawa ay iyo'y ibig makita ang katipan sa dulaan.",
                        options = listOf("TAMA", "MALI"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Ang magtatanghal sa Teatro ay ang mga di bantog na mga Pranses.",
                        options = listOf("TAMA", "MALI"),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "Ang palabas ang humati sa Maynila.",
                        options = listOf("TAMA", "MALI"),
                        correctAnswer = 0 //
                    )

                ),
                false),
            Datas(21,R.drawable.chapter_22, R.string.kabanata_22, R.string.kabanata_22_content,
        R.raw.kabanata_22, quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mga Katanungan. Piliin ang letra ng tamang sagot sa bawat pangungusap\n\n1. Ano ang pamagat ng Kabanata 22 ng El Filibusterismo?",
                        options = listOf("Ang Pananampalataya", "Ang Paglalakbay", "Ang Palabas" ),
                        correctAnswer = 2 //
                    ),
                    QuizQuestion(
                        question = "2. Sino ang pinakamataas na opisyal ng pamahalaan ng Espanya sa Pilipinas na nabanggit sa kabanatang ito?",
                        options = listOf("Padre Damaso", "Kapitan Tiago", "Kapitan Heneral"),
                        correctAnswer = 2 //
                    ),
                    QuizQuestion(
                        question = "3. Ano ang ginagawa ng mga tao sa binasang kabanata?",
                        options = listOf("Nagdiriwang ng pista", "Naghihintay sa Kapitan Heneral", "Nag-aalsa laban sa pamahalaan"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "4. Ano ang tagpuan sa binasang kabanata?",
                        options = listOf("Sa isang Teatro", "Sa isang simbahan", "Sa bahay ni Kapitan Tiago"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "5. Ano ang inaasahan ng mga tao na mangyayari sa kabanatang ito?",
                        options = listOf("Ang pagdating ng Kapitan Heneral", "Ang pagtatanghal ng isang dula", "Ang pagsasalita ng Kapitan Heneral"),
                        correctAnswer = 1 //
                    )

                ),
                false),
            Datas(22,R.drawable.chapter_23,R.string.kabanata_23, R.string.kabanata_23_content,
        R.raw.kabanata_23, quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mga Katanungan. Piliin ang letra ng tamang sagot sa bawat pangungusap.\n" +
                                " A. Sta. Clara\n" +
                                " B. Basilio\n" +
                                " C. Larawan ni Maria Clara\n" +
                                " D. Huli\n" +
                                " E. Kapitan Tiago\n" +
                                " F. Pamahalaan\nAng tinubos ni Basilio sa pagkaalila.",
                        options = listOf("A. Sta. Clara", "B. Basilio", "C. Larawan ni Maria Clara", "D. Huli", "E. Kapitan Tiago", "F. Pamahalaan"),
                        correctAnswer = 3 //
                    ),
                    QuizQuestion(
                        question = "Pinag-aralan niyang mabuti ang pagpapagaling kay Kapitan Tiago.",
                        options = listOf("A. Sta. Clara", "B. Basilio", "C. Larawan ni Maria Clara", "D. Huli", "E. Kapitan Tiago", "F. Pamahalaan"),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "Mahirap pakibagayan dahil sa kanyang karamdaman.",
                        options = listOf("A. Sta. Clara", "B. Basilio", "C. Larawan ni Maria Clara", "D. Huli", "E. Kapitan Tiago", "F. Pamahalaan"),
                        correctAnswer = 4 //
                    ),
                    QuizQuestion(
                        question = "Ang paniniwala ni Simoun na may kapakinabangang matatamo pagsalakay.",
                        options = listOf("A. Sta. Clara", "B. Basilio", "C. Larawan ni Maria Clara", "D. Huli", "E. Kapitan Tiago", "F. Pamahalaan"),
                        correctAnswer = 5 //
                    ),
                    QuizQuestion(
                        question = "Ang hinahagkan at hinihingan ng tawad ni Kapitan Tiago.",
                        options = listOf("A. Sta. Clara", "B. Basilio", "C. Larawan ni Maria Clara", "D. Huli", "E. Kapitan Tiago", "F. Pamahalaan"),
                        correctAnswer = 2 //
                    )

                ),
                false),
        //    Datas(23,R.drawable.c, R.string.kabanata_24, R.string.,R.raw.kabanata_24),
        //R.raw.kabanata_24, quizQuestions = listOf(
//       QuizQuestion(
//            question = ("Mga Katanungan. Piliin ang letra ng tamang sagot sa bawat pangungusap.
//// A. Kapitan Heneral
//// B. Paulita
//// C. Doña Victorina
//// D. Matandang babae
//// E. Isagani\n\nKung ang mga liberal sa España ay katulad ng mga narito, mabibilang sa daliri ang magiging tapat sa kanya.”',
//            options = listOf("A. Kapitan Heneral", "B. Paulita", "C. Doña Victorina", "D. Matandang babae", "E. Isagani"),
//            correctAnswer = 0 //
//        ),
//        QuizQuestion(
//            question = '"Kung wala kayong mapala?"',
//            options = listOf("A. Kapitan Heneral", "B. Paulita", "C. Doña Victorina", "D. Matandang babae", "E. Isagani"),
//
//            correctAnswer = 1 //
//        ),
//        QuizQuestion(
//            question = '"Kung mananatili sa pag-aaral at patuloy na magiging marangal, tiyak ang tagumpay ng bayan."',
//            options = listOf("A. Kapitan Heneral", "B. Paulita", "C. Doña Victorina", "D. Matandang babae", "E. Isagani"),
//
//            correctAnswer = 4 //
//        ),
//        QuizQuestion(
//            question = '"Pangarap, may pangarap! Marami kayong kaaway, ang bayang ito ay mananatiling busabos."',
//            options = listOf("A. Kapitan Heneral", "B. Paulita", "C. Doña Victorina", "D. Matandang babae", "E. Isagani"),
//
//            correctAnswer = 2 //
//        ),
//        QuizQuestion(
//            question = '"... namatay ang pag-ibig ko sa pagtatanggol sa karapatan ng aking bayan."',
//            options = listOf("A. Kapitan Heneral", "B. Paulita", "C. Doña Victorina", "D. Matandang babae", "E. Isagani"),
//
//            correctAnswer = 3 //
//        )
//        ),
//                        false),
            Datas(24,R.drawable.chapter_25,R.string.kabanata_25, R.string.kabanata_25_content,
        R.raw.kabanata_25, quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mga Katanungan. Piliin ang letra ng tamang sagot sa bawat pangungusap.\n" +
                                "// A. Don Custodio\n" +
                                "// B. Pinagtitipunan ng mga mag-aaral\n" +
                                "// C. Pamahalaan at sa bayan\n" +
                                "// D. Padre Irene\n" +
                                "// E. Sa mga prayle\n\npansit gisado.",
                        options = listOf("A. Don Custodio", "B. Pinagtitipunan ng mga mag-aaral", "C. Pamahalaan at sa bayan", "D. Padre Irene", "E. Sa mga prayle"),
                        correctAnswer = 2 //
                    ),
                    QuizQuestion(
                        question = "lumpiang Shanghai.",
                        options = listOf("A. Don Custodio", "B. Pinagtitipunan ng mga mag-aaral", "C. Pamahalaan at sa bayan", "D. Padre Irene", "E. Sa mga prayle"),
                        correctAnswer = 3 //
                    ),
                    QuizQuestion(
                        question = "panukalang sopas.",
                        options = listOf("A. Don Custodio", "B. Pinagtitipunan ng mga mag-aaral", "C. Pamahalaan at sa bayan", "D. Padre Irene", "E. Sa mga prayle"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "tortang alimango pamahalaan at sa bayan",
                        options = listOf("A. Don Custodio", "B. Pinagtitipunan ng mga mag-aaral", "C. Pamahalaan at sa bayan", "D. Padre Irene", "E. Sa mga prayle"),
                        correctAnswer = 4 //
                    ),
                    QuizQuestion(
                        question = "Panciteria Macanista de Buen Gusto.",
                        options = listOf("A. Don Custodio", "B. Pinagtitipunan ng mga mag-aaral", "C. Pamahalaan at sa bayan", "D. Padre Irene", "E. Sa mga prayle"),
                        correctAnswer = 1 //
                    )

                ),
                false),
            Datas(25,R.drawable.chapter_26,R.string.kabanata_26, R.string.kabanata_26_content,
        R.raw.kabanata_26, quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mga Katanungan. May limang (5) mahahalagang pangyayari sa kabanata na nakalagay ibaba. Pagsunud-sunurin ang mga pangyayari mula 1 hanggang 5. \n\nPupuntahan ni Basilio si Macaraig upang humiram ng salapi.",
                        options = listOf("1", "2", "3", "4", "5"),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "Tagni-tagning balita ang nakuha niya.",
                        options = listOf("1", "2", "3", "4", "5"),
                        correctAnswer = 3 //
                    ),
                    QuizQuestion(
                        question = "Dinakip si Macaraig pati si Basilio ng Guardia Civil.",
                        options = listOf("1", "2", "3", "4", "5"),
                        correctAnswer = 4 //
                    ),
                    QuizQuestion(
                        question = "Nais ayusin ni Basilio ang kanyang lisensiyatura sa unibersidad.",
                        options = listOf("1", "2", "3", "4", "5"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Habang siya'y naglalakad napansin niya ang pagkakasara ng mga paaralan.",
                        options = listOf("1", "2", "3", "4", "5"),
                        correctAnswer = 2 //
                    )

                ),
                false),
            Datas(26,R.drawable.chapter_27, R.string.kabanata_27, R.string.kabanata_27_content,
        R.raw.kabanata_27, quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mga Katanungan. Piliin ang letra ng tamang sagot sa bawat pangungusap.\n" +
                                "// A. Ang pagsasalita ng opinyon kasalungat ng sa pari \n" +
                                "// B. Ito'y hindi ipinagkakaloob kundi sa karapat- dapat lamang. \n" +
                                "// C. Ang katumbas ng edukasyon \n" +
                                "// D. Ang paring labis na iginagalang ni Isagani. Isang guro sa pangmadlang pagpapahayag \n" +
                                "// E. Hindi pinayagang mangatwiran, hindi sila binibigyan ng kalayaang maipahayag ang sariling kaisipan\n\nFilibustero",
                        options = listOf("A. Ang pagsasalita ng opinyon kasalungat ng sa pari", "B. Ito'y hindi ipinagkakaloob kundi sa karapat- dapat lamang.", "C. Ang katumbas ng edukasyon", "D. Ang paring labis na iginagalang ni Isagani. Isang guro sa pangmadlang pagpapahayag", "E. Hindi pinayagang mangatwiran, hindi sila binibigyan ng kalayaang maipahayag ang sariling kaisipan"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Kalayaan",
                        options = listOf("A. Ang pagsasalita ng opinyon kasalungat ng sa pari", "B. Ito'y hindi ipinagkakaloob kundi sa karapat- dapat lamang.", "C. Ang katumbas ng edukasyon", "D. Ang paring labis na iginagalang ni Isagani. Isang guro sa pangmadlang pagpapahayag", "E. Hindi pinayagang mangatwiran, hindi sila binibigyan ng kalayaang maipahayag ang sariling kaisipan"),
                        correctAnswer = 4 //
                    ),
                    QuizQuestion(
                        question = "Karunungan",
                        options = listOf("A. Ang pagsasalita ng opinyon kasalungat ng sa pari", "B. Ito'y hindi ipinagkakaloob kundi sa karapat- dapat lamang.", "C. Ang katumbas ng edukasyon", "D. Ang paring labis na iginagalang ni Isagani. Isang guro sa pangmadlang pagpapahayag", "E. Hindi pinayagang mangatwiran, hindi sila binibigyan ng kalayaang maipahayag ang sariling kaisipan"),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "Mga estudyante",
                        options = listOf("A. Ang pagsasalita ng opinyon kasalungat ng sa pari", "B. Ito'y hindi ipinagkakaloob kundi sa karapat- dapat lamang.", "C. Ang katumbas ng edukasyon", "D. Ang paring labis na iginagalang ni Isagani. Isang guro sa pangmadlang pagpapahayag", "E. Hindi pinayagang mangatwiran, hindi sila binibigyan ng kalayaang maipahayag ang sariling kaisipan"),
                        correctAnswer = 2 //
                    ),
                    QuizQuestion(
                        question = "Padre Fernandez",
                        options = listOf("A. Ang pagsasalita ng opinyon kasalungat ng sa pari", "B. Ito'y hindi ipinagkakaloob kundi sa karapat- dapat lamang.", "C. Ang katumbas ng edukasyon", "D. Ang paring labis na iginagalang ni Isagani. Isang guro sa pangmadlang pagpapahayag", "E. Hindi pinayagang mangatwiran, hindi sila binibigyan ng kalayaang maipahayag ang sariling kaisipan"),
                        correctAnswer = 3 //
                    )

                ),
                false),
            Datas(27,R.drawable.chapter_28, R.string.kabanata_28, R.string.kabanata_28_content,
        R.raw.kabanata_28, quizQuestions = listOf(
                    QuizQuestion(
                        question = "Isulat ang W kung wasto o tama ang diwa ng pangungusap at M kung mali\n\nAyon kay Ben Zayb nakabuti sa Pilipinas ang pagtuturo sa kabataan.",
                        options = listOf("WASTO", "MALI"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Natatakot si Quiroga sa mga pangyayari pagkat sa kabila ng kanyang mga bagong dating na paninda ay hindi naglilibot o pumapasyal ang mga prayle.",
                        options = listOf("WASTO", "MALI"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Ayaw tumanggap ng sinumang bisita si Don Custodio dahil abala ito sa pag-aaral na kung paano magtatanggol sakaling masalakay siya.",
                        options = listOf("WASTO", "MALI"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Lalong napadali ang pagkamatay ni Kapitan Tiago dahil sa mga katatakutan at kasindak-sindak na balita ni Padre Irene.",
                        options = listOf("WASTO", "MALI"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Ang mga tao ay nagtakbuhan at nagbukas ng bintana dahil sa pagkatakot.",
                        options = listOf("WASTO", "MALI"),
                        correctAnswer = 1 //
                    )

                ),
                false),
            Datas(28,R.drawable.chapter_29, R.string.kabanata_29, R.string.kabanata_29_content,
        R.raw.kabanata_29, quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mga Katanungan. Piliin ang letra ng tamang sagot sa bawat pangungusap.\n" +
                                "// A. 20.00\n" +
                                "// B. 25.00\n" +
                                "// C. Padre Irene\n" +
                                "// D. Kapitan Tinong\n" +
                                "// E. Don Patrocinio\n\nAng hinirang na eksekyutor o tagapamahala at tagapagtupad ng testamento ng kapitan ay si _______",
                        options = listOf("A. 20.00", "B. 25.00", "C. Padre Irene", "D. Kapitan Tinong", "E. Don Patrocinio"),
                        correctAnswer = 2 //
                    ),
                    QuizQuestion(
                        question = "Ang itinira na pangmatrikula ng mga estudyanteng mahihirap ay _________",
                        options = listOf("A. 20.00", "B. 25.00", "C. Padre Irene", "D. Kapitan Tinong", "E. Don Patrocinio"),

                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "Si Basilio nama'y pinamanahan ng halagang ________ pero binawi ito dahil sa kawalang-utang na loob.",
                        options = listOf("A. 20.00", "B. 25.00", "C. Padre Irene", "D. Kapitan Tinong", "E. Don Patrocinio"),

                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Sinabi ni _________ na dapat pagsuotin ng Franciscano ang bangkay.",
                        options = listOf("A. 20.00", "B. 25.00", "C. Padre Irene", "D. Kapitan Tinong", "E. Don Patrocinio"),

                        correctAnswer = 2 //
                    ),
                    QuizQuestion(
                        question = "Si _________ang kalaban ni Kapitan Tiago ay inggit na inggit sa nasabing libing.",
                        options = listOf("A. 20.00", "B. 25.00", "C. Padre Irene", "D. Kapitan Tinong", "E. Don Patrocinio"),

                        correctAnswer = 4 //
                    )

                ),
                false),
            Datas(29,R.drawable.chapter_30, R.string.kabanata_30, R.string.kabanata_30_content,
        R.raw.kabanata_30, quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mga Katanungan. Isulat kung Tama o Mali ang mga salungguhit na salita.\n\nNabalita sa lalawigan ng San Diego ang pagkamatay ni Kapitan Tiago at ang pagdakip kay Isagani.",
                        options = listOf("TAMA", "MALI"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Masama ang loob ni Hermana Bali sa maagang paglaya ni Huli.",
                        options = listOf("TAMA", "MALI"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Si Padre Camorra ang dahilan kung bakit may mga binatang binugbog ng kura kapag nanghaharana kay Huli.",
                        options = listOf("TAMA", "MALI"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Ipinatapon sa Carolinas si Basilio.",
                        options = listOf("TAMA", "MALI"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Ang dalaga na tumalon sa bintana ng kumbento, nahulog sa mga bato at namatay ay si Hermana Bali.",
                        options = listOf("TAMA", "MALI"),
                        correctAnswer = 1 //
                    )

                ),
                false),
          //  Datas(30,R.drawable.chapter_31, R.string.kabanata_31, R.string.kabanata_31_content,
        //R.raw.kabanata_31, quizQuestions = listOf(
//        QuizQuestion(
////            question = "Piliin ang letra ng wastong sagot. \n\n1. Ang nalipat sa bayan ng Tiani dahil sa nangyari kay Huli ",
////            options = listOf("Padre Irene", "Padre Fernandez", "Padre Camorra", "Padre Salvi"),
////            correctAnswer = 2 //
////        ),
////        QuizQuestion(
////            question = "2. Ang estudyante na hindi pa nakalaya ",
////            options = listOf("Sandoval", "Basilio", "Isagani", "Tadeo"),
////            correctAnswer = 1 //
////        ),
////        QuizQuestion(
////            question = "3. Ang nakatalo ng mataas na kawani sa panunungkulan ",
////            options = listOf("Simoun", "Don Custodio", "Ben Zayb", "Kapitan Heneral"),
////            correctAnswer = 3 //
////        ),
////        QuizQuestion(
////            question = "4. Ang nagbitiw sa tungkulin at pagkaraa'y tumulak na pabalik sa España optungen",
////            options = listOf("Mataas na Kawani", "Kapitan Heneral", "Ben Zayb", "Don Custodio"),
////            correctAnswer = 1 //
////        ),
////        QuizQuestion(
////            question = "5. Ang kilabot at pinuno ng mga tulisan ",
////            options = listOf("Simoun", "Basilio", "Isagani", "Matanglawin"),
////            correctAnswer = 3 //
////        )
//        ),
//                        false),
            Datas(31,R.drawable.chapter_32, R.string.kabanata_32, R.string.kabanata_32_content,
        R.raw.kabanata_32, quizQuestions = listOf(
                    QuizQuestion(
                        question = "Piliin ang letra ng wastong sagot.\n" +
                                "// A. Macaraig\n" +
                                "// B. Tadeo\n" +
                                "// C. Juanito\n" +
                                "// D. Sandoval\n" +
                                "// E. Isagani\n\nNatuwa ang mag-aaral na si _______,  sinigaan ang kanyang mga aklat at nauwi rin siya sa mahabang pagbabakasyon.",
                        options = listOf("A. Macaraig", "B. Tadeo", "C. Juanito", "D. Sandoval", "E. Isagani"),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "Si ________ ay isinama na lamang ng ama sa tindahan at tinuruan ng pangangalakal.",
                        options = listOf("A. Macaraig", "B. Tadeo", "C. Juanito", "D. Sandoval", "E. Isagani"),
                        correctAnswer = 2 //
                    ),
                    QuizQuestion(
                        question = "Si ______ ay naging maingat sa pagsangkot sa anumang usapan. Kumuha ito ng pasaporte at dalidaling nagtungo sa Europa.",
                        options = listOf("A. Macaraig", "B. Tadeo", "C. Juanito", "D. Sandoval", "E. Isagani"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Si ________ ay nakapasa sa kanyang asignatura kay Padre Fernandez ngunit bumagsak sa iba.",
                        options = listOf("A. Macaraig", "B. Tadeo", "C. Juanito", "D. Sandoval", "E. Isagani"),
                        correctAnswer = 4 //
                    ),
                    QuizQuestion(
                        question = "Dinaan naman sa talumpati ni _______ ang tribunal.",
                        options = listOf("A. Macaraig", "B. Tadeo", "C. Juanito", "D. Sandoval", "E. Isagani"),
                        correctAnswer = 3 //
                    )

                ),
                false),
            Datas(32,R.drawable.chapter_33, R.string.kabanata_33, R.string.kabanata_33_content,
        R.raw.kabanata_33, quizQuestions = listOf(
            QuizQuestion(
                question = ("Mga katanungan. Tukuyin kung sino sa dalawang pangunahing tauhan ang nagsabi ng mga kaisipan sa ibaba. Isulat ang A kung si Simoun at B kung si Basilio sa patlang.\n\nNalimot kong pinatay ang una at pinahirapan ang pangalawa. Ngayo\'y pinarusahan ako ng Diyos. Wala nang matitira sa akin kundi gantihan ng sama ang sama, ng pagpatay ang pagpatay..."),
                        options = listOf("Simoun", "Basilio"),
            correctAnswer = 0 //
            ),
            QuizQuestion(
                question = ("Nasa panig ko ay karapatan at matuwid dahil ang tinutulungan ko\'y kapakanan ng mga sawimpalad..."),
                        options = listOf("Simoun", "Basilio"),
                correctAnswer = 1 //
            ),
            QuizQuestion(
                question = ("Sa tulong mo magtatagumpay tayo. Ako ang kikilos sa itaas, ikaw sa ibaba...Magsasabog ako ng kamatayan sa gitna ng bango at rangya. Gigisingin mo naman ang kabataan sa gitna ng dugo..."),
                options = listOf("Simoun", "Basilio"),
                correctAnswer = 0 //
            ),
            QuizQuestion(
                question = ("Ngayong gabi, makaririnig ng pagsabog ang Pilipinas at parurusahan ang mga makasalanang dati'y hindi maparusahan.."),
                        options = listOf("Simoun", "Basilio"),
            correctAnswer = 0 //
        ),
        QuizQuestion(
            question = ("Kailangang lipulin ang lahi. At mula sa dugong daranak, sisibol ang isang bagong lipunan, malusog at di maaapi."),
            options = listOf("Simoun", "Basilio"),
            correctAnswer = 0 //
        )

        ),
                false),
            Datas(33,R.drawable.chapter_34, R.string.kabanata_34, R.string.kabanata_34_content,
        R.raw.kabanata_34, quizQuestions = listOf(
                    QuizQuestion(
                        question = " Piliin ang letra ng wastong sagot.\n" +
                                "// A. Nanumbalik ang matinding galit at pagnanais na dumating na ang oras na kanyang hinihintay\n" +
                                "// B. May asawa na siya at isang doktor na pinagmulan ng kaguluhan\n" +
                                "// C. Isasakatuparan ang balak na paghihiganti\n" +
                                "// D. Nagunita niya siya, gutom na naglalakad, noong bata pa hanggang magpaalila nga siya\n" +
                                "// E. isang napakagarang lampara\n\nNagmuni-muni si Basilio habang naglalakad",
                        options = listOf("A. Nanumbalik ang matinding galit at pagnanais na dumating na ang oras na kanyang hinihintay", "B. May asawa na siya at isang doktor na pinagmulan ng kaguluhan", "C. Isasakatuparan ang balak na paghihiganti", "D. Nagunita niya siya, gutom na naglalakad, noong bata pa hanggang magpaalila nga siya", "E. isang napakagarang lampara"),
                        correctAnswer = 3 //
                    ),
                    QuizQuestion(
                        question = "Ang regalo ni Simoun kina Paulita at Juanito.",
                        options = listOf("A. Nanumbalik ang matinding galit at pagnanais na dumating na ang oras na kanyang hinihintay", "B. May asawa na siya at isang doktor na pinagmulan ng kaguluhan", "C. Isasakatuparan ang balak na paghihiganti", "D. Nagunita niya siya, gutom na naglalakad, noong bata pa hanggang magpaalila nga siya", "E. isang napakagarang lampara"),
                        correctAnswer = 4 //
                    ),
                    QuizQuestion(
                        question = "Nagunita ni Basilio ang durug-durog na katawan ni Huli",
                        options = listOf("A. Nanumbalik ang matinding galit at pagnanais na dumating na ang oras na kanyang hinihintay", "B. May asawa na siya at isang doktor na pinagmulan ng kaguluhan", "C. Isasakatuparan ang balak na paghihiganti", "D. Nagunita niya siya, gutom na naglalakad, noong bata pa hanggang magpaalila nga siya", "E. isang napakagarang lampara"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Naiisip ni Basilio na kung hindi siya nabilanggo",
                        options = listOf("A. Nanumbalik ang matinding galit at pagnanais na dumating na ang oras na kanyang hinihintay", "B. May asawa na siya at isang doktor na pinagmulan ng kaguluhan", "C. Isasakatuparan ang balak na paghihiganti", "D. Nagunita niya siya, gutom na naglalakad, noong bata pa hanggang magpaalila nga siya", "E. isang napakagarang lampara"),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "Si Simoun ang nangasiwa sa paggagayak sa bahay kung saan",
                        options = listOf("A. Nanumbalik ang matinding galit at pagnanais na dumating na ang oras na kanyang hinihintay", "B. May asawa na siya at isang doktor na pinagmulan ng kaguluhan", "C. Isasakatuparan ang balak na paghihiganti", "D. Nagunita niya siya, gutom na naglalakad, noong bata pa hanggang magpaalila nga siya", "E. isang napakagarang lampara"),
                        correctAnswer = 2 //
                    )

                ),
                false),
            Datas(34,R.drawable.chapter_35, R.string.kabanata_35, R.string.kabanata_35_content,
        R.raw.kabanata_35, quizQuestions = listOf(
                    QuizQuestion(
                        question = ("Mga Katanungan. Lagyan ng tsek (V) kung ang mga sumusunod na pangyayari ay tama at ekis (X) kung hindi.\n\nDumating ang bagong kasal na kasama ni Simoun."),
                        options = listOf("✔", "✘"),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = ("Nabuo sa isip ni Isagani na ang lahat ng kasayahan ng mga panauhin ay masusuklian ng kahindik-hindik na pangyayari."),
                        options = listOf("✔", "✘"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = ("Si Basilio ay pinapasok ng mga guwardiya sa handaan dahil sa magarang kasuotan bagamat hindi siya inimbitahan."),
                        options = listOf("✔", "✘"),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = ("Nakilala ni Padre Salvi na talagang lagda ni Ibarra ang kapirasong papel na nagpalipat kamay sa mga panauhin."),
                        options = listOf("✔", "✘"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = ("Ang kahulugan ng Mane, thecel, pares ay tapos na ang iyong kapangyarihan, bilang na ang oras mo, tinimbang ka ngunit kulang."),
                        options = listOf("✔", "✘"),
                        correctAnswer = 0 //
                    )

                ),
                false),
//            Datas(35,R.drawable.chapter_36, R.string.kabanata_36, R.string.kabanata_36_content,
//        R.raw.kabanata_36, quizQuestions = listOf(
//                    QuizQuestion(
//                        question = "Mga Ktanungan. Isaayos ang mga letra sa loob ng kahon na nagpapakilala sa mga tauhan sa kabanata na angkop sa paglalarawang nasa ilalim nito. \n\nAng paring nagtago sa ilalim ng mesa ",
//                        options = listOf("E R E P DE N A R I "),
//                        correctAnswer = "PADRE IRENE" //
//                    ),
//                    QuizQuestion(
//                        question = "Hindi siya nagbigay ng pahintulot na ilathala ang nangyari sa kasalan",
//                        options = listOf("A H E LE N R"),
//                        correctAnswer = "HENERAL" //
//                    ),
//                    QuizQuestion(
//                        question = "Ang niloobang pari sa bahay- bakasyunan sa Pasig",
//                        options = listOf("A P E R C D M A O R"),
//                        correctAnswer = "PADRE CAMORA" //
//                    ),
//                    QuizQuestion(
//                        question = "Manunulat na nagbalak sumulat ng balita ukol sa pangyayaring",
//                        options = listOf("Z B Y E A B N"),
//                        correctAnswer = "BEN ZAYB" //
//                    ),
//                    QuizQuestion(
//                        question = "Ang bumuo ng panukala at naghanda ng habla laban sa mag- aalahas",
//                        options = listOf("D I N S O C O T U O D"),
//                        correctAnswer = "DON CUSTODIO" //
//                    )
//
//                ),
//                false),
            Datas(36,R.drawable.chapter_37, R.string.kabanata_37, R.string.kabanata_37_content,
        R.raw.kabanata_37, quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mga Katanungan. Piliin ang letra ng wastong sagot.\n\nIniligaw ni Isagani ang isipan ng Pamilya Orenda upang tiyakin kung",
                        options = listOf("nahuli ang umagaw ng lampara", "nakilala ang magnanakaw", "nabatid na si Simoun ay si Crisostomo Ibarra"),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "Ayon sa hinala, ang naglagay ng pulbura sa lampara ay si/ang ________",
                        options = listOf("Simoun", "Quiroga", "Kaaway ni Juanito"),
                        correctAnswer = 0 //
                    ),
                    QuizQuestion(
                        question = "Si Chicoy, ang payat na platero, ang nagdala ng hikaw para kay __________",
                        options = listOf("Don Timoteo", "Doña Victorina", "Paulita"),
                        correctAnswer = 2 //
                    ),
                    QuizQuestion(
                        question = "Ang nangyari nang nakaraang gabi ay pinag-usapan ng isang pamilya ________ sa Sta. Cruz, mga kaibigan ni Isagani.",
                        options = listOf("Quiroga", "Orenda", "Pelaez"),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "Ang nangasiwa sa pag-aayos ng dating bahay ni Kapitan Tiago ay si Simoun at si",
                        options = listOf("Don Timoteo", "Quiroga", "Juanito"),
                        correctAnswer = 0 //
                    )

                ),
                false),
            Datas(37,R.drawable.chapter_38, R.string.kabanata_38, R.string.kabanata_38_content,
        R.raw.kabanata_38, quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mga Katanungan. Pagsunud-sunurin ang mga pangyayari. Isulat ang bilang 1 hanggang 5. \n\n________Pagdedepensa ni Carolino sa mga bilanggo laban sa lupit ni Mautang",
                        options = listOf("1", "2", "3", "4", "5"),
                        correctAnswer = 3 //
                    ),
                    QuizQuestion(
                        question = "________ Pagbaril sa isang lalaki sa ibabaw ng mga bato",
                        options = listOf("1", "2", "3", "4", "5"),

                        correctAnswer = 2 //
                    ),
                    QuizQuestion(
                        question = "________Pagsalakay sa bayan-bayan ng mga tulisan sa pamumuno ni Matanglawin",
                        options = listOf("1", "2", "3", "4", "5"),

                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "________Binawian ng buhay si Tandang Selo",
                        options = listOf("1", "2", "3", "4", "5"),

                        correctAnswer = 4 //
                    ),
                    QuizQuestion(
                        question = "________Hinuli at pinarusahan ang mga bilanggo.",
                        options = listOf("1", "2", "3", "4", "5"),

                        correctAnswer = 0 //
                    )

                ),
                false),
            Datas(38,R.drawable.chapter_39, R.string.kabanata_39, R.string.kabanata_39_content,
        R.raw.kabanata_39, quizQuestions = listOf(
                    QuizQuestion(
                        question = " Mga Katanungan. Piliin ang letra ng wastong sagot.\n\nSino ang nagtago sa katawan ni Simoun matapos niyang mamatay?",
                        options = listOf("Basilio", "Isagani", "Padre Florentino"),
                        correctAnswer = 2 //
                    ),
                    QuizQuestion(
                        question = "Ano ang huling salita ni Simoun bago siya namatay?",
                        options = listOf("Diyos ko, bakit mo ako pinabayaan?", "Ang aking yaman...", "Sana\'y magkaroon ng pag-asa ang Pilipinas..."),
                                correctAnswer = 2 //
                    ),
                    QuizQuestion(
                        question = "3. Saan natagpuan ang mga alahas ni Simoun?",
                        options = listOf("Sa kanyang bag", "Sa kanyang kahon", "Sa kanyang kaban"),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "4. Ano ang ginawa ni Padre Florentino sa mga alahas ni Simoun?",
                        options = listOf("Ibinenta niya ito", "Itinapon niya ito sa dagat", "Itinago niya ito"),
                        correctAnswer = 1 //
                    ),
                    QuizQuestion(
                        question = "Ano ang naging reaksyon ng mga tao sa kamatayan ni Simoun?",
                        options = listOf("Nagdiwang sila", "Nagluksa sila", "Wala silang pakialam"),
                        correctAnswer = 1 //
                    )

                ),
                false
            ),
        // Add more Datas as needed
        )
        originalDataList.addAll(initialList)
        _dataList.value = initialList
    }
    fun Datas.getAudioResId(): Int {
        return audioResId
    }
    fun filterData(context: Context, query: String) {
        val filteredList = if (query.isEmpty()) {
            originalDataList.toList()
        } else {
            originalDataList.filter { data ->
                context.getString(data.titleResId).contains(query, true)
            }
        }
        _dataList.value = filteredList
    }

}
