package defpackage;

import ir.mservices.market.app.detail.data.ScreenshotDto;
import ir.mservices.market.app.detail.data.VideoShotDto;
import ir.mservices.market.app.detail.ui.recycler.AppScreenshotData;
import ir.mservices.market.app.detail.ui.recycler.AppVideoShotData;
import ir.mservices.market.app.search.result.ui.recycler.BaseSearchScreenshotData;
import ir.mservices.market.app.search.result.ui.recycler.SearchScreenshotAppData;
import ir.mservices.market.app.search.result.ui.recycler.b;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.layoutManager.PaddingLayoutManager$Padding;
import ir.mservices.market.version2.webapi.responsedto.SearchSpecialAppDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class mj7 extends b {
    @Override // ir.mservices.market.app.search.result.ui.recycler.b
    public final PaddingLayoutManager$Padding A() {
        return null;
    }

    @Override // ir.mservices.market.app.search.result.ui.recycler.b
    public final ArrayList C(BaseSearchScreenshotData baseSearchScreenshotData, int i) {
        Iterable iterableSubList;
        int width;
        SearchScreenshotAppData searchScreenshotAppData = (SearchScreenshotAppData) baseSearchScreenshotData;
        js3.p(searchScreenshotAppData, "data");
        List<ScreenshotDto> list = searchScreenshotAppData.l;
        int i2 = 0;
        int i3 = 0;
        for (ScreenshotDto screenshotDto : list) {
            boolean z = searchScreenshotAppData.m;
            if (z) {
                width = (int) ((i * 16.0f) / 9.0f);
            } else {
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                width = (screenshotDto.getWidth() * i) / screenshotDto.getHeight();
            }
            i3 += width;
            if (i3 <= this.Q) {
                i2++;
                i3 += this.P;
            }
        }
        if (list.size() < i2 || i2 == 0) {
            lw.g(null, "Cannot get screenshot list (search)", dw1.j(i2, list.size(), "count: ", ", list.size(): "));
            iterableSubList = EmptyList.a;
        } else {
            ArrayList arrayList = new ArrayList();
            SearchSpecialAppDTO searchSpecialAppDTO = searchScreenshotAppData.k;
            VideoShotDto videoshot = searchSpecialAppDTO.getVideoshot();
            if (videoshot != null) {
                String packageName = searchSpecialAppDTO.getApplication().getPackageName();
                js3.o(packageName, "getPackageName(...)");
                String refId = searchSpecialAppDTO.getApplication().getRefId();
                js3.o(refId, "getRefId(...)");
                arrayList.add(new AppVideoShotData(packageName, videoshot, refId, searchSpecialAppDTO.getApplication().getCallbackUrl(), searchSpecialAppDTO.getApplication().getInstallCallbackUrl(), searchSpecialAppDTO.getApplication().getClickCallback()));
            }
            for (ScreenshotDto screenshotDto2 : list) {
                List list2 = searchScreenshotAppData.l;
                String packageName2 = searchSpecialAppDTO.getApplication().getPackageName();
                String refId2 = searchSpecialAppDTO.getApplication().getRefId();
                js3.o(refId2, "getRefId(...)");
                arrayList.add(new AppScreenshotData(screenshotDto2, list2, packageName2, refId2, searchSpecialAppDTO.getApplication().getCallbackUrl(), searchSpecialAppDTO.getApplication().getInstallCallbackUrl(), searchSpecialAppDTO.getApplication().getClickCallback()));
            }
            iterableSubList = arrayList.subList(0, i2);
        }
        ArrayList arrayList2 = new ArrayList(wu0.V(iterableSubList, 10));
        Iterator it = iterableSubList.iterator();
        while (it.hasNext()) {
            bl4.G((MyketRecyclerData) it.next(), arrayList2);
        }
        return arrayList2;
    }
}
