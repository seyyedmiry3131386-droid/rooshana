package defpackage;

import android.os.Build;
import ir.mservices.market.core.Font$FontStyle;
import ir.mservices.market.theme.ThemeStyle;
import ir.myket.persistent.datasource.a;

/* JADX INFO: loaded from: classes3.dex */
public final class pr7 {
    public lu7 a;
    public dr1 b;
    public final Object c = bt2.D(a.class);

    public final Font$FontStyle a() {
        Font$FontStyle font$FontStyle = Font$FontStyle.e;
        try {
            return Font$FontStyle.valueOf(this.a.f(lu7.g0, font$FontStyle.name()));
        } catch (Exception unused) {
            this.a.i(lu7.g0, "DEFAULT");
            return font$FontStyle;
        }
    }

    public final String b() {
        return this.a.f(lu7.e0, Build.VERSION.SDK_INT > 28 ? "auto" : "off");
    }

    public final ThemeStyle c() {
        try {
            return ThemeStyle.valueOf(this.a.f(lu7.f0, ThemeStyle.g.name()));
        } catch (Exception unused) {
            return ThemeStyle.g;
        }
    }

    public final boolean d() {
        return this.a.b(lu7.B, false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [c24, java.lang.Object] */
    public final void e(boolean z) {
        this.a.j(lu7.z0, z);
        a aVar = (a) this.c.getValue();
        aVar.k.b(aVar, a.n[10], Boolean.valueOf(z));
    }
}
