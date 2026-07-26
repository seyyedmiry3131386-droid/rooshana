package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import ir.mservices.market.version2.activity.WebViewActivity;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class vc9 extends WebViewClient {
    public final WebViewActivity a;
    public final /* synthetic */ WebViewActivity b;

    public vc9(WebViewActivity webViewActivity, WebViewActivity webViewActivity2) {
        this.b = webViewActivity;
        this.a = webViewActivity2;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Handler handler;
        this.b.u0(2);
        this.b.w0(str);
        WebViewActivity webViewActivity = this.b;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Iterator it = webViewActivity.H0.iterator();
        while (it.hasNext()) {
            if (str.toLowerCase().contains(((String) it.next()).toLowerCase())) {
                this.b.F0.D.loadUrl("javascript:window.KOMEIL.process(document.getElementById('main').innerHTML,true);");
                WebViewActivity webViewActivity2 = this.b;
                webViewActivity2.G0 = webViewActivity2.m0();
                if (this.b.G0 != null) {
                    synchronized (zk8.class) {
                        handler = zk8.a;
                        if (handler == null) {
                            handler = new Handler(Looper.getMainLooper());
                            zk8.a = handler;
                        }
                    }
                    handler.removeCallbacks(this.b.G0);
                    Runnable runnable = this.b.G0;
                    js3.p(runnable, "callback");
                    lw.f(null, null, o27.f().postDelayed(runnable, 3000L));
                    return;
                }
                return;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        hh2.H(new hh2(this.a, str));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if ("release".equals("release")) {
            sslErrorHandler.cancel();
        } else {
            sslErrorHandler.proceed();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.toLowerCase().startsWith("http://") || str.toLowerCase().startsWith("https://")) {
            return false;
        }
        this.b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        return true;
    }
}
