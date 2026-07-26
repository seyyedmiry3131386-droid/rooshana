package ir.mservices.market.app.search.result.ui.recycler;

import defpackage.js3;
import defpackage.js6;
import defpackage.pv6;
import defpackage.vb7;
import ir.mservices.market.app.detail.data.ScreenshotDto;
import ir.mservices.market.app.detail.data.VideoShotDto;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.webapi.responsedto.SearchSpecialAppDTO;
import java.util.List;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchScrollableScreenshotAppData extends BaseSearchScreenshotData implements MyketRecyclerData {
    public static final int n = js6.search_scrollable_screenshot_app;
    public final SearchSpecialAppDTO k;
    public final VideoShotDto l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchScrollableScreenshotAppData(SearchSpecialAppDTO searchSpecialAppDTO, String str, vb7 vb7Var, pv6 pv6Var, i iVar) {
        List<ScreenshotDto> screenshots;
        super(searchSpecialAppDTO, str, vb7Var, pv6Var, iVar);
        js3.p(searchSpecialAppDTO, "app");
        js3.p(str, "itemType");
        js3.p(pv6Var, "installStateFlow");
        js3.p(iVar, "stopVideo");
        this.k = searchSpecialAppDTO;
        VideoShotDto videoshot = searchSpecialAppDTO.getVideoshot();
        this.l = videoshot;
        if (videoshot == null && (screenshots = searchSpecialAppDTO.getScreenshots()) != null && (!screenshots.isEmpty())) {
            ScreenshotDto screenshotDto = searchSpecialAppDTO.getScreenshots().get(0);
            screenshotDto.getWidth();
            screenshotDto.getHeight();
        }
    }

    @Override // ir.mservices.market.app.common.recycler.AppData, ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return n;
    }

    @Override // ir.mservices.market.app.common.recycler.AppData, ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    @Override // ir.mservices.market.app.search.result.ui.recycler.BaseSearchScreenshotData
    public final String e() {
        if (this.l == null) {
            return "";
        }
        String str = this.k.getApplication().getPackageName() + "_" + this.g + "_" + this.f;
        return str == null ? "" : str;
    }
}
