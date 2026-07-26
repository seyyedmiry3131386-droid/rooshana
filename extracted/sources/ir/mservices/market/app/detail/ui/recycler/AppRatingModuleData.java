package ir.mservices.market.app.detail.ui.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.v48;
import defpackage.vb7;
import defpackage.wo2;
import defpackage.xe2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public class AppRatingModuleData implements MyketRecyclerData, g32, wo2 {
    public static final int f = js6.rate_review;
    public final String a;
    public final v48 b;
    public final xe2 c;
    public final boolean d;
    public final boolean e;

    public AppRatingModuleData(String str, l lVar, vb7 vb7Var, boolean z, boolean z2) {
        js3.p(str, "packageName");
        js3.p(lVar, "rate");
        js3.p(vb7Var, "commentFlow");
        this.a = str;
        this.b = lVar;
        this.c = vb7Var;
        this.d = z;
        this.e = z2;
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
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        AppRatingModuleData appRatingModuleData = (AppRatingModuleData) obj;
        return js3.i(this.a, appRatingModuleData.a) && ((Number) this.b.getValue()).floatValue() == ((Number) appRatingModuleData.b.getValue()).floatValue() && this.d == appRatingModuleData.d && this.e == appRatingModuleData.e;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(hashCode());
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(((Number) this.b.getValue()).floatValue()) + (this.a.hashCode() * 31)) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31) + 1231;
    }
}
