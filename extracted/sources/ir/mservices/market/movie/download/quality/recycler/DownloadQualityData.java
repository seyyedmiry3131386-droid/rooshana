package ir.mservices.market.movie.download.quality.recycler;

import defpackage.fu7;
import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.rv6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.uri.downloadInfo.data.QualityItem;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
public final class DownloadQualityData implements MyketRecyclerData, g32 {
    public static final int d = js6.holder_quality_select_item;
    public final QualityItem a;
    public final rv6 b;
    public final fu7 c;

    public DownloadQualityData(QualityItem qualityItem, rv6 rv6Var, i iVar) {
        js3.p(iVar, "notEnoughStorageFlow");
        this.a = qualityItem;
        this.b = rv6Var;
        this.c = iVar;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return d;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!DownloadQualityData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.download.quality.recycler.DownloadQualityData");
        DownloadQualityData downloadQualityData = (DownloadQualityData) obj;
        if (this.a.equals(downloadQualityData.a)) {
            return this.b.equals(downloadQualityData.b);
        }
        return false;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(this.a.getQuality());
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
