package ir.mservices.market.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.js3;
import defpackage.to1;
import ir.mservices.market.pika.common.model.ByteArrayResult;

/* JADX INFO: loaded from: classes3.dex */
public final class HorizontalRecyclerView extends RecyclerView {
    public float i1;
    public float j1;
    public boolean k1;
    public to1 l1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        setFocusable(false);
        setHasFixedSize(true);
    }

    public final to1 getDisableInterceptTouchEventCallBack() {
        return this.l1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        to1 to1Var;
        js3.p(motionEvent, ByteArrayResult.AppInfo.IMG_SERIALISED_NAME);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.i1 = motionEvent.getX();
            this.j1 = motionEvent.getY();
        } else if ((action == 2 || action == 3) && Math.abs(this.i1 - motionEvent.getX()) > Math.abs(this.j1 - motionEvent.getY()) && (to1Var = this.l1) != null) {
            to1Var.t(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        to1 to1Var;
        js3.p(motionEvent, ByteArrayResult.AppInfo.IMG_SERIALISED_NAME);
        if (this.k1) {
            s0();
        }
        int action = motionEvent.getAction();
        if (action == 1) {
            to1 to1Var2 = this.l1;
            if (to1Var2 != null) {
                to1Var2.t(false);
            }
        } else if (action == 2 && Math.abs(this.i1 - motionEvent.getX()) > Math.abs(this.j1 - motionEvent.getY()) && (to1Var = this.l1) != null) {
            to1Var.t(true);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setDisableInterceptTouchEventCallBack(to1 to1Var) {
        this.l1 = to1Var;
    }

    public final void setScrolling(boolean z) {
        this.k1 = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HorizontalRecyclerView(Context context) {
        this(context, null);
        js3.p(context, "context");
    }
}
