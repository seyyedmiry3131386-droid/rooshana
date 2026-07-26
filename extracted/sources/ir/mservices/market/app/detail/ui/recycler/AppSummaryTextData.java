package ir.mservices.market.app.detail.ui.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.app.detail.data.SummaryTextDto;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class AppSummaryTextData implements MyketRecyclerData, g32 {
    public static final int b = js6.app_summery_text;
    public final SummaryTextDto a;

    public AppSummaryTextData(SummaryTextDto summaryTextDto) {
        this.a = summaryTextDto;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return b;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AppSummaryTextData) {
            return js3.i(this.a, ((AppSummaryTextData) obj).a);
        }
        return false;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(this.a.hashCode());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
