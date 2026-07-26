package io.sentry.protocol;

import defpackage.rm7;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 implements g2 {
    public String a;
    public String b;
    public String c;
    public String d;
    public Double e;
    public Double f;
    public Double g;
    public Double h;
    public String i;
    public Double j;
    public List k;
    public HashMap l;

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        if (this.a != null) {
            cVar.q("rendering_system");
            cVar.z(this.a);
        }
        if (this.b != null) {
            cVar.q("type");
            cVar.z(this.b);
        }
        if (this.c != null) {
            cVar.q("identifier");
            cVar.z(this.c);
        }
        if (this.d != null) {
            cVar.q("tag");
            cVar.z(this.d);
        }
        if (this.e != null) {
            cVar.q("width");
            cVar.y(this.e);
        }
        if (this.f != null) {
            cVar.q("height");
            cVar.y(this.f);
        }
        if (this.g != null) {
            cVar.q("x");
            cVar.y(this.g);
        }
        if (this.h != null) {
            cVar.q("y");
            cVar.y(this.h);
        }
        if (this.i != null) {
            cVar.q("visibility");
            cVar.z(this.i);
        }
        if (this.j != null) {
            cVar.q("alpha");
            cVar.y(this.j);
        }
        List list = this.k;
        if (list != null && !list.isEmpty()) {
            cVar.q("children");
            cVar.w(u0Var, this.k);
        }
        HashMap map = this.l;
        if (map != null) {
            for (String str : map.keySet()) {
                rm7.y(this.l, str, cVar, str, u0Var);
            }
        }
        cVar.n();
    }
}
