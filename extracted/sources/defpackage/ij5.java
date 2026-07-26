package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;
import kotlin.a;

/* JADX INFO: loaded from: classes.dex */
public final class ij5 {
    public final Context a;
    public final ni5 b = new ni5(this, new ji5(this, 0));
    public final jc0 c;
    public final Activity d;
    public boolean e;
    public final h40 f;
    public final boolean g;
    public final c24 h;

    public ij5(Context context) {
        Object next;
        this.a = context;
        this.c = new jc0(context);
        Iterator it = mo7.s(new i25(14), context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.d = (Activity) next;
        this.f = new h40(3, this);
        this.g = true;
        ll5 ll5Var = this.b.r;
        ll5Var.a(new hj5(ll5Var));
        this.b.r.a(new m7(this.a));
        this.h = a.a(new ji5(this, 1));
    }

    public final int a() {
        ov ovVar = this.b.f;
        int i = 0;
        if (ovVar != null && ovVar.isEmpty()) {
            return 0;
        }
        Iterator it = ovVar.iterator();
        while (it.hasNext()) {
            if (!(((ei5) it.next()).b instanceof fj5) && (i = i + 1) < 0) {
                br9.O();
                throw null;
            }
        }
        return i;
    }

    public final jj5 b() {
        return (jj5) this.h.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r10, android.os.Bundle r11, defpackage.lj5 r12) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ij5.c(int, android.os.Bundle, lj5):void");
    }

    public final boolean d() {
        ni5 ni5Var = this.b;
        if (ni5Var.f.isEmpty()) {
            return false;
        }
        wi5 wi5VarF = ni5Var.f();
        js3.m(wi5VarF);
        return ni5Var.l(wi5VarF.b.a, true, false) && ni5Var.b();
    }

    public final void e(int i) {
        this.b.q(b().b(i), null);
    }

    public final void f(int i, Bundle bundle) {
        this.b.q(b().b(i), bundle);
    }
}
