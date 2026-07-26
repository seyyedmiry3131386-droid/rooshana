package com.microsoft.clarity.i;

import android.app.Activity;
import android.view.Window;
import android.webkit.WebView;
import com.microsoft.clarity.g.C0076x;
import com.microsoft.clarity.k.C0097c;
import com.microsoft.clarity.models.LogLevel;
import com.microsoft.clarity.models.ingest.analytics.KeystrokesEvent;
import com.microsoft.clarity.models.observers.FramePicture;
import com.microsoft.clarity.models.observers.ScreenMetadata;
import com.microsoft.clarity.models.telemetry.ErrorType;
import com.microsoft.clarity.models.viewhierarchy.EditTextInfo;
import com.microsoft.clarity.models.viewhierarchy.WebViewData;
import defpackage.a77;
import defpackage.bp2;
import defpackage.js3;
import defpackage.m88;
import defpackage.tx8;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: com.microsoft.clarity.i.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0090l extends Lambda implements bp2 {
    public final /* synthetic */ q a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ Ref$ObjectRef d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0090l(q qVar, boolean z, Activity activity2, Ref$ObjectRef ref$ObjectRef) {
        super(0);
        this.a = qVar;
        this.b = z;
        this.c = activity2;
        this.d = ref$ObjectRef;
    }

    @Override // defpackage.bp2
    public final Object invoke() throws IllegalAccessException {
        boolean z;
        int iAbs;
        com.microsoft.clarity.k.G g;
        com.microsoft.clarity.k.G g2;
        com.microsoft.clarity.k.G g3;
        this.a.c();
        q qVar = this.a;
        synchronized (qVar.w) {
            z = qVar.x;
        }
        qVar.a(z || this.b);
        q qVar2 = this.a;
        C0076x c0076x = qVar2.l;
        Activity activity2 = this.c;
        ScreenMetadata screenMetadata = (ScreenMetadata) this.d.a;
        boolean zA = q.a(qVar2);
        q qVar3 = this.a;
        FramePicture framePictureA = c0076x.a(activity2, screenMetadata, zA, qVar3.y, qVar3.z, this.b);
        Integer num = null;
        if (framePictureA == null) {
            return null;
        }
        q qVar4 = this.a;
        Ref$ObjectRef ref$ObjectRef = this.d;
        qVar4.a(false);
        qVar4.y = false;
        qVar4.z = null;
        qVar4.i.add(framePictureA);
        C0097c c0097c = qVar4.d;
        ScreenMetadata screenMetadata2 = framePictureA.getScreenMetadata();
        js3.p(screenMetadata2, "screenMetadata");
        c0097c.d = screenMetadata2;
        com.microsoft.clarity.k.s sVar = qVar4.c;
        ScreenMetadata screenMetadata3 = framePictureA.getScreenMetadata();
        List<WeakReference<Window>> windows = framePictureA.getWindows();
        EditTextInfo focusedEditTextInfo = framePictureA.getViewHierarchy().getFocusedEditTextInfo();
        js3.p(screenMetadata3, "screenMetadata");
        js3.p(windows, "windows");
        sVar.c = screenMetadata3;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = windows.iterator();
        while (it.hasNext()) {
            Window window = (Window) ((WeakReference) it.next()).get();
            if (window != null) {
                arrayList.add(window);
            }
        }
        Set<Window> setT0 = kotlin.collections.a.T0(arrayList);
        Collection collectionValues = sVar.f.d.values();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            Window window2 = (Window) ((WeakReference) it2.next()).get();
            if (window2 != null) {
                arrayList2.add(window2);
            }
        }
        for (Window window3 : a77.m(kotlin.collections.a.T0(arrayList2), setT0)) {
            js3.o(window3, "window");
            sVar.a(window3);
        }
        for (Window window4 : setT0) {
            Window.Callback callback = window4.getCallback();
            if ((callback instanceof com.microsoft.clarity.k.q) && !js3.i(((com.microsoft.clarity.k.q) callback).a, sVar.c)) {
                sVar.a(window4);
            }
            int iHashCode = window4.hashCode();
            Integer num2 = (Integer) sVar.f.c.get(Integer.valueOf(iHashCode));
            if ((num2 != null ? num2.intValue() : 0) <= 5 && !(window4.getCallback() instanceof com.microsoft.clarity.k.q)) {
                LogLevel logLevel = com.microsoft.clarity.q.l.a;
                com.microsoft.clarity.q.l.b("Watch touches for " + screenMetadata3 + ' ' + window4 + '.');
                com.microsoft.clarity.k.q qVar5 = (com.microsoft.clarity.k.q) sVar.f.b.get(Integer.valueOf(iHashCode));
                if (qVar5 != null) {
                    com.microsoft.clarity.q.l.b("Had to deactivate the previously set callback.");
                    qVar5.d = false;
                }
                com.microsoft.clarity.k.q qVar6 = new com.microsoft.clarity.k.q(sVar, screenMetadata3, window4);
                window4.setCallback(qVar6);
                com.microsoft.clarity.k.r rVar = sVar.f;
                rVar.getClass();
                Integer num3 = num;
                rVar.b.put(Integer.valueOf(iHashCode), qVar6);
                rVar.d.put(Integer.valueOf(iHashCode), new WeakReference(window4));
                LinkedHashMap linkedHashMap = rVar.e.f.c;
                Integer numValueOf = Integer.valueOf(iHashCode);
                Integer num4 = (Integer) rVar.e.f.c.get(Integer.valueOf(iHashCode));
                linkedHashMap.put(numValueOf, Integer.valueOf((num4 != null ? num4.intValue() : 0) + 1));
                num = num3;
            }
        }
        Integer num5 = num;
        EditTextInfo editTextInfo = sVar.e;
        if (js3.i(editTextInfo != null ? Integer.valueOf(editTextInfo.getHashCode()) : num5, focusedEditTextInfo != null ? Integer.valueOf(focusedEditTextInfo.getHashCode()) : num5)) {
            int textLength = focusedEditTextInfo != null ? focusedEditTextInfo.getTextLength() : 0;
            EditTextInfo editTextInfo2 = sVar.e;
            iAbs = Math.abs(textLength - (editTextInfo2 != null ? editTextInfo2.getTextLength() : 0));
        } else {
            iAbs = 0;
        }
        sVar.e = focusedEditTextInfo;
        if (iAbs != 0) {
            sVar.a(new KeystrokesEvent(System.currentTimeMillis(), screenMetadata3, iAbs));
        }
        List<WebViewData> webViewsData = framePictureA.getViewHierarchy().getWebViewsData();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : webViewsData) {
            if (((WebViewData) obj).getMasked()) {
                arrayList3.add(obj);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            WebView webView = ((WebViewData) it3.next()).getWebView().get();
            if (webView != null && (g3 = qVar4.e) != null && !g3.c(webView)) {
                WeakReference weakReference = new WeakReference(webView);
                kotlin.collections.a.C0(g3.h, new com.microsoft.clarity.k.z(webView));
                g3.g.add(weakReference);
                if (g3.b(webView) != null) {
                    g3.f.add(weakReference);
                }
            }
        }
        List<WebViewData> webViewsData2 = framePictureA.getViewHierarchy().getWebViewsData();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : webViewsData2) {
            if (!((WebViewData) obj2).getMasked()) {
                arrayList4.add(obj2);
            }
        }
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            WebView webView2 = ((WebViewData) it4.next()).getWebView().get();
            if (webView2 != null && (g2 = qVar4.e) != null) {
                LinkedHashSet linkedHashSet = g2.h;
                if (!(linkedHashSet != null) || !linkedHashSet.isEmpty()) {
                    Iterator it5 = linkedHashSet.iterator();
                    while (it5.hasNext()) {
                        if (js3.i(((WeakReference) it5.next()).get(), webView2)) {
                            break;
                        }
                    }
                }
                WeakReference weakReference2 = new WeakReference(webView2);
                kotlin.collections.a.C0(g2.g, new com.microsoft.clarity.k.E(webView2));
                g2.h.add(weakReference2);
                if (g2.b(webView2) != null) {
                    g2.f.add(weakReference2);
                }
            }
        }
        Iterator<WebViewData> it6 = framePictureA.getViewHierarchy().getWebViewsData().iterator();
        while (it6.hasNext()) {
            WebView webView3 = it6.next().getWebView().get();
            if (webView3 != null && (g = qVar4.e) != null) {
                ScreenMetadata screenMetadata4 = framePictureA.getScreenMetadata();
                js3.p(screenMetadata4, "screenMetadata");
                LinkedHashSet linkedHashSet2 = g.i;
                if (!(linkedHashSet2 != null) || !linkedHashSet2.isEmpty()) {
                    Iterator it7 = linkedHashSet2.iterator();
                    while (it7.hasNext()) {
                        if (js3.i(((WeakReference) it7.next()).get(), webView3)) {
                            break;
                        }
                    }
                }
                if (!m88.Z(webView3.getClass().getName(), "com.google.android.gms.ads.internal.webview", false)) {
                    try {
                        com.microsoft.clarity.k.u uVarB = g.b(webView3);
                        if (uVarB == null || !js3.i(uVarB.b, screenMetadata4)) {
                            webView3.getSettings().setJavaScriptEnabled(true);
                            uVarB = new com.microsoft.clarity.k.u(new WeakReference(webView3), screenMetadata4);
                            g.d.add(uVarB);
                        } else {
                            ArrayList arrayList5 = g.f;
                            if (!(arrayList5 != null) || !arrayList5.isEmpty()) {
                                Iterator it8 = arrayList5.iterator();
                                while (true) {
                                    if (!it8.hasNext()) {
                                        break;
                                    }
                                    if (js3.i(((WeakReference) it8.next()).get(), webView3)) {
                                        g.b(uVarB);
                                        break;
                                    }
                                }
                            }
                        }
                        g.a(uVarB);
                    } catch (Exception e) {
                        ErrorType errorType = ErrorType.WebViewTracking;
                        Iterator it9 = g.b.iterator();
                        while (it9.hasNext()) {
                            ((C0080b) it9.next()).a(e, errorType);
                        }
                        g.i.add(new WeakReference(webView3));
                    }
                }
            }
        }
        qVar4.u = (ScreenMetadata) ref$ObjectRef.a;
        return tx8.a;
    }
}
