package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.views.MiniPlayerView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u52 implements q94, yp2, n31, ms5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ u52(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.n31
    public void accept(Object obj) {
        switch (this.a) {
            case 5:
                ((qg6) obj).m0(this.b);
                break;
            case 6:
                ((qg6) obj).x0(this.b);
                break;
            case 7:
                ((qg6) obj).N(this.b);
                break;
            default:
                ((qg6) obj).I0(this.b);
                break;
        }
    }

    @Override // defpackage.yp2
    public Object apply(Object obj) {
        return Integer.valueOf(this.b);
    }

    @Override // defpackage.q94
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((eb6) obj).h(this.b);
                break;
            case 1:
                ((eb6) obj).q(this.b);
                break;
            default:
                ((eb6) obj).h(this.b);
                break;
        }
    }

    @Override // defpackage.ms5
    public lf9 q(View view, lf9 lf9Var) {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 9:
                int i3 = MiniPlayerView.t;
                js3.p(view, "view");
                no3 no3VarG = lf9Var.a.g(2);
                js3.o(no3VarG, "getInsets(...)");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                js3.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = view.getResources().getDimensionPixelSize(pq6.space_4) + no3VarG.d;
                marginLayoutParams.setMarginStart(view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer) + i2);
                marginLayoutParams.setMarginEnd(view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer));
                view.setLayoutParams(marginLayoutParams);
                view.requestLayout();
                break;
            default:
                js3.p(view, "view");
                no3 no3VarG2 = lf9Var.a.g(i2);
                js3.o(no3VarG2, "getInsets(...)");
                view.setPadding(0, no3VarG2.b, 0, no3VarG2.d);
                cc7.D(view, lf9Var);
                break;
        }
        return lf9Var;
    }
}
