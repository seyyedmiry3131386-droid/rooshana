package com.microsoft.clarity.models.ingest;

import com.microsoft.clarity.models.SessionMetadata;
import com.microsoft.clarity.q.q;
import defpackage.dw1;
import defpackage.js3;
import defpackage.o40;
import defpackage.t61;

/* JADX INFO: loaded from: classes3.dex */
public final class Envelope {
    private final long duration;
    private final int end;
    private final int pageNum;
    private final int platform;
    private final int sequence;
    private final SessionMetadata sessionMetadata;
    private final long start;
    private final int upload;

    public Envelope(SessionMetadata sessionMetadata, int i, int i2, long j, long j2) {
        js3.p(sessionMetadata, "sessionMetadata");
        this.sessionMetadata = sessionMetadata;
        this.pageNum = i;
        this.sequence = i2;
        this.start = j;
        this.duration = j2;
        this.platform = 1;
    }

    public final String serialize() {
        String strA = q.a(this.sessionMetadata.getVersion());
        String strA2 = q.a(this.sessionMetadata.getProjectId());
        String strA3 = q.a(this.sessionMetadata.getUserId());
        String strA4 = q.a(this.sessionMetadata.getSessionId());
        StringBuilder sbN = t61.n("[\"", strA, "\",");
        sbN.append(this.sequence);
        sbN.append(',');
        sbN.append(this.start);
        sbN.append(',');
        sbN.append(this.duration);
        sbN.append(",\"");
        sbN.append(strA2);
        o40.I("\",\"", strA3, "\",\"", strA4, sbN);
        sbN.append("\",");
        sbN.append(this.pageNum);
        sbN.append(',');
        sbN.append(this.upload);
        sbN.append(',');
        sbN.append(this.end);
        sbN.append(',');
        return dw1.q(sbN, this.platform, ']');
    }
}
