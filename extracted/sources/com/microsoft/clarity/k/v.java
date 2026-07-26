package com.microsoft.clarity.k;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.microsoft.clarity.k.v;
import com.microsoft.clarity.models.DynamicConfig;
import com.microsoft.clarity.models.LogLevel;
import com.microsoft.clarity.models.observers.WebViewStatus;
import defpackage.bp2;
import defpackage.js3;
import defpackage.m88;
import defpackage.tx8;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Lambda;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends Lambda implements bp2 {
    public final /* synthetic */ WebView a;
    public final /* synthetic */ G b;
    public final /* synthetic */ u c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(WebView webView, G g, u uVar, String str) {
        super(0);
        this.a = webView;
        this.b = g;
        this.c = uVar;
        this.d = str;
    }

    public final void a() {
        Integer numA0;
        if (this.a.getUrl() == null) {
            com.microsoft.clarity.q.l.b("WebView url is null.");
            return;
        }
        DynamicConfig dynamicConfig = this.b.a;
        String url = this.a.getUrl();
        js3.m(url);
        if (!dynamicConfig.isAllowedUrl(url)) {
            G.a(this.b, this.c, WebViewStatus.NotAllowed);
            com.microsoft.clarity.q.l.b("WebView url is not allowed.");
            return;
        }
        String str = this.d;
        if (str != null) {
            char[] cArr = {'\"'};
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                char cCharAt = str.charAt(!z ? i : length);
                int i2 = 0;
                while (true) {
                    if (i2 >= 1) {
                        i2 = -1;
                        break;
                    } else if (cCharAt == cArr[i2]) {
                        break;
                    } else {
                        i2++;
                    }
                }
                boolean z2 = i2 >= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            String string = str.subSequence(i, length + 1).toString();
            if (string == null || (numA0 = m88.a0(string)) == null) {
                return;
            }
            int iIntValue = numA0.intValue();
            int[] iArr = new int[5];
            System.arraycopy(com.microsoft.clarity.d.b.a, 0, iArr, 0, 5);
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = iArr[i3];
                if (com.microsoft.clarity.d.b.a(i4) == iIntValue) {
                    int iA = com.microsoft.clarity.d.b.a(i4);
                    if (iA == 0) {
                        com.microsoft.clarity.q.l.b("Injecting Clarity.");
                        G g = this.b;
                        final String strX = m88.X(g.l, g.k, G.a(this.a, g));
                        G.a(this.b, this.c, WebViewStatus.Loading);
                        final WebView webView = this.a;
                        webView.evaluateJavascript(this.b.j, new ValueCallback() { // from class: nh9
                            @Override // android.webkit.ValueCallback
                            public final void onReceiveValue(Object obj) {
                                v.a(webView, strX, (String) obj);
                            }
                        });
                        return;
                    }
                    if (iA == 2) {
                        com.microsoft.clarity.q.l.b("Sending channel port.");
                        G.a(this.b, this.c);
                        return;
                    }
                    if (iA == 3) {
                        com.microsoft.clarity.q.l.b("Clarity is active.");
                        return;
                    }
                    if (iA == 4) {
                        G.a(this.b, this.c, WebViewStatus.Skipped);
                        com.microsoft.clarity.q.l.b("Injection skipped as Web script exists");
                        return;
                    }
                    LogLevel logLevel = com.microsoft.clarity.q.l.a;
                    StringBuilder sb = new StringBuilder("ClarityJs state ");
                    sb.append(i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? Ssh2PublicKeyAlgorithmName.NULL : "Skipped" : "Active" : "WaitingChannel" : "Inactive" : "Undefined");
                    sb.append('.');
                    com.microsoft.clarity.q.l.b(sb.toString());
                    return;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }

    @Override // defpackage.bp2
    public final /* bridge */ /* synthetic */ Object invoke() {
        a();
        return tx8.a;
    }

    public static final void a(WebView webView, String str, String str2) {
        js3.p(webView, "$webView");
        js3.p(str, "$startScript");
        webView.evaluateJavascript(str, null);
    }
}
