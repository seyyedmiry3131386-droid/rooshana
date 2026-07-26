package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class q96 {
    public static final p96 a;

    static {
        p96 fz1Var;
        if (Build.VERSION.SDK_INT >= 24) {
            sg sgVar = new sg();
            sgVar.c = new rl3();
            fz1Var = sgVar;
        } else {
            fz1Var = new fz1(25);
        }
        a = fz1Var;
    }
}
