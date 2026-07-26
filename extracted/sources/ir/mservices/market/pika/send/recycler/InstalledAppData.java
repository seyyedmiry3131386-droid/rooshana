package ir.mservices.market.pika.send.recycler;

import android.graphics.drawable.Drawable;
import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.k76;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class InstalledAppData implements MyketRecyclerData, wo2, g32, k76 {
    public static final int e = js6.holder_installed_app;
    public final String a;
    public final String b;
    public final Drawable c;
    public final String d;

    public InstalledAppData(String str, String str2, Drawable drawable, String str3) {
        js3.p(str3, "appSize");
        this.a = str;
        this.b = str2;
        this.c = drawable;
        this.d = str3;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return e;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!InstalledAppData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.pika.send.recycler.InstalledAppData");
        return js3.i(this.a, ((InstalledAppData) obj).a);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
