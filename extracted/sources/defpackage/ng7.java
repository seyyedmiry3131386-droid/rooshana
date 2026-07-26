package defpackage;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes.dex */
public final class ng7 {
    public final mg7 a;

    public ng7(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new lg7(nestedScrollView);
        } else {
            this.a = new rl3();
        }
    }
}
