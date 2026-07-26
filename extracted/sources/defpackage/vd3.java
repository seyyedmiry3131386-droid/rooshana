package defpackage;

import java.io.IOException;
import java.util.List;
import okhttp3.internal.http2.ErrorCode;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vd3 implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;

    public /* synthetic */ vd3(vl1 vl1Var, int i) {
        this.a = 3;
        this.b = vl1Var;
        this.c = i;
    }

    private final Object b() {
        ae3 ae3Var = (ae3) this.b;
        int i = this.c;
        ae3Var.k.getClass();
        synchronized (ae3Var) {
            ae3Var.y.remove(Integer.valueOf(i));
        }
        return tx8.a;
    }

    private final Object d() {
        ae3 ae3Var = (ae3) this.b;
        int i = this.c;
        ae3Var.k.getClass();
        try {
            ae3Var.w.D(i, ErrorCode.h);
            synchronized (ae3Var) {
                ae3Var.y.remove(Integer.valueOf(i));
            }
        } catch (IOException unused) {
        }
        return tx8.a;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ae3 ae3Var = (ae3) this.b;
                int i = this.c;
                ae3Var.k.getClass();
                try {
                    ae3Var.w.D(i, ErrorCode.h);
                    synchronized (ae3Var) {
                        ae3Var.y.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return tx8.a;
            case 1:
                return b();
            case 2:
                return d();
            default:
                vl1 vl1Var = (vl1) this.b;
                return Integer.valueOf(((ri8) vl1Var.e).b.d(this.c));
        }
    }

    public /* synthetic */ vd3(ae3 ae3Var, int i, Object obj, int i2) {
        this.a = i2;
        this.b = ae3Var;
        this.c = i;
    }

    public /* synthetic */ vd3(ae3 ae3Var, int i, List list, boolean z) {
        this.a = 2;
        this.b = ae3Var;
        this.c = i;
    }
}
