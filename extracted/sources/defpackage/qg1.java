package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class qg1 {
    public final Context a;
    public final gu b;
    public boolean c;

    public qg1(Context context) {
        this.a = context;
        this.b = new gu(context, false);
    }

    public final v80[] a(Handler handler, b62 b62Var, b62 b62Var2, b62 b62Var3, b62 b62Var4) {
        ArrayList arrayList = new ArrayList();
        boolean z = this.c;
        Context context = this.a;
        an4 an4Var = new an4(context);
        gu guVar = this.b;
        an4Var.c = guVar;
        an4Var.d = 5000L;
        an4Var.e = z;
        an4Var.f = handler;
        an4Var.g = b62Var;
        an4Var.h = 50;
        vy2.s(!an4Var.b);
        Handler handler2 = an4Var.f;
        vy2.s((handler2 == null && an4Var.g == null) || !(handler2 == null || an4Var.g == null));
        an4Var.b = true;
        arrayList.add(new cn4(an4Var));
        jd1 jd1Var = new jd1(context);
        vy2.s(!jd1Var.d);
        jd1Var.d = true;
        if (jd1Var.c == null) {
            jd1Var.c = new wv8(new g00[0]);
        }
        if (jd1Var.g == null) {
            qq4 qq4Var = new qq4();
            qq4Var.a = context == null ? null : context.getApplicationContext();
            jd1Var.g = qq4Var;
        }
        arrayList.add(new qm4(this.a, guVar, this.c, handler, b62Var2, new rd1(jd1Var)));
        arrayList.add(new aj8(b62Var3, handler.getLooper()));
        Looper looper = handler.getLooper();
        arrayList.add(new pv4(b62Var4, looper));
        arrayList.add(new pv4(b62Var4, looper));
        arrayList.add(new fm0());
        arrayList.add(new li3(new jc0(context)));
        return (v80[]) arrayList.toArray(new v80[0]);
    }
}
