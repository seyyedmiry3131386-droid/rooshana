package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class rs2 extends d91 {
    public final Handler d;
    public final int e;
    public final long f;
    public Bitmap g;

    public rs2(Handler handler, int i, long j) {
        this.d = handler;
        this.e = i;
        this.f = j;
    }

    @Override // defpackage.ve8
    public final void i(Object obj, ir8 ir8Var) {
        this.g = (Bitmap) obj;
        Handler handler = this.d;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f);
    }

    @Override // defpackage.ve8
    public final void j(Drawable drawable) {
        this.g = null;
    }
}
