package com.microsoft.clarity.k;

import defpackage.dp2;
import defpackage.js3;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class F extends Lambda implements dp2 {
    public final /* synthetic */ LinkedHashSet a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(LinkedHashSet linkedHashSet) {
        super(1);
        this.a = linkedHashSet;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        u uVar = (u) obj;
        js3.p(uVar, "it");
        return Boolean.valueOf(this.a.contains(uVar));
    }
}
