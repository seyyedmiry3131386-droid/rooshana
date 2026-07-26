package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class yz0 extends x70 {
    public final HashMap h = new HashMap();
    public Handler i;
    public fq8 j;

    @Override // defpackage.x70
    public final void d() {
        for (xz0 xz0Var : this.h.values()) {
            xz0Var.a.c(xz0Var.b);
        }
    }

    @Override // defpackage.x70
    public final void f() {
        for (xz0 xz0Var : this.h.values()) {
            xz0Var.a.e(xz0Var.b);
        }
    }

    @Override // defpackage.x70
    public void j() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((xz0) it.next()).a.j();
        }
    }

    @Override // defpackage.x70
    public void p() {
        HashMap map = this.h;
        for (xz0 xz0Var : map.values()) {
            x70 x70Var = xz0Var.a;
            wz0 wz0Var = xz0Var.c;
            x70Var.o(xz0Var.b);
            x70Var.r(wz0Var);
            x70Var.q(wz0Var);
        }
        map.clear();
    }

    public abstract ks4 t(Object obj, ks4 ks4Var);

    public abstract void w(Object obj, x70 x70Var, bm8 bm8Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [ls4, vz0] */
    public final void x(final Object obj, x70 x70Var) {
        HashMap map = this.h;
        vy2.j(!map.containsKey(obj));
        ?? r1 = new ls4() { // from class: vz0
            @Override // defpackage.ls4
            public final void a(x70 x70Var2, bm8 bm8Var) {
                this.a.w(obj, x70Var2, bm8Var);
            }
        };
        wz0 wz0Var = new wz0(this, obj);
        map.put(obj, new xz0(x70Var, r1, wz0Var));
        Handler handler = this.i;
        handler.getClass();
        x70Var.getClass();
        pg pgVar = x70Var.c;
        pgVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) pgVar.d;
        os4 os4Var = new os4();
        os4Var.a = handler;
        os4Var.b = wz0Var;
        copyOnWriteArrayList.add(os4Var);
        Handler handler2 = this.i;
        handler2.getClass();
        sw1 sw1Var = x70Var.d;
        sw1Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = sw1Var.c;
        rw1 rw1Var = new rw1();
        rw1Var.a = handler2;
        rw1Var.b = wz0Var;
        copyOnWriteArrayList2.add(rw1Var);
        fq8 fq8Var = this.j;
        ee6 ee6Var = this.g;
        vy2.t(ee6Var);
        x70Var.k(r1, fq8Var, ee6Var);
        if (this.b.isEmpty()) {
            x70Var.c(r1);
        }
    }

    public long u(long j, Object obj) {
        return j;
    }

    public int v(int i, Object obj) {
        return i;
    }
}
