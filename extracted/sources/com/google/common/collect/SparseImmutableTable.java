package com.google.common.collect;

import com.google.common.collect.ImmutableTable;
import defpackage.hs9;
import defpackage.mj3;
import defpackage.sb7;
import defpackage.zx8;
import j$.util.Objects;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class SparseImmutableTable<R, C, V> extends RegularImmutableTable<R, C, V> {
    public static final ImmutableTable g;
    public final ImmutableMap c;
    public final ImmutableMap d;
    public final int[] e;
    public final int[] f;

    static {
        mj3 mj3Var = ImmutableList.b;
        ImmutableList immutableList = RegularImmutableList.e;
        int i = ImmutableSet.c;
        RegularImmutableSet regularImmutableSet = RegularImmutableSet.j;
        g = new SparseImmutableTable(immutableList, regularImmutableSet, regularImmutableSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SparseImmutableTable(ImmutableList immutableList, ImmutableSet immutableSet, ImmutableSet immutableSet2) {
        ImmutableMap immutableMapH = hs9.H(immutableSet);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        zx8 it = immutableSet.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), new LinkedHashMap());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        zx8 it2 = immutableSet2.iterator();
        while (it2.hasNext()) {
            linkedHashMap2.put(it2.next(), new LinkedHashMap());
        }
        int[] iArr = new int[immutableList.size()];
        int[] iArr2 = new int[immutableList.size()];
        for (int i = 0; i < immutableList.size(); i++) {
            Tables$ImmutableCell tables$ImmutableCell = (Tables$ImmutableCell) ((u1) immutableList.get(i));
            Object obj = tables$ImmutableCell.a;
            Object obj2 = tables$ImmutableCell.b;
            Object obj3 = tables$ImmutableCell.c;
            Integer num = (Integer) ((RegularImmutableMap) immutableMapH).get(obj);
            Objects.requireNonNull(num);
            iArr[i] = num.intValue();
            Map map = (Map) linkedHashMap.get(obj);
            Objects.requireNonNull(map);
            iArr2[i] = map.size();
            Object objPut = map.put(obj2, obj3);
            if (!(objPut == null)) {
                throw new IllegalArgumentException(sb7.o("Duplicate key: (row=%s, column=%s), values: [%s, %s].", obj, obj2, obj3, objPut));
            }
            Map map2 = (Map) linkedHashMap2.get(obj2);
            Objects.requireNonNull(map2);
            map2.put(obj, obj3);
        }
        this.e = iArr;
        this.f = iArr2;
        j0 j0Var = new j0(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            j0Var.c(entry.getKey(), ImmutableMap.b((Map) entry.getValue()));
        }
        this.c = j0Var.a(true);
        j0 j0Var2 = new j0(linkedHashMap2.size());
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            j0Var2.c(entry2.getKey(), ImmutableMap.b((Map) entry2.getValue()));
        }
        this.d = j0Var2.a(true);
    }

    @Override // com.google.common.collect.ImmutableTable, defpackage.he8
    public final Map f() {
        return ImmutableMap.b(this.c);
    }

    @Override // com.google.common.collect.ImmutableTable
    public final ImmutableMap j() {
        return ImmutableMap.b(this.d);
    }

    @Override // com.google.common.collect.ImmutableTable
    /* JADX INFO: renamed from: n */
    public final ImmutableMap f() {
        return ImmutableMap.b(this.c);
    }

    @Override // com.google.common.collect.RegularImmutableTable
    public final u1 o(int i) {
        Map.Entry entry = (Map.Entry) this.c.entrySet().a().get(this.e[i]);
        ImmutableMap immutableMap = (ImmutableMap) entry.getValue();
        Map.Entry entry2 = (Map.Entry) immutableMap.entrySet().a().get(this.f[i]);
        return ImmutableTable.h(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.RegularImmutableTable
    public final Object p(int i) {
        ImmutableMap immutableMap = (ImmutableMap) this.c.values().a().get(this.e[i]);
        return immutableMap.values().a().get(this.f[i]);
    }

    @Override // defpackage.he8
    public final int size() {
        return this.e.length;
    }

    @Override // com.google.common.collect.RegularImmutableTable, com.google.common.collect.ImmutableTable
    public Object writeReplace() {
        ImmutableMap immutableMapH = hs9.H(j().keySet());
        int[] iArr = new int[i().size()];
        zx8 it = i().iterator();
        int i = 0;
        while (it.hasNext()) {
            Integer num = (Integer) ((RegularImmutableMap) immutableMapH).get(((Tables$ImmutableCell) ((u1) it.next())).b);
            Objects.requireNonNull(num);
            iArr[i] = num.intValue();
            i++;
        }
        return ImmutableTable.SerializedForm.a(this, this.e, iArr);
    }
}
