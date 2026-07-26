package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.VirtualLayout;
import androidx.constraintlayout.widget.c;
import defpackage.eu6;
import defpackage.f31;
import defpackage.oy2;
import defpackage.sa9;
import defpackage.ye2;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends VirtualLayout {
    public ye2 l;

    public Flow(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        this.l = new ye2();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, eu6.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == eu6.ConstraintLayout_Layout_android_orientation) {
                    this.l.Z0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == eu6.ConstraintLayout_Layout_android_padding) {
                    ye2 ye2Var = this.l;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    ye2Var.w0 = dimensionPixelSize;
                    ye2Var.x0 = dimensionPixelSize;
                    ye2Var.y0 = dimensionPixelSize;
                    ye2Var.z0 = dimensionPixelSize;
                } else if (index == eu6.ConstraintLayout_Layout_android_paddingStart) {
                    ye2 ye2Var2 = this.l;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    ye2Var2.y0 = dimensionPixelSize2;
                    ye2Var2.A0 = dimensionPixelSize2;
                    ye2Var2.B0 = dimensionPixelSize2;
                } else if (index == eu6.ConstraintLayout_Layout_android_paddingEnd) {
                    this.l.z0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == eu6.ConstraintLayout_Layout_android_paddingLeft) {
                    this.l.A0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == eu6.ConstraintLayout_Layout_android_paddingTop) {
                    this.l.w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == eu6.ConstraintLayout_Layout_android_paddingRight) {
                    this.l.B0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == eu6.ConstraintLayout_Layout_android_paddingBottom) {
                    this.l.x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == eu6.ConstraintLayout_Layout_flow_wrapMode) {
                    this.l.X0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == eu6.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.l.H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == eu6.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.l.I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == eu6.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.l.J0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == eu6.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.l.L0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == eu6.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.l.K0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == eu6.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.l.M0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == eu6.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.l.N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == eu6.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.l.P0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == eu6.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.l.R0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == eu6.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.l.Q0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == eu6.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.l.S0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == eu6.ConstraintLayout_Layout_flow_verticalBias) {
                    this.l.O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == eu6.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.l.V0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == eu6.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.l.W0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == eu6.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.l.T0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == eu6.ConstraintLayout_Layout_flow_verticalGap) {
                    this.l.U0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == eu6.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.l.Y0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.d = this.l;
        q();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void l(c cVar, oy2 oy2Var, Constraints.LayoutParams layoutParams, SparseArray sparseArray) {
        super.l(cVar, oy2Var, layoutParams, sparseArray);
        if (oy2Var instanceof ye2) {
            ye2 ye2Var = (ye2) oy2Var;
            int i = layoutParams.V;
            if (i != -1) {
                ye2Var.Z0 = i;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void m(f31 f31Var, boolean z) {
        ye2 ye2Var = this.l;
        int i = ye2Var.y0;
        if (i > 0 || ye2Var.z0 > 0) {
            if (z) {
                ye2Var.A0 = ye2Var.z0;
                ye2Var.B0 = i;
            } else {
                ye2Var.A0 = i;
                ye2Var.B0 = ye2Var.z0;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onMeasure(int i, int i2) {
        r(this.l, i, i2);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public final void r(sa9 sa9Var, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (sa9Var == null) {
            setMeasuredDimension(0, 0);
        } else {
            sa9Var.V(mode, size, mode2, size2);
            setMeasuredDimension(sa9Var.D0, sa9Var.E0);
        }
    }

    public void setFirstHorizontalBias(float f) {
        this.l.P0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.l.J0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.l.Q0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.l.K0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.l.V0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.l.N0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.l.T0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.l.H0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.l.R0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.l.L0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.l.S0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.l.M0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.l.Y0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.l.Z0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        ye2 ye2Var = this.l;
        ye2Var.w0 = i;
        ye2Var.x0 = i;
        ye2Var.y0 = i;
        ye2Var.z0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.l.x0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.l.A0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.l.B0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.l.w0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.l.W0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.l.O0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.l.U0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.l.I0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.l.X0 = i;
        requestLayout();
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
