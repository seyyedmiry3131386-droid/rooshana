package ir.mservices.market.togo;

import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.by2;
import defpackage.f88;
import defpackage.fb4;
import defpackage.g77;
import defpackage.hs5;
import defpackage.j77;
import defpackage.js3;
import defpackage.js8;
import defpackage.m88;
import defpackage.pk0;
import defpackage.rb4;
import defpackage.w47;
import ir.mservices.market.togo.TogoAction;
import java.net.URLConnection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Result;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends WebViewClient {
    public final /* synthetic */ TogoFragment a;

    public b(TogoFragment togoFragment) {
        this.a = togoFragment;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        js3.p(webView, "view");
        js3.p(str, "url");
        int i = TogoFragment.o1;
        TogoFragment togoFragment = this.a;
        togoFragment.q1(fb4.c);
        if (str.equalsIgnoreCase("about:blank")) {
            return;
        }
        if (togoFragment.g1.empty() || !js3.i(togoFragment.g1.peek(), str)) {
            togoFragment.g1.push(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        js3.p(webView, "view");
        js3.p(sslErrorHandler, "handler");
        js3.p(sslError, "error");
        sslErrorHandler.cancel();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [c24, java.lang.Object] */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Object objA;
        String strGuessContentTypeFromName;
        int i = TogoFragment.o1;
        TogoFragment togoFragment = this.a;
        if (!((Boolean) togoFragment.n1().J0.a.getValue()).booleanValue()) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        pk0 pk0Var = togoFragment.e1;
        if (pk0Var == null) {
            js3.V("cacheInterceptor");
            throw null;
        }
        if (webResourceRequest != null) {
            String string = webResourceRequest.getUrl().toString();
            js3.o(string, "toString(...)");
            boolean zF = pk0Var.b.f(string);
            boolean z = m88.S(string, "/", false) || m88.S(string, ".html", false);
            if (zF || z) {
                try {
                    String string2 = webResourceRequest.getUrl().toString();
                    js3.o(string2, "toString(...)");
                    hs5 hs5Var = (hs5) pk0Var.a.getValue();
                    rb4 rb4Var = new rb4(15);
                    rb4Var.P(string2);
                    g77 g77VarD = hs5Var.b(new w47(rb4Var)).d();
                    by2 by2Var = g77VarD.f;
                    j77 j77Var = g77VarD.g;
                    TreeMap treeMapE = by2Var.e();
                    String strA = by2Var.a("content-type");
                    if (strA == null || (strGuessContentTypeFromName = (String) f88.y0(strA, new String[]{";"}, 6).get(0)) == null) {
                        strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(string2);
                        if (strGuessContentTypeFromName == null) {
                            strGuessContentTypeFromName = "application/octet-stream";
                        }
                    }
                    int i2 = g77VarD.d;
                    String str = g77VarD.c;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.b.L(treeMapE.size()));
                    for (Object obj : treeMapE.entrySet()) {
                        linkedHashMap.put(((Map.Entry) obj).getKey(), kotlin.collections.a.t0((Iterable) ((Map.Entry) obj).getValue(), ",", null, null, null, 62));
                    }
                    objA = new WebResourceResponse(strGuessContentTypeFromName, "utf-8", i2, str, linkedHashMap, j77Var.d1().n1());
                } catch (Throwable th) {
                    objA = kotlin.b.a(th);
                }
                return (WebResourceResponse) (objA instanceof Result.Failure ? null : objA);
            }
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String strValueOf = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        boolean Z = m88.Z(strValueOf, "http://", true);
        TogoFragment togoFragment = this.a;
        if (Z || m88.Z(strValueOf, "https://", true)) {
            int i = TogoFragment.o1;
            togoFragment.n1().r(new TogoAction.CheckUrlSafeForJsAction(strValueOf));
            return false;
        }
        Context contextH = togoFragment.H();
        Uri uri = Uri.parse(strValueOf);
        js3.o(uri, "parse(...)");
        return js8.q(contextH, uri, null, null);
    }
}
