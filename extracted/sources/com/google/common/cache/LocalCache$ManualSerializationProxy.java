package com.google.common.cache;

import defpackage.ek0;
import defpackage.jl8;
import defpackage.od9;
import defpackage.r37;
import defpackage.sb7;
import defpackage.tj2;
import defpackage.wn5;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
class LocalCache$ManualSerializationProxy<K, V> extends tj2 implements Serializable {
    private static final long serialVersionUID = 1;
    public final int A;
    public final r37 B;
    public final jl8 C;
    public transient ek0 D;
    public final LocalCache$Strength s;
    public final LocalCache$Strength t;
    public final com.google.common.base.a u;
    public final com.google.common.base.a v;
    public final long w;
    public final long x;
    public final long y;
    public final od9 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalCache$ManualSerializationProxy(d dVar) {
        super(16);
        LocalCache$Strength localCache$Strength = dVar.g;
        LocalCache$Strength localCache$Strength2 = dVar.h;
        com.google.common.base.a aVar = dVar.e;
        com.google.common.base.a aVar2 = dVar.f;
        long j = dVar.l;
        long j2 = dVar.k;
        long j3 = dVar.i;
        od9 od9Var = dVar.j;
        int i = dVar.d;
        r37 r37Var = dVar.n;
        jl8 jl8Var = dVar.o;
        this.s = localCache$Strength;
        this.t = localCache$Strength2;
        this.u = aVar;
        this.v = aVar2;
        this.w = j;
        this.x = j2;
        this.y = j3;
        this.z = od9Var;
        this.A = i;
        this.B = r37Var;
        this.C = (jl8Var == jl8.a || jl8Var == a.p) ? null : jl8Var;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        a aVarY = Y();
        aVarY.a();
        this.D = new LocalCache$LocalManualCache(new d(aVarY));
    }

    private Object readResolve() {
        return this.D;
    }

    @Override // defpackage.hs9
    /* JADX INFO: renamed from: A */
    public final Object Y() {
        return this.D;
    }

    public final a Y() {
        boolean z;
        long j;
        a aVar = new a();
        boolean z2 = true;
        aVar.a = true;
        aVar.b = -1;
        aVar.c = -1L;
        aVar.d = -1L;
        aVar.h = -1L;
        aVar.i = -1L;
        aVar.n = a.o;
        LocalCache$Strength localCache$Strength = aVar.f;
        wn5.q(localCache$Strength, "Key strength was already set to %s", localCache$Strength == null);
        LocalCache$Strength localCache$Strength2 = this.s;
        localCache$Strength2.getClass();
        aVar.f = localCache$Strength2;
        LocalCache$Strength localCache$Strength3 = aVar.g;
        wn5.q(localCache$Strength3, "Value strength was already set to %s", localCache$Strength3 == null);
        LocalCache$Strength localCache$Strength4 = this.t;
        localCache$Strength4.getClass();
        aVar.g = localCache$Strength4;
        com.google.common.base.a aVar2 = aVar.j;
        wn5.q(aVar2, "key equivalence was already set to %s", aVar2 == null);
        com.google.common.base.a aVar3 = this.u;
        aVar3.getClass();
        aVar.j = aVar3;
        com.google.common.base.a aVar4 = aVar.k;
        wn5.q(aVar4, "value equivalence was already set to %s", aVar4 == null);
        com.google.common.base.a aVar5 = this.v;
        aVar5.getClass();
        aVar.k = aVar5;
        int i = aVar.b;
        wn5.r("concurrency level was already set to %s", i, i == -1);
        int i2 = this.A;
        wn5.j(i2 > 0);
        aVar.b = i2;
        wn5.t(aVar.l == null);
        r37 r37Var = this.B;
        r37Var.getClass();
        aVar.l = r37Var;
        aVar.a = false;
        long j2 = this.w;
        if (j2 > 0) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long j3 = aVar.h;
            if (j3 == -1) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            j = -1;
            wn5.p(j3, "expireAfterWrite was already set to %s ns", z2);
            if ((j2 >= 0 ? z ? 1 : 0 : null) == null) {
                Object[] objArr = new Object[2];
                objArr[0] = Long.valueOf(j2);
                objArr[z ? 1 : 0] = timeUnit;
                throw new IllegalArgumentException(sb7.o("duration cannot be negative: %s %s", objArr));
            }
            aVar.h = timeUnit.toNanos(j2);
        } else {
            z = true;
            j = -1;
        }
        long j4 = this.x;
        if (j4 > 0) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            long j5 = aVar.i;
            wn5.p(j5, "expireAfterAccess was already set to %s ns", j5 == j ? z ? 1 : 0 : false);
            if ((j4 >= 0 ? z ? 1 : 0 : null) == null) {
                Object[] objArr2 = new Object[2];
                objArr2[0] = Long.valueOf(j4);
                objArr2[z ? 1 : 0] = timeUnit2;
                throw new IllegalArgumentException(sb7.o("duration cannot be negative: %s %s", objArr2));
            }
            aVar.i = timeUnit2.toNanos(j4);
        }
        CacheBuilder$OneWeigher cacheBuilder$OneWeigher = CacheBuilder$OneWeigher.a;
        long j6 = this.y;
        od9 od9Var = this.z;
        if (od9Var != cacheBuilder$OneWeigher) {
            wn5.t(aVar.e == null ? z ? 1 : 0 : false);
            if (aVar.a) {
                long j7 = aVar.c;
                wn5.p(j7, "weigher can not be combined with maximum size (%s provided)", j7 == j ? z ? 1 : 0 : false);
            }
            od9Var.getClass();
            aVar.e = od9Var;
            if (j6 != j) {
                long j8 = aVar.d;
                wn5.p(j8, "maximum weight was already set to %s", j8 == j ? z ? 1 : 0 : false);
                long j9 = aVar.c;
                wn5.p(j9, "maximum size was already set to %s", j9 == j ? z ? 1 : 0 : false);
                wn5.i("maximum weight must not be negative", j6 >= 0 ? z ? 1 : 0 : false);
                aVar.d = j6;
            }
        } else if (j6 != j) {
            long j10 = aVar.c;
            wn5.p(j10, "maximum size was already set to %s", j10 == j ? z ? 1 : 0 : false);
            long j11 = aVar.d;
            wn5.p(j11, "maximum weight was already set to %s", j11 == j ? z ? 1 : 0 : false);
            wn5.s("maximum size can not be combined with weigher", aVar.e == null ? z ? 1 : 0 : false);
            wn5.i("maximum size must not be negative", j6 >= 0 ? z ? 1 : 0 : false);
            aVar.c = j6;
        }
        jl8 jl8Var = this.C;
        if (jl8Var != null) {
            if (aVar.m != null) {
                z = false;
            }
            wn5.t(z);
            aVar.m = jl8Var;
        }
        return aVar;
    }
}
