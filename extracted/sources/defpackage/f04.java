package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.insets.ProtectionLayout;
import com.google.android.material.circularreveal.CircularRevealFrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f04 extends a79 {
    public final FrameLayout A;
    public final RelativeLayout B;
    public final FrameLayout C;
    public final FrameLayout v;
    public final FrameLayout w;
    public final FrameLayout x;
    public final ProtectionLayout y;
    public final CircularRevealFrameLayout z;

    public f04(ea1 ea1Var, View view, FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, ProtectionLayout protectionLayout, CircularRevealFrameLayout circularRevealFrameLayout, FrameLayout frameLayout4, RelativeLayout relativeLayout, FrameLayout frameLayout5) {
        super(0, view, ea1Var);
        this.v = frameLayout;
        this.w = frameLayout2;
        this.x = frameLayout3;
        this.y = protectionLayout;
        this.z = circularRevealFrameLayout;
        this.A = frameLayout4;
        this.B = relativeLayout;
        this.C = frameLayout5;
    }
}
