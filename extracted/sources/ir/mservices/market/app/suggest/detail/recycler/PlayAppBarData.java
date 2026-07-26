package ir.mservices.market.app.suggest.detail.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class PlayAppBarData implements MyketRecyclerData, g32 {
    public static final int c = js6.holder_play_detail_info;
    public final String a;
    public final String b;

    public PlayAppBarData(String str, String str2) {
        js3.p(str2, "appName");
        this.a = str;
        this.b = str2;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return c;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!PlayAppBarData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.app.suggest.detail.recycler.PlayAppBarData");
        PlayAppBarData playAppBarData = (PlayAppBarData) obj;
        return js3.i(this.a, playAppBarData.a) && js3.i(this.b, playAppBarData.b);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(hashCode());
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
