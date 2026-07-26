package defpackage;

import android.view.View;
import android.widget.ImageView;
import ir.mservices.market.views.MyketEditText;

/* JADX INFO: loaded from: classes3.dex */
public final class x69 extends a79 {
    public static final /* synthetic */ int z = 0;
    public final View v;
    public final ImageView w;
    public final MyketEditText x;
    public long y;

    /* JADX WARN: Illegal instructions before constructor call */
    public x69(View[] viewArr) {
        Object[] objArrJ0 = a79.j0(viewArr, 3, null);
        View view = viewArr[0];
        View view2 = (View) objArrJ0[0];
        ImageView imageView = (ImageView) objArrJ0[2];
        MyketEditText myketEditText = (MyketEditText) objArrJ0[1];
        super(0, view, null);
        this.v = view2;
        this.w = imageView;
        this.x = myketEditText;
        this.y = -1L;
        this.v.setTag(null);
        this.w.setTag(null);
        this.x.setTag(null);
        m0(viewArr);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        synchronized (this) {
            j = this.y;
            this.y = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.b().n : 0;
        if (j2 != 0) {
            this.x.setTextColor(i);
            this.x.setHintTextColor(i);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.y != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.y = 1L;
        }
        k0();
    }
}
