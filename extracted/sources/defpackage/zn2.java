package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.fragment.app.d;
import androidx.lifecycle.Lifecycle$Event;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zn2 implements jx2, qd7, x79 {
    public final d a;
    public final u79 b;
    public final b7 c;
    public q79 d;
    public i64 e = null;
    public rn6 f = null;

    public zn2(d dVar, u79 u79Var, b7 b7Var) {
        this.a = dVar;
        this.b = u79Var;
        this.c = b7Var;
    }

    @Override // defpackage.g64
    public final i64 D() {
        b();
        return this.e;
    }

    public final void a(Lifecycle$Event lifecycle$Event) {
        this.e.d(lifecycle$Event);
    }

    public final void b() {
        if (this.e == null) {
            this.e = new i64(this, true);
            rn6 rn6Var = new rn6(new bp4(this, new o06(17, this)));
            this.f = rn6Var;
            rn6Var.u();
            this.c.run();
        }
    }

    @Override // defpackage.jx2
    public final q79 h() {
        Application application;
        d dVar = this.a;
        q79 q79VarH = dVar.h();
        if (!q79VarH.equals(dVar.X)) {
            this.d = q79VarH;
            return q79VarH;
        }
        if (this.d == null) {
            Context applicationContext = dVar.q0().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.d = new rd7(application, dVar, dVar.g);
        }
        return this.d;
    }

    @Override // defpackage.jx2
    public final ta5 i() {
        Application application;
        d dVar = this.a;
        Context applicationContext = dVar.q0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        ta5 ta5Var = new ta5(0);
        LinkedHashMap linkedHashMap = ta5Var.a;
        if (application != null) {
            linkedHashMap.put(p79.e, application);
        }
        linkedHashMap.put(rq4.b, dVar);
        linkedHashMap.put(rq4.c, this);
        Bundle bundle = dVar.g;
        if (bundle != null) {
            linkedHashMap.put(rq4.d, bundle);
        }
        return ta5Var;
    }

    @Override // defpackage.x79
    public final u79 m() {
        b();
        return this.b;
    }

    @Override // defpackage.qd7
    public final bn6 o() {
        b();
        return (bn6) this.f.c;
    }
}
