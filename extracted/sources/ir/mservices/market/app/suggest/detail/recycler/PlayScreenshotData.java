package ir.mservices.market.app.suggest.detail.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.app.detail.data.ScreenshotDto;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class PlayScreenshotData implements MyketRecyclerData, g32 {
    public static final int b = js6.holder_play_screenshot;
    public final ScreenshotDto a;

    public PlayScreenshotData(ScreenshotDto screenshotDto) {
        js3.p(screenshotDto, "screenshot");
        this.a = screenshotDto;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return b;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!PlayScreenshotData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.app.suggest.detail.recycler.PlayScreenshotData");
        return js3.i(this.a, ((PlayScreenshotData) obj).a);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        ScreenshotDto screenshotDto = this.a;
        String mainUrl = screenshotDto.getMainUrl();
        return mainUrl == null ? String.valueOf(screenshotDto.hashCode()) : mainUrl;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
