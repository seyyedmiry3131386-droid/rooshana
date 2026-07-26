package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.SparseBooleanArray;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class up4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ up4(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xp4 xp4Var = (xp4) this.c;
                jq4 jq4Var = (jq4) this.d;
                dc0 dc0Var = (dc0) this.e;
                if (this.b == xp4Var.i) {
                    xp4Var.d(jq4Var, dc0Var, xp4Var.b(false));
                    return;
                }
                return;
            case 1:
                pg pgVar = (pg) this.c;
                List list = (List) this.d;
                hq4 hq4Var = (hq4) this.e;
                xq4 xq4Var = ((hr4) pgVar.d).g;
                int i = this.b;
                if (i == -1) {
                    xq4Var.t.i0(list);
                } else {
                    xq4Var.t.h0(i, list);
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                sparseBooleanArray.append(20, true);
                xq4Var.q(hq4Var, new cb6(new vd2(sparseBooleanArray)));
                return;
            default:
                v24 v24Var = (v24) this.c;
                d30 d30Var = (d30) this.d;
                int i2 = this.b;
                Runnable runnable = (Runnable) this.e;
                od8 od8Var = (od8) v24Var.f;
                try {
                    try {
                        i42 i42Var = (i42) v24Var.c;
                        Objects.requireNonNull(i42Var);
                        ((qb7) od8Var).y(new ts5(29, i42Var));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) v24Var.a).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            ((qb7) od8Var).y(new y52(v24Var, d30Var, i2));
                        } else {
                            v24Var.b(d30Var, i2);
                        }
                        break;
                    } catch (SynchronizationException unused) {
                        ((pa2) v24Var.d).y(d30Var, i2 + 1, false);
                        break;
                    }
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    runnable.run();
                    throw th;
                }
        }
    }

    public /* synthetic */ up4(v24 v24Var, d30 d30Var, int i, Runnable runnable) {
        this.a = 2;
        this.c = v24Var;
        this.d = d30Var;
        this.b = i;
        this.e = runnable;
    }
}
