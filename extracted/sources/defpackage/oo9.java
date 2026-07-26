package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class oo9 extends po9 {
    public final /* synthetic */ Long e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ Bundle h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ yo9 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo9(yo9 yo9Var, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(yo9Var, true);
        this.e = l;
        this.f = str;
        this.g = str2;
        this.h = bundle;
        this.i = z;
        this.j = z2;
        this.k = yo9Var;
    }

    @Override // defpackage.po9
    public final void a() {
        Long l = this.e;
        long jLongValue = l == null ? this.a : l.longValue();
        en9 en9Var = this.k.g;
        rq4.n(en9Var);
        en9Var.logEvent(this.f, this.g, this.h, this.i, this.j, jLongValue);
    }
}
