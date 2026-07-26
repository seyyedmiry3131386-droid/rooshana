package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class gw1 extends h3 {
    public final /* synthetic */ int d;
    public final Object e;
    public final Object f;

    public gw1(f07 f07Var) {
        this.d = 1;
        this.f = new WeakHashMap();
        this.e = f07Var;
    }

    @Override // defpackage.h3
    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        int i = this.d;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        Object obj = this.f;
        switch (i) {
            case 0:
                DrawerLayout drawerLayout = (DrawerLayout) obj;
                if (accessibilityEvent.getEventType() != 32) {
                    return accessibilityDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
                }
                List<CharSequence> text = accessibilityEvent.getText();
                View viewE = drawerLayout.e();
                if (viewE != null) {
                    int iG = drawerLayout.g(viewE);
                    drawerLayout.getClass();
                    WeakHashMap weakHashMap = q69.a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(iG, drawerLayout.getLayoutDirection());
                    CharSequence charSequence = absoluteGravity == 3 ? drawerLayout.z : absoluteGravity == 5 ? drawerLayout.A : null;
                    if (charSequence != null) {
                        text.add(charSequence);
                    }
                }
                return true;
            case 1:
                h3 h3Var = (h3) ((WeakHashMap) obj).get(view);
                return h3Var != null ? h3Var.a(view, accessibilityEvent) : accessibilityDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            default:
                return super.a(view, accessibilityEvent);
        }
    }

    @Override // defpackage.h3
    public nm5 b(View view) {
        switch (this.d) {
            case 1:
                h3 h3Var = (h3) ((WeakHashMap) this.f).get(view);
                if (h3Var == null) {
                }
                break;
        }
        return super.b(view);
    }

    @Override // defpackage.h3
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 0:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
                break;
            case 1:
                h3 h3Var = (h3) ((WeakHashMap) this.f).get(view);
                if (h3Var == null) {
                    super.c(view, accessibilityEvent);
                } else {
                    h3Var.c(view, accessibilityEvent);
                }
                break;
            default:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
                break;
        }
    }

    @Override // defpackage.h3
    public final void d(View view, t3 t3Var) {
        int i = this.d;
        Object obj = this.f;
        Object obj2 = this.e;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        switch (i) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = t3Var.a;
                if (DrawerLayout.N) {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                } else {
                    AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoObtain);
                    t3Var.c = -1;
                    accessibilityNodeInfo.setSource(view);
                    WeakHashMap weakHashMap = q69.a;
                    Object parentForAccessibility = view.getParentForAccessibility();
                    if (parentForAccessibility instanceof View) {
                        t3Var.b = -1;
                        accessibilityNodeInfo.setParent((View) parentForAccessibility);
                    }
                    Rect rect = (Rect) obj2;
                    accessibilityNodeInfoObtain.getBoundsInScreen(rect);
                    t3Var.l(rect);
                    t3Var.A(accessibilityNodeInfoObtain.isVisibleToUser());
                    accessibilityNodeInfo.setPackageName(accessibilityNodeInfoObtain.getPackageName());
                    t3Var.m(accessibilityNodeInfoObtain.getClassName());
                    t3Var.p(accessibilityNodeInfoObtain.getContentDescription());
                    accessibilityNodeInfo.setEnabled(accessibilityNodeInfoObtain.isEnabled());
                    accessibilityNodeInfo.setFocused(accessibilityNodeInfoObtain.isFocused());
                    t3Var.i(accessibilityNodeInfoObtain.isAccessibilityFocused());
                    accessibilityNodeInfo.setSelected(accessibilityNodeInfoObtain.isSelected());
                    t3Var.a(accessibilityNodeInfoObtain.getActions());
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (DrawerLayout.h(childAt)) {
                            accessibilityNodeInfo.addChild(childAt);
                        }
                    }
                }
                t3Var.m("androidx.drawerlayout.widget.DrawerLayout");
                accessibilityNodeInfo.setFocusable(false);
                accessibilityNodeInfo.setFocused(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) o3.e.a);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) o3.f.a);
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = t3Var.a;
                f07 f07Var = (f07) obj2;
                RecyclerView recyclerView = f07Var.d;
                RecyclerView recyclerView2 = f07Var.d;
                if (recyclerView.Q() || recyclerView2.getLayoutManager() == null) {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                } else {
                    recyclerView2.getLayoutManager().X(view, t3Var);
                    h3 h3Var = (h3) ((WeakHashMap) obj).get(view);
                    if (h3Var != null) {
                        h3Var.d(view, t3Var);
                    } else {
                        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                    }
                }
                break;
            default:
                SlidingPaneLayout slidingPaneLayout = (SlidingPaneLayout) obj;
                AccessibilityNodeInfo accessibilityNodeInfo3 = t3Var.a;
                AccessibilityNodeInfo accessibilityNodeInfoObtain2 = AccessibilityNodeInfo.obtain(accessibilityNodeInfo3);
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoObtain2);
                Rect rect2 = (Rect) obj2;
                accessibilityNodeInfoObtain2.getBoundsInScreen(rect2);
                t3Var.l(rect2);
                t3Var.A(accessibilityNodeInfoObtain2.isVisibleToUser());
                accessibilityNodeInfo3.setPackageName(accessibilityNodeInfoObtain2.getPackageName());
                t3Var.m(accessibilityNodeInfoObtain2.getClassName());
                t3Var.p(accessibilityNodeInfoObtain2.getContentDescription());
                accessibilityNodeInfo3.setEnabled(accessibilityNodeInfoObtain2.isEnabled());
                accessibilityNodeInfo3.setClickable(accessibilityNodeInfoObtain2.isClickable());
                accessibilityNodeInfo3.setFocusable(accessibilityNodeInfoObtain2.isFocusable());
                accessibilityNodeInfo3.setFocused(accessibilityNodeInfoObtain2.isFocused());
                t3Var.i(accessibilityNodeInfoObtain2.isAccessibilityFocused());
                accessibilityNodeInfo3.setSelected(accessibilityNodeInfoObtain2.isSelected());
                accessibilityNodeInfo3.setLongClickable(accessibilityNodeInfoObtain2.isLongClickable());
                t3Var.a(accessibilityNodeInfoObtain2.getActions());
                accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfoObtain2.getMovementGranularities());
                t3Var.m("androidx.slidingpanelayout.widget.SlidingPaneLayout");
                t3Var.c = -1;
                accessibilityNodeInfo3.setSource(view);
                WeakHashMap weakHashMap2 = q69.a;
                Object parentForAccessibility2 = view.getParentForAccessibility();
                if (parentForAccessibility2 instanceof View) {
                    t3Var.b = -1;
                    accessibilityNodeInfo3.setParent((View) parentForAccessibility2);
                }
                int childCount2 = slidingPaneLayout.getChildCount();
                for (int i3 = 0; i3 < childCount2; i3++) {
                    View childAt2 = slidingPaneLayout.getChildAt(i3);
                    if (!slidingPaneLayout.b(childAt2) && childAt2.getVisibility() == 0) {
                        childAt2.setImportantForAccessibility(1);
                        accessibilityNodeInfo3.addChild(childAt2);
                    }
                }
                break;
        }
    }

    @Override // defpackage.h3
    public void e(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 1:
                h3 h3Var = (h3) ((WeakHashMap) this.f).get(view);
                if (h3Var == null) {
                    super.e(view, accessibilityEvent);
                } else {
                    h3Var.e(view, accessibilityEvent);
                }
                break;
            default:
                super.e(view, accessibilityEvent);
                break;
        }
    }

    @Override // defpackage.h3
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 0:
                if (DrawerLayout.N || DrawerLayout.h(view)) {
                }
                break;
            case 1:
                h3 h3Var = (h3) ((WeakHashMap) this.f).get(viewGroup);
                if (h3Var == null) {
                }
                break;
            default:
                if (!((SlidingPaneLayout) this.f).b(view)) {
                }
                break;
        }
        return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.h3
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.d) {
            case 1:
                f07 f07Var = (f07) this.e;
                RecyclerView recyclerView = f07Var.d;
                RecyclerView recyclerView2 = f07Var.d;
                if (!recyclerView.Q() && recyclerView2.getLayoutManager() != null) {
                    h3 h3Var = (h3) ((WeakHashMap) this.f).get(view);
                    if (h3Var == null ? !super.g(view, i, bundle) : !h3Var.g(view, i, bundle)) {
                        l lVar = recyclerView2.getLayoutManager().b.c;
                    }
                }
                break;
        }
        return super.g(view, i, bundle);
    }

    @Override // defpackage.h3
    public void h(View view, int i) {
        switch (this.d) {
            case 1:
                h3 h3Var = (h3) ((WeakHashMap) this.f).get(view);
                if (h3Var == null) {
                    super.h(view, i);
                } else {
                    h3Var.h(view, i);
                }
                break;
            default:
                super.h(view, i);
                break;
        }
    }

    @Override // defpackage.h3
    public void i(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 1:
                h3 h3Var = (h3) ((WeakHashMap) this.f).get(view);
                if (h3Var == null) {
                    super.i(view, accessibilityEvent);
                } else {
                    h3Var.i(view, accessibilityEvent);
                }
                break;
            default:
                super.i(view, accessibilityEvent);
                break;
        }
    }

    public gw1(SlidingPaneLayout slidingPaneLayout) {
        this.d = 2;
        this.f = slidingPaneLayout;
        this.e = new Rect();
    }

    public gw1(DrawerLayout drawerLayout) {
        this.d = 0;
        this.f = drawerLayout;
        this.e = new Rect();
    }
}
