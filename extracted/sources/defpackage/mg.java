package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.core.view.a;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class mg implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ng ngVar = (ng) obj;
                Context context = view.getContext();
                if (!ngVar.d) {
                    context.getApplicationContext().registerComponentCallbacks(ngVar.e);
                    ngVar.d = true;
                }
                break;
            case 2:
                y12 y12Var = (y12) obj;
                AccessibilityManager accessibilityManager = y12Var.t;
                if (y12Var.u != null && accessibilityManager != null && y12Var.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(y12Var.u);
                    break;
                }
                break;
            case 3:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = q69.a;
                f69.c(view2);
                break;
            case 6:
                js3.p(view, "v");
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        int i = this.a;
        boolean z = false;
        Object obj = this.b;
        switch (i) {
            case 0:
                ng ngVar = (ng) obj;
                Context context = view.getContext();
                if (ngVar.d) {
                    context.getApplicationContext().unregisterComponentCallbacks(ngVar.e);
                    ngVar.d = false;
                }
                break;
            case 1:
                on0 on0Var = (on0) obj;
                ViewTreeObserver viewTreeObserver = on0Var.x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        on0Var.x = view.getViewTreeObserver();
                    }
                    on0Var.x.removeGlobalOnLayoutListener(on0Var.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 2:
                y12 y12Var = (y12) obj;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = y12Var.u;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = y12Var.t) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
                break;
            case 3:
                break;
            case 4:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) obj;
                uy2 uy2Var = hideBottomViewOnScrollBehavior.h;
                if (uy2Var != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.g) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(uy2Var);
                    hideBottomViewOnScrollBehavior.h = null;
                    break;
                }
                break;
            case 5:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) obj;
                uy2 uy2Var2 = hideViewOnScrollBehavior.c;
                if (uy2Var2 != null && (accessibilityManager3 = hideViewOnScrollBehavior.b) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(uy2Var2);
                    hideViewOnScrollBehavior.c = null;
                    break;
                }
                break;
            case 6:
                js3.p(view, "v");
                ((PagingRecyclerListContentFragment) obj).Y0 = false;
                break;
            case 7:
                l48 l48Var = (l48) obj;
                ViewTreeObserver viewTreeObserver2 = l48Var.o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        l48Var.o = view.getViewTreeObserver();
                    }
                    l48Var.o.removeGlobalOnLayoutListener(l48Var.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 8:
                AbstractComposeView abstractComposeView = (AbstractComposeView) obj;
                int i2 = zh6.a;
                Iterator it = a.b(abstractComposeView).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj2 = (ViewParent) it.next();
                        if (obj2 instanceof View) {
                            View view2 = (View) obj2;
                            js3.p(view2, "<this>");
                            Object tag = view2.getTag(zh6.b);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z = true;
                            }
                        }
                    }
                }
                if (!z) {
                    abstractComposeView.d();
                }
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((li1) obj).g(null);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }

    private final void f(View view) {
    }

    private final void g(View view) {
    }
}
