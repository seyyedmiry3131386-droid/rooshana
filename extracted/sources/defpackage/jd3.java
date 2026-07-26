package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class jd3 extends i1 {
    public qi4 b;
    public rf0 c;
    public final cv d = new cv(27);
    public final xe1 a = new xe1(6);

    /* JADX WARN: Removed duplicated region for block: B:159:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02e5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void i(defpackage.jd3 r18, defpackage.vp7 r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 748
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jd3.i(jd3, vp7, java.lang.String):void");
    }

    @Override // defpackage.i1
    public final void a(vp7 vp7Var) {
        rf0 rf0Var = this.c;
        if (rf0Var == null) {
            throw new IllegalStateException("Unexpected state, html-renderer is not defined");
        }
        rf0Var.I(vp7Var, this.b);
    }

    @Override // defpackage.i1
    public final void e() {
        xe1 xe1Var = this.a;
        xe1Var.getClass();
        xe1Var.f(new u02(new fv(new cv(10))));
        xe1Var.f(new u02(3));
        xe1Var.f(new gd0(0));
        xe1Var.f(new u02(5));
        xe1Var.f(new u02(6));
        xe1Var.f(new u02(4));
        xe1Var.f(new gd0(2));
        xe1Var.f(new gd0(3));
        xe1Var.f(new gd0(1));
        xe1Var.f(new u02(0));
        xe1Var.f(new u02(1));
        this.b = new qi4(this.d, new xs8());
        HashMap map = (HashMap) xe1Var.b;
        if (xe1Var.a) {
            throw new IllegalStateException("Builder has been already built");
        }
        xe1Var.a = true;
        this.c = map.size() > 0 ? new ri4(DesugarCollections.unmodifiableMap(map)) : new si4();
    }

    @Override // defpackage.i1
    public final void h(pj9 pj9Var) {
        pj9Var.v(fd3.class, new id3(this, 1));
        pj9Var.v(hd3.class, new id3(this, 0));
    }
}
