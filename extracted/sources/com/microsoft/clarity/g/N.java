package com.microsoft.clarity.g;

import com.microsoft.clarity.i.C0084f;
import com.microsoft.clarity.models.observers.FramePicture;
import defpackage.js3;
import java.io.PipedInputStream;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes3.dex */
public final class N {
    public final FramePicture a;
    public final PipedInputStream b;
    public final C0084f c;
    public final CountDownLatch d;

    public N(FramePicture framePicture, PipedInputStream pipedInputStream, C0084f c0084f) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        js3.p(framePicture, "framePicture");
        js3.p(pipedInputStream, "stream");
        js3.p(c0084f, "callback");
        this.a = framePicture;
        this.b = pipedInputStream;
        this.c = c0084f;
        this.d = countDownLatch;
    }
}
