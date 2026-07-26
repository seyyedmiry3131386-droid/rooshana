package ir.mservices.market.app.search.result.ui.recycler;

import defpackage.fu7;
import defpackage.is3;
import defpackage.js3;
import defpackage.vb7;
import ir.mservices.market.app.common.recycler.AppData;
import ir.mservices.market.app.detail.data.DownloadSummaryDto;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SearchApplicationData extends AppData {
    public final DownloadSummaryDto e;
    public final String f;
    public final String g;
    public final String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchApplicationData(ApplicationDTO applicationDTO, DownloadSummaryDto downloadSummaryDto, String str, String str2, vb7 vb7Var, fu7 fu7Var) {
        super(vb7Var, fu7Var, applicationDTO);
        js3.p(str2, "itemType");
        js3.p(fu7Var, "installStateFlow");
        this.e = downloadSummaryDto;
        this.f = str;
        this.g = str2;
        long j = is3.p + 1;
        is3.p = j;
        this.h = String.valueOf(j);
    }

    @Override // ir.mservices.market.app.common.recycler.AppData
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.app.search.result.ui.recycler.SearchApplicationData");
        SearchApplicationData searchApplicationData = (SearchApplicationData) obj;
        if (js3.i(this.e, searchApplicationData.e) && js3.i(this.f, searchApplicationData.f)) {
            return js3.i(this.g, searchApplicationData.g);
        }
        return false;
    }

    @Override // ir.mservices.market.app.common.recycler.AppData, defpackage.g32
    public String getUniqueId() {
        return this.h;
    }

    @Override // ir.mservices.market.app.common.recycler.AppData
    public int hashCode() {
        DownloadSummaryDto downloadSummaryDto = this.e;
        int iHashCode = (downloadSummaryDto != null ? downloadSummaryDto.hashCode() : 0) * 31;
        String str = this.f;
        return this.g.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
