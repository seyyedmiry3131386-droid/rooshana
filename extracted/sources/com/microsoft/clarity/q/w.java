package com.microsoft.clarity.q;

import defpackage.dp2;
import defpackage.f88;
import defpackage.js3;
import defpackage.m88;
import kotlin.jvm.internal.Lambda;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends Lambda implements dp2 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(int i) {
        super(1);
        this.a = i;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        String str = (String) obj;
        js3.p(str, "it");
        return f88.c0(str, "@", false) ? m88.W(this.a, Marker.ANY_MARKER) : str;
    }
}
