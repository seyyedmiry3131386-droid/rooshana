package com.google.common.cache;

import defpackage.bl4;
import defpackage.gk0;
import defpackage.gu9;
import defpackage.hk0;
import defpackage.ik0;
import defpackage.jl8;
import defpackage.od9;
import defpackage.pa2;
import defpackage.r37;
import defpackage.vb8;
import defpackage.wn5;
import defpackage.wu8;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final vb8 o = com.google.common.base.b.f(new gk0());
    public static final hk0 p = new hk0();
    public boolean a;
    public int b;
    public long c;
    public long d;
    public od9 e;
    public LocalCache$Strength f;
    public LocalCache$Strength g;
    public long h;
    public long i;
    public com.google.common.base.a j;
    public com.google.common.base.a k;
    public r37 l;
    public jl8 m;
    public vb8 n;

    public final void a() {
        if (this.e == null) {
            wn5.s("maximumWeight requires weigher", this.d == -1);
        } else if (this.a) {
            wn5.s("weigher requires maximumWeight", this.d != -1);
        } else if (this.d == -1) {
            ik0.a.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    public final String toString() {
        pa2 pa2VarF = gu9.F(this);
        int i = this.b;
        if (i != -1) {
            pa2VarF.i("concurrencyLevel", String.valueOf(i));
        }
        long j = this.c;
        if (j != -1) {
            pa2VarF.i("maximumSize", String.valueOf(j));
        }
        long j2 = this.d;
        if (j2 != -1) {
            pa2VarF.i("maximumWeight", String.valueOf(j2));
        }
        if (this.h != -1) {
            pa2VarF.h("expireAfterWrite", bl4.s(this.h, "ns", new StringBuilder()));
        }
        if (this.i != -1) {
            pa2VarF.h("expireAfterAccess", bl4.s(this.i, "ns", new StringBuilder()));
        }
        LocalCache$Strength localCache$Strength = this.f;
        if (localCache$Strength != null) {
            pa2VarF.h("keyStrength", wu8.L(localCache$Strength.toString()));
        }
        LocalCache$Strength localCache$Strength2 = this.g;
        if (localCache$Strength2 != null) {
            pa2VarF.h("valueStrength", wu8.L(localCache$Strength2.toString()));
        }
        if (this.j != null) {
            pa2 pa2Var = new pa2(17, false);
            ((pa2) pa2VarF.d).d = pa2Var;
            pa2VarF.d = pa2Var;
            pa2Var.c = "keyEquivalence";
        }
        if (this.k != null) {
            pa2 pa2Var2 = new pa2(17, false);
            ((pa2) pa2VarF.d).d = pa2Var2;
            pa2VarF.d = pa2Var2;
            pa2Var2.c = "valueEquivalence";
        }
        if (this.l != null) {
            pa2 pa2Var3 = new pa2(17, false);
            ((pa2) pa2VarF.d).d = pa2Var3;
            pa2VarF.d = pa2Var3;
            pa2Var3.c = "removalListener";
        }
        return pa2VarF.toString();
    }
}
