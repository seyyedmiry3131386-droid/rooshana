package ir.mservices.market.app.suggest.detail.recycler;

import defpackage.fu7;
import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import defpackage.rm7;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
public final class PlayAppSuggestData implements MyketRecyclerData, wo2, g32 {
    public static final int h = js6.holder_play_detail_suggest;
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final fu7 e;
    public final fu7 f;
    public final String g;

    public PlayAppSuggestData(boolean z, String str, String str2, String str3, i iVar, i iVar2) {
        js3.p(iVar, "showProgressFlow");
        js3.p(iVar2, "enableButtonFlow");
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = iVar;
        this.f = iVar2;
        long j = is3.p + 1;
        is3.p = j;
        this.g = String.valueOf(j);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return h;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!PlayAppSuggestData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.app.suggest.detail.recycler.PlayAppSuggestData");
        PlayAppSuggestData playAppSuggestData = (PlayAppSuggestData) obj;
        return js3.i(this.c, playAppSuggestData.c) && js3.i(this.d, playAppSuggestData.d) && this.a == playAppSuggestData.a && js3.i(this.b, playAppSuggestData.b);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.g;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((rm7.k(this.d, this.c.hashCode() * 31, 31) + (this.a ? 1231 : 1237)) * 31);
    }
}
