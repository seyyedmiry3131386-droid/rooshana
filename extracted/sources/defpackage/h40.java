package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.c;
import androidx.fragment.app.d;
import androidx.fragment.app.g;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.version2.activity.WebViewActivity;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class h40 extends rs5 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h40(int i, Object obj) {
        super(false);
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.rs5
    public void a() {
        switch (this.d) {
            case 0:
                ((xy0) this.e).getClass();
                break;
            case 1:
                g gVar = (g) this.e;
                if (g.N(3)) {
                    Objects.toString(gVar);
                }
                if (g.N(3)) {
                    Objects.toString(gVar.h);
                }
                p40 p40Var = gVar.h;
                if (p40Var != null) {
                    p40Var.s = false;
                    p40Var.d();
                    p40 p40Var2 = gVar.h;
                    b7 b7Var = new b7(28, gVar);
                    if (p40Var2.q == null) {
                        p40Var2.q = new ArrayList();
                    }
                    p40Var2.q.add(b7Var);
                    gVar.h.e();
                    gVar.i = true;
                    gVar.B(true);
                    gVar.H();
                    gVar.i = false;
                    gVar.h = null;
                }
                break;
        }
    }

    @Override // defpackage.rs5
    public final void b() {
        Handler handler;
        int i = 1;
        switch (this.d) {
            case 0:
                ((xy0) this.e).c.invoke();
                return;
            case 1:
                g gVar = (g) this.e;
                if (g.N(3)) {
                    Objects.toString(gVar);
                }
                h40 h40Var = gVar.j;
                ArrayList<fm2> arrayList = gVar.o;
                gVar.i = true;
                gVar.B(true);
                gVar.i = false;
                if (gVar.h == null) {
                    if (h40Var.b) {
                        gVar.V();
                        return;
                    } else {
                        gVar.g.b();
                        return;
                    }
                }
                if (!arrayList.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(g.I(gVar.h));
                    for (fm2 fm2Var : arrayList) {
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            fm2Var.a((d) it.next(), true);
                        }
                    }
                }
                Iterator it2 = gVar.h.a.iterator();
                while (it2.hasNext()) {
                    d dVar = ((cn2) it2.next()).b;
                    if (dVar != null) {
                        dVar.n = false;
                    }
                }
                for (c cVar : gVar.g(new ArrayList(Collections.singletonList(gVar.h)), 0, 1)) {
                    ArrayList arrayList2 = cVar.c;
                    cVar.m(arrayList2);
                    cVar.c(arrayList2);
                }
                Iterator it3 = gVar.h.a.iterator();
                while (it3.hasNext()) {
                    d dVar2 = ((cn2) it3.next()).b;
                    if (dVar2 != null && dVar2.I == null) {
                        gVar.h(dVar2).k();
                    }
                }
                gVar.h = null;
                gVar.n0();
                if (g.N(3)) {
                    boolean z = h40Var.b;
                    gVar.toString();
                    return;
                }
                return;
            case 2:
                LaunchContentActivity launchContentActivity = (LaunchContentActivity) this.e;
                if (launchContentActivity.z0) {
                    launchContentActivity.finish();
                    return;
                }
                launchContentActivity.z0 = true;
                hh2.H(new hh2(launchContentActivity, launchContentActivity.getString(rs6.ask_exit)));
                u03 u03Var = new u03(i, this);
                synchronized (zk8.class) {
                    handler = zk8.a;
                    if (handler == null) {
                        handler = new Handler(Looper.getMainLooper());
                        zk8.a = handler;
                    }
                    break;
                }
                lw.f(null, null, handler.postDelayed(u03Var, 3000L));
                return;
            case 3:
                ((ij5) this.e).d();
                return;
            case 4:
                ((dp2) this.e).invoke(this);
                return;
            default:
                WebViewActivity webViewActivity = (WebViewActivity) this.e;
                int i2 = WebViewActivity.L0;
                webViewActivity.v0();
                return;
        }
    }

    @Override // defpackage.rs5
    public void c(f40 f40Var) {
        switch (this.d) {
            case 0:
                ((xy0) this.e).getClass();
                break;
            case 1:
                g gVar = (g) this.e;
                if (g.N(2)) {
                    Objects.toString(gVar);
                }
                if (gVar.h != null) {
                    for (c cVar : gVar.g(new ArrayList(Collections.singletonList(gVar.h)), 0, 1)) {
                        cVar.getClass();
                        ArrayList arrayList = cVar.c;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            a.b0(((p28) it.next()).k, arrayList2);
                        }
                        List listP0 = a.P0(a.T0(arrayList2));
                        int size = listP0.size();
                        for (int i = 0; i < size; i++) {
                            ((o28) listP0.get(i)).d(f40Var, cVar.a);
                        }
                    }
                    Iterator it2 = gVar.o.iterator();
                    while (it2.hasNext()) {
                        ((fm2) it2.next()).getClass();
                    }
                }
                break;
        }
    }

    @Override // defpackage.rs5
    public void d(f40 f40Var) {
        switch (this.d) {
            case 0:
                ((xy0) this.e).getClass();
                break;
            case 1:
                g gVar = (g) this.e;
                if (g.N(3)) {
                    Objects.toString(gVar);
                }
                gVar.y();
                gVar.z(new vl2(gVar), false);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h40(int i, Object obj, boolean z) {
        super(true);
        this.d = i;
        this.e = obj;
    }
}
