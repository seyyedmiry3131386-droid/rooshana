package defpackage;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes.dex */
public final class lg7 implements mg7 {
    public final ScrollFeedbackProvider a;

    public lg7(NestedScrollView nestedScrollView) {
        this.a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // defpackage.mg7
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.a.onScrollProgress(i, i2, i3, i4);
    }

    @Override // defpackage.mg7
    public final void r(int i, int i2, boolean z, int i3) {
        this.a.onScrollLimit(i, i2, i3, z);
    }
}
