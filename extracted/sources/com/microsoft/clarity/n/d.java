package com.microsoft.clarity.n;

import com.microsoft.clarity.models.LogLevel;
import com.microsoft.clarity.models.SessionMetadata;
import com.microsoft.clarity.p.h;
import com.microsoft.clarity.q.l;
import defpackage.js3;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements b {
    public static final Object b = new Object();
    public final com.microsoft.clarity.p.e a;

    public d(com.microsoft.clarity.p.e eVar) {
        js3.p(eVar, "metadataStore");
        this.a = eVar;
    }

    public final void a(String str, SessionMetadata sessionMetadata) {
        js3.p(str, "sessionId");
        js3.p(sessionMetadata, "metadata");
        LogLevel logLevel = l.a;
        l.b("Setting session " + str + " metadata.");
        String json = sessionMetadata.toJson();
        synchronized (b) {
            com.microsoft.clarity.p.e eVar = this.a;
            h hVar = h.OVERWRITE;
            js3.p(json, "content");
            js3.p(hVar, "mode");
            com.microsoft.clarity.p.c cVar = new com.microsoft.clarity.p.c(json);
            File fileA = com.microsoft.clarity.p.f.a(eVar, str, false, true, 2);
            cVar.invoke(new FileOutputStream(fileA, false));
            fileA.length();
        }
    }

    public final SessionMetadata a(String str) {
        String strB;
        js3.p(str, "sessionId");
        synchronized (b) {
            if (!com.microsoft.clarity.p.f.a(this.a, str, false, false, 6).exists()) {
                str = null;
            }
            strB = str != null ? this.a.b(str) : null;
        }
        if (strB != null) {
            return SessionMetadata.Companion.fromJson(strB);
        }
        return null;
    }
}
