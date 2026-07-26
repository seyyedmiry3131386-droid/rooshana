package ir.mservices.market.app.detail.ui.recycler;

import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.app.detail.data.ScreenshotDto;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class AppScreenshotData implements MyketRecyclerData, g32 {
    public static final int j = js6.holder_screenshot;
    public final ScreenshotDto a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final String i;

    public AppScreenshotData(ScreenshotDto screenshotDto, List list, String str, String str2, String str3, String str4, String str5) {
        js3.p(screenshotDto, "screenshot");
        js3.p(str2, "refId");
        this.a = screenshotDto;
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = ((double) (((float) screenshotDto.getWidth()) / ((float) screenshotDto.getHeight()))) > 1.4d;
        long j2 = is3.p + 1;
        is3.p = j2;
        this.i = String.valueOf(j2);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return j;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppScreenshotData)) {
            return false;
        }
        AppScreenshotData appScreenshotData = (AppScreenshotData) obj;
        return js3.i(this.a, appScreenshotData.a) && js3.i(this.b, appScreenshotData.b) && js3.i(this.c, appScreenshotData.c) && js3.i(this.i, appScreenshotData.i);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.i;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.i;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
