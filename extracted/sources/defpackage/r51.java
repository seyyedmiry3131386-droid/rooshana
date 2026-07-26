package defpackage;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import ir.mservices.market.views.MyketTextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class r51 extends i1 {
    public final ArrayList a = new ArrayList(0);
    public boolean b;

    public static void i(vp7 vp7Var, String str, String str2, vc0 vc0Var) {
        vp7Var.z();
        int iH0 = vp7Var.h0();
        h28 h28Var = (h28) vp7Var.d;
        StringBuilder sb = h28Var.a;
        sb.append((char) 160);
        sb.append('\n');
        ((ol3) ((rb4) vp7Var.b).c).getClass();
        h28Var.b(sb.length(), str2);
        sb.append((CharSequence) str2);
        vp7Var.z();
        h28Var.a((char) 160);
        ct2.h.b((xg5) vp7Var.c, str);
        vp7Var.z0(vc0Var, iH0);
        vp7Var.s(vc0Var);
    }

    @Override // defpackage.i1
    public final void b(MyketTextView myketTextView) {
        if (this.b || myketTextView.getMovementMethod() != null) {
            return;
        }
        myketTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // defpackage.i1
    public final void c(MyketTextView myketTextView, SpannableStringBuilder spannableStringBuilder) {
        xv5[] xv5VarArr = (xv5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), xv5.class);
        if (xv5VarArr != null) {
            TextPaint paint = myketTextView.getPaint();
            for (xv5 xv5Var : xv5VarArr) {
                xv5Var.d = (int) (paint.measureText(xv5Var.b) + 0.5f);
            }
        }
        nj8[] nj8VarArr = (nj8[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), nj8.class);
        if (nj8VarArr != null) {
            for (nj8 nj8Var : nj8VarArr) {
                spannableStringBuilder.removeSpan(nj8Var);
            }
        }
        nj8 nj8Var2 = new nj8();
        new WeakReference(myketTextView);
        spannableStringBuilder.setSpan(nj8Var2, 0, spannableStringBuilder.length(), 18);
    }

    @Override // defpackage.i1
    public final void f(wx3 wx3Var) {
        bd0 bd0Var = new bd0(1);
        wx3Var.b(t88.class, new bd0(7));
        wx3Var.b(t02.class, new bd0(3));
        wx3Var.b(xc0.class, new bd0(0));
        wx3Var.b(hu0.class, new bd0(2));
        wx3Var.b(qa2.class, bd0Var);
        wx3Var.b(lm3.class, bd0Var);
        wx3Var.b(x84.class, new bd0(6));
        wx3Var.b(ey2.class, new bd0(4));
        wx3Var.b(o74.class, new bd0(5));
        wx3Var.b(pj8.class, new bd0(8));
    }

    @Override // defpackage.i1
    public final void h(pj9 pj9Var) {
        pj9Var.v(nf8.class, new id3(this, 2));
        pj9Var.v(t88.class, new q51(6));
        pj9Var.v(t02.class, new q51(7));
        pj9Var.v(xc0.class, new q51(8));
        pj9Var.v(hu0.class, new q51(9));
        pj9Var.v(qa2.class, new q51(10));
        pj9Var.v(lm3.class, new q51(11));
        pj9Var.v(vh3.class, new q51(12));
        pj9Var.v(wh0.class, new q51(14));
        pj9Var.v(wv5.class, new q51(14));
        pj9Var.v(x84.class, new q51(13));
        pj9Var.v(pj8.class, new q51(0));
        pj9Var.v(ey2.class, new q51(1));
        pj9Var.v(g18.class, new q51(2));
        pj9Var.v(zw2.class, new q51(3));
        pj9Var.v(k16.class, new q51(4));
        pj9Var.v(o74.class, new q51(5));
    }
}
