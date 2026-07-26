package defpackage;

import android.content.res.Configuration;
import io.sentry.SentryLevel;
import io.sentry.android.core.AppComponentsBreadcrumbsIntegration;
import io.sentry.f;
import io.sentry.h0;
import io.sentry.protocol.Device$DeviceOrientation;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q59 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q59(n00 n00Var, Object obj, long j) {
        this.c = n00Var;
        this.d = obj;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.d;
        long j = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                b62 b62Var = ((n00) obj2).c;
                String str = j29.a;
                e62 e62Var = b62Var.a;
                hd1 hd1Var = e62Var.s;
                be beVarA0 = hd1Var.a0();
                hd1Var.b0(beVarA0, 26, new j2(beVarA0, obj, j));
                if (e62Var.R == obj) {
                    e62Var.m.f(26, new vv1(12));
                }
                break;
            default:
                AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration = (AppComponentsBreadcrumbsIntegration) obj2;
                Configuration configuration = (Configuration) obj;
                if (appComponentsBreadcrumbsIntegration.b != null) {
                    int i2 = appComponentsBreadcrumbsIntegration.a.getResources().getConfiguration().orientation;
                    Device$DeviceOrientation device$DeviceOrientation = i2 != 1 ? i2 != 2 ? null : Device$DeviceOrientation.LANDSCAPE : Device$DeviceOrientation.PORTRAIT;
                    String lowerCase = device$DeviceOrientation != null ? device$DeviceOrientation.name().toLowerCase(Locale.ROOT) : "undefined";
                    f fVar = new f(j);
                    fVar.e = "navigation";
                    fVar.g = "device.orientation";
                    fVar.c(lowerCase, "position");
                    fVar.i = SentryLevel.INFO;
                    h0 h0Var = new h0();
                    h0Var.d(configuration, "android:configuration");
                    appComponentsBreadcrumbsIntegration.b.h(fVar, h0Var);
                }
                break;
        }
    }

    public /* synthetic */ q59(AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration, long j, Configuration configuration) {
        this.c = appComponentsBreadcrumbsIntegration;
        this.b = j;
        this.d = configuration;
    }
}
