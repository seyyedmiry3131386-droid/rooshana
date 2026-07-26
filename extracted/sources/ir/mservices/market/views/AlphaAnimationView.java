package ir.mservices.market.views;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.view.View;
import defpackage.js3;
import defpackage.sj8;
import defpackage.yq6;

/* JADX INFO: loaded from: classes3.dex */
public final class AlphaAnimationView extends View {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AlphaAnimationView(Context context) {
        this(context, null, 6, 0);
        js3.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AlphaAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        js3.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlphaAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        js3.p(context, "context");
        setBackgroundResource(yq6.skeleton_view_bg);
        if (getBackground() != null) {
            getBackground().setColorFilter(new PorterDuffColorFilter(sj8.b().p, PorterDuff.Mode.MULTIPLY));
        }
    }

    public /* synthetic */ AlphaAnimationView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
