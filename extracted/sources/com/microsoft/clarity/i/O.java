package com.microsoft.clarity.i;

import com.microsoft.clarity.models.AssetType;
import com.microsoft.clarity.models.LogLevel;
import com.microsoft.clarity.models.SessionMetadata;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tx8;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class O extends FunctionReferenceImpl implements qp2 {
    public O(P p) {
        super(2, p, P.class, "processWebAsset", "processWebAsset(Ljava/lang/String;[B)V", 0);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        byte[] bArr = (byte[]) obj2;
        js3.p(str, "p0");
        js3.p(bArr, "p1");
        P p = (P) this.receiver;
        p.getClass();
        LogLevel logLevel = com.microsoft.clarity.q.l.a;
        com.microsoft.clarity.q.l.b("Received web asset " + str + '.');
        com.microsoft.clarity.n.c cVar = p.e;
        SessionMetadata sessionMetadata = p.p;
        js3.m(sessionMetadata);
        String sessionId = sessionMetadata.getSessionId();
        AssetType assetType = AssetType.Web;
        com.microsoft.clarity.n.g gVar = (com.microsoft.clarity.n.g) cVar;
        gVar.getClass();
        js3.p(sessionId, "sessionId");
        js3.p(assetType, "type");
        com.microsoft.clarity.q.l.b("Save session " + sessionId + " asset " + str);
        com.microsoft.clarity.p.g gVarA = gVar.a(assetType);
        String strA = com.microsoft.clarity.n.g.a(sessionId, str);
        com.microsoft.clarity.p.e eVar = (com.microsoft.clarity.p.e) gVarA;
        js3.p(strA, "filename");
        if (!com.microsoft.clarity.p.f.a(eVar, strA, false, false, 6).exists()) {
            js3.p(com.microsoft.clarity.p.h.OVERWRITE, "mode");
            com.microsoft.clarity.p.d dVar = new com.microsoft.clarity.p.d(bArr);
            File fileA = com.microsoft.clarity.p.f.a(eVar, strA, false, true, 2);
            dVar.invoke(new FileOutputStream(fileA, false));
            fileA.length();
        }
        return tx8.a;
    }
}
