package defpackage;

import androidx.compose.material.ripple.RippleContainer;
import androidx.compose.material.ripple.RippleHostView;
import androidx.compose.material.ripple.RippleNode;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ph extends RippleNode {
    public RippleContainer x;
    public RippleHostView y;

    @Override // defpackage.gx4
    public final void u0() {
        RippleContainer rippleContainer = this.x;
        if (rippleContainer != null) {
            this.y = null;
            rf0.z(this);
            bn6 bn6Var = rippleContainer.d;
            RippleHostView rippleHostView = (RippleHostView) ((LinkedHashMap) bn6Var.b).get(this);
            if (rippleHostView != null) {
                rippleHostView.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) bn6Var.b;
                RippleHostView rippleHostView2 = (RippleHostView) linkedHashMap.get(this);
                if (rippleHostView2 != null) {
                }
                linkedHashMap.remove(this);
                rippleContainer.c.add(rippleHostView);
            }
        }
    }
}
