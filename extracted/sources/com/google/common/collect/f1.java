package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap;
import defpackage.ai4;
import defpackage.bi4;
import defpackage.sh4;
import defpackage.vh4;

/* JADX INFO: loaded from: classes.dex */
public final class f1 implements d1 {
    public static final f1 a = new f1();

    @Override // com.google.common.collect.d1
    public final MapMakerInternalMap.Segment a(MapMakerInternalMap mapMakerInternalMap, int i) {
        return new MapMakerInternalMap.StrongKeyWeakValueSegment(mapMakerInternalMap, i);
    }

    @Override // com.google.common.collect.d1
    public final MapMakerInternalMap.Strength b() {
        return MapMakerInternalMap.Strength.a;
    }

    @Override // com.google.common.collect.d1
    public final void c(MapMakerInternalMap.Segment segment, sh4 sh4Var, Object obj) {
        g1 g1Var = (g1) sh4Var;
        ai4 ai4Var = g1Var.c;
        g1Var.c = new bi4(((MapMakerInternalMap.StrongKeyWeakValueSegment) segment).h, obj, g1Var);
        ai4Var.clear();
    }

    @Override // com.google.common.collect.d1
    public final MapMakerInternalMap.Strength d() {
        return MapMakerInternalMap.Strength.b;
    }

    @Override // com.google.common.collect.d1
    public final sh4 e(MapMakerInternalMap.Segment segment, Object obj, int i, sh4 sh4Var) {
        g1 g1Var = (g1) sh4Var;
        return g1Var == null ? new g1(i, obj) : new vh4(obj, i, g1Var);
    }

    @Override // com.google.common.collect.d1
    public final sh4 f(MapMakerInternalMap.Segment segment, sh4 sh4Var, sh4 sh4Var2) {
        MapMakerInternalMap.StrongKeyWeakValueSegment strongKeyWeakValueSegment = (MapMakerInternalMap.StrongKeyWeakValueSegment) segment;
        g1 g1Var = (g1) sh4Var;
        g1 g1Var2 = (g1) sh4Var2;
        int i = MapMakerInternalMap.Segment.g;
        if (g1Var.getValue() == null) {
            return null;
        }
        Object obj = g1Var.a;
        int i2 = g1Var.b;
        g1 g1Var3 = g1Var2 == null ? new g1(i2, obj) : new vh4(obj, i2, g1Var2);
        g1Var3.c = g1Var.c.a(strongKeyWeakValueSegment.h, g1Var3);
        return g1Var3;
    }
}
