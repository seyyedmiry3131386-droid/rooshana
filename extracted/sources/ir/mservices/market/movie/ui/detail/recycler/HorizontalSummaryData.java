package ir.mservices.market.movie.ui.detail.recycler;

import defpackage.bz6;
import defpackage.dp2;
import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.version2.model.AppDownloadFlowStatus;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class HorizontalSummaryData extends NestedRecyclerData implements wo2, g32 {
    public static final int i = js6.holder_app_summary;
    public final boolean g;
    public final AppDownloadFlowStatus h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalSummaryData(boolean z, AppDownloadFlowStatus appDownloadFlowStatus, bz6 bz6Var, dp2 dp2Var) {
        super(bz6Var, dp2Var);
        js3.p(bz6Var, "recyclerData");
        this.g = z;
        this.h = appDownloadFlowStatus;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return i;
    }

    @Override // ir.mservices.market.version2.ui.recycler.NestedRecyclerData
    public final int c() {
        return 1;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return HorizontalSummaryData.class.equals(obj != null ? obj.getClass() : null);
    }

    @Override // ir.mservices.market.version2.ui.recycler.NestedRecyclerData
    public final boolean f() {
        return true;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(HorizontalSummaryData.class.hashCode());
    }

    public final int hashCode() {
        return HorizontalSummaryData.class.hashCode();
    }
}
