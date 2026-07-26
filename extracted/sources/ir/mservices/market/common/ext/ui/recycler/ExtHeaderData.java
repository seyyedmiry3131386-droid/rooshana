package ir.mservices.market.common.ext.ui.recycler;

import defpackage.a55;
import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.pv1;
import defpackage.rm7;
import defpackage.v48;
import ir.mservices.market.app.detail.data.AdInfoDto;
import ir.mservices.market.common.ext.data.ExtensionPointDto;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class ExtHeaderData implements MyketRecyclerData, a55, g32 {
    public static final int i = js6.holder_ext_header_app;
    public static final int j = js6.holder_ext_header_clickable;
    public final String a;
    public final String b;
    public final String c;
    public final AdInfoDto d;
    public final boolean e;
    public final v48 f;
    public final boolean g;
    public boolean h;

    public /* synthetic */ ExtHeaderData(String str, String str2, String str3, AdInfoDto adInfoDto) {
        this(str, str2, str3, adInfoDto, false, null, false);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        String lowerCase;
        String str = this.a;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            js3.o(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        Locale locale = Locale.ROOT;
        String lowerCase2 = ExtensionPointDto.TYPE_APP.toLowerCase(locale);
        js3.o(lowerCase2, "toLowerCase(...)");
        if (js3.i(lowerCase, lowerCase2)) {
            return i;
        }
        String lowerCase3 = ExtensionPointDto.TYPE_BANNER_LIST.toLowerCase(locale);
        js3.o(lowerCase3, "toLowerCase(...)");
        boolean zI = js3.i(lowerCase, lowerCase3);
        int i2 = j;
        if (!zI) {
            String lowerCase4 = ExtensionPointDto.TYPE_BANNER_LIST_NO_TITLE.toLowerCase(locale);
            js3.o(lowerCase4, "toLowerCase(...)");
            if (!js3.i(lowerCase, lowerCase4)) {
                String lowerCase5 = ExtensionPointDto.TYPE_REEL_LIST.toLowerCase(locale);
                js3.o(lowerCase5, "toLowerCase(...)");
                js3.i(lowerCase, lowerCase5);
            }
        }
        return i2;
    }

    @Override // defpackage.a55
    public final pv1 a() {
        v48 v48Var = this.f;
        return new pv1(3, !(v48Var != null ? ((Boolean) v48Var.getValue()).booleanValue() : true) && this.g);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ExtHeaderData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.common.ext.ui.recycler.ExtHeaderData");
        ExtHeaderData extHeaderData = (ExtHeaderData) obj;
        return js3.i(this.a, extHeaderData.a) && js3.i(this.b, extHeaderData.b) && js3.i(this.c, extHeaderData.c) && js3.i(this.d, extHeaderData.d);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(hashCode());
    }

    public final int hashCode() {
        String str = this.a;
        int iK = rm7.k(this.b, (str != null ? str.hashCode() : 0) * 31, 31);
        String str2 = this.c;
        int iHashCode = (iK + (str2 != null ? str2.hashCode() : 0)) * 31;
        AdInfoDto adInfoDto = this.d;
        return iHashCode + (adInfoDto != null ? adInfoDto.hashCode() : 0);
    }

    public ExtHeaderData(String str, String str2, String str3, AdInfoDto adInfoDto, boolean z, v48 v48Var, boolean z2) {
        js3.p(str2, "url");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = adInfoDto;
        this.e = z;
        this.f = v48Var;
        this.g = z2;
    }
}
