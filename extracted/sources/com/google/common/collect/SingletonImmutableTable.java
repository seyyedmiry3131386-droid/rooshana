package com.google.common.collect;

import com.google.common.collect.ImmutableTable;
import defpackage.vy2;

/* JADX INFO: loaded from: classes.dex */
class SingletonImmutableTable<R, C, V> extends ImmutableTable<R, C, V> {
    public final Object c;
    public final Object d;
    public final Object e;

    public SingletonImmutableTable(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        this.c = obj;
        obj2.getClass();
        this.d = obj2;
        obj3.getClass();
        this.e = obj3;
    }

    @Override // com.google.common.collect.ImmutableTable
    public final ImmutableMap j() {
        Object obj = this.c;
        Object obj2 = this.e;
        vy2.k(obj, obj2);
        RegularImmutableMap regularImmutableMapP = RegularImmutableMap.p(1, new Object[]{obj, obj2}, null);
        Object obj3 = this.d;
        vy2.k(obj3, regularImmutableMapP);
        return RegularImmutableMap.p(1, new Object[]{obj3, regularImmutableMapP}, null);
    }

    @Override // com.google.common.collect.ImmutableTable, defpackage.z2
    /* JADX INFO: renamed from: k */
    public final ImmutableSet e() {
        u1 u1VarH = ImmutableTable.h(this.c, this.d, this.e);
        int i = ImmutableSet.c;
        return new SingletonImmutableSet(u1VarH);
    }

    @Override // com.google.common.collect.ImmutableTable
    /* JADX INFO: renamed from: l */
    public final ImmutableCollection m() {
        int i = ImmutableSet.c;
        return new SingletonImmutableSet(this.e);
    }

    @Override // com.google.common.collect.ImmutableTable, defpackage.he8
    /* JADX INFO: renamed from: n */
    public final ImmutableMap f() {
        Object obj = this.d;
        Object obj2 = this.e;
        vy2.k(obj, obj2);
        RegularImmutableMap regularImmutableMapP = RegularImmutableMap.p(1, new Object[]{obj, obj2}, null);
        Object obj3 = this.c;
        vy2.k(obj3, regularImmutableMapP);
        return RegularImmutableMap.p(1, new Object[]{obj3, regularImmutableMapP}, null);
    }

    @Override // defpackage.he8
    public final int size() {
        return 1;
    }

    @Override // com.google.common.collect.ImmutableTable
    public Object writeReplace() {
        return ImmutableTable.SerializedForm.a(this, new int[]{0}, new int[]{0});
    }
}
