package io.sentry;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.dw1;
import defpackage.rm7;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class t6 implements g2 {
    public final io.sentry.protocol.v a;
    public final String b;
    public final String c;
    public final String d;
    public HashMap e;

    public t6(io.sentry.protocol.v vVar, String str, String str2, String str3) {
        this.a = vVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        cVar.q("event_id");
        this.a.serialize(cVar, u0Var);
        String str = this.b;
        if (str != null) {
            cVar.q(AppMeasurementSdk.ConditionalUserProperty.NAME);
            cVar.z(str);
        }
        String str2 = this.c;
        if (str2 != null) {
            cVar.q("email");
            cVar.z(str2);
        }
        String str3 = this.d;
        if (str3 != null) {
            cVar.q("comments");
            cVar.z(str3);
        }
        HashMap map = this.e;
        if (map != null) {
            for (String str4 : map.keySet()) {
                rm7.y(this.e, str4, cVar, str4, u0Var);
            }
        }
        cVar.n();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserFeedback{eventId=");
        sb.append(this.a);
        sb.append(", name='");
        sb.append(this.b);
        sb.append("', email='");
        sb.append(this.c);
        sb.append("', comments='");
        return dw1.s(sb, this.d, "'}");
    }
}
