package defpackage;

import io.sentry.SentryLevel;
import io.sentry.android.core.AppComponentsBreadcrumbsIntegration;
import io.sentry.f;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s59 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ s59(n00 n00Var, int i, long j) {
        this.a = 0;
        this.b = n00Var;
        this.d = i;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.d;
        long j = this.c;
        Object obj = this.b;
        switch (i) {
            case 0:
                b62 b62Var = ((n00) obj).c;
                String str = j29.a;
                hd1 hd1Var = b62Var.a.s;
                be beVarX = hd1Var.X((ks4) hd1Var.d.e);
                hd1Var.b0(beVarX, 1018, new tc1(i2, j, beVarX));
                break;
            case 1:
                b62 b62Var2 = ((n00) obj).c;
                String str2 = j29.a;
                hd1 hd1Var2 = b62Var2.a.s;
                be beVarX2 = hd1Var2.X((ks4) hd1Var2.d.e);
                hd1Var2.b0(beVarX2, 1021, new l31(i2, j, beVarX2));
                break;
            default:
                AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration = (AppComponentsBreadcrumbsIntegration) obj;
                if (appComponentsBreadcrumbsIntegration.b != null) {
                    f fVar = new f(j);
                    fVar.e = "system";
                    fVar.g = "device.event";
                    fVar.d = "Low memory";
                    fVar.c("LOW_MEMORY", PackageListMetaDataDTO.KEY_ACTION);
                    fVar.c(Integer.valueOf(i2), "level");
                    fVar.i = SentryLevel.WARNING;
                    appComponentsBreadcrumbsIntegration.b.h(fVar, AppComponentsBreadcrumbsIntegration.e);
                }
                break;
        }
    }

    public /* synthetic */ s59(Object obj, long j, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = j;
        this.d = i;
    }
}
