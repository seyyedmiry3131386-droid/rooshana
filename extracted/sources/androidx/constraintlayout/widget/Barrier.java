package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.widget.Constraints;
import defpackage.b31;
import defpackage.eu6;
import defpackage.f31;
import defpackage.g31;
import defpackage.l50;
import defpackage.oy2;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends ConstraintHelper {
    public int j;
    public int k;
    public l50 l;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.l.x0;
    }

    public int getMargin() {
        return this.l.y0;
    }

    public int getType() {
        return this.j;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        this.l = new l50();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, eu6.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == eu6.ConstraintLayout_Layout_barrierDirection) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == eu6.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.l.x0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == eu6.ConstraintLayout_Layout_barrierMargin) {
                    this.l.y0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
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
        b31 b31Var = cVar.e;
        if (oy2Var instanceof l50) {
            l50 l50Var = (l50) oy2Var;
            r(l50Var, b31Var.g0, ((g31) oy2Var.V).z0);
            l50Var.x0 = b31Var.o0;
            l50Var.y0 = b31Var.h0;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void m(f31 f31Var, boolean z) {
        r(f31Var, this.j, z);
    }

    public final void r(f31 f31Var, int i, boolean z) {
        this.k = i;
        if (z) {
            int i2 = this.j;
            if (i2 == 5) {
                this.k = 1;
            } else if (i2 == 6) {
                this.k = 0;
            }
        } else {
            int i3 = this.j;
            if (i3 == 5) {
                this.k = 0;
            } else if (i3 == 6) {
                this.k = 1;
            }
        }
        if (f31Var instanceof l50) {
            ((l50) f31Var).w0 = this.k;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.l.x0 = z;
    }

    public void setDpMargin(int i) {
        this.l.y0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.l.y0 = i;
    }

    public void setType(int i) {
        this.j = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
