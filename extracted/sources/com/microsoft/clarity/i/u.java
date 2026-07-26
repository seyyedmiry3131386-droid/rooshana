package com.microsoft.clarity.i;

import com.microsoft.clarity.models.PageMetadata;
import com.microsoft.clarity.models.SessionMetadata;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u {
    public static String a(v vVar) {
        SessionMetadata sessionMetadata;
        PageMetadata pageMetadataA = vVar.a();
        if (pageMetadataA == null || (sessionMetadata = pageMetadataA.getSessionMetadata()) == null) {
            return null;
        }
        return sessionMetadata.getSessionId();
    }
}
