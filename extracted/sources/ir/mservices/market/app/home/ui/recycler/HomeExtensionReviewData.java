package ir.mservices.market.app.home.ui.recycler;

import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import defpackage.wo2;
import defpackage.xe2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.webapi.responsedto.InCompleteReviewDto;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeExtensionReviewData implements MyketRecyclerData, wo2, g32 {
    public static final int e = js6.holder_home_app_review;
    public final InCompleteReviewDto a;
    public final xe2 b;
    public final xe2 c;
    public float d;

    public HomeExtensionReviewData(InCompleteReviewDto inCompleteReviewDto, String str, xe2 xe2Var, xe2 xe2Var2) {
        js3.p(xe2Var, "commentStateFlow");
        js3.p(xe2Var2, "commentFlow");
        this.a = inCompleteReviewDto;
        this.b = xe2Var;
        this.c = xe2Var2;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return e;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HomeExtensionReviewData) {
            return js3.i(this.a, ((HomeExtensionReviewData) obj).a);
        }
        return false;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        long j = is3.p + 1;
        is3.p = j;
        return String.valueOf(j);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
