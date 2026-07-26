package defpackage;

import android.widget.Magnifier;

/* JADX INFO: loaded from: classes.dex */
public class t96 implements r96 {
    public final Magnifier a;

    public t96(Magnifier magnifier) {
        this.a = magnifier;
    }

    @Override // defpackage.r96
    public void a(long j, long j2) {
        this.a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public final void b() {
        this.a.dismiss();
    }

    public final long c() {
        return (((long) this.a.getHeight()) & 4294967295L) | (((long) this.a.getWidth()) << 32);
    }

    public final void d() {
        this.a.update();
    }
}
