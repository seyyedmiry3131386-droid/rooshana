package ir.mservices.market.views;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;
import defpackage.bp2;
import defpackage.js3;
import defpackage.pj;
import defpackage.qq1;

/* JADX INFO: loaded from: classes3.dex */
public final class DownloadProgressBar extends ProgressBar {
    public static final /* synthetic */ int c = 0;
    public boolean a;
    public ValueAnimator b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DownloadProgressBar(Context context) {
        this(context, null, 6, 0);
        js3.p(context, "context");
    }

    public final void a(int i) {
        b(i, new qq1(1));
    }

    public final void b(int i, bp2 bp2Var) {
        if (i <= 0) {
            setProgress(0);
            this.a = true;
            return;
        }
        int i2 = i * 100;
        if (this.a) {
            setProgress(i2);
            this.a = false;
            return;
        }
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getProgress(), i2);
        valueAnimatorOfInt.setDuration(1000L);
        valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new pj(bp2Var, this, 4));
        valueAnimatorOfInt.start();
        this.b = valueAnimatorOfInt;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a = true;
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
        }
        this.b = null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DownloadProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        js3.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        js3.p(context, "context");
        this.a = true;
        setMax(10000);
    }

    public /* synthetic */ DownloadProgressBar(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, R.attr.progressBarStyleHorizontal);
    }
}
