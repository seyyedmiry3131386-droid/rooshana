package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class xt4 extends FrameLayout implements pu0 {
    public final CollapsibleActionView a;

    /* JADX WARN: Multi-variable type inference failed */
    public xt4(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // defpackage.pu0
    public final void onActionViewCollapsed() {
        this.a.onActionViewCollapsed();
    }

    @Override // defpackage.pu0
    public final void onActionViewExpanded() {
        this.a.onActionViewExpanded();
    }
}
