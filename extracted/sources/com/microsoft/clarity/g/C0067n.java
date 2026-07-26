package com.microsoft.clarity.g;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.view.View;
import android.widget.EditText;
import com.microsoft.clarity.models.LogLevel;
import com.microsoft.clarity.models.viewhierarchy.EditTextInfo;
import defpackage.bp2;
import defpackage.js3;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: com.microsoft.clarity.g.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0067n extends Lambda implements bp2 {
    public final /* synthetic */ C0076x a;
    public final /* synthetic */ C0066m b;
    public final /* synthetic */ C0062i c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ View e;
    public final /* synthetic */ Ref$ObjectRef f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0067n(C0076x c0076x, C0066m c0066m, C0062i c0062i, Ref$ObjectRef ref$ObjectRef, View view, Ref$ObjectRef ref$ObjectRef2) {
        super(0);
        this.a = c0076x;
        this.b = c0066m;
        this.c = c0062i;
        this.d = ref$ObjectRef;
        this.e = view;
        this.f = ref$ObjectRef2;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        Activity activity2;
        C0076x c0076x = this.a;
        Context context = this.b.a.getContext();
        js3.o(context, "windowInfo.window.context");
        c0076x.getClass();
        do {
            activity2 = context instanceof Activity ? (Activity) context : null;
            if (activity2 == null) {
                ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
                if (contextWrapper == null) {
                    break;
                }
                context = contextWrapper.getBaseContext();
            } else {
                break;
            }
        } while (context != null);
        activity2 = null;
        if (activity2 != null) {
            C0076x c0076x2 = this.a;
            if (c0076x2.d.isAllowedActivity(activity2, c0076x2.b.isReactNative$sdk_prodRelease())) {
                LogLevel logLevel = com.microsoft.clarity.q.l.a;
                com.microsoft.clarity.q.l.b("Capture Activity: " + activity2);
                Point point = this.c.c;
                Point point2 = this.b.b;
                point.set(point2.x, point2.y);
                if (this.c.h == null) {
                    View currentFocus = this.b.a.getCurrentFocus();
                    EditText editText = currentFocus instanceof EditText ? (EditText) currentFocus : null;
                    if (editText != null) {
                        this.c.h = new EditTextInfo(editText.hashCode(), editText.length());
                    }
                }
                Ref$ObjectRef ref$ObjectRef = this.d;
                C0076x c0076x3 = this.a;
                View rootView = this.b.a.getDecorView().getRootView();
                js3.o(rootView, "windowInfo.window.decorView.rootView");
                C0076x c0076x4 = this.a;
                ref$ObjectRef.a = c0076x3.a(rootView, null, c0076x4.d.isMaskedActivity(activity2, c0076x4.b.isReactNative$sdk_prodRelease()), true, this.c);
                if (js3.i(this.b.a.getDecorView().getRootView(), this.e)) {
                    this.f.a = this.d.a;
                }
            }
        }
        return tx8.a;
    }
}
