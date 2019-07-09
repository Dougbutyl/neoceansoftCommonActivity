package com.neocean.app.myapplication

import android.os.Handler
import android.view.View
import android.widget.TextView
import com.neocean.app.myapplication.adapter.CommonAdapter
import com.neocean.app.myapplication.widget.LayoutManager


/**
 * User weixn
 * Date 2019/7/4
 */
class AListActivity : CommonListActivity() {


    var list = arrayListOf("item1", "item2", "item3", "item4", "item5")
    override fun layoutManager(): com.neocean.app.myapplication.widget.LayoutManager? {

        return super.layoutManager()
    }

    override fun setTVTitle() = "我的列表"

    override fun setAdapterLayoutId() = R.layout.test_tv

    override fun setAdapterDataList() = list

    override fun bindAdapterData(holder: CommonAdapter.CommonViewHolder, position: Int) {
//        (holder.map[R.id.root_id] as CardView)
    }

    override fun listMain() {
    }

    override fun pullRefreshEnable() = true
    override fun refresh() {
        Handler().postDelayed(Runnable { refreshComplete("刷新完成") }, 3000)
    }

    override fun itemClick(view: View?, positon: Int) {
        super.itemClick(view, positon)
        view?.Toast("$positon")
    }

    override fun itemLongClick(view: View?, positon: Int) {
        super.itemLongClick(view, positon)
        view?.Toast("长按$positon")
    }

    override fun rightViewClick(view: View) {
        super.rightViewClick(view)
        view?.Toast("${(view as TextView).text}")
    }


}