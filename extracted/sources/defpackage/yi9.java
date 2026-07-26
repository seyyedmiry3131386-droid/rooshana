package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.TelemetryData;

/* JADX INFO: loaded from: classes.dex */
public final class yi9 extends fu2 implements kf8 {
    public static final qq4 l = new qq4("ClientNotification.API", new qh9(2), new th0(26));
    public static final qq4 m = new qq4("ClientTelemetry.API", new qh9(3), new th0(26));
    public static final qq4 n = new qq4("SmsRetriever.API", new qh9(6), new th0(26));
    public static int o = 1;

    public ox9 g(TelemetryData telemetryData) {
        cf0 cf0VarB = cf0.b();
        cf0VarB.e = new Feature[]{gu9.d};
        cf0VarB.c = false;
        cf0VarB.d = new t15(19, telemetryData);
        return f(2, cf0VarB.a());
    }

    public synchronized int h() {
        int i;
        try {
            i = o;
            if (i == 1) {
                Context context = this.a;
                gu2 gu2Var = gu2.e;
                int iB = gu2Var.b(context, 12451000);
                if (iB == 0) {
                    i = 4;
                    o = 4;
                } else if (gu2Var.a(iB, context, null) != null || sy1.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    i = 2;
                    o = 2;
                } else {
                    i = 3;
                    o = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }
}
