package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import nene.downloadmanager.exceptions.NeneRuntimeException;

/* JADX INFO: loaded from: classes3.dex */
public final class xl5 {
    public final pa1 a;

    static {
        eh5.a("Nene");
    }

    public xl5(Context context, String str, int i, int i2, vs1 vs1Var, ts1 ts1Var, qs1 qs1Var, wl5 wl5Var) {
        if (dh5.a == null) {
            dh5.a = context.getApplicationContext();
            vl5.g.getLooper();
            zl5.a.getLooper();
        } else {
            context.getApplicationContext();
        }
        if (i <= 0) {
            throw new IllegalArgumentException("concurrentDownloadCount must be greater than 0");
        }
        this.a = new pa1(TextUtils.isEmpty(str) ? null : str, i, i2, vs1Var, ts1Var, qs1Var, wl5Var);
    }

    public final void a(String str, String str2, String str3, Serializable serializable, int i) throws Throwable {
        if (str3 != null && b(str3) != null) {
            throw new NeneRuntimeException("A download with given downloadKey exist, " + b(str3));
        }
        pa1 pa1Var = this.a;
        pt2 pt2Var = pa1Var.d;
        fs1 fs1Var = pa1Var.c;
        if (pa1Var.i == null && (str == null || str2 == null)) {
            throw new IllegalArgumentException("If DownloadPreProcess is not set, both URL and file path should be provided");
        }
        as1 as1Var = pa1Var.h;
        int i2 = as1Var.a;
        as1Var.a = i2 + 1;
        es1 es1Var = new es1(i2, str, str2, str3, serializable);
        int i3 = i == 200 ? 301 : 300;
        if (i == 201 || i == 202 || i == 200) {
            es1Var.c(110);
        } else {
            if (i != 203) {
                throw new NeneRuntimeException("Download priority is wrong");
            }
            es1Var.c(120);
        }
        fs1Var.a(es1Var, i3);
        if (i == 202 && ((SparseArray) pt2Var.b).size() >= pa1Var.a.b) {
            List listF = fs1Var.f();
            listF.size();
            es1 es1Var2 = (es1) listF.get(listF.size() - 1);
            pt2Var.z(es1Var2, true);
            es1Var2.c(110);
            fs1Var.c(es1Var2);
            pa1Var.g(es1Var2, 251);
        }
        pa1Var.g(es1Var, 250);
        pa1Var.c();
    }

    public final es1 b(String str) {
        return (es1) this.a.c.f.get(str);
    }

    public final List c() {
        return this.a.c.c;
    }

    public final boolean d(nr1 nr1Var) {
        ArrayList arrayList = this.a.e.a;
        if (nr1Var == null) {
            throw new NullPointerException("Cannot register null listener");
        }
        if (arrayList.contains(nr1Var)) {
            nr1Var.toString();
            return false;
        }
        arrayList.add(nr1Var);
        arrayList.size();
        return true;
    }
}
