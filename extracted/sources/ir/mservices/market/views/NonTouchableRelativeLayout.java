package ir.mservices.market.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import defpackage.js3;
import ir.mservices.market.pika.common.model.ByteArrayResult;

/* JADX INFO: loaded from: classes3.dex */
public final class NonTouchableRelativeLayout extends RelativeLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NonTouchableRelativeLayout(Context context) {
        this(context, null, 6, 0);
        js3.p(context, "context");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        js3.p(motionEvent, ByteArrayResult.AppInfo.IMG_SERIALISED_NAME);
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NonTouchableRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        js3.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonTouchableRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        js3.p(context, "context");
    }

    public /* synthetic */ NonTouchableRelativeLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
