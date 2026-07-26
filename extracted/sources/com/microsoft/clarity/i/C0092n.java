package com.microsoft.clarity.i;

import com.microsoft.clarity.models.observers.ErrorDisplayFrame;
import com.microsoft.clarity.models.observers.ScreenMetadata;
import com.microsoft.clarity.models.telemetry.ErrorType;
import defpackage.dp2;
import defpackage.js3;
import defpackage.tx8;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: com.microsoft.clarity.i.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0092n extends Lambda implements dp2 {
    public final /* synthetic */ q a;
    public final /* synthetic */ Ref$ObjectRef b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0092n(q qVar, Ref$ObjectRef ref$ObjectRef) {
        super(1);
        this.a = qVar;
        this.b = ref$ObjectRef;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        Exception exc = (Exception) obj;
        js3.p(exc, "it");
        q.a(this.a, exc, ErrorType.FramePictureCapture);
        LinkedBlockingQueue linkedBlockingQueue = this.a.i;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ScreenMetadata screenMetadata = (ScreenMetadata) this.b.a;
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        linkedBlockingQueue.add(new ErrorDisplayFrame(jCurrentTimeMillis, screenMetadata, message));
        return tx8.a;
    }
}
