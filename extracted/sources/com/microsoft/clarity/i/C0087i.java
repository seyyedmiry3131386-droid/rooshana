package com.microsoft.clarity.i;

import com.microsoft.clarity.models.observers.ErrorDisplayFrame;
import com.microsoft.clarity.models.observers.FramePicture;
import com.microsoft.clarity.models.observers.ScreenMetadata;
import com.microsoft.clarity.models.telemetry.ErrorType;
import defpackage.dp2;
import defpackage.js3;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: com.microsoft.clarity.i.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0087i extends Lambda implements dp2 {
    public final /* synthetic */ q a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ Ref$ObjectRef c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0087i(q qVar, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
        super(1);
        this.a = qVar;
        this.b = ref$ObjectRef;
        this.c = ref$ObjectRef2;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        Exception exc = (Exception) obj;
        js3.p(exc, "it");
        q.a(this.a, exc, (ErrorType) this.b.a);
        FramePicture framePicture = (FramePicture) this.c.a;
        if (framePicture != null) {
            q qVar = this.a;
            long timestamp = framePicture.getTimestamp();
            ScreenMetadata screenMetadata = framePicture.getScreenMetadata();
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            ErrorDisplayFrame errorDisplayFrame = new ErrorDisplayFrame(timestamp, screenMetadata, message);
            for (r rVar : qVar.k) {
                rVar.getClass();
                rVar.a.b.a(errorDisplayFrame);
            }
        }
        if (this.b.a == ErrorType.PictureProcessing) {
            this.a.a(true);
        }
        return tx8.a;
    }
}
