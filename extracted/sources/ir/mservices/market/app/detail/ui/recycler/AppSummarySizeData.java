package ir.mservices.market.app.detail.ui.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.v48;
import ir.mservices.market.common.data.SummaryDialogDto;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class AppSummarySizeData implements MyketRecyclerData, g32 {
    public static final int e = js6.app_summery_size;
    public final String a;
    public final v48 b;
    public final String c;
    public SummaryDialogDto d;

    public AppSummarySizeData(String str, v48 v48Var, String str2, SummaryDialogDto summaryDialogDto) {
        js3.p(v48Var, "size");
        this.a = str;
        this.b = v48Var;
        this.c = str2;
        this.d = summaryDialogDto;
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
        if (!(obj instanceof AppSummarySizeData)) {
            return false;
        }
        AppSummarySizeData appSummarySizeData = (AppSummarySizeData) obj;
        return js3.i(this.a, appSummarySizeData.a) && js3.i(this.b.getValue(), appSummarySizeData.b.getValue()) && js3.i(this.c, appSummarySizeData.c) && js3.i(this.d, appSummarySizeData.d);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(hashCode());
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = (String) this.b.getValue();
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        SummaryDialogDto summaryDialogDto = this.d;
        return iHashCode3 + (summaryDialogDto != null ? summaryDialogDto.hashCode() : 0);
    }
}
