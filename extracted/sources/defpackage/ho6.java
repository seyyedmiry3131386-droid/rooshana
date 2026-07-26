package defpackage;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import ir.mservices.market.togo.TogoFragment;
import ir.mservices.market.version2.activity.WebViewActivity;
import ir.mservices.market.views.TryAgainView;
import ir.mservices.market.webview.WebViewFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class ho6 extends WebChromeClient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ho6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        switch (this.a) {
            case 0:
                ((WebView.WebViewTransport) message.obj).setWebView((WebView) this.b);
                message.sendToTarget();
                break;
            case 1:
                js3.p(webView, "view");
                js3.p(message, "resultMsg");
                Object obj = message.obj;
                WebView.WebViewTransport webViewTransport = obj instanceof WebView.WebViewTransport ? (WebView.WebViewTransport) obj : null;
                if (webViewTransport != null) {
                    an2 an2Var = ((TogoFragment) this.b).f1;
                    js3.m(an2Var);
                    webViewTransport.setWebView(an2Var.y);
                }
                message.sendToTarget();
                break;
            case 2:
                ((WebView.WebViewTransport) message.obj).setWebView(((WebViewActivity) this.b).F0.D);
                message.sendToTarget();
                break;
            default:
                js3.p(message, "resultMsg");
                Object obj2 = message.obj;
                WebView.WebViewTransport webViewTransport2 = obj2 instanceof WebView.WebViewTransport ? (WebView.WebViewTransport) obj2 : null;
                if (webViewTransport2 != null) {
                    v41 v41Var = ((WebViewFragment) this.b).W0;
                    js3.m(v41Var);
                    webViewTransport2.setWebView(v41Var.x);
                }
                message.sendToTarget();
                break;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                break;
            case 1:
                TogoFragment togoFragment = (TogoFragment) obj;
                js3.p(webView, "view");
                if (i < 100) {
                    an2 an2Var = togoFragment.f1;
                    js3.m(an2Var);
                    TryAgainView tryAgainView = an2Var.x;
                    if (!tryAgainView.s && tryAgainView.getVisibility() != 8) {
                        togoFragment.q1(hb4.c);
                    }
                }
                if (i == 100) {
                    int i3 = TogoFragment.o1;
                    togoFragment.q1(fb4.c);
                }
                break;
            case 2:
                WebViewActivity webViewActivity = (WebViewActivity) obj;
                webViewActivity.F0.D.getOriginalUrl();
                if (i < 100) {
                    TryAgainView tryAgainView2 = webViewActivity.F0.z;
                    if (!tryAgainView2.s && tryAgainView2.getVisibility() != 8) {
                        webViewActivity.u0(1);
                    }
                }
                if (i == 100) {
                    webViewActivity.u0(2);
                }
                break;
            default:
                WebViewFragment webViewFragment = (WebViewFragment) obj;
                if (i < 100) {
                    v41 v41Var = webViewFragment.W0;
                    js3.m(v41Var);
                    TryAgainView tryAgainView3 = v41Var.w;
                    if (!tryAgainView3.s && tryAgainView3.getVisibility() != 8) {
                        webViewFragment.n1(gb4.b);
                    }
                }
                if (i == 100) {
                    int i4 = WebViewFragment.c1;
                    webViewFragment.n1(eb4.b);
                }
                break;
        }
    }

    private final void a(WebView webView, int i) {
    }
}
