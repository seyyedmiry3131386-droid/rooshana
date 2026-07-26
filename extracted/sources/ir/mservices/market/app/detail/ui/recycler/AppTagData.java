package ir.mservices.market.app.detail.ui.recycler;

import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import defpackage.v48;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.TagDto;

/* JADX INFO: loaded from: classes3.dex */
public final class AppTagData implements MyketRecyclerData, g32 {
    public static final int g = js6.tag_view;
    public final TagDto a;
    public final Integer b;
    public final boolean c;
    public final Integer d;
    public final v48 e;
    public final String f;

    public /* synthetic */ AppTagData(TagDto tagDto) {
        this(tagDto, null, false, null, null);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return g;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AppTagData.class.equals(obj.getClass())) {
            return false;
        }
        AppTagData appTagData = (AppTagData) obj;
        if (js3.i(this.a, appTagData.a) && js3.i(this.b, appTagData.b) && this.c == appTagData.c) {
            return js3.i(this.f, appTagData.f);
        }
        return false;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return this.f.hashCode() + ((((iHashCode + (num != null ? num.intValue() : 0)) * 31) + (this.c ? 1231 : 1237)) * 31);
    }

    public AppTagData(TagDto tagDto, Integer num, boolean z, Integer num2, v48 v48Var) {
        js3.p(tagDto, "tag");
        this.a = tagDto;
        this.b = num;
        this.c = z;
        this.d = num2;
        this.e = v48Var;
        long j = is3.p + 1;
        is3.p = j;
        this.f = String.valueOf(j);
    }
}
