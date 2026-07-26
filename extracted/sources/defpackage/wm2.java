package defpackage;

import android.view.ViewParent;
import androidx.fragment.app.d;
import androidx.fragment.app.g;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import io.sentry.SpanStatus;
import io.sentry.b6;
import io.sentry.e5;
import io.sentry.instrumentation.file.a;
import io.sentry.k1;
import io.sentry.t;
import io.sentry.util.k;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wm2 {
    public long a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public final Object f;

    public wm2(k1 k1Var, File file, b6 b6Var) {
        this.e = SpanStatus.OK;
        this.b = k1Var;
        this.c = file;
        this.d = b6Var;
        this.f = new t(b6Var, 2);
        e5.d().a("FileIO");
    }

    public static ViewPager2 c(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            return (ViewPager2) parent;
        }
        throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
    }

    public void a(Closeable closeable) {
        k1 k1Var = (k1) this.b;
        try {
            try {
                closeable.close();
            } catch (IOException e) {
                this.e = SpanStatus.INTERNAL_ERROR;
                if (k1Var != null) {
                    k1Var.i(e);
                }
                throw e;
            }
        } finally {
            b();
        }
    }

    public void b() {
        String strY;
        File file = (File) this.c;
        b6 b6Var = (b6) this.d;
        k1 k1Var = (k1) this.b;
        if (k1Var != null) {
            String strA = k.a(this.a);
            if (file != null) {
                String strA2 = k.a(this.a);
                if (b6Var.isSendDefaultPii()) {
                    strY = file.getName() + " (" + strA2 + ")";
                } else {
                    int iLastIndexOf = file.getName().lastIndexOf(46);
                    strY = (iLastIndexOf <= 0 || iLastIndexOf >= file.getName().length() + (-1)) ? o40.y("*** (", strA2, ")") : bl4.w("***", file.getName().substring(iLastIndexOf), " (", strA2, ")");
                }
                k1Var.s(strY);
                if (b6Var.isSendDefaultPii()) {
                    k1Var.p(file.getAbsolutePath(), "file.path");
                }
            } else {
                k1Var.s(strA);
            }
            k1Var.p(Long.valueOf(this.a), "file.size");
            boolean zC = b6Var.getThreadChecker().c();
            k1Var.p(Boolean.valueOf(zC), "blocked_main_thread");
            if (zC) {
                k1Var.p(((t) this.f).b(), "call_stack");
            }
            k1Var.k((SpanStatus) this.e);
        }
    }

    public Object d(a aVar) throws IOException {
        try {
            Object objCall = aVar.call();
            if (objCall instanceof Integer) {
                int iIntValue = ((Integer) objCall).intValue();
                if (iIntValue != -1) {
                    this.a += (long) iIntValue;
                    return objCall;
                }
            } else if (objCall instanceof Long) {
                long jLongValue = ((Long) objCall).longValue();
                if (jLongValue != -1) {
                    this.a += jLongValue;
                }
            }
            return objCall;
        } catch (IOException e) {
            this.e = SpanStatus.INTERNAL_ERROR;
            k1 k1Var = (k1) this.b;
            if (k1Var != null) {
                k1Var.i(e);
            }
            throw e;
        }
    }

    public void e(boolean z) {
        int currentItem;
        d dVar;
        xm2 xm2Var = (xm2) this.f;
        i50 i50Var = xm2Var.j;
        ue4 ue4Var = xm2Var.f;
        g gVar = xm2Var.e;
        if (gVar.S() || ((ViewPager2) this.e).getScrollState() != 0 || ue4Var.g() || xm2Var.c() == 0 || (currentItem = ((ViewPager2) this.e).getCurrentItem()) >= xm2Var.c()) {
            return;
        }
        long j = currentItem;
        if ((j != this.a || z) && (dVar = (d) ue4Var.d(j)) != null && dVar.Q()) {
            this.a = j;
            gVar.getClass();
            p40 p40Var = new p40(gVar);
            ArrayList<List> arrayList = new ArrayList();
            d dVar2 = null;
            for (int i = 0; i < ue4Var.k(); i++) {
                long jH = ue4Var.h(i);
                d dVar3 = (d) ue4Var.l(i);
                if (dVar3.Q()) {
                    if (jH != this.a) {
                        p40Var.l(dVar3, Lifecycle$State.d);
                        i50Var.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = i50Var.a.iterator();
                        if (it.hasNext()) {
                            throw bl4.o(it);
                        }
                        arrayList.add(arrayList2);
                    } else {
                        dVar2 = dVar3;
                    }
                    dVar3.v0(jH == this.a);
                }
            }
            if (dVar2 != null) {
                p40Var.l(dVar2, Lifecycle$State.e);
                i50Var.getClass();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = i50Var.a.iterator();
                if (it2.hasNext()) {
                    throw bl4.o(it2);
                }
                arrayList.add(arrayList3);
            }
            if (p40Var.a.isEmpty()) {
                return;
            }
            p40Var.g();
            Collections.reverse(arrayList);
            for (List list : arrayList) {
                i50Var.getClass();
                i50.a(list);
            }
        }
    }

    public wm2(xm2 xm2Var) {
        this.f = xm2Var;
        this.a = -1L;
    }
}
