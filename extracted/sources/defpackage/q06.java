package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.d;

/* JADX INFO: loaded from: classes3.dex */
public final class q06 extends d {
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q06(Context context, int i) {
        super(context);
        this.q = i;
    }

    @Override // androidx.recyclerview.widget.d
    public float h(DisplayMetrics displayMetrics) {
        switch (this.q) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.h(displayMetrics);
        }
    }

    @Override // androidx.recyclerview.widget.d
    public int j() {
        switch (this.q) {
            case 0:
                return -1;
            default:
                return super.j();
        }
    }
}
