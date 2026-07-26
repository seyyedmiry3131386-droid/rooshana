package ir.mservices.market.app.home.ui.recycler;

import defpackage.fu7;
import defpackage.js3;
import defpackage.pv6;
import defpackage.vb7;
import ir.mservices.market.version2.webapi.responsedto.VideoRowDto;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeVideoData extends BaseHomeVideoData {
    public final vb7 e;
    public final fu7 f;
    public final String g;
    public final String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeVideoData(vb7 vb7Var, pv6 pv6Var, VideoRowDto videoRowDto, boolean z, String str, String str2) {
        super(videoRowDto, z);
        js3.p(pv6Var, "installStateFlow");
        this.e = vb7Var;
        this.f = pv6Var;
        this.g = str;
        this.h = str2;
    }
}
