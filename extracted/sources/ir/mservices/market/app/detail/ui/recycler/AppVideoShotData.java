package ir.mservices.market.app.detail.ui.recycler;

import defpackage.fu7;
import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import defpackage.vy2;
import ir.mservices.market.app.detail.data.VideoShotDto;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
public final class AppVideoShotData implements MyketRecyclerData, g32 {
    public static final int j = js6.holder_video_shot;
    public final String a;
    public final VideoShotDto b;
    public final fu7 c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final String i;

    public AppVideoShotData(String str, VideoShotDto videoShotDto, i iVar, String str2, String str3, String str4, String str5) {
        js3.p(str, "packageName");
        js3.p(iVar, "stopVideoFlow");
        js3.p(str2, "refId");
        this.a = str;
        this.b = videoShotDto;
        this.c = iVar;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        long j2 = is3.p + 1;
        is3.p = j2;
        this.i = String.valueOf(j2);
        this.h = ((double) (((float) videoShotDto.getWidth()) / ((float) videoShotDto.getHeight()))) > 1.4d;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return j;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppVideoShotData)) {
            return false;
        }
        AppVideoShotData appVideoShotData = (AppVideoShotData) obj;
        return js3.i(this.a, appVideoShotData.a) && js3.i(this.b, appVideoShotData.b) && this.h == appVideoShotData.h && js3.i(this.i, appVideoShotData.i);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.i;
    }

    public final int hashCode() {
        int iHashCode = (((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + (this.h ? 1231 : 1237)) * 31;
        String str = this.i;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public /* synthetic */ AppVideoShotData(String str, VideoShotDto videoShotDto, String str2, String str3, String str4, String str5) {
        this(str, videoShotDto, vy2.e(0, 7, null), str2, str3, str4, str5);
    }
}
