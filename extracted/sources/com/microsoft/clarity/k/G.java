package com.microsoft.clarity.k;

import android.content.Context;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebView;
import com.microsoft.clarity.i.C0080b;
import com.microsoft.clarity.k.G;
import com.microsoft.clarity.models.DynamicConfig;
import com.microsoft.clarity.models.LogLevel;
import com.microsoft.clarity.models.MaskingMode;
import com.microsoft.clarity.models.observers.ScreenMetadata;
import com.microsoft.clarity.models.observers.WebViewStatus;
import com.microsoft.clarity.models.observers.WebViewStatusEvent;
import defpackage.a77;
import defpackage.dp2;
import defpackage.g7;
import defpackage.js3;
import defpackage.ry7;
import defpackage.zp0;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.function.Predicate;
import org.json.JSONArray;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes3.dex */
public final class G {
    public final DynamicConfig a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final LinkedHashMap e;
    public final ArrayList f;
    public final LinkedHashSet g;
    public final LinkedHashSet h;
    public final LinkedHashSet i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public boolean o;

    public G(Context context, DynamicConfig dynamicConfig) throws IOException {
        js3.p(context, "context");
        js3.p(dynamicConfig, "dynamicConfig");
        this.a = dynamicConfig;
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new LinkedHashMap();
        this.f = new ArrayList();
        this.g = new LinkedHashSet();
        this.h = new LinkedHashSet();
        this.i = new LinkedHashSet();
        InputStream inputStreamOpen = context.getAssets().open("clarity.js");
        js3.o(inputStreamOpen, "context.assets.open(\"clarity.js\")");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, zp0.a), 8192);
        try {
            String strR = ry7.r(bufferedReader);
            bufferedReader.close();
            this.j = strR;
            this.k = "[[START_PARAMS]]";
            this.l = "startClarity([[START_PARAMS]]);";
            this.m = "clearClarity();";
            this.n = "(function() {if(window[\"clarity\"] && window[\"clarity\"][\"v\"] != \"-1\" ) return \"4\";else if(!window[\"clarityhybrid\"]) return \"0\";else return window[\"clarityhybrid\"](\"state\");})();";
        } finally {
        }
    }

    public static final String a(WebView webView, G g) {
        String string;
        g.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(webView.getId());
        sb.append(',');
        sb.append(webView.getUniqueDrawingId());
        sb.append(",\"");
        String string2 = new JSONArray((Collection) g.a.getWebMaskSelectors()).toString();
        js3.o(string2, "JSONArray(set).toString()");
        sb.append(com.microsoft.clarity.q.q.a(string2));
        sb.append("\",\"");
        if (g.a.getMaskingMode() != MaskingMode.Relaxed || g.a.getWebUnmaskSelectors().contains("body") || g.c(webView)) {
            string = new JSONArray((Collection) g.a.getWebUnmaskSelectors()).toString();
            js3.o(string, "JSONArray(set).toString()");
        } else {
            string = new JSONArray((Collection) a77.n(g.a.getWebUnmaskSelectors(), "body")).toString();
            js3.o(string, "JSONArray(set).toString()");
        }
        sb.append(com.microsoft.clarity.q.q.a(string));
        sb.append("\",");
        sb.append(!g.c(webView));
        return sb.toString();
    }

    public static final void b(WebView webView, G g) {
        js3.p(webView, "$webView");
        js3.p(g, "this$0");
        webView.evaluateJavascript(g.m, null);
    }

    public final boolean c(WebView webView) {
        LinkedHashSet linkedHashSet = this.g;
        if (linkedHashSet != null && linkedHashSet.isEmpty()) {
            return false;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (js3.i(((WeakReference) it.next()).get(), webView)) {
                return true;
            }
        }
        return false;
    }

    public final u b(WebView webView) {
        Object next;
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (js3.i(((u) next).a.get(), webView)) {
                break;
            }
        }
        return (u) next;
    }

    public final void b(u uVar) {
        WebView webView = (WebView) uVar.a.get();
        if (webView == null) {
            return;
        }
        LogLevel logLevel = com.microsoft.clarity.q.l.a;
        com.microsoft.clarity.q.l.b("Restarting Clarity JS for webview #" + webView.getUniqueDrawingId() + '.');
        if (uVar.c != WebViewStatus.Skipped) {
            a(webView);
        }
        a(uVar);
        kotlin.collections.a.B0(new A(webView), this.f);
    }

    public static final void a(G g, u uVar) {
        g.getClass();
        WebView webView = (WebView) uVar.a.get();
        if (webView == null) {
            return;
        }
        int iHashCode = webView.hashCode();
        WebMessagePort webMessagePort = (WebMessagePort) g.e.get(Integer.valueOf(uVar.hashCode()));
        if (webMessagePort != null) {
            webMessagePort.close();
        }
        WebMessagePort[] webMessagePortArrCreateWebMessageChannel = webView.createWebMessageChannel();
        js3.o(webMessagePortArrCreateWebMessageChannel, "webView.createWebMessageChannel()");
        WebMessagePort webMessagePort2 = webMessagePortArrCreateWebMessageChannel[0];
        WebMessagePort webMessagePort3 = webMessagePortArrCreateWebMessageChannel[1];
        webMessagePort2.setWebMessageCallback(new D(g, uVar, iHashCode));
        webView.postWebMessage(new WebMessage("clarityNativePort", new WebMessagePort[]{webMessagePort3}), Uri.parse(Marker.ANY_MARKER));
        g.e.put(Integer.valueOf(webView.hashCode()), webMessagePort2);
    }

    public static final void a(G g, u uVar, WebViewStatus webViewStatus) {
        g.getClass();
        WebView webView = (WebView) uVar.a.get();
        if (webView == null || uVar.c == webViewStatus) {
            return;
        }
        for (C0080b c0080b : g.b) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            ScreenMetadata screenMetadata = uVar.b;
            String url = webView.getUrl();
            if (url == null) {
                url = "";
            }
            WebViewStatus webViewStatus2 = webViewStatus;
            WebViewStatusEvent webViewStatusEvent = new WebViewStatusEvent(webView, jCurrentTimeMillis, screenMetadata, url, webViewStatus2);
            c0080b.getClass();
            c0080b.a.i.add(webViewStatusEvent);
            webViewStatus = webViewStatus2;
        }
        uVar.c = webViewStatus;
    }

    public final void a(ArrayList arrayList) {
        WebView webView;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u uVar = (u) it.next();
            if (uVar.c != WebViewStatus.Skipped && (webView = (WebView) uVar.a.get()) != null) {
                a(webView);
            }
            linkedHashSet.add(uVar);
            LogLevel logLevel = com.microsoft.clarity.q.l.a;
            StringBuilder sb = new StringBuilder("WebView ");
            WebView webView2 = (WebView) uVar.a.get();
            sb.append(webView2 != null ? Long.valueOf(webView2.getUniqueDrawingId()) : null);
            sb.append(" in screen ");
            sb.append(uVar.b);
            sb.append(" will be cleared");
            com.microsoft.clarity.q.l.b(sb.toString());
        }
        ArrayList arrayList2 = this.d;
        final F f = new F(linkedHashSet);
        Collection.EL.removeIf(arrayList2, new Predicate() { // from class: fq2
            public /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            public /* synthetic */ Predicate negate() {
                return Predicate$CC.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return G.a(f, obj);
            }
        });
    }

    public static final boolean a(dp2 dp2Var, Object obj) {
        js3.p(dp2Var, "$tmp0");
        return ((Boolean) dp2Var.invoke(obj)).booleanValue();
    }

    public static final void a(WebView webView, G g, u uVar, String str) {
        js3.p(webView, "$webView");
        js3.p(g, "this$0");
        js3.p(uVar, "$trackedWebViewData");
        com.microsoft.clarity.q.g.a(new v(webView, g, uVar, str), new w(g, uVar), new y(webView, g), 2);
    }

    public final void a(WebView webView) {
        webView.post(new g7(webView, this, 24));
        WebMessagePort webMessagePort = (WebMessagePort) this.e.remove(Integer.valueOf(webView.hashCode()));
        if (webMessagePort != null) {
            webMessagePort.close();
        }
    }

    public final void a(final u uVar) {
        final WebView webView = (WebView) uVar.a.get();
        if (webView == null) {
            return;
        }
        ArrayList arrayList = this.c;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (js3.i(((WeakReference) it.next()).get(), webView)) {
                    return;
                }
            }
        }
        this.c.add(uVar.a);
        webView.evaluateJavascript(this.n, new ValueCallback() { // from class: eq2
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                G.a(webView, this, uVar, (String) obj);
            }
        });
    }
}
