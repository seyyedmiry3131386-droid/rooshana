package com.bumptech.glide.load.engine;

import defpackage.ha1;
import defpackage.ka1;
import defpackage.la1;
import defpackage.sx3;
import defpackage.w18;
import defpackage.zo1;
import defpackage.zw4;

/* JADX INFO: loaded from: classes.dex */
public final class e implements ka1 {
    public final /* synthetic */ zw4 a;
    public final /* synthetic */ w18 b;

    public e(w18 w18Var, zw4 zw4Var) {
        this.b = w18Var;
        this.a = zw4Var;
    }

    @Override // defpackage.ka1
    public final void a(Exception exc) {
        w18 w18Var = this.b;
        zw4 zw4Var = this.a;
        zw4 zw4Var2 = w18Var.f;
        if (zw4Var2 == null || zw4Var2 != zw4Var) {
            return;
        }
        w18 w18Var2 = this.b;
        zw4 zw4Var3 = this.a;
        a aVar = w18Var2.b;
        ha1 ha1Var = w18Var2.g;
        la1 la1Var = zw4Var3.c;
        aVar.c(ha1Var, exc, la1Var, la1Var.d());
    }

    @Override // defpackage.ka1
    public final void f(Object obj) {
        w18 w18Var = this.b;
        zw4 zw4Var = this.a;
        zw4 zw4Var2 = w18Var.f;
        if (zw4Var2 == null || zw4Var2 != zw4Var) {
            return;
        }
        w18 w18Var2 = this.b;
        zw4 zw4Var3 = this.a;
        zo1 zo1Var = w18Var2.a.p;
        if (obj != null && zo1Var.a(zw4Var3.c.d())) {
            w18Var2.e = obj;
            w18Var2.b.n(DecodeJob$RunReason.b);
        } else {
            a aVar = w18Var2.b;
            sx3 sx3Var = zw4Var3.a;
            la1 la1Var = zw4Var3.c;
            aVar.a(sx3Var, obj, la1Var, la1Var.d(), w18Var2.g);
        }
    }
}
