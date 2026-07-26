package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class bn extends n70 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bn(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.z89
    public final void b(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ln lnVar = ((an) obj).b;
                lnVar.v.setAlpha(1.0f);
                lnVar.y.e(null);
                lnVar.y = null;
                break;
            case 1:
                ln lnVar2 = (ln) obj;
                lnVar2.v.setAlpha(1.0f);
                lnVar2.y.e(null);
                lnVar2.y = null;
                break;
            default:
                ln lnVar3 = (ln) ((do3) obj).b;
                lnVar3.v.setVisibility(8);
                PopupWindow popupWindow = lnVar3.w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (lnVar3.v.getParent() instanceof View) {
                    View view2 = (View) lnVar3.v.getParent();
                    WeakHashMap weakHashMap = q69.a;
                    f69.c(view2);
                }
                lnVar3.v.e();
                lnVar3.y.e(null);
                lnVar3.y = null;
                ViewGroup viewGroup = lnVar3.B;
                WeakHashMap weakHashMap2 = q69.a;
                f69.c(viewGroup);
                break;
        }
    }

    @Override // defpackage.n70, defpackage.z89
    public void c() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((an) obj).b.v.setVisibility(0);
                break;
            case 1:
                ln lnVar = (ln) obj;
                lnVar.v.setVisibility(0);
                if (lnVar.v.getParent() instanceof View) {
                    View view = (View) lnVar.v.getParent();
                    WeakHashMap weakHashMap = q69.a;
                    f69.c(view);
                }
                break;
        }
    }
}
