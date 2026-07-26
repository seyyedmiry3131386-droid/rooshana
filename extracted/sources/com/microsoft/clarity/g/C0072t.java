package com.microsoft.clarity.g;

import android.view.View;
import android.view.Window;
import defpackage.dp2;
import defpackage.js3;
import java.lang.reflect.Field;
import java.util.HashMap;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: com.microsoft.clarity.g.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0072t extends FunctionReferenceImpl implements dp2 {
    public C0072t(C0076x c0076x) {
        super(1, c0076x, C0076x.class, "getViewWindow", "getViewWindow(Landroid/view/View;)Landroid/view/Window;", 0);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        Object objInvoke;
        View view = (View) obj;
        js3.p(view, "p0");
        ((C0076x) this.receiver).getClass();
        HashMap map = com.microsoft.clarity.q.p.a;
        try {
            objInvoke = new com.microsoft.clarity.q.m(view.getClass().getName(), "mWindow").invoke();
        } catch (Exception unused) {
            objInvoke = null;
        }
        Field field = (Field) objInvoke;
        Object obj2 = field != null ? field.get(view) : null;
        if (obj2 instanceof Window) {
            return (Window) obj2;
        }
        return null;
    }
}
