package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n92 extends a79 {
    public final MyketTextView A;
    public final FrameLayout B;
    public final MyketTextView C;
    public final AppIconView v;
    public final ImageButton w;
    public final MyketTextView x;
    public final ImageButton y;
    public final MyketTextView z;

    public n92(ea1 ea1Var, View view, AppIconView appIconView, ImageButton imageButton, MyketTextView myketTextView, ImageButton imageButton2, MyketTextView myketTextView2, MyketTextView myketTextView3, FrameLayout frameLayout, MyketTextView myketTextView4) {
        super(0, view, ea1Var);
        this.v = appIconView;
        this.w = imageButton;
        this.x = myketTextView;
        this.y = imageButton2;
        this.z = myketTextView2;
        this.A = myketTextView3;
        this.B = frameLayout;
        this.C = myketTextView4;
    }
}
