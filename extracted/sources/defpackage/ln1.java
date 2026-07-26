package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ir.mservices.market.views.DialogHeaderComponent;
import ir.mservices.market.views.LoginInfoView;
import ir.mservices.market.virtualKeyboard.VirtualKeyboardView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ln1 extends a79 {
    public static final /* synthetic */ int D = 0;
    public final VirtualKeyboardView A;
    public final ImageView B;
    public final ImageView C;
    public final FrameLayout v;
    public final View w;
    public final View x;
    public final DialogHeaderComponent y;
    public final LoginInfoView z;

    public ln1(ea1 ea1Var, View view, FrameLayout frameLayout, View view2, View view3, DialogHeaderComponent dialogHeaderComponent, LoginInfoView loginInfoView, VirtualKeyboardView virtualKeyboardView, ImageView imageView, ImageView imageView2) {
        super(0, view, ea1Var);
        this.v = frameLayout;
        this.w = view2;
        this.x = view3;
        this.y = dialogHeaderComponent;
        this.z = loginInfoView;
        this.A = virtualKeyboardView;
        this.B = imageView;
        this.C = imageView2;
    }
}
