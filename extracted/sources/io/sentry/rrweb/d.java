package io.sentry.rrweb;

import defpackage.rm7;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends c implements g2 {
    public RRWebInteractionEvent$InteractionType d;
    public int e;
    public float f;
    public float g;
    public int h;
    public int i;
    public HashMap j;
    public HashMap k;

    public d() {
        super(RRWebIncrementalSnapshotEvent$IncrementalSource.MouseInteraction);
        this.h = 2;
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        cVar.q("type");
        cVar.w(u0Var, this.a);
        cVar.q("timestamp");
        cVar.v(this.b);
        cVar.q("data");
        cVar.d();
        cVar.q("source");
        cVar.w(u0Var, this.c);
        cVar.q("type");
        cVar.w(u0Var, this.d);
        cVar.q("id");
        cVar.v(this.e);
        cVar.q("x");
        cVar.u(this.f);
        cVar.q("y");
        cVar.u(this.g);
        cVar.q("pointerType");
        cVar.v(this.h);
        cVar.q("pointerId");
        cVar.v(this.i);
        HashMap map = this.k;
        if (map != null) {
            for (String str : map.keySet()) {
                rm7.y(this.k, str, cVar, str, u0Var);
            }
        }
        cVar.n();
        HashMap map2 = this.j;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                rm7.y(this.j, str2, cVar, str2, u0Var);
            }
        }
        cVar.n();
    }
}
