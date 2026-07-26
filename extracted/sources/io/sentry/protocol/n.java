package io.sentry.protocol;

import defpackage.rm7;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements g2 {
    public String a;
    public String b;
    public String c;
    public Boolean d;
    public AbstractMap e;
    public ConcurrentHashMap f;
    public Boolean g;
    public Integer h;
    public Integer i;
    public Boolean j;
    public HashMap k;

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        if (this.a != null) {
            cVar.q("type");
            cVar.z(this.a);
        }
        if (this.b != null) {
            cVar.q(PackageListMetaDataDTO.KEY_DESCRIPTION);
            cVar.z(this.b);
        }
        if (this.c != null) {
            cVar.q("help_link");
            cVar.z(this.c);
        }
        if (this.d != null) {
            cVar.q("handled");
            cVar.x(this.d);
        }
        if (this.e != null) {
            cVar.q("meta");
            cVar.w(u0Var, this.e);
        }
        if (this.f != null) {
            cVar.q("data");
            cVar.w(u0Var, this.f);
        }
        if (this.g != null) {
            cVar.q("synthetic");
            cVar.x(this.g);
        }
        if (this.h != null) {
            cVar.q("exception_id");
            cVar.w(u0Var, this.h);
        }
        if (this.i != null) {
            cVar.q("parent_id");
            cVar.w(u0Var, this.i);
        }
        if (this.j != null) {
            cVar.q("is_exception_group");
            cVar.x(this.j);
        }
        HashMap map = this.k;
        if (map != null) {
            for (String str : map.keySet()) {
                rm7.y(this.k, str, cVar, str, u0Var);
            }
        }
        cVar.n();
    }
}
