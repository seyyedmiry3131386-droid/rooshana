package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uy2 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ CoordinatorLayout.Behavior c;

    public /* synthetic */ uy2(CoordinatorLayout.Behavior behavior, View view, int i) {
        this.a = i;
        this.c = behavior;
        this.b = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        int i = this.a;
        View view = this.b;
        CoordinatorLayout.Behavior behavior = this.c;
        switch (i) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) behavior;
                int i2 = HideBottomViewOnScrollBehavior.m;
                if (z && hideBottomViewOnScrollBehavior.j == 1) {
                    hideBottomViewOnScrollBehavior.y(view);
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) behavior;
                if (hideViewOnScrollBehavior.d && z && hideViewOnScrollBehavior.k == 1) {
                    hideViewOnScrollBehavior.z(view);
                    break;
                }
                break;
        }
    }
}
