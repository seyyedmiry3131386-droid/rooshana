package com.google.common.collect;

import defpackage.d94;
import defpackage.ga5;
import defpackage.js3;
import defpackage.wn5;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class n1 {
    public final /* synthetic */ js3 a;

    public n1(js3 js3Var) {
        this.a = js3Var;
    }

    public static ga5 b() {
        NaturalOrdering naturalOrdering = NaturalOrdering.c;
        naturalOrdering.getClass();
        return new ga5(naturalOrdering);
    }

    public final d94 a() {
        Map mapW = this.a.w();
        MultimapBuilder$ArrayListSupplier multimapBuilder$ArrayListSupplier = new MultimapBuilder$ArrayListSupplier();
        Multimaps$CustomListMultimap multimaps$CustomListMultimap = new Multimaps$CustomListMultimap();
        wn5.j(mapW.isEmpty());
        multimaps$CustomListMultimap.f = mapW;
        multimaps$CustomListMultimap.h = multimapBuilder$ArrayListSupplier;
        return multimaps$CustomListMultimap;
    }
}
