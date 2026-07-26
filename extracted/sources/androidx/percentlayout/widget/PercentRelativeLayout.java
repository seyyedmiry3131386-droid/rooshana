package androidx.percentlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import defpackage.t46;
import defpackage.u46;
import defpackage.ut4;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class PercentRelativeLayout extends RelativeLayout {
    public final ut4 a;

    @Deprecated
    public static class LayoutParams extends RelativeLayout.LayoutParams implements u46 {
        public t46 a;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = ut4.j(context, attributeSet);
        }

        @Override // defpackage.u46
        public final t46 a() {
            if (this.a == null) {
                this.a = new t46();
            }
            return this.a;
        }

        @Override // android.view.ViewGroup.LayoutParams
        public final void setBaseAttributes(TypedArray typedArray, int i, int i2) {
            ((ViewGroup.LayoutParams) this).width = typedArray.getLayoutDimension(i, 0);
            ((ViewGroup.LayoutParams) this).height = typedArray.getLayoutDimension(i2, 0);
        }
    }

    public PercentRelativeLayout(Context context) {
        super(context);
        this.a = new ut4(5, this);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.a.o();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        ut4 ut4Var = this.a;
        ut4Var.h(i, i2);
        super.onMeasure(i, i2);
        if (ut4Var.k()) {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public final RelativeLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public PercentRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ut4(5, this);
    }

    public PercentRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new ut4(5, this);
    }
}
