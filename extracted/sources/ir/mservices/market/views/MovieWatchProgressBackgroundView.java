package ir.mservices.market.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import defpackage.b77;
import defpackage.eq6;
import defpackage.i85;
import defpackage.js3;
import defpackage.pq6;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieWatchProgressBackgroundView extends Hilt_MovieWatchProgressBackgroundView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MovieWatchProgressBackgroundView(Context context) {
        this(context, null);
        js3.p(context, "context");
    }

    public final void setBackgroundRadius(int i) {
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        Resources resources = getContext().getResources();
        int i2 = eq6.transparent;
        ThreadLocal threadLocal = b77.a;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{resources.getColor(i2, null), getContext().getResources().getColor(eq6.movie_watch_progress_background, null)});
        float f = i;
        gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, f, f});
        setBackground(gradientDrawable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieWatchProgressBackgroundView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        if (!isInEditMode() && !this.b) {
            this.b = true;
            ((i85) e()).getClass();
        }
        setBackgroundRadius(context.getResources().getDimensionPixelSize(pq6.space_4));
    }
}
