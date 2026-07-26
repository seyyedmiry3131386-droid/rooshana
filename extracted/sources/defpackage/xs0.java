package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.EditText;
import ir.mservices.market.common.comment.SubmitCommentFragment;
import ir.mservices.market.feedback.recycler.FeedbackPhoneNumberData;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xs0 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xs0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        l lVar;
        Object value;
        ca2 ca2Var;
        switch (this.a) {
            case 0:
                at0 at0Var = (at0) this.b;
                at0Var.s(at0Var.t());
                break;
            case 1:
                for (EditText editText : (EditText[]) this.b) {
                    if (editText.hasFocus()) {
                    }
                    break;
                }
                o37.n(view, false);
                break;
            case 2:
                mx1 mx1Var = (mx1) this.b;
                mx1Var.l = z;
                mx1Var.p();
                if (!z) {
                    mx1Var.s(false);
                    mx1Var.m = false;
                }
                break;
            case 3:
                xb5 xb5Var = ((FeedbackPhoneNumberData) this.b).a;
                do {
                    lVar = (l) xb5Var;
                    value = lVar.getValue();
                    ca2Var = (ca2) value;
                } while (!lVar.n(value, z ? new aa2(ca2Var.a) : new ba2(ca2Var.a)));
                break;
            default:
                gw0 gw0Var = ((SubmitCommentFragment) this.b).b1;
                js3.m(gw0Var);
                gw0Var.w.getBackground().setColorFilter(new PorterDuffColorFilter(z ? sj8.b().c : sj8.b().n, PorterDuff.Mode.MULTIPLY));
                break;
        }
    }
}
