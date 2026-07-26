package ir.mservices.market.app.search.result.ui.recycler;

import android.view.View;
import defpackage.bl4;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.e51;
import defpackage.js3;
import defpackage.n35;
import defpackage.pq6;
import defpackage.sg4;
import defpackage.ug1;
import defpackage.up1;
import defpackage.wu0;
import ir.mservices.market.app.detail.data.ScreenshotDto;
import ir.mservices.market.app.detail.data.VideoShotDto;
import ir.mservices.market.app.detail.ui.recycler.AppScreenshotData;
import ir.mservices.market.app.detail.ui.recycler.AppVideoShotData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.layoutManager.PaddingLayoutManager$Padding;
import ir.mservices.market.version2.webapi.responsedto.SearchSpecialAppDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends b {
    public n35 S;

    @Override // ir.mservices.market.app.search.result.ui.recycler.b
    public final PaddingLayoutManager$Padding A() {
        View view = this.a;
        return new PaddingLayoutManager$Padding(view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer), 0, view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer), 0);
    }

    @Override // ir.mservices.market.app.search.result.ui.recycler.b
    public final ArrayList C(BaseSearchScreenshotData baseSearchScreenshotData, int i) {
        SearchScrollableScreenshotAppData searchScrollableScreenshotAppData = (SearchScrollableScreenshotAppData) baseSearchScreenshotData;
        js3.p(searchScrollableScreenshotAppData, "data");
        ArrayList arrayList = new ArrayList();
        SearchSpecialAppDTO searchSpecialAppDTO = searchScrollableScreenshotAppData.k;
        VideoShotDto videoshot = searchSpecialAppDTO.getVideoshot();
        if (videoshot != null) {
            String packageName = searchSpecialAppDTO.getApplication().getPackageName();
            js3.o(packageName, "getPackageName(...)");
            String refId = searchSpecialAppDTO.getApplication().getRefId();
            js3.o(refId, "getRefId(...)");
            arrayList.add(new AppVideoShotData(packageName, videoshot, refId, searchSpecialAppDTO.getApplication().getCallbackUrl(), searchSpecialAppDTO.getApplication().getInstallCallbackUrl(), searchSpecialAppDTO.getApplication().getClickCallback()));
        }
        List<ScreenshotDto> screenshots = searchSpecialAppDTO.getScreenshots();
        if (screenshots != null) {
            ArrayList arrayList2 = new ArrayList(wu0.V(screenshots, 10));
            for (ScreenshotDto screenshotDto : screenshots) {
                js3.m(screenshotDto);
                List<ScreenshotDto> screenshots2 = searchSpecialAppDTO.getScreenshots();
                String packageName2 = searchSpecialAppDTO.getApplication().getPackageName();
                String refId2 = searchSpecialAppDTO.getApplication().getRefId();
                js3.o(refId2, "getRefId(...)");
                arrayList2.add(new AppScreenshotData(screenshotDto, screenshots2, packageName2, refId2, searchSpecialAppDTO.getApplication().getCallbackUrl(), searchSpecialAppDTO.getApplication().getInstallCallbackUrl(), searchSpecialAppDTO.getApplication().getClickCallback()));
            }
            arrayList.addAll(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(wu0.V(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bl4.G((MyketRecyclerData) it.next(), arrayList3);
        }
        return arrayList3;
    }

    @Override // ir.mservices.market.app.search.result.ui.recycler.b, ir.mservices.market.app.search.result.ui.recycler.a
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public final void t(SearchScrollableScreenshotAppData searchScrollableScreenshotAppData) {
        js3.p(searchScrollableScreenshotAppData, "app");
        super.t(searchScrollableScreenshotAppData);
        n35 n35Var = this.S;
        if (n35Var != null) {
            B().g0(n35Var);
        }
        View view = this.a;
        js3.o(view, "itemView");
        e51 e51VarQ = cc7.q(view);
        ug1 ug1Var = up1.a;
        bt2.G(e51VarQ, sg4.a, null, new ScrollableScreenshotViewHolder$onBindView$2(this, searchScrollableScreenshotAppData, null), 2);
        n35 n35Var2 = new n35(this, searchScrollableScreenshotAppData, 1);
        B().j(n35Var2);
        this.S = n35Var2;
    }
}
