package com.example.elfiliquizapp.ui

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.elfiliquizapp.adapter.GlosaryAdapter
import com.example.elfiliquizapp.databinding.DialogGlossaryBinding
import com.example.elfiliquizapp.databinding.FragmentSearchBinding
import com.example.wika_runungan.data.Glosary
import java.util.Locale


class SearchFragment : Fragment() {
    private lateinit var binding : FragmentSearchBinding
    lateinit var adapter: GlosaryAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSearchBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        var lists = mutableListOf<Glosary>(
            Glosary("Abuloy", "sdfsdf"),
            Glosary("Bapor Tabo", "barko na hugis tabo"),
            Glosary("Kubyerta", "Palapag ng bapor na bukás sa magkabilang gilid nito na tíla pasilyo na sagad sa magkabilang dulo."),
            Glosary("Panukala", "Mungkahing inihaharap sa pulong upang pagpasiyahan."),
            Glosary("Ehipsiyo", "Ehipto"),
            Glosary("Konserbatibo", "Makaluma; sinauna."),
            Glosary("Serbesa", "Inuming may alkohol ngunit hindi gaanong matapang at makalasing tulad ng alak na mulâ sa malt."),
            Glosary("Pumanhik", "Umakyat sa bahay o anumang gusali nang sa hagdan ang daan."),
            Glosary("Mga Katanungan", "Ilagay sa wastong pagkakasunod sunod ang mga pangyayari."),
            Glosary("Tulisan", "Magnanákaw na nanghaharang sa mga lansangan o nanloloob."),
            Glosary("Katipan", "kasintahan"),
            Glosary("Yungib", "kuweba"),
            Glosary("Beateryo", "kumbento"),
            Glosary("Kapitalista", "namumuhunan"),
            Glosary("Kabesa de barangay", "taong pinuno"),
            Glosary("Gulok", "itak"),
            Glosary("Kutsero", "Táong nagpapalakad o nagpapatakbo ng anumang sasakyáng pangkatihan na hinihila ng kabayo."),
            Glosary("Tumistis", "Paglagari sa kahoy nang paayon sa kahabaan nito"),
            Glosary("Awtopsiya", "Pagbiyak at pagsusuri sa bangkay upang maláman ang sanhi ng pagkamatay."),
            Glosary("Batingaw", "kampana"),
            Glosary("Bunton", "tumpok"),
            Glosary("Piyeltro", "Makapal na káyong yarì sa lana"),
            Glosary("Dominiko", "Nahihinggil kay Sto. Domingo (1170-1212) o sa kaniyang itinatag na orden."),
            Glosary("Loro", "Ibon na may malaki at balikukong tukâ at karaniwang berde at pulá ang mga balahibo nitó na natuturuan ding magsalita."),
            Glosary("Pingkian", "Pagkikiskis ng dalawang batóng matigas upang makalikha ng apoy."),
            Glosary("Baston at sable", "tungkod at espada"),
            Glosary("Sobresaliente", "pinakamataas na marka"),
            Glosary("Yabag", "tunog ng paglakad"),
            Glosary("Nagulintang", "nagulat, nabigla"),
            Glosary("Pagpawi", "pag-alis"),
            Glosary("Naniniil", "nang-aapi"),
            Glosary("Hahantong", "darating"),
            Glosary("Taliwas", "kabaliktaran, hindi pagsunod"),
            Glosary("Paghihimagsik", "pagsuway, pagrerebelde"),
            Glosary("Aginaldo", "Anumang kaloob o ibinigay bílang handog tuwing Pasko; handog o alaala kung Pasko."),
            Glosary("Manghang-mangha", "Ekspresyon na magkahalong gúlat at pagtataká."),
            Glosary("Nakasaksi", "nakita o naging saksí ng anumang pangyayari; mapatunayan sa pamamagitan ng pagkakakita sa nangyari."),
            Glosary("Pipi", "Táong hindi makapagsalita, karaniwang mula sa pagkabata."),
            Glosary("Kagyat", "Biglang datíng ng anumang pangyayari; agad."),
            Glosary("Tugisin", "Mahabol, mahagad."),
            Glosary("Asendero", "May-ari ng asyenda o malalaking pataniman."),
            Glosary("Prayle", "Paring Español na nabibilang sa isa sa mga kapatirang Katoliko."),
            Glosary("Nagtungo", "pumunta sa direksiyong paroroonan."),
            Glosary("Humanga", "Maakit sa isang tao dahil sa katangiang taglay nitó."),
            Glosary("Agnos", "Palawit sa kuwintas na kinauukitan o kinadidikitan ng larawang banal."),
            Glosary("Isangguni", "ilapit, idulog, o ihingi ng payo sa isang ipinalalagay na marunong."),
            Glosary("Takipsilim", "Paglubog ng araw; kalagayang nag-aagaw ang dilim at ang liwanag."),
            Glosary("Rebolber", "Baril, pistola, paltik."),
            Glosary("Mangaso", "Manghúli ng maiilap na hayop sa parang o sa kagubatan."),
            Glosary("Lingid", "Hindi alam."),
            Glosary("Talakayan", "palitan ng kuro ang ilang tao tungkol sa isang paksa."),
            Glosary("Tinahak", "Pagtalunton sa isang landas."),
            Glosary("Palaisipan", "Anumang nagbibigay ng suliraning dapat lutasin sa pamamagitan ng katalinuhan o matiyagang pagsisikap."),
            Glosary("Mestisong", "Laláking anak ng isang Pilipino sa isang banyaga; mestísa kung babae."),
            Glosary("Patiyad", "Dulo lámang ng mga daliri ang sumasayad."),
            Glosary("Bulwagan", "Pinakamalaking silid sa isang bahay o gusaling tanggapan ng mga panauhin; malaking bukas na espasyo sa isang gusali."),
            Glosary("Rehas", "Mga halang na magkakabit na maayos na inilalagay sa isang malaking puwang (gaya ng mga bintana, bentanilya, atbp.) bílang pangharang, pantukod, o pansalalay na maaaring yarì sa kahoy o sa kansa, bakal, atbp."),
            Glosary("Gabinete", "Lupon ng mga kalihim o opisyal ng iba't ibang kagawaran at ahensiya na tumutulong sa pangulo sa pagpapatakbo ng pámahalaán."),
            Glosary("Inilalaan", "Paghahanda o pag-uukol sa sinuman o sa anuman."),
            Glosary("Nilait", "Pag-uukol ng masamang salita sa kapuwa."),
            Glosary("Nag-aalinlangan", "Nakararamdam ng kawalang katiyakan; nag-aatubili."),
            Glosary("Padrino", "Táong tumutulong sa kapuwa o sa isang gawain; tagatangkilik, tagapagtaguyod."),
            Glosary("Balakin", "Tangkain; hangarín; planuhin; pag-isipan; naisin; mithiin."),
            Glosary("Pagkiling", "Pagpanig, pagsang-ayon, o pagkampi sa sinuman."),
            Glosary("Nagtungo", "pumunta sa direksiyong paroroonan."),
            Glosary("Hikayatin", "Paghimok sa pamamagitan ng maiinam na pangako at mahuhusay na pangungusap upang mayakag na sumáma sa ganitong lugar o sa gayong bagay."),
            Glosary("Sumangguni", "Lumapit sa isang ipinalalagay na marunong upang humingi ng payo."),
            Glosary("Napagpasyahan", "nagbigay hatol hinggil sa ikalulutas ng isang suliranin."),
            Glosary("Naghandog", "nagbigay nang kusang loob."),
            Glosary("Naghahangad", "nagnanais na magawa, matamo, mangyari, matupad, o maganap ang isang bagay."),
            Glosary("Konsulado", "Tanggapan o tiráhan ng isang konsul."),
            Glosary("Kawani", "Tao na nagtatrabaho sa isang tanggapan o pagawaan, karaniwang inuupahan, at hindi kabílang sa antas ehekutibo."),
            Glosary("Nagsisidaing", "Pagpapahayag ng sakit o lungkot."),
            Glosary("Pag-aalinlangan", "pagdududa"),
            Glosary("Pulutong", "Pangkat na hiwalay sa ibang kasamahan; ilang magkakasamang nakabukod sa paglakad."),
            Glosary("Likha", "Paggawa ng anuman mulâ sa isang bagay o sa walâ."),
            Glosary("Liwasan", "Lugar na pára sa lahat; pasyálan; palarúan."),
            Glosary("Paghanga", "Damdámin ng kagalakan, kasiyahan, o pagtataka na dulot ng anumang napakabuti, nakapaganda, atbp."),
            Glosary("Inukit", "nilílok (gaya ng ginagawa ng eskultor)."),
            Glosary("Nangangamba", "takot na naghahari sa sinumang tao."),
            Glosary("Panlilinlang", "Pandaraya."),
            Glosary("Pahintulot", "Pagsang-ayon ng nakatataas na magawa ng isang nasasakupan ang isang bagay."),
            Glosary("Pagsisiyasat", "Pagsusuri sa anuman o sinuman nang pormal at sistematiko upang matiyak ang mga impormasyong hinahanap, katotohanan, at iba pang kauri."),
            Glosary("Papiro", "Matandang dokumento o anumang sulat-kamay na nakasulat sa ganitong kagamitan."),
            Glosary("Espinghe", "Malaking estatwang mito na yarì sa bató, ang ulo ay sa tao, o sa lawin, o tupa, at ang katawan ay sa leon."),
            Glosary("Poot", "Gálit na naghahari sa damdámin ng isang tao; labis na pagkagalit."),
            Glosary("Liham", "Nakasulat na mensahe, nakasulat na pakikipagtalastasan na ipinadadala sa kinauukulan."),
            Glosary("Kabesa", "Pinunò ng barangay na bahagi ng pámahalaáng bayan noong panahon ng Español."),
            Glosary("Nag-usisa", "Pagtatanong tungkol sa pinag-usapan o napagkasunduan."),
            Glosary("Lansangan", "Daan; kalsada."),
            Glosary("Daungan", "Lugar sa tabing-ilog o tabing-dagat na tinitigilan ng mga sasakyang-dagat upang maglulan o magbaba ng lamán na kargá o pasahéro."),
            Glosary("Puksain", "Ubusin sa pamamagitan ng pagpatay, lipulin."),
            Glosary("Tanyag", "BANTÓG"),
            Glosary("Mamamahayag", "Mánunulát sa pahayagán, reporter."),
            Glosary("Makahalubilo", "kahalo-halo sa isang pagtitipon o pagdiriwang."),
            Glosary("Kawani", "Tao na nagtatrabaho sa isang tanggapan o pagawaan, karaniwang inuupahan, at hindi kabílang sa antas ehekutibo."),
            Glosary("Pag-aalinlangan", "pagdududa, kahina-hinala, hindi maliwanag na totoo"),
            Glosary("Bantog", "kilala, tanyag"),
            Glosary("Teatro", "Tanghalan; palabásan."),
            Glosary("Paskil", "Babalang idinidikit sa mga hayag na pook."),
            Glosary("Apyan", "opyo"),
            Glosary("Rebelyon", "Paglában o paghihimagsik lában sa pamahalaán."),
            Glosary("Nanaog", "bumaba"),
            Glosary("Kahabag-habag", "kaawa-awa"),
            Glosary("Takipsilim", "Paglubog ng araw"),
            Glosary("Nakikipagtunggalian", "Paglalaban ng dalawang panig para sa isang karangalan, kapangyarihan, at katulad."),
            Glosary("Sumagi", "Maalaala o biglang magunitâ ang isang bagay."),
            Glosary("Karwahe", "sasakyang pang mayaman"),
            Glosary("Lulan", "sakay"),
            Glosary("Makaniig", "Makausap nang sarilinan o makatalamitam."),
            Glosary("Napadako", "napapunta"),
            Glosary("Pasaring", "parinig"),
            Glosary("Kamusmusan", "kapaslitan"),
            Glosary("Nagtiktik", "nagmanman, nagsubaybay"),
            Glosary("Pamantasan", "paaralan"),
            Glosary("Naimpok", "naipon"),
            Glosary("Dampa", "bahay kubo"),
            Glosary("Kapisanan", "Samahan"),
            Glosary("Dinakip", "hinuli"),
            Glosary("Itinatwa", "itinanggi"),
            Glosary("Panghulo", "pagkaintindi"),
            Glosary("Pinupulaan", "pinipintasan"),
            Glosary("Pagbabalatkayo", "pagkukunwari"),
            Glosary("Pag-uusig", "pagsisiyasat"),
            Glosary("Ninanasa", "inaasam"),
            Glosary("Nangahas", "naglakas loob"),
            Glosary("Hinadlangan", "pinigilan"),
            Glosary("Pagpapatiwakal", "pagpapakamatay"),
            Glosary("Nagsiputan", "nagsidatingan bigla"),
            Glosary("Palatuntunan", "programa"),
            Glosary("Tulisan", "rebelde"),
            Glosary("Maringal", "kahanga hanga"),
            Glosary("Naghangad", "nagnais"),
            Glosary("Yumao", "namatay"),
            Glosary("Prestihiyo", "reputasyon"),
            Glosary("Pansiterya", "Tindahan na ang karaniwang inihahain o ipinagbibili ay pansit."),
            Glosary("Ehemplo", "modelo, huwaran"),
            Glosary("Agwa bendita", "tubig na benditado"),
            Glosary("Padrino", "inaama"),
            Glosary("Eksamen", "pagsusuri"),
            Glosary("Engrande", "bongga, mamahalin"),
            Glosary("Despidida", "paghahanda sa taong aalis na"),
            Glosary("Balakin", "tangkain, hangarin"),
            Glosary("Kasawian", "kabiguan"),
            Glosary("Nitrogliserina", "isang gas na nakalalson at sumasabog"),
            Glosary("Magara", "mamahalin"),
            Glosary("Aranya", "Pulutong ng maliwanag na nakabiting mga ilaw"),
            Glosary("Piging", "handaan."),
            Glosary("Nagsiklab", "pagsimula, paginit ng laban"),
            Glosary("Karwahe", "sasakyang hila-hila ng kabayo"),
            Glosary("Nangatal", "nanginig"),
            Glosary("Nangahas", "nagtangka"),
            Glosary("Sinunggaban", "biglang kinuha"),
            Glosary("Nakalundag", "nakatalon"),
            Glosary("Dali-dali", "kaagad"),
            Glosary("Nailathala", "naipabalita"),
            Glosary("Umalingawngaw", "umiingay"),
            Glosary("Nasamsam", "nakuha"),
            Glosary("Nililinlang", "niloloko"),
            Glosary("Nasumpungan", "Nakita"),
            Glosary("Panukala", "mungkahi, pahayag"),
            Glosary("Nililihim", "tinatago"),
            Glosary("Kiosko", "istrukturang maliit"),
            Glosary("Batid", "alam"),
            Glosary("Namamahala", "namumuno"),
            Glosary("Piging", "handaan"),
            Glosary("Naghasik", "nagkalat"),
            Glosary("Kabyawan", "tistisan ng mga tubo"),
            Glosary("Tutop", "takip"),
            Glosary("Punglo", "bala"),
            Glosary("Ikinukumpay", "iwinawasiwas"),
            Glosary("Bayoneta", "kutsilyong nakakabit sad ulo ng baril"),
            Glosary("Telegrama", "uri ng sulat"),
            Glosary("Pakutya", "nang-aasar"),
            Glosary("Lunas", "gamot"),
            Glosary("Namalagi", "tumira"),
            Glosary("Adhikain", "layunin, plano")
        )


