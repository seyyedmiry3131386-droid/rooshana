package ir.mservices.market.common.ui.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.re0;

/* JADX INFO: loaded from: classes3.dex */
public class ScrollAwareFabBehavior extends FloatingActionButton.Behavior {
    public ScrollAwareFabBehavior() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void p(int i, View view) {
        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
        if (i > 0 && floatingActionButton.getVisibility() == 0) {
            floatingActionButton.h(new re0(), true);
        } else {
            if (i >= 0 || floatingActionButton.getVisibility() == 0) {
                return;
            }
            floatingActionButton.l(null, true);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean u(int i, View view) {
        return i == 2;
    }

    public ScrollAwareFabBehavior(Context context, AttributeSet attributeSet) {
    }
}
