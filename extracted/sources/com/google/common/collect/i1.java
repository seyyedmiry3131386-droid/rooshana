package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap;
import defpackage.ai4;
import defpackage.bi4;
import defpackage.sh4;
import defpackage.yh4;

/* JADX INFO: loaded from: classes.dex */
public final class i1 implements d1 {
    public static final i1 a = new i1();

    @Override // com.google.common.collect.d1
    public final MapMakerInternalMap.Segment a(MapMakerInternalMap mapMakerInternalMap, int i) {
        return new MapMakerInternalMap.WeakKeyWeakValueSegment(mapMakerInternalMap, i);
    }

    @Override // com.google.common.collect.d1
    public final MapMakerInternalMap.Strength b() {
        return MapMakerInternalMap.Strength.b;
    }

    @Override // com.google.common.collect.d1
    public final void c(MapMakerInternalMap.Segment segment, sh4 sh4Var, Object obj) {
        j1 j1Var = (j1) sh4Var;
        ai4 ai4Var = j1Var.b;
        j1Var.b = new bi4(((MapMakerInternalMap.WeakKeyWeakValueSegment) segment).i, obj, j1Var);
        ai4Var.clear();
    }

    @Override // com.google.common.collect.d1
    public final MapMakerInternalMap.Strength d() {
        return MapMakerInternalMap.Strength.b;
    }

    @Override // com.google.common.collect.d1
    public final sh4 e(MapMakerInternalMap.Segment segment, Object obj, int i, sh4 sh4Var) {
        MapMakerInternalMap.WeakKeyWeakValueSegment weakKeyWeakValueSegment = (MapMakerInternalMap.WeakKeyWeakValueSegment) segment;
        j1 j1Var = (j1) sh4Var;
        return j1Var == null ? new j1(weakKeyWeakValueSegment.h, obj, i) : new yh4(weakKeyWeakValueSegment.h, obj, i, j1Var);
    }

    @Override // com.google.common.collect.d1
    public final sh4 f(MapMakerInternalMap.Segment segment, sh4 sh4Var, sh4 sh4Var2) {
        MapMakerInternalMap.WeakKeyWeakValueSegment weakKeyWeakValueSegment = (MapMakerInternalMap.WeakKeyWeakValueSegment) segment;
        j1 j1Var = (j1) sh4Var;
        j1 j1Var2 = (j1) sh4Var2;
        T t = j1Var.get();
        if (t == 0) {
            return null;
        }
        int i = MapMakerInternalMap.Segment.g;
        if (j1Var.b.get() == null) {
            return null;
        }
        int i2 = j1Var.a;
        j1 j1Var3 = j1Var2 == null ? new j1(weakKeyWeakValueSegment.h, t, i2) : new yh4(weakKeyWeakValueSegment.h, t, i2, j1Var2);
        j1Var3.b = j1Var.b.a(weakKeyWeakValueSegment.i, j1Var3);
        return j1Var3;
    }
}
