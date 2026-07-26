package io.sentry;

import defpackage.rm7;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c6 extends k4 implements g2 {
    public File p;
    public int t;
    public Date v;
    public HashMap z;
    public io.sentry.protocol.v s = new io.sentry.protocol.v();
    public String q = "replay_event";
    public SentryReplayEvent$ReplayType r = SentryReplayEvent$ReplayType.SESSION;
    public List x = new ArrayList();
    public List y = new ArrayList();
    public List w = new ArrayList();
    public Date u = io.sentry.config.a.z();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c6.class == obj.getClass()) {
            c6 c6Var = (c6) obj;
            if (this.t == c6Var.t && io.sentry.config.a.t(this.q, c6Var.q) && this.r == c6Var.r && io.sentry.config.a.t(this.s, c6Var.s) && io.sentry.config.a.t(this.w, c6Var.w) && io.sentry.config.a.t(this.x, c6Var.x) && io.sentry.config.a.t(this.y, c6Var.y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.q, this.r, this.s, Integer.valueOf(this.t), this.w, this.x, this.y});
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        cVar.q("type");
        cVar.z(this.q);
        cVar.q("replay_type");
        cVar.w(u0Var, this.r);
        cVar.q("segment_id");
        cVar.v(this.t);
        cVar.q("timestamp");
        cVar.w(u0Var, this.u);
        if (this.s != null) {
            cVar.q("replay_id");
            cVar.w(u0Var, this.s);
        }
        if (this.v != null) {
            cVar.q("replay_start_timestamp");
            cVar.w(u0Var, this.v);
        }
        if (this.w != null) {
            cVar.q("urls");
            cVar.w(u0Var, this.w);
        }
        if (this.x != null) {
            cVar.q("error_ids");
            cVar.w(u0Var, this.x);
        }
        if (this.y != null) {
            cVar.q("trace_ids");
            cVar.w(u0Var, this.y);
        }
        io.sentry.config.a.X(this, cVar, u0Var);
        HashMap map = this.z;
        if (map != null) {
            for (String str : map.keySet()) {
                rm7.y(this.z, str, cVar, str, u0Var);
            }
        }
        cVar.n();
    }
}
