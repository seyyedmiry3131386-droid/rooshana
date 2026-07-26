package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.movie.streamers.recycler.OtherStreamerData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannersItemData;
import ir.mservices.market.social.users.common.recycler.UserCardData;
import ir.mservices.market.version2.ui.recycler.adapter.a;

/* JADX INFO: loaded from: classes3.dex */
public final class dy4 extends a {
    public final /* synthetic */ int l;
    public final int m;
    public og5 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dy4(int i, int i2, int i3) {
        super(i);
        this.l = i3;
        this.m = i2;
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        switch (this.l) {
            case 0:
                if (i != OtherStreamerData.b) {
                    return null;
                }
                qs3 qs3Var = (qs3) this.n;
                if (qs3Var != null) {
                    return new sw5(this.m, qs3Var, view);
                }
                js3.V("onStreamerClickListener");
                throw null;
            case 1:
                if (i != MovieHomeBannersItemData.c) {
                    return null;
                }
                h35 h35Var = new h35(this.m, view);
                qs3 qs3Var2 = (qs3) this.n;
                if (qs3Var2 != null) {
                    h35Var.x = qs3Var2;
                    return h35Var;
                }
                js3.V("onBannerClickListener");
                throw null;
            default:
                if (i != UserCardData.d) {
                    return null;
                }
                qs3 qs3Var3 = (qs3) this.n;
                if (qs3Var3 != null) {
                    return new d19(this.m, qs3Var3, view);
                }
                js3.V("onClickListener");
                throw null;
        }
    }
}
