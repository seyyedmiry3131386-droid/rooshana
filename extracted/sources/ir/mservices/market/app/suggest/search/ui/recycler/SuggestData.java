package ir.mservices.market.app.suggest.search.ui.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.rm7;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class SuggestData implements MyketRecyclerData, g32 {
    public static final int f = js6.holder_suggest;
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;

    public SuggestData(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return f;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestData)) {
            return false;
        }
        SuggestData suggestData = (SuggestData) obj;
        return js3.i(this.a, suggestData.a) && js3.i(this.b, suggestData.b) && js3.i(this.c, suggestData.c) && this.d == suggestData.d && js3.i(this.e, suggestData.e);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.a;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((rm7.k(this.c, rm7.k(this.b, this.a.hashCode() * 31, 31), 31) + (this.d ? 1231 : 1237)) * 31);
    }
}
