package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.insets.ProtectionLayout;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n60 extends a79 {
    public final FrameLayout v;
    public final LinearLayout w;
    public final ProtectionLayout x;

    public n60(ea1 ea1Var, View view, FrameLayout frameLayout, LinearLayout linearLayout, ProtectionLayout protectionLayout) {
        super(0, view, ea1Var);
        this.v = frameLayout;
        this.w = linearLayout;
        this.x = protectionLayout;
    }
}
