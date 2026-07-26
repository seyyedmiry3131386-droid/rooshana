package com.microsoft.clarity.k;

import com.microsoft.clarity.i.C0082d;
import com.microsoft.clarity.models.ingest.analytics.ScriptErrorEvent;
import com.microsoft.clarity.models.observers.ScreenMetadata;
import defpackage.ew;
import defpackage.js3;
import ir.mservices.market.pika.common.model.ByteArrayResult;
import java.lang.Thread;
import java.util.ArrayList;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: renamed from: com.microsoft.clarity.k.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0097c implements Thread.UncaughtExceptionHandler {
    public final ArrayList a = new ArrayList();
    public final Thread.UncaughtExceptionHandler b = Thread.getDefaultUncaughtExceptionHandler();
    public boolean c;
    public ScreenMetadata d;

    public C0097c() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        String string;
        js3.p(thread, "t");
        js3.p(th, ByteArrayResult.AppInfo.IMG_SERIALISED_NAME);
        ScreenMetadata screenMetadata = this.d;
        if (!this.c && screenMetadata != null) {
            Throwable cause = th;
            while (cause.getCause() != null) {
                cause = cause.getCause();
                js3.m(cause);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str = "[Native] " + cause.getMessage();
            StackTraceElement[] stackTrace = cause.getStackTrace();
            if (stackTrace == null) {
                string = Ssh2PublicKeyAlgorithmName.NULL;
            } else {
                int length = stackTrace.length;
                if (length > 429496729) {
                    length = 429496729;
                }
                StringBuilder sb = new StringBuilder((length * 5) + 2);
                ew.v0(stackTrace, sb, new ArrayList());
                string = sb.toString();
            }
            ScriptErrorEvent scriptErrorEvent = new ScriptErrorEvent(jCurrentTimeMillis, str, string, screenMetadata);
            for (C0082d c0082d : this.a) {
                c0082d.getClass();
                com.microsoft.clarity.i.q.a(c0082d.a, scriptErrorEvent);
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
