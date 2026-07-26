package com.microsoft.clarity.g;

import com.microsoft.clarity.models.display.DisplayFrame;
import com.microsoft.clarity.models.observers.FramePicture;
import defpackage.bp2;
import defpackage.js3;
import defpackage.tv8;
import defpackage.tx8;
import java.io.IOException;
import java.io.PipedInputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
public final class O extends Lambda implements bp2 {
    public final /* synthetic */ S a;
    public final /* synthetic */ Ref$ObjectRef b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(S s, Ref$ObjectRef ref$ObjectRef) {
        super(0);
        this.a = s;
        this.b = ref$ObjectRef;
    }

    @Override // defpackage.bp2
    public final Object invoke() throws IOException {
        N n = (N) this.a.c.take();
        this.b.a = n;
        PipedInputStream pipedInputStream = n.b;
        S s = this.a;
        try {
            FramePicture framePicture = n.a;
            com.microsoft.clarity.m.d dVar = new com.microsoft.clarity.m.d(pipedInputStream);
            DisplayFrame displayFrame = new DisplayFrame(framePicture.getTimestamp(), framePicture.isKeyFrame(), framePicture.getViewHierarchy(), framePicture.getScreenMetadata(), framePicture.getScreenWidth(), framePicture.getScreenHeight(), framePicture.getKeyboardHeight(), framePicture.getSystemBackgroundColor(), framePicture.getDensity(), framePicture.isForceStartNewSessionFirstFrame(), framePicture.getForceStartNewSessionCallback(), framePicture.isNewPageFirstFrame(), s.b.a(dVar));
            MessageDigest messageDigest = com.microsoft.clarity.q.c.a;
            DigestInputStream digestInputStream = dVar.c;
            js3.p(digestInputStream, "<this>");
            digestInputStream.close();
            MessageDigest messageDigest2 = digestInputStream.getMessageDigest();
            js3.o(messageDigest2, "this.messageDigest");
            String strA = com.microsoft.clarity.q.c.a(messageDigest2, (byte[]) null);
            if (framePicture.isKeyFrame() || !js3.i(s.d, strA)) {
                s.a.a(framePicture, displayFrame);
                S.a(s, displayFrame);
                S.b(s, displayFrame);
                s.e.a(framePicture);
                s.d = strA;
                n.c.invoke(displayFrame);
            }
            tx8 tx8Var = tx8.a;
            tv8.h(pipedInputStream, null);
            return tx8Var;
        } finally {
        }
    }
}
