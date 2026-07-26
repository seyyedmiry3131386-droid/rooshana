package defpackage;

import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class a99 extends a79 {
    public static final /* synthetic */ int y = 0;
    public final ImageView v;
    public final ImageView w;
    public long x;

    /* JADX WARN: Illegal instructions before constructor call */
    public a99(View[] viewArr) {
        Object[] objArrJ0 = a79.j0(viewArr, 2, null);
        View view = viewArr[0];
        ImageView imageView = (ImageView) objArrJ0[1];
        ImageView imageView2 = (ImageView) objArrJ0[0];
        super(0, view, null);
        this.v = imageView;
        this.w = imageView2;
        this.x = -1L;
        this.v.setTag(null);
        this.w.setTag(null);
        m0(viewArr);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        synchronized (this) {
            this.x = 0L;
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.x != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.x = 1L;
        }
        k0();
    }
}
