package ir.mservices.market.app.search.result.ui.recycler;

import android.os.Parcelable;
import defpackage.fu7;
import defpackage.js3;
import defpackage.vb7;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.version2.webapi.responsedto.SearchSpecialAppDTO;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseSearchScreenshotData extends SearchApplicationData implements MyketRecyclerData, wo2 {
    public final fu7 i;
    public Parcelable j;

    /* JADX WARN: Illegal instructions before constructor call */
    public BaseSearchScreenshotData(SearchSpecialAppDTO searchSpecialAppDTO, String str, vb7 vb7Var, fu7 fu7Var, fu7 fu7Var2) {
        js3.p(searchSpecialAppDTO, "app");
        js3.p(str, "itemType");
        js3.p(fu7Var, "installStateFlow");
        js3.p(fu7Var2, "stopVideo");
        ApplicationDTO application = searchSpecialAppDTO.getApplication();
        js3.o(application, "getApplication(...)");
        super(application, searchSpecialAppDTO.getDownloadSummary(), searchSpecialAppDTO.getBgColor(), str, vb7Var, fu7Var);
        this.i = fu7Var2;
    }

    public abstract String e();
}
