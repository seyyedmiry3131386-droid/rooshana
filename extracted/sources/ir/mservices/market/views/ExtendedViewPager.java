package ir.mservices.market.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class ExtendedViewPager extends ViewPager {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtendedViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        js3.p(motionEvent, "event");
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExtendedViewPager(Context context) {
        this(context, null);
        js3.p(context, "context");
    }
}
