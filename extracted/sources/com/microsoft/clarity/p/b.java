package com.microsoft.clarity.p;

import defpackage.dp2;
import defpackage.js3;
import java.io.File;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends Lambda implements dp2 {
    public final /* synthetic */ boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z) {
        super(1);
        this.a = z;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        File file = (File) obj;
        js3.p(file, "it");
        return Boolean.valueOf(this.a || !file.isDirectory());
    }
}
