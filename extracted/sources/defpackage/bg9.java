package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class bg9 implements ag9 {
    public final rj1 b;

    public bg9() {
        this.b = Build.VERSION.SDK_INT >= 34 ? sj1.a : eq.w;
        br9.o(1, 2, 4, 8, 16, 32, 64, 128);
    }
}
