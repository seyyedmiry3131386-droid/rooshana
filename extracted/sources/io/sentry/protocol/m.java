package io.sentry.protocol;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.rm7;
import io.sentry.SentryAttributeType;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements g2 {
    public final /* synthetic */ int a = 1;
    public final String b;
    public final Object c;
    public AbstractMap d;

    public m(String str, Object obj) {
        this.b = str;
        if (obj == null || !str.equals("string")) {
            this.c = obj;
        } else {
            this.c = obj.toString();
        }
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) throws IOException {
        switch (this.a) {
            case 0:
                io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
                cVar.d();
                cVar.q(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                cVar.y((Number) this.c);
                String str = this.b;
                if (str != null) {
                    cVar.q("unit");
                    cVar.z(str);
                }
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.d;
                if (concurrentHashMap != null) {
                    for (K k : concurrentHashMap.keySet()) {
                        rm7.z((ConcurrentHashMap) this.d, k, cVar, k, u0Var);
                    }
                }
                cVar.n();
                break;
            default:
                io.sentry.internal.debugmeta.c cVar2 = (io.sentry.internal.debugmeta.c) i3Var;
                cVar2.d();
                cVar2.q("type");
                cVar2.w(u0Var, this.b);
                cVar2.q(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                cVar2.w(u0Var, this.c);
                HashMap map = (HashMap) this.d;
                if (map != null) {
                    for (String str2 : map.keySet()) {
                        rm7.y((HashMap) this.d, str2, cVar2, str2, u0Var);
                    }
                }
                cVar2.n();
                break;
        }
    }

    public m(SentryAttributeType sentryAttributeType, Object obj) {
        this(sentryAttributeType.apiName(), obj);
    }

    public m(Number number, String str) {
        this.c = number;
        this.b = str;
    }
}
