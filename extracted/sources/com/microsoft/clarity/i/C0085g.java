package com.microsoft.clarity.i;

import com.microsoft.clarity.g.C0077y;
import com.microsoft.clarity.g.S;
import com.microsoft.clarity.models.observers.FramePicture;
import defpackage.bp2;
import defpackage.js3;
import defpackage.tx8;
import java.io.IOException;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.microsoft.clarity.i.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0085g extends Lambda implements bp2 {
    public final /* synthetic */ q a;
    public final /* synthetic */ FramePicture b;
    public final /* synthetic */ C0077y c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0085g(C0077y c0077y, q qVar, FramePicture framePicture) {
        super(0);
        this.a = qVar;
        this.b = framePicture;
        this.c = c0077y;
    }

    @Override // defpackage.bp2
    public final Object invoke() throws InterruptedException, IOException {
        S s = this.a.m;
        FramePicture framePicture = this.b;
        js3.o(framePicture, "event");
        s.a(framePicture, new C0084f(this.c, this.a, this.b));
        return tx8.a;
    }
}
