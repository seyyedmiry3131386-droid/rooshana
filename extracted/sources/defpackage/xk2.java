package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class xk2 extends wk2 {
    public static final sk6 C;
    public static final SparseIntArray D;
    public long B;

    static {
        sk6 sk6Var = new sk6(6);
        C = sk6Var;
        sk6Var.J(0, new String[]{"empty_view_button"}, new int[]{2}, new int[]{js6.empty_view_button});
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(rr6.search_view, 3);
        sparseIntArray.put(rr6.selected_list_fragment, 4);
        sparseIntArray.put(rr6.shadow, 5);
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        long j2 = j & 2;
        int i = j2 != 0 ? sj8.b().l : 0;
        if (j2 != 0) {
            this.w.setBackground(new ColorDrawable(i));
        }
        this.v.c0();
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                if (this.B != 0) {
                    return true;
                }
                return this.v.e0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.B = 2L;
        }
        this.v.g0();
        k0();
    }
}
