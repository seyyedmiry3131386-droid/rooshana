package androidx.compose.ui.graphics.layer.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.graphics.layer.ViewLayer;
import defpackage.js3;
import defpackage.tm0;
import defpackage.ve;
import defpackage.vr6;

/* JADX INFO: loaded from: classes.dex */
public class DrawChildContainer extends ViewGroup {
    public boolean a;

    public DrawChildContainer(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        setTag(vr6.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
    }

    public final void a(tm0 tm0Var, View view, long j) {
        super.drawChild(ve.a(tm0Var), view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            js3.n(childAt, "null cannot be cast to non-null type androidx.compose.ui.graphics.layer.ViewLayer");
            if (((ViewLayer) childAt).d) {
                this.a = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.a = false;
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.a) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
