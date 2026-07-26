package ir.mservices.market.app.suggest.search.ui;

import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import defpackage.kb8;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final /* synthetic */ SuggestListFragment a;

    public a(SuggestListFragment suggestListFragment) {
        this.a = suggestListFragment;
    }

    @JavascriptInterface
    public final void onContentLoaded() {
        SuggestListFragment suggestListFragment = this.a;
        kb8 kb8Var = new kb8(0, suggestListFragment);
        suggestListFragment.m1 = kb8Var;
        WebView webView = suggestListFragment.l1;
        if (webView != null) {
            webView.post(kb8Var);
        }
    }
}
