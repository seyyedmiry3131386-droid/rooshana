package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class s62 extends nm5 {
    public final /* synthetic */ t62 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s62(t62 t62Var) {
        super(2);
        this.d = t62Var;
    }

    @Override // defpackage.nm5
    public final t3 g(int i) {
        return new t3(AccessibilityNodeInfo.obtain(this.d.r(i).a));
    }

    @Override // defpackage.nm5
    public final t3 j(int i) {
        t62 t62Var = this.d;
        int i2 = i == 2 ? t62Var.k : t62Var.l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return g(i2);
    }

    @Override // defpackage.nm5
    public final boolean w(int i, int i2, Bundle bundle) {
        int i3;
        t62 t62Var = this.d;
        View view = t62Var.i;
        if (i == -1) {
            WeakHashMap weakHashMap = q69.a;
            return view.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            return t62Var.w(i);
        }
        if (i2 == 2) {
            return t62Var.j(i);
        }
        if (i2 != 64) {
            if (i2 != 128) {
                return t62Var.s(i, i2, bundle);
            }
            if (t62Var.k != i) {
                return false;
            }
            t62Var.k = Integer.MIN_VALUE;
            view.invalidate();
            t62Var.x(i, 65536);
            return true;
        }
        AccessibilityManager accessibilityManager = t62Var.h;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = t62Var.k) == i) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            t62Var.k = Integer.MIN_VALUE;
            view.invalidate();
            t62Var.x(i3, 65536);
        }
        t62Var.k = i;
        view.invalidate();
        t62Var.x(i, 32768);
        return true;
    }
}
