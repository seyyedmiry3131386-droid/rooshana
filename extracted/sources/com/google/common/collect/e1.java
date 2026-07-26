package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap;
import defpackage.sh4;
import defpackage.th4;
import defpackage.uh4;

/* JADX INFO: loaded from: classes.dex */
public final class e1 implements d1 {
    public static final e1 a = new e1();

    @Override // com.google.common.collect.d1
    public final MapMakerInternalMap.Segment a(MapMakerInternalMap mapMakerInternalMap, int i) {
        return new MapMakerInternalMap.StrongKeyStrongValueSegment(mapMakerInternalMap, i);
    }

    @Override // com.google.common.collect.d1
    public final MapMakerInternalMap.Strength b() {
        return MapMakerInternalMap.Strength.a;
    }

    @Override // com.google.common.collect.d1
    public final void c(MapMakerInternalMap.Segment segment, sh4 sh4Var, Object obj) {
        ((uh4) sh4Var).c = obj;
    }

    @Override // com.google.common.collect.d1
    public final MapMakerInternalMap.Strength d() {
        return MapMakerInternalMap.Strength.a;
    }

    @Override // com.google.common.collect.d1
    public final sh4 e(MapMakerInternalMap.Segment segment, Object obj, int i, sh4 sh4Var) {
        uh4 uh4Var = (uh4) sh4Var;
        return uh4Var == null ? new uh4(i, obj) : new th4(obj, i, uh4Var);
    }

    @Override // com.google.common.collect.d1
    public final sh4 f(MapMakerInternalMap.Segment segment, sh4 sh4Var, sh4 sh4Var2) {
        uh4 uh4Var = (uh4) sh4Var;
        uh4 uh4Var2 = (uh4) sh4Var2;
        Object obj = uh4Var.a;
        int i = uh4Var.b;
        uh4 uh4Var3 = uh4Var2 == null ? new uh4(i, obj) : new th4(obj, i, uh4Var2);
        uh4Var3.c = uh4Var.c;
        return uh4Var3;
    }
}
