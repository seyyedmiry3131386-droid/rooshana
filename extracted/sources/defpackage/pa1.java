package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import nene.downloadmanager.core.DownloaderService;
import nene.downloadmanager.exceptions.NeneRuntimeException;

/* JADX INFO: loaded from: classes3.dex */
public final class pa1 {
    public static final /* synthetic */ int n = 0;
    public final bm5 a;
    public final yr1 b;
    public final fs1 c;
    public final pt2 d;
    public final vo0 e;
    public final ArrayDeque f;
    public final ib1 g;
    public final as1 h;
    public final vs1 i;
    public final ts1 j;
    public final qs1 k;
    public int l = 0;
    public final oa1 m = new oa1(this);

    static {
        eh5.a("DataManager");
    }

    public pa1(String str, int i, int i2, vs1 vs1Var, ts1 ts1Var, qs1 qs1Var, yr1 yr1Var) throws Throwable {
        List arrayList;
        boolean z = false;
        this.a = new bm5(i, i2);
        this.i = vs1Var;
        this.j = ts1Var;
        this.b = yr1Var;
        String strConcat = str == null ? null : str.concat("_PREFERENCES");
        int i3 = iu7.b;
        iu7 ju7Var = TextUtils.isEmpty(strConcat) ? new ju7() : new iu7(strConcat);
        Context context = dh5.a;
        String[] strArr = ib1.b;
        ib1 kb1Var = TextUtils.isEmpty(str) ? new kb1(context, null) : new ib1(context, str);
        this.g = kb1Var;
        try {
            arrayList = kb1Var.u();
        } catch (Exception unused) {
            this.g.b();
            ju7Var.a(false);
            arrayList = new ArrayList();
        }
        if (this.g.a) {
            ju7Var.a(true);
        }
        as1 as1Var = new as1();
        as1Var.a = -100;
        this.h = as1Var;
        fs1 fs1Var = new fs1(ju7Var, arrayList, as1Var);
        this.c = fs1Var;
        pt2 pt2Var = new pt2(20, z);
        pt2Var.b = new SparseArray(i);
        this.d = pt2Var;
        vo0 vo0Var = new vo0();
        vo0Var.a = new ArrayList();
        this.e = vo0Var;
        this.f = new ArrayDeque(2);
        this.k = qs1Var;
        ib1 ib1Var = this.g;
        ListIterator listIterator = fs1Var.b.listIterator(0);
        while (listIterator.hasNext()) {
            es1 es1Var = (es1) listIterator.next();
            if (es1Var.f == 100) {
                es1Var.c(110);
                ib1Var.D(es1Var);
            }
        }
        c();
        if (eh5.b(0)) {
            this.c.toString();
        }
    }

    public final boolean a(es1 es1Var) throws Throwable {
        if (!es1Var.a(150, "cancelDownload")) {
            return false;
        }
        if (es1Var.f == 100) {
            this.d.z(es1Var, true);
        }
        if (es1Var.c != null) {
            pb2.d().c(es1Var.c);
        }
        es1Var.i = 0L;
        es1Var.h = -1L;
        es1Var.c(150);
        this.c.g(es1Var, 300);
        g(es1Var, 251);
        c();
        return true;
    }

    public final void b(es1 es1Var, int i) throws Throwable {
        ib1 ib1Var = this.g;
        switch (i) {
            case 250:
                ib1Var.y(es1Var);
                break;
            case 251:
                ib1Var.D(es1Var);
                break;
            case 252:
                ib1Var.d(es1Var);
                break;
            default:
                throw new NeneRuntimeException(rm7.n(i, "infoChangeType is not valid: "));
        }
        Iterator it = this.e.a.iterator();
        while (it.hasNext()) {
            ((nr1) it.next()).n(es1Var, i);
        }
    }

