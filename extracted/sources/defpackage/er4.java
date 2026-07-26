package defpackage;

import android.media.VolumeProvider;
import android.os.Build;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class er4 {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public VolumeProvider e;
    public final /* synthetic */ Handler f;
    public final /* synthetic */ qg6 g;

    public er4(int i, int i2, int i3, String str, Handler handler, qg6 qg6Var) {
        this.f = handler;
        this.g = qg6Var;
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.c = str;
    }

    public final VolumeProvider a() {
        er4 er4Var;
        if (this.e != null) {
            er4Var = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            er4Var = this;
            er4Var.e = new gb9(er4Var, this.a, this.b, this.d, this.c);
        } else {
            er4Var = this;
            er4Var.e = new hb9(this, er4Var.a, er4Var.b, er4Var.d);
        }
        return er4Var.e;
    }
}
