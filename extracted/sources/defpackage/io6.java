package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.d;
import ir.mservices.market.version2.fragments.dialog.PushNotifDialogFragment;
import ir.mservices.market.webview.WebViewFragment;
import j$.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class io6 extends WebViewClient {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ io6(int i, d dVar) {
        this.a = i;
        this.b = dVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        switch (this.a) {
            case 1:
                WebViewFragment webViewFragment = (WebViewFragment) this.b;
                if (str != null) {
                    int i = WebViewFragment.c1;
                    webViewFragment.n1(eb4.b);
                    if (!str.equalsIgnoreCase("about:blank")) {
                        if (webViewFragment.Y0.isEmpty() || !js3.i(webViewFragment.Y0.peek(), str)) {
                            webViewFragment.Y0.push(str);
                        }
                        break;
                    }
                }
                break;
            default:
                super.onPageFinished(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.a) {
            case 1:
                if (webResourceError != null) {
                    webResourceError.getErrorCode();
                }
                CharSequence description = webResourceError != null ? webResourceError.getDescription() : null;
                Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
                Objects.toString(description);
                Objects.toString(url);
                break;
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        switch (this.a) {
            case 1:
                if (sslErrorHandler != null) {
                    sslErrorHandler.cancel();
                }
                break;
            default:
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        String string;
        switch (this.a) {
            case 1:
                if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null && (string = url.toString()) != null) {
                    WebViewFragment webViewFragment = (WebViewFragment) this.b;
                    if (!m88.Z(string, "http://", true) && !m88.Z(string, "https://", true)) {
                        int i = WebViewFragment.c1;
                        if (webViewFragment.k1().f) {
                            Context contextH = webViewFragment.H();
                            Uri uri = Uri.parse(string);
                            js3.o(uri, "parse(...)");
                            return js8.q(contextH, uri, null, null);
                        }
                    }
                }
                return false;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.a) {
            case 0:
                if (!str.toLowerCase().startsWith("myket://")) {
                    return false;
                }
                ((PushNotifDialogFragment) this.b).y0(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, str);
        }
    }
}
