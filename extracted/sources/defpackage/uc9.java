package defpackage;

import android.webkit.JavascriptInterface;
import ir.mservices.market.version2.activity.WebViewActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class uc9 {
    public final /* synthetic */ WebViewActivity a;

    public uc9(WebViewActivity webViewActivity) {
        this.a = webViewActivity;
    }

    @JavascriptInterface
    public void process(String str, boolean z) {
        WebViewActivity webViewActivity = this.a;
        if (!z) {
            webViewActivity.finish();
        }
        webViewActivity.runOnUiThread(new g6(this, str, 28));
    }
}
