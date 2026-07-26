package com.microsoft.clarity.i;

import com.microsoft.clarity.g.C0077y;
import com.microsoft.clarity.models.display.DisplayFrame;
import com.microsoft.clarity.models.display.IDisplayFrame;
import com.microsoft.clarity.models.observers.FramePicture;
import defpackage.dp2;
import defpackage.js3;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.microsoft.clarity.i.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0084f extends Lambda implements dp2 {
    public final /* synthetic */ FramePicture a;
    public final /* synthetic */ q b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0084f(C0077y c0077y, q qVar, FramePicture framePicture) {
        super(1);
        this.a = framePicture;
        this.b = qVar;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        DisplayFrame displayFrame = (DisplayFrame) obj;
        if (displayFrame != null) {
            js3.o(this.a, "event");
            for (r rVar : this.b.k) {
                rVar.getClass();
                rVar.a.b.a((IDisplayFrame) displayFrame);
            }
            this.b.o = this.a.getViewHierarchy();
        }
        return tx8.a;
    }
}
