package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap;
import defpackage.sh4;
import defpackage.wh4;
import defpackage.xh4;

/* JADX INFO: loaded from: classes.dex */
public final class h1 implements d1 {
    public static final h1 a = new h1();

    @Override // com.google.common.collect.d1
    public final MapMakerInternalMap.Segment a(MapMakerInternalMap mapMakerInternalMap, int i) {
        return new MapMakerInternalMap.WeakKeyStrongValueSegment(mapMakerInternalMap, i);
    }

    @Override // com.google.common.collect.d1
    public final MapMakerInternalMap.Strength b() {
        return MapMakerInternalMap.Strength.b;
    }

    @Override // com.google.common.collect.d1
    public final void c(MapMakerInternalMap.Segment segment, sh4 sh4Var, Object obj) {
        ((xh4) sh4Var).b = obj;
    }

    @Override // com.google.common.collect.d1
    public final MapMakerInternalMap.Strength d() {
        return MapMakerInternalMap.Strength.a;
    }

    @Override // com.google.common.collect.d1
    public final sh4 e(MapMakerInternalMap.Segment segment, Object obj, int i, sh4 sh4Var) {
        MapMakerInternalMap.WeakKeyStrongValueSegment weakKeyStrongValueSegment = (MapMakerInternalMap.WeakKeyStrongValueSegment) segment;
        xh4 xh4Var = (xh4) sh4Var;
        return xh4Var == null ? new xh4(weakKeyStrongValueSegment.h, obj, i) : new wh4(weakKeyStrongValueSegment.h, obj, i, xh4Var);
    }

    @Override // com.google.common.collect.d1
    public final sh4 f(MapMakerInternalMap.Segment segment, sh4 sh4Var, sh4 sh4Var2) {
        MapMakerInternalMap.WeakKeyStrongValueSegment weakKeyStrongValueSegment = (MapMakerInternalMap.WeakKeyStrongValueSegment) segment;
        xh4 xh4Var = (xh4) sh4Var;
        xh4 xh4Var2 = (xh4) sh4Var2;
        T t = xh4Var.get();
        if (t == 0) {
            return null;
        }
        int i = xh4Var.a;
        xh4 xh4Var3 = xh4Var2 == null ? new xh4(weakKeyStrongValueSegment.h, t, i) : new wh4(weakKeyStrongValueSegment.h, t, i, xh4Var2);
        xh4Var3.b = xh4Var.b;
        return xh4Var3;
    }
}
