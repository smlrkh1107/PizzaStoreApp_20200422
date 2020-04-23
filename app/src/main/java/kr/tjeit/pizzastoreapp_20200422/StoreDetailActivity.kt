package kr.tjeit.pizzastoreapp_20200422

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_store_detail.*
import kr.tjeit.pizzastoreapp_20200422.datas.Store

class StoreDetailActivity : BaseActivity() {

    private lateinit var storeData:Store

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_store_detail)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

        storeData = intent.getSerializableExtra("storeData") as Store

        storeNameTxt.text = storeData.name
        storePhonTxt.text = storeData.phoneNum

        Glide.with(mContext).load(storeData.logoUrl).into(storeLogoImg)

    }

}
