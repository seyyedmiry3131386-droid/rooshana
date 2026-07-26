package defpackage;

import android.content.Context;
import android.view.View;
import ir.mservices.market.feedback.recycler.FeedbackBodyData;
import ir.mservices.market.feedback.recycler.b;
import ir.mservices.market.theme.ThemeData;
import ir.mservices.market.views.MyketEditText;
import ir.mservices.market.views.MyketTextView;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i92 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i92(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        l lVar;
        Object value;
        ca2 ca2Var;
        switch (this.a) {
            case 0:
                b bVar = (b) this.b;
                FeedbackBodyData feedbackBodyData = (FeedbackBodyData) this.c;
                MyketTextView myketTextView = bVar.x().v;
                js3.o(myketTextView, "errorTxt");
                if (myketTextView.getVisibility() != 0) {
                    bVar.x().v.setVisibility(4);
                    xb5 xb5Var = feedbackBodyData.a;
                    do {
                        lVar = (l) xb5Var;
                        value = lVar.getValue();
                        ca2Var = (ca2) value;
                    } while (!lVar.n(value, z ? new aa2(ca2Var.a) : new ba2(ca2Var.a)));
                }
                break;
            default:
                MyketEditText myketEditText = (MyketEditText) this.b;
                View view2 = (View) this.c;
                Context context = view2.getContext();
                js3.o(context, "getContext(...)");
                ea7 ea7Var = new ea7(context);
                ea7Var.b = sj8.b().P;
                ThemeData themeDataB = sj8.b();
                ea7Var.i = z ? themeDataB.c : themeDataB.w;
                ea7Var.c(view2.getResources().getDimensionPixelSize(pq6.space_12));
                ea7Var.p = sj8.b().N;
                ea7Var.h = view2.getContext().getResources().getDimensionPixelSize(z ? pq6.space_2 : pq6.border_size);
                myketEditText.setBackground(ea7Var.a());
                break;
        }
    }
}
