package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.widget.ContentLoadingProgressBar;
import defpackage.h41;

/* JADX INFO: loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {
    public static final /* synthetic */ int c = 0;
    public final h41 a;
    public final h41 b;

    public ContentLoadingProgressBar(Context context) {
        this(context, null);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.a);
        removeCallbacks(this.b);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.a);
        removeCallbacks(this.b);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [h41] */
    /* JADX WARN: Type inference failed for: r2v2, types: [h41] */
    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        final int i = 0;
        this.a = new Runnable(this) { // from class: h41
            public final /* synthetic */ ContentLoadingProgressBar b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                ContentLoadingProgressBar contentLoadingProgressBar = this.b;
                switch (i2) {
                    case 0:
                        int i3 = ContentLoadingProgressBar.c;
                        contentLoadingProgressBar.setVisibility(8);
                        break;
                    default:
                        int i4 = ContentLoadingProgressBar.c;
                        contentLoadingProgressBar.getClass();
                        System.currentTimeMillis();
                        contentLoadingProgressBar.setVisibility(0);
                        break;
                }
            }
        };
        final int i2 = 1;
        this.b = new Runnable(this) { // from class: h41
            public final /* synthetic */ ContentLoadingProgressBar b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                ContentLoadingProgressBar contentLoadingProgressBar = this.b;
                switch (i22) {
                    case 0:
                        int i3 = ContentLoadingProgressBar.c;
                        contentLoadingProgressBar.setVisibility(8);
                        break;
                    default:
                        int i4 = ContentLoadingProgressBar.c;
                        contentLoadingProgressBar.getClass();
                        System.currentTimeMillis();
                        contentLoadingProgressBar.setVisibility(0);
                        break;
                }
            }
        };
    }
}
