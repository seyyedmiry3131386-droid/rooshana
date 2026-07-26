package com.microsoft.clarity.g;

import android.view.View;
import android.view.ViewGroup;
import defpackage.js3;
import defpackage.tp2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: com.microsoft.clarity.g.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0061h extends FunctionReferenceImpl implements tp2 {
    public C0061h(C0076x c0076x) {
        super(5, c0076x, C0076x.class, "captureView", "captureView(Landroid/view/View;Landroid/view/ViewGroup;ZZLcom/microsoft/clarity/helpers/DisplayFrameCapturer$CaptureContext;)Lcom/microsoft/clarity/models/viewhierarchy/ViewNode;", 0);
    }

    @Override // defpackage.tp2
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        C0062i c0062i = (C0062i) obj5;
        js3.p(view, "p0");
        js3.p(c0062i, "p4");
        return ((C0076x) this.receiver).a(view, (ViewGroup) obj2, zBooleanValue, zBooleanValue2, c0062i);
    }
}
