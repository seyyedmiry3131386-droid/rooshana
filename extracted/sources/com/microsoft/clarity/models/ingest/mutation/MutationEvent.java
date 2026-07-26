package com.microsoft.clarity.models.ingest.mutation;

import com.microsoft.clarity.models.display.DisplayFrame;
import com.microsoft.clarity.models.ingest.EventType;
import com.microsoft.clarity.q.c;
import defpackage.js3;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class MutationEvent extends BaseMutationEvent {
    private final DisplayFrame frame;
    private final EventType type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutationEvent(DisplayFrame displayFrame) {
        super(displayFrame.getTimestamp());
        js3.p(displayFrame, "frame");
        this.frame = displayFrame;
        this.type = EventType.Mutation;
    }

    public final DisplayFrame getFrame() {
        return this.frame;
    }

    @Override // com.microsoft.clarity.models.ingest.SessionEvent
    public EventType getType() {
        return this.type;
    }

    @Override // com.microsoft.clarity.models.ingest.SessionEvent
    public String serialize(long j) {
        byte[] byteArray = this.frame.toProtobufInstance(j).toByteArray();
        MessageDigest messageDigest = c.a;
        js3.o(byteArray, "data");
        return "[" + relativeTimestamp(j) + ',' + getType().getCustomOrdinal() + ',' + this.frame.isKeyFrame() + ",\"" + c.a(byteArray, false) + "\",\"\",-2," + ((Object) 3) + ']';
    }
}
