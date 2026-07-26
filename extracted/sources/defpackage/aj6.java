package defpackage;

import android.content.Context;
import androidx.datastore.preferences.core.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class aj6 {
    public final String a;
    public final ut4 b;
    public final dp2 c;
    public final e71 d;
    public final Object e;
    public volatile a f;

    public aj6(String str, ut4 ut4Var, dp2 dp2Var, e71 e71Var) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.a = str;
        this.b = ut4Var;
        this.c = dp2Var;
        this.d = e71Var;
        this.e = new Object();
    }

    public final Object a(Object obj, ox3 ox3Var) {
        a aVar;
        Context context = (Context) obj;
        js3.p(context, "thisRef");
        js3.p(ox3Var, "property");
        a aVar2 = this.f;
        if (aVar2 != null) {
            return aVar2;
        }
        synchronized (this.e) {
            try {
                if (this.f == null) {
                    Context applicationContext = context.getApplicationContext();
                    ut4 ut4Var = this.b;
                    dp2 dp2Var = this.c;
                    js3.m(applicationContext);
                    List list = (List) dp2Var.invoke(applicationContext);
                    e71 e71Var = this.d;
                    xv3 xv3Var = new xv3(applicationContext, this, 14);
                    js3.p(list, "migrations");
                    this.f = new a(new a(androidx.datastore.core.a.c(new sb2(new o06(9, xv3Var)), ut4Var, list, e71Var)));
                }
                aVar = this.f;
                js3.m(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }
}
