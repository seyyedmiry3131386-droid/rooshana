package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class le3 implements ax4 {
    public static final pv5 b = pv5.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");
    public final ql4 a;

    public le3(ql4 ql4Var) {
        this.a = ql4Var;
    }

    @Override // defpackage.ax4
    public final zw4 a(Object obj, int i, int i2, sv5 sv5Var) {
        ot2 ot2Var = (ot2) obj;
        ql4 ql4Var = this.a;
        if (ql4Var != null) {
            xw4 xw4Var = (xw4) ql4Var.b;
            yw4 yw4VarA = yw4.a(ot2Var);
            Object objB = xw4Var.b(yw4VarA);
            ArrayDeque arrayDeque = yw4.b;
            synchronized (arrayDeque) {
                arrayDeque.offer(yw4VarA);
            }
            ot2 ot2Var2 = (ot2) objB;
            if (ot2Var2 == null) {
                xw4Var.e(yw4.a(ot2Var), ot2Var);
            } else {
                ot2Var = ot2Var2;
            }
        }
        return new zw4(ot2Var, new ue3(ot2Var, ((Integer) sv5Var.c(b)).intValue()));
    }

    @Override // defpackage.ax4
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
