package androidx.privacysandbox.ads.adservices.measurement;

import android.content.Context;
import android.os.Build;
import defpackage.dp2;
import defpackage.il4;
import defpackage.is3;
import defpackage.js3;
import defpackage.qb;
import defpackage.rb;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static is3 a(final Context context) {
        int i = Build.VERSION.SDK_INT;
        rb rbVar = rb.a;
        if (i >= 33) {
            rbVar.a();
        }
        if ((i >= 33 ? rbVar.a() : 0) >= 5) {
            return new il4(context, 1);
        }
        qb qbVar = qb.a;
        Object objInvoke = null;
        if (((i == 31 || i == 32) ? qbVar.a() : 0) < 9) {
            return null;
        }
        try {
            objInvoke = new dp2() { // from class: androidx.privacysandbox.ads.adservices.measurement.MeasurementManager$Companion$obtain$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.dp2
                public final Object invoke(Object obj) {
                    js3.p((Context) obj, "it");
                    return new il4(context, 0);
                }
            }.invoke(context);
        } catch (NoClassDefFoundError unused) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 == 31 || i2 == 32) {
                qbVar.a();
            }
        }
        return (is3) objInvoke;
    }
}
