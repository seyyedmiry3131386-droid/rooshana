package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.q62;
import defpackage.r62;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {
    public int a;

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public abstract boolean f(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object obj = (r62) view2;
        boolean z = ((FloatingActionButton) obj).o.b;
        if (z) {
            int i = this.a;
            if (i != 0 && i != 2) {
                return false;
            }
        } else if (this.a != 1) {
            return false;
        }
        this.a = z ? 1 : 2;
        y((View) obj, view, z, true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        r62 r62Var;
        int i2;
        if (!view.isLaidOut()) {
            ArrayList arrayListO = coordinatorLayout.o(view);
            int size = arrayListO.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    r62Var = null;
                    break;
                }
                View view2 = (View) arrayListO.get(i3);
                if (f(view, view2)) {
                    r62Var = (r62) view2;
                    break;
                }
                i3++;
            }
            if (r62Var != null) {
                boolean z = ((FloatingActionButton) r62Var).o.b;
                if (!z ? this.a == 1 : !((i2 = this.a) != 0 && i2 != 2)) {
                    int i4 = z ? 1 : 2;
                    this.a = i4;
                    view.getViewTreeObserver().addOnPreDrawListener(new q62(this, view, i4, r62Var));
                }
            }
        }
        return false;
    }

    public abstract void y(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior() {
        this.a = 0;
    }
}
