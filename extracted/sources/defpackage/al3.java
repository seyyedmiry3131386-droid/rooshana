package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class al3 extends zk3 {
    public static final SparseIntArray A;
    public long z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(rr6.arrow, 2);
        sparseIntArray.put(rr6.logo_icon, 3);
        sparseIntArray.put(rr6.logo_text, 4);
        sparseIntArray.put(rr6.nested_scroll_view, 5);
        sparseIntArray.put(rr6.content, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public al3(View view) {
        Object[] objArrI0 = a79.i0(view, 7, null, A);
        View view2 = (View) objArrI0[1];
        ImageView imageView = (ImageView) objArrI0[3];
        ImageView imageView2 = (ImageView) objArrI0[4];
        super(null, view, view2, imageView, imageView2);
        this.z = -1L;
        this.v.setTag(null);
        ((ConstraintLayout) objArrI0[0]).setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        synchronized (this) {
            j = this.z;
            this.z = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.b().v : 0;
        if (j2 != 0) {
            t61.s(i, this.v);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.z != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.z = 1L;
        }
        k0();
    }
}
