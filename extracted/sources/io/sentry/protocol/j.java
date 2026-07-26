package io.sentry.protocol;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements g2 {
    public String a;
    public String b;
    public String c;
    public v d;
    public v e;
    public String f;
    public AbstractMap g;

    public j(String str) {
        if (str.length() > 4096) {
            this.a = str.substring(0, 4096);
        } else {
            this.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return io.sentry.config.a.t(this.a, jVar.a) && io.sentry.config.a.t(this.b, jVar.b) && io.sentry.config.a.t(this.c, jVar.c) && io.sentry.config.a.t(this.d, jVar.d) && io.sentry.config.a.t(this.e, jVar.e) && io.sentry.config.a.t(this.f, jVar.f) && io.sentry.config.a.t(this.g, jVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g});
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        cVar.q("message");
        cVar.z(this.a);
        if (this.b != null) {
            cVar.q("contact_email");
            cVar.z(this.b);
        }
        if (this.c != null) {
            cVar.q(AppMeasurementSdk.ConditionalUserProperty.NAME);
            cVar.z(this.c);
        }
        if (this.d != null) {
            cVar.q("associated_event_id");
            this.d.serialize(cVar, u0Var);
        }
        if (this.e != null) {
            cVar.q("replay_id");
            this.e.serialize(cVar, u0Var);
        }
        if (this.f != null) {
            cVar.q("url");
            cVar.z(this.f);
        }
        AbstractMap abstractMap = this.g;
        if (abstractMap != null) {
            for (String str : abstractMap.keySet()) {
                Object obj = this.g.get(str);
                cVar.q(str);
                cVar.w(u0Var, obj);
            }
        }
        cVar.n();
    }

    public final String toString() {
        return "Feedback{message='" + this.a + "', contactEmail='" + this.b + "', name='" + this.c + "', associatedEventId=" + this.d + ", replayId=" + this.e + ", url='" + this.f + "', unknown=" + this.g + '}';
    }
}
