package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.search.history.ui.a;
import ir.mservices.market.search.history.ui.recycler.SearchHistoryData;
import ir.mservices.market.version2.webapi.requestdto.AppStatusDto;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class qi7 extends qg5 {
    public xf5 w;
    public hi7 x;
    public a y;
    public ii6 z;

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        SearchHistoryData searchHistoryData = (SearchHistoryData) myketRecyclerData;
        js3.p(searchHistoryData, "data");
        String str = searchHistoryData.d;
        String str2 = searchHistoryData.b;
        int i = searchHistoryData.c;
        View view = this.a;
        js3.o(view, "itemView");
        qg5.v(view, this.x, this, searchHistoryData);
        ii6 ii6Var = this.z;
        if (ii6Var == null) {
            js3.V("binding");
            throw null;
        }
        ImageView imageView = ii6Var.v;
        js3.o(imageView, "icon");
        imageView.setVisibility(i > 0 ? 0 : 8);
        if (i > 0) {
            ii6 ii6Var2 = this.z;
            if (ii6Var2 == null) {
                js3.V("binding");
                throw null;
            }
            ImageView imageView2 = ii6Var2.v;
            imageView2.setImageResource(i);
            imageView2.getDrawable().setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        }
        if (!f88.n0(str2) && str != null && !f88.n0(str)) {
            ii6 ii6Var3 = this.z;
            if (ii6Var3 == null) {
                js3.V("binding");
                throw null;
            }
            MyketTextView myketTextView = ii6Var3.x;
            if (this.w == null) {
                js3.V("myketUIUtils");
                throw null;
            }
            myketTextView.setText(xf5.g(str2, str));
        }
        ii6 ii6Var4 = this.z;
        if (ii6Var4 == null) {
            js3.V("binding");
            throw null;
        }
        ii6Var4.w.getDrawable().mutate().setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        ii6 ii6Var5 = this.z;
        if (ii6Var5 == null) {
            js3.V("binding");
            throw null;
        }
        ImageView imageView3 = ii6Var5.w;
        js3.o(imageView3, AppStatusDto.Type.REMOVE);
        qg5.v(imageView3, this.y, this, searchHistoryData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof ii6) {
            this.z = (ii6) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
