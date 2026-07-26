package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class uf5 extends ClickableSpan {
    public final /* synthetic */ MyketTextView a;
    public final /* synthetic */ MyketTextView b;
    public final /* synthetic */ bp2 c;
    public final /* synthetic */ bp2 d;
    public final /* synthetic */ Integer e;

    public uf5(MyketTextView myketTextView, MyketTextView myketTextView2, bp2 bp2Var, bp2 bp2Var2, Integer num) {
        this.a = myketTextView;
        this.b = myketTextView2;
        this.c = bp2Var;
        this.d = bp2Var2;
        this.e = num;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        js3.p(view, "widget");
        int i = MyketTextView.k;
        MyketTextView myketTextView = this.a;
        sf5 sf5Var = myketTextView.h;
        if (sf5Var != null) {
            myketTextView.removeCallbacks(sf5Var);
        }
        myketTextView.h = null;
        this.b.setMaxLines(Integer.MAX_VALUE);
        this.c.invoke();
        bp2 bp2Var = this.d;
        if (bp2Var != null) {
            bp2Var.invoke();
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        js3.p(textPaint, "ds");
        textPaint.setUnderlineText(false);
        Integer num = this.e;
        textPaint.setColor(num != null ? num.intValue() : sj8.b().c);
    }
}