        binding.searchEt2.clearFocus()
        adapter = GlosaryAdapter(lists)
        binding.recycler.adapter = adapter
        binding.recycler.layoutManager = LinearLayoutManager(requireContext())
        lists.sortBy {
            it.title
        }
        adapter.onItemClick = { glossary ->
            showGlossaryDialog(glossary)
        }

        binding.searchEt2.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                val searchList = ArrayList<Glosary>()

                if (newText != null) {
                    val searchQuery =
                        newText.toLowerCase(Locale.ROOT) // Convert search query to lowercase

                    for (i in lists) {
                        val title =
                            i.title.toLowerCase(Locale.ROOT) // Convert title to lowercase for comparison
                        if (title.contains(searchQuery)) {
                            searchList.add(i)
                        }
                    }

                    if (searchList.isEmpty()) {
                        // Handle case when search results are empty
                    } else {
                        adapter.onApplySearch(searchList)
                    }
                }

                return true
            }
        })
    }
    private fun showGlossaryDialog(glossary: Glosary) {
        val dialogView = DialogGlossaryBinding.inflate(layoutInflater)
        dialogView.dialogTitle.text = glossary.title
        dialogView.dialogDescription.text = glossary.description

        AlertDialog.Builder(requireContext())
            .setView(dialogView.root)
            .setPositiveButton("OK", null)
            .show()
    }
}