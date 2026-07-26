package com.microsoft.clarity.models.ingest.mutation;

import com.microsoft.clarity.models.ingest.EventType;
import defpackage.bl4;
import defpackage.js3;
import defpackage.m88;

/* JADX INFO: loaded from: classes3.dex */
public final class MutationErrorEvent extends BaseMutationEvent {
    private final String reason;
    private final EventType type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutationErrorEvent(long j, String str) {
        super(j);
        js3.p(str, "reason");
        this.reason = str;
        this.type = EventType.MutationError;
    }

    public final String getReason() {
        return this.reason;
    }

    @Override // com.microsoft.clarity.models.ingest.SessionEvent
    public EventType getType() {
        return this.type;
    }

    @Override // com.microsoft.clarity.models.ingest.SessionEvent
    public String serialize(long j) {
        String str = this.reason;
        js3.p(str, "string");
        String strX = m88.X(m88.X(m88.X(m88.X(str, "\\", "\\\\"), "\"", "\\\""), "\r\n", " "), "\n", " ");
        StringBuilder sb = new StringBuilder("[");
        sb.append(relativeTimestamp(j));
        sb.append(',');
        sb.append(getType().getCustomOrdinal());
        return bl4.z(sb, ",\"", strX, "\"]");
    }
}