    public final void c() throws Throwable {
        List<es1> listSubList;
        pa1 pa1Var;
        int size = this.a.b;
        fs1 fs1Var = this.c;
        if (fs1Var.b.isEmpty()) {
            listSubList = Collections.EMPTY_LIST;
        } else {
            if (size > fs1Var.b.size()) {
                size = fs1Var.b.size();
            }
            listSubList = fs1Var.b.subList(0, size);
        }
        if (listSubList.isEmpty() || !(((es1) listSubList.get(0)).f == 110 || ((es1) listSubList.get(0)).f == 100)) {
            pa1Var = this;
            d();
        } else {
            for (es1 es1Var : listSubList) {
                int i = es1Var.f;
                if (i != 100) {
                    if (i != 110) {
                        break;
                    }
                    es1Var.c(100);
                    g(es1Var, 251);
                    if (this.l == 0) {
                        this.l = 2;
                        dh5.a.bindService(new Intent(dh5.a, (Class<?>) DownloaderService.class), this.m, 1);
                    }
                    tt1 tt1Var = new tt1(this, this.a, es1Var, this.i, this.j);
                    SparseArray sparseArray = (SparseArray) this.d.b;
                    int i2 = es1Var.a;
                    if (sparseArray.get(i2) != null) {
                        throw new IllegalArgumentException("downloader is null or download already exist in DownloaderContainer. downloadItem = [" + es1Var + "], downloader = [" + tt1Var + "]");
                    }
                    sparseArray.put(i2, tt1Var);
                    es1 es1Var2 = tt1Var.f;
                    int i3 = es1Var2.f;
                    tt1Var.k = 100;
                    tt1Var.i(101);
                    es1 es1Var3 = new es1(es1Var2);
                    bm5 bm5Var = tt1Var.a;
                    qi6 qi6Var = new qi6(tt1Var, es1Var3, tt1Var.c, bm5Var.a);
                    qi6Var.c(bm5Var.c, new Void[0]);
                    tt1Var.h = qi6Var;
                }
            }
            pa1Var = this;
        }
        while (true) {
            h16 h16Var = (h16) pa1Var.f.poll();
            if (h16Var == null) {
                return;
            } else {
                b((es1) h16Var.a, ((Integer) h16Var.b).intValue());
            }
        }
    }

    public final void d() {
        ((SparseArray) this.d.b).size();
        if (this.l == 3) {
            oa1 oa1Var = this.m;
            ut1 ut1Var = oa1Var.a;
            if (ut1Var != null) {
                qs1 qs1Var = oa1Var.b.k;
                DownloaderService downloaderService = ut1Var.n;
                int i = downloaderService.c;
                if (qs1Var != null) {
                    int i2 = i - 1;
                    downloaderService.c = i2;
                    if (i2 <= 0) {
                        downloaderService.stopForeground(false);
                    }
                }
            }
            this.l = 0;
            dh5.a.unbindService(oa1Var);
        }
    }

    public final boolean e(es1 es1Var) throws Throwable {
        if (!es1Var.a(120, "pauseDownload")) {
            return false;
        }
        if (es1Var.f == 100) {
            this.d.z(es1Var, true);
        }
        es1Var.c(120);
        this.c.g(es1Var, 300);
        g(es1Var, 251);
        c();
        return true;
    }

    public final void f(es1 es1Var) throws Throwable {
        if (es1Var.f == 100) {
            this.d.z(es1Var, true);
        }
        if (es1Var.c != null) {
            pb2.d().c(es1Var.c);
        }
        fs1 fs1Var = this.c;
        ListIterator listIteratorE = fs1Var.e(es1Var);
        listIteratorE.previous();
        listIteratorE.remove();
        String str = es1Var.d;
        if (str != null) {
        }
        fs1Var.h();
        g(es1Var, 252);
        c();
    }

    public final void g(es1 es1Var, int i) {
        ArrayDeque<h16> arrayDeque = this.f;
        for (h16 h16Var : arrayDeque) {
            if (h16Var.a == es1Var && (((Integer) h16Var.b).intValue() == i || i != 252)) {
                return;
            }
        }
        arrayDeque.add(new h16(es1Var, Integer.valueOf(i)));
    }

    public final boolean h(es1 es1Var, int i) throws Throwable {
        int i2;
        int i3 = es1Var.f;
        if (i3 == 100) {
            es1Var.toString();
            return false;
        }
        if (i == 203) {
            es1Var.toString();
            return false;
        }
        if (i3 == 110) {
            if (i != 202) {
                dh5.b(202);
                es1Var.toString();
                return false;
            }
        } else if (!es1Var.a(110, "startDownload")) {
            return false;
        }
        if (i == 201 || i == 202) {
            i2 = 300;
        } else {
            if (i != 200) {
                throw new NeneRuntimeException("Given download priority is not correct: " + dh5.b(i));
            }
            i2 = 301;
        }
        fs1 fs1Var = this.c;
        if (i == 202) {
            pt2 pt2Var = this.d;
            if (((SparseArray) pt2Var.b).size() >= this.a.b) {
                List listF = fs1Var.f();
                listF.size();
                es1 es1Var2 = (es1) listF.get(listF.size() - 1);
                pt2Var.z(es1Var2, true);
                es1Var2.c(110);
                g(es1Var2, 251);
            }
        }
        if (es1Var.f != 110) {
            es1Var.c(110);
        }
        fs1Var.g(es1Var, i2);
        g(es1Var, 251);
        c();
        return true;
    }
}
