package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.tabs.TabLayout;
import io.sentry.android.core.t0;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class q69 {
    public static WeakHashMap a = null;
    public static Field b = null;
    public static boolean c = false;
    public static final int[] d = {xr6.accessibility_custom_action_0, xr6.accessibility_custom_action_1, xr6.accessibility_custom_action_2, xr6.accessibility_custom_action_3, xr6.accessibility_custom_action_4, xr6.accessibility_custom_action_5, xr6.accessibility_custom_action_6, xr6.accessibility_custom_action_7, xr6.accessibility_custom_action_8, xr6.accessibility_custom_action_9, xr6.accessibility_custom_action_10, xr6.accessibility_custom_action_11, xr6.accessibility_custom_action_12, xr6.accessibility_custom_action_13, xr6.accessibility_custom_action_14, xr6.accessibility_custom_action_15, xr6.accessibility_custom_action_16, xr6.accessibility_custom_action_17, xr6.accessibility_custom_action_18, xr6.accessibility_custom_action_19, xr6.accessibility_custom_action_20, xr6.accessibility_custom_action_21, xr6.accessibility_custom_action_22, xr6.accessibility_custom_action_23, xr6.accessibility_custom_action_24, xr6.accessibility_custom_action_25, xr6.accessibility_custom_action_26, xr6.accessibility_custom_action_27, xr6.accessibility_custom_action_28, xr6.accessibility_custom_action_29, xr6.accessibility_custom_action_30, xr6.accessibility_custom_action_31};
    public static final c69 e = new c69();
    public static final e69 f = new e69();

    public static void a(View view, ViewGroup viewGroup) {
        viewGroup.getOverlay().add(view);
        View view2 = (View) view.getParent();
        js3.p(view2, "<this>");
        view2.setTag(yr6.view_tree_disjoint_parent, viewGroup);
    }

    public static x89 b(View view) {
        if (a == null) {
            a = new WeakHashMap();
        }
        x89 x89Var = (x89) a.get(view);
        if (x89Var != null) {
            return x89Var;
        }
        x89 x89Var2 = new x89(view);
        a.put(view, x89Var2);
        return x89Var2;
    }

    public static lf9 c(View view, lf9 lf9Var) {
        int i = Build.VERSION.SDK_INT;
        WindowInsets windowInsetsG = lf9Var.g();
        if (windowInsetsG != null) {
            WindowInsets windowInsetsA = i >= 30 ? n69.a(view, windowInsetsG) : f69.a(view, windowInsetsG);
            if (!windowInsetsA.equals(windowInsetsG)) {
                return lf9.h(view, windowInsetsA);
            }
        }
        return lf9Var;
    }

    public static boolean d(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = p69.d;
        p69 p69Var = (p69) view.getTag(xr6.tag_unhandled_key_event_manager);
        if (p69Var == null) {
            p69Var = new p69();
            p69Var.a = null;
            p69Var.b = null;
            p69Var.c = null;
            view.setTag(xr6.tag_unhandled_key_event_manager, p69Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = p69Var.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = p69.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (p69Var.a == null) {
                            p69Var.a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = p69.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                p69Var.a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    p69Var.a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewA = p69Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (p69Var.b == null) {
                    p69Var.b = new SparseArray();
                }
                p69Var.b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static View.AccessibilityDelegate e(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return m69.a(view);
        }
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static CharSequence f(View view) {
        Object tag;
        int i = xr6.tag_accessibility_pane_title;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = l69.a(view);
        } else {
            tag = view.getTag(i);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList g(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(xr6.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(xr6.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] h(AppCompatEditText appCompatEditText) {
        return Build.VERSION.SDK_INT >= 31 ? o69.a(appCompatEditText) : (String[]) appCompatEditText.getTag(xr6.tag_on_receive_content_mime_types);
    }

    public static qf9 i(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return n69.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return new qf9(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void j(int i, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = f(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(f(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e2) {
                        t0.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(f(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static lf9 k(View view, lf9 lf9Var) {
        WindowInsets windowInsetsG = lf9Var.g();
        if (windowInsetsG != null) {
            WindowInsets windowInsetsB = f69.b(view, windowInsetsG);
            if (!windowInsetsB.equals(windowInsetsG)) {
                return lf9.h(view, windowInsetsB);
            }
        }
        return lf9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void l(int r5, android.view.View r6) {
        /*
            r0 = -1
            if (r5 != r0) goto L5
        L3:
            r3 = r0
            goto L3f
        L5:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            r3 = 6
            r4 = 0
            if (r1 >= r2) goto L16
            switch(r5) {
                case 21: goto L15;
                case 22: goto L13;
                case 23: goto L15;
                case 24: goto L13;
                case 25: goto L11;
                case 26: goto L15;
                case 27: goto L13;
                default: goto L10;
            }
        L10:
            goto L16
        L11:
            r5 = r4
            goto L16
        L13:
            r5 = 4
            goto L16
        L15:
            r5 = r3
        L16:
            r2 = 30
            if (r1 >= r2) goto L2f
            r2 = 12
            if (r5 == r2) goto L2d
            r2 = 13
            if (r5 == r2) goto L30
            r2 = 16
            if (r5 == r2) goto L2d
            r2 = 17
            if (r5 == r2) goto L2b
            goto L2f
        L2b:
            r3 = r4
            goto L30
        L2d:
            r3 = 1
            goto L30
        L2f:
            r3 = r5
        L30:
            r5 = 27
            if (r1 >= r5) goto L3f
            r5 = 7
            if (r3 == r5) goto L3
            r5 = 8
            if (r3 == r5) goto L3
            r5 = 9
            if (r3 == r5) goto L3
        L3f:
            if (r3 != r0) goto L42
            return
        L42:
            r6.performHapticFeedback(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q69.l(int, android.view.View):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f41 m(View view, f41 f41Var) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(f41Var);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o69.b(view, f41Var);
        }
        mj8 mj8Var = (mj8) view.getTag(xr6.tag_on_receive_content_listener);
        pt5 pt5Var = e;
        if (mj8Var == null) {
            if (view instanceof pt5) {
                pt5Var = (pt5) view;
            }
            return pt5Var.a(f41Var);
        }
        f41 f41VarA = mj8.a(view, f41Var);
        if (f41VarA == null) {
            return null;
        }
        if (view instanceof pt5) {
            pt5Var = (pt5) view;
        }
        return pt5Var.a(f41VarA);
    }

    public static void n(int i, View view) {
        ArrayList arrayListG = g(view);
        for (int i2 = 0; i2 < arrayListG.size(); i2++) {
            if (((o3) arrayListG.get(i2)).a() == i) {
                arrayListG.remove(i2);
                return;
            }
        }
    }

    public static void o(View view, o3 o3Var, String str, d4 d4Var) {
        if (d4Var == null && str == null) {
            n(o3Var.a(), view);
            j(0, view);
            return;
        }
        o3 o3Var2 = new o3(null, o3Var.b, str, d4Var, o3Var.c);
        View.AccessibilityDelegate accessibilityDelegateE = e(view);
        h3 h3Var = accessibilityDelegateE == null ? null : accessibilityDelegateE instanceof g3 ? ((g3) accessibilityDelegateE).a : new h3(accessibilityDelegateE);
        if (h3Var == null) {
            h3Var = new h3();
        }
        q(view, h3Var);
        n(o3Var2.a(), view);
        g(view).add(o3Var2);
        j(0, view);
    }

    public static void p(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            m69.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void q(View view, h3 h3Var) {
        if (h3Var == null && (e(view) instanceof g3)) {
            h3Var = new h3();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(h3Var == null ? null : h3Var.b);
    }

    public static void r(View view, CharSequence charSequence) {
        new d69(xr6.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).f(view, charSequence);
        e69 e69Var = f;
        if (charSequence == null) {
            e69Var.a.remove(view);
            view.removeOnAttachStateChangeListener(e69Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(e69Var);
        } else {
            e69Var.a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(e69Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(e69Var);
            }
        }
    }

    public static void s(TabLayout.TabView tabView, hl5 hl5Var) {
        if (Build.VERSION.SDK_INT >= 24) {
            j69.a(tabView, (PointerIcon) hl5Var.b);
        }
    }

    public static void t(View view, mu0 mu0Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            se9.h(view, mu0Var);
            return;
        }
        PathInterpolator pathInterpolator = pe9.e;
        View.OnApplyWindowInsetsListener oe9Var = mu0Var != null ? new oe9(view, mu0Var) : null;
        view.setTag(xr6.tag_window_insets_animation_callback, oe9Var);
        if (view.getTag(xr6.tag_compat_insets_dispatch) == null && view.getTag(xr6.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(oe9Var);
        }
    }
}
