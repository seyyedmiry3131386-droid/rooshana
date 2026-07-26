package com.microsoft.clarity.models;

import defpackage.js3;
import defpackage.yd1;

/* JADX INFO: loaded from: classes3.dex */
public final class PayloadMetadata {
    private transient Long duration;
    private final transient Long firstNonBaselineEventTimestamp;
    private final transient boolean isFirstPayload;
    private final int maxPayloadDuration;
    private final int pageNum;
    private final long pageTimestamp;
    private final int sequence;
    private final String sessionId;
    private transient long sizeInBytes;
    private final long start;

    public PayloadMetadata(String str, int i, int i2, long j, long j2, Long l) {
        js3.p(str, "sessionId");
        this.sessionId = str;
        this.pageNum = i;
        this.sequence = i2;
        this.start = j;
        this.pageTimestamp = j2;
        this.firstNonBaselineEventTimestamp = l;
        this.maxPayloadDuration = Math.min(i2 * 1000, 30000);
        this.isFirstPayload = i == 1 && i2 == 1;
    }

    public static /* synthetic */ PayloadMetadata copy$default(PayloadMetadata payloadMetadata, String str, int i, int i2, long j, long j2, Long l, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = payloadMetadata.sessionId;
        }
        if ((i3 & 2) != 0) {
            i = payloadMetadata.pageNum;
        }
        if ((i3 & 4) != 0) {
            i2 = payloadMetadata.sequence;
        }
        if ((i3 & 8) != 0) {
            j = payloadMetadata.start;
        }
        if ((i3 & 16) != 0) {
            j2 = payloadMetadata.pageTimestamp;
        }
        if ((i3 & 32) != 0) {
            l = payloadMetadata.firstNonBaselineEventTimestamp;
        }
        Long l2 = l;
        long j3 = j2;
        int i4 = i2;
        return payloadMetadata.copy(str, i, i4, j, j3, l2);
    }

    public final boolean canIncludeEvent(long j) {
        Long l = this.firstNonBaselineEventTimestamp;
        js3.m(l);
        return j - l.longValue() <= ((long) this.maxPayloadDuration) && this.sizeInBytes <= 31457280;
    }

    public final String component1() {
        return this.sessionId;
    }

    public final int component2() {
        return this.pageNum;
    }

    public final int component3() {
        return this.sequence;
    }

    public final long component4() {
        return this.start;
    }

    public final long component5() {
        return this.pageTimestamp;
    }

    public final Long component6() {
        return this.firstNonBaselineEventTimestamp;
    }

    public final PayloadMetadata copy(String str, int i, int i2, long j, long j2, Long l) {
        js3.p(str, "sessionId");
        return new PayloadMetadata(str, i, i2, j, j2, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayloadMetadata)) {
            return false;
        }
        PayloadMetadata payloadMetadata = (PayloadMetadata) obj;
        return js3.i(this.sessionId, payloadMetadata.sessionId) && this.pageNum == payloadMetadata.pageNum && this.sequence == payloadMetadata.sequence && this.start == payloadMetadata.start && this.pageTimestamp == payloadMetadata.pageTimestamp && js3.i(this.firstNonBaselineEventTimestamp, payloadMetadata.firstNonBaselineEventTimestamp);
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final Long getFirstNonBaselineEventTimestamp() {
        return this.firstNonBaselineEventTimestamp;
    }

    public final int getMaxPayloadDuration() {
        return this.maxPayloadDuration;
    }

    public final int getPageNum() {
        return this.pageNum;
    }

    public final long getPageTimestamp() {
        return this.pageTimestamp;
    }

    public final int getSequence() {
        return this.sequence;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final long getStart() {
        return this.start;
    }

    public int hashCode() {
        int iHashCode = (this.sequence + ((this.pageNum + (this.sessionId.hashCode() * 31)) * 31)) * 31;
        long j = this.start;
        long j2 = this.pageTimestamp;
        int i = (((int) ((j2 >>> 32) ^ j2)) + ((((int) (j ^ (j >>> 32))) + iHashCode) * 31)) * 31;
        Long l = this.firstNonBaselineEventTimestamp;
        return i + (l == null ? 0 : l.hashCode());
    }

    public final boolean isFirstPayload() {
        return this.isFirstPayload;
    }

    public final void setDuration(Long l) {
        this.duration = l;
    }

    public String toString() {
        return "PayloadMetadata(sessionId=" + this.sessionId + ", pageNum=" + this.pageNum + ", sequence=" + this.sequence + ", start=" + this.start + ", pageTimestamp=" + this.pageTimestamp + ", firstNonBaselineEventTimestamp=" + this.firstNonBaselineEventTimestamp + ')';
    }

    public final void updateDuration(long j) {
        long j2 = j - this.pageTimestamp;
        Long l = this.duration;
        this.duration = Long.valueOf(Math.max(l != null ? l.longValue() : 0L, j2 - this.start));
    }

    public final void updateSizeInBytes(long j) {
        this.sizeInBytes = Math.max(this.sizeInBytes, j);
    }

    public /* synthetic */ PayloadMetadata(String str, int i, int i2, long j, long j2, Long l, int i3, yd1 yd1Var) {
        this(str, i, i2, j, j2, (i3 & 32) != 0 ? null : l);
    }
}
