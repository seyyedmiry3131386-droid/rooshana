package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class u3 extends AccessibilityNodeProvider {
    public final nm5 a;

    public u3(nm5 nm5Var) {
        this.a = nm5Var;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        t3 t3VarG = this.a.g(i);
        if (t3VarG == null) {
            return null;
        }
        return t3VarG.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        t3 t3VarJ = this.a.j(i);
        if (t3VarJ == null) {
            return null;
        }
        return t3VarJ.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.a.w(i, i2, bundle);
    }
}
