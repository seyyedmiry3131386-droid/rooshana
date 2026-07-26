package ir.mservices.market.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class ExtendedSwipeRefreshLayout extends SwipeRefreshLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtendedSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        js3.p(motionEvent, "ev");
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExtendedSwipeRefreshLayout(Context context) {
        this(context, null);
        js3.p(context, "context");
    }
}
