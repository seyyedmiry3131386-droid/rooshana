package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ee9 extends n70 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ge9 b;

    public /* synthetic */ ee9(ge9 ge9Var, int i) {
        this.a = i;
        this.b = ge9Var;
    }

    @Override // defpackage.z89
    public final void b(View view) {
        View view2;
        int i = this.a;
        ge9 ge9Var = this.b;
        switch (i) {
            case 0:
                if (ge9Var.E && (view2 = ge9Var.w) != null) {
                    view2.setTranslationY(0.0f);
                    ge9Var.t.setTranslationY(0.0f);
                }
                ge9Var.t.setVisibility(8);
                ge9Var.t.setTransitioning(false);
                ge9Var.J = null;
                do3 do3Var = ge9Var.A;
                if (do3Var != null) {
                    do3Var.u(ge9Var.z);
                    ge9Var.z = null;
                    ge9Var.A = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = ge9Var.s;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = q69.a;
                    f69.c(actionBarOverlayLayout);
                }
                break;
            default:
                ge9Var.J = null;
                ge9Var.t.requestLayout();
                break;
        }
    }
}
