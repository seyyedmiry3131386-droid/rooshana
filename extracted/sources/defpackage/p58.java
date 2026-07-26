package defpackage;

import android.graphics.ColorSpace;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.datatransport.TransportRegistrar;
import ir.mservices.market.app.common.recycler.AppNestedData;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p58 implements hi8, yp2, ly0, og5, ms5 {
    public static final p58 b = new p58(13);
    public static final p58 c = new p58(14);
    public static final p58 d = new p58(15);
    public static final p58 e = new p58(16);
    public static final p58 f = new p58(17);
    public final /* synthetic */ int a;

    public /* synthetic */ p58(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ ColorSpace a(Object obj) {
        return (ColorSpace) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0430  */
    @Override // defpackage.yp2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object apply(java.lang.Object r54) {
        /*
            Method dump skipped, instruction units count: 1302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p58.apply(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ly0
    public Object h(o77 o77Var) {
        switch (this.a) {
            case 19:
                return TransportRegistrar.lambda$getComponents$0(o77Var);
            case 20:
                return TransportRegistrar.lambda$getComponents$1(o77Var);
            default:
                return TransportRegistrar.lambda$getComponents$2(o77Var);
        }
    }

    @Override // defpackage.og5
    public void m(View view, qg5 qg5Var, Object obj) {
        js3.p(view, "<unused var>");
        js3.p((h95) qg5Var, "<unused var>");
        js3.p((AppNestedData) obj, "<unused var>");
    }

    @Override // defpackage.ms5
    public lf9 q(View view, lf9 lf9Var) {
        switch (this.a) {
            case 28:
                js3.p(view, "view");
                view.setPadding(0, 0, 0, 0);
                cc7.D(view, lf9Var);
                break;
            default:
                js3.p(view, "view");
                no3 no3VarG = lf9Var.a.g(128);
                js3.o(no3VarG, "getInsets(...)");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                js3.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = no3VarG.b;
                cc7.D(view, lf9Var);
                break;
        }
        return lf9Var;
    }
}
