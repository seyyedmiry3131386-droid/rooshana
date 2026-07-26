package ir.mservices.market.app.url.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.vb7;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.webapi.responsedto.InCompleteReviewDto;

/* JADX INFO: loaded from: classes3.dex */
public final class AppReviewData implements MyketRecyclerData, g32 {
    public static final int g = js6.holder_home_app_review;
    public final String a;
    public final InCompleteReviewDto b;
    public final String c;
    public final vb7 d;
    public final vb7 e;
    public float f;

    public AppReviewData(String str, InCompleteReviewDto inCompleteReviewDto, String str2, vb7 vb7Var, vb7 vb7Var2) {
        js3.p(str, "id");
        this.a = str;
        this.b = inCompleteReviewDto;
        this.c = str2;
        this.d = vb7Var;
        this.e = vb7Var2;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return g;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppReviewData)) {
            return false;
        }
        AppReviewData appReviewData = (AppReviewData) obj;
        return js3.i(this.b, appReviewData.b) && js3.i(this.c, appReviewData.c) && js3.i(this.a, appReviewData.a);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode() + ((((this.c.hashCode() + (this.b.hashCode() * 31)) * 31) + 1237) * 31);
    }
}
