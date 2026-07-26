package defpackage;

import com.airbnb.lottie.LottieAnimationView;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.search.history.ui.a;
import ir.mservices.market.search.history.ui.recycler.SearchHistoryListTitleData;
import ir.mservices.market.theme.ThemeMode;
import ir.mservices.market.version2.webapi.requestdto.AppStatusDto;

/* JADX INFO: loaded from: classes3.dex */
public final class gi7 extends qg5 {
    public a w;
    public fi7 x;

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        SearchHistoryListTitleData searchHistoryListTitleData = (SearchHistoryListTitleData) myketRecyclerData;
        js3.p(searchHistoryListTitleData, "data");
        fi7 fi7Var = this.x;
        if (fi7Var == null) {
            js3.V("binding");
            throw null;
        }
        fi7Var.v.setAnimation(sj8.g == ThemeMode.b ? qs6.recyclebin_dark : qs6.recyclebin_light);
        fi7 fi7Var2 = this.x;
        if (fi7Var2 == null) {
            js3.V("binding");
            throw null;
        }
        fi7Var2.w.setText(this.a.getResources().getString(searchHistoryListTitleData.a));
        fi7 fi7Var3 = this.x;
        if (fi7Var3 == null) {
            js3.V("binding");
            throw null;
        }
        LottieAnimationView lottieAnimationView = fi7Var3.v;
        js3.o(lottieAnimationView, AppStatusDto.Type.REMOVE);
        qg5.v(lottieAnimationView, this.w, this, searchHistoryListTitleData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof fi7) {
            this.x = (fi7) a79Var;
        } else {
            lw.g(null, "Data binding is incompatible", null);
        }
    }
}
