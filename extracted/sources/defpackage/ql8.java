package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public final class ql8 extends View.AccessibilityDelegate {
    public final /* synthetic */ Resources a;
    public final /* synthetic */ int b;

    public ql8(Resources resources, int i) {
        this.a = resources;
        this.b = i;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.a.getString(this.b));
    }
}
