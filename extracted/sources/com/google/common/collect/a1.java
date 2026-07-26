package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap;
import defpackage.gu9;
import defpackage.oh4;
import defpackage.pa2;
import defpackage.wn5;
import defpackage.wu8;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public final class a1 {
    public boolean a;
    public int b = -1;
    public int c = -1;
    public MapMakerInternalMap.Strength d;
    public MapMakerInternalMap.Strength e;
    public com.google.common.base.a f;

    public final ConcurrentMap a() {
        if (!this.a) {
            int i = this.b;
            if (i == -1) {
                i = 16;
            }
            int i2 = this.c;
            if (i2 == -1) {
                i2 = 4;
            }
            return new ConcurrentHashMap(i, 0.75f, i2);
        }
        oh4 oh4Var = MapMakerInternalMap.j;
        MapMakerInternalMap.Strength strength = this.d;
        MapMakerInternalMap.Strength.AnonymousClass1 anonymousClass1 = MapMakerInternalMap.Strength.a;
        if (((MapMakerInternalMap.Strength) gu9.p(strength, anonymousClass1)) == anonymousClass1 && ((MapMakerInternalMap.Strength) gu9.p(this.e, anonymousClass1)) == anonymousClass1) {
            return new MapMakerInternalMap(this, e1.a);
        }
        MapMakerInternalMap.Strength strength2 = (MapMakerInternalMap.Strength) gu9.p(this.d, anonymousClass1);
        MapMakerInternalMap.Strength.AnonymousClass2 anonymousClass2 = MapMakerInternalMap.Strength.b;
        if (strength2 == anonymousClass1 && ((MapMakerInternalMap.Strength) gu9.p(this.e, anonymousClass1)) == anonymousClass2) {
            return new MapMakerInternalMap(this, f1.a);
        }
        if (((MapMakerInternalMap.Strength) gu9.p(this.d, anonymousClass1)) == anonymousClass2 && ((MapMakerInternalMap.Strength) gu9.p(this.e, anonymousClass1)) == anonymousClass1) {
            return new MapMakerInternalMap(this, h1.a);
        }
        if (((MapMakerInternalMap.Strength) gu9.p(this.d, anonymousClass1)) == anonymousClass2 && ((MapMakerInternalMap.Strength) gu9.p(this.e, anonymousClass1)) == anonymousClass2) {
            return new MapMakerInternalMap(this, i1.a);
        }
        throw new AssertionError();
    }

    public final void b() {
        MapMakerInternalMap.Strength strength = this.d;
        wn5.q(strength, "Key strength was already set to %s", strength == null);
        this.d = MapMakerInternalMap.Strength.b;
        this.a = true;
    }

    public final String toString() {
        pa2 pa2VarF = gu9.F(this);
        int i = this.b;
        if (i != -1) {
            pa2VarF.i("initialCapacity", String.valueOf(i));
        }
        int i2 = this.c;
        if (i2 != -1) {
            pa2VarF.i("concurrencyLevel", String.valueOf(i2));
        }
        MapMakerInternalMap.Strength strength = this.d;
        if (strength != null) {
            pa2VarF.h("keyStrength", wu8.L(strength.toString()));
        }
        MapMakerInternalMap.Strength strength2 = this.e;
        if (strength2 != null) {
            pa2VarF.h("valueStrength", wu8.L(strength2.toString()));
        }
        if (this.f != null) {
            pa2 pa2Var = new pa2(17, false);
            ((pa2) pa2VarF.d).d = pa2Var;
            pa2VarF.d = pa2Var;
            pa2Var.c = "keyEquivalence";
        }
        return pa2VarF.toString();
    }
}
