package defpackage;

import android.os.SystemClock;
import com.google.android.material.progressindicator.BaseProgressIndicator;

/* JADX INFO: loaded from: classes.dex */
public final class r80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseProgressIndicator b;

    public /* synthetic */ r80(BaseProgressIndicator baseProgressIndicator, int i) {
        this.a = i;
        this.b = baseProgressIndicator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        BaseProgressIndicator baseProgressIndicator = this.b;
        switch (i) {
            case 0:
                int i2 = BaseProgressIndicator.p;
                if (baseProgressIndicator.f > 0) {
                    baseProgressIndicator.g = SystemClock.uptimeMillis();
                }
                baseProgressIndicator.setVisibility(0);
                break;
            default:
                int i3 = BaseProgressIndicator.p;
                ((cw1) baseProgressIndicator.getCurrentDrawable()).d(false, false, true);
                if ((baseProgressIndicator.getProgressDrawable() == null || !baseProgressIndicator.getProgressDrawable().isVisible()) && (baseProgressIndicator.getIndeterminateDrawable() == null || !baseProgressIndicator.getIndeterminateDrawable().isVisible())) {
                    baseProgressIndicator.setVisibility(4);
                }
                baseProgressIndicator.g = -1L;
                break;
        }
    }
}
