package ir.mservices.market.views;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.d04;
import defpackage.js3;
import defpackage.rg5;
import defpackage.u91;

/* JADX INFO: loaded from: classes3.dex */
public final class MyketWebView extends Hilt_MyketWebView {
    public d04 c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MyketWebView(Context context) {
        this(context, null, 6, 0);
        js3.p(context, "context");
    }

    public final d04 getLanguageHelper() {
        d04 d04Var = this.c;
        if (d04Var != null) {
            return d04Var;
        }
        js3.V("languageHelper");
        throw null;
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onCheckIsTextEditor() {
        return true;
    }

    public final void setLanguageHelper(d04 d04Var) {
        js3.p(d04Var, "<set-?>");
        this.c = d04Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MyketWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        js3.p(context, "context");
    }

    public /* synthetic */ MyketWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyketWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        js3.p(context, "context");
        if (!isInEditMode() && !this.b) {
            this.b = true;
            this.c = (d04) ((u91) ((rg5) e())).a.p.get();
        }
        getLanguageHelper().a();
        setFocusable(true);
        setFocusableInTouchMode(true);
    }
}
