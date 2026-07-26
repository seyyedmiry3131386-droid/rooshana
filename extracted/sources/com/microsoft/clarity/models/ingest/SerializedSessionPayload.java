package com.microsoft.clarity.models.ingest;

import defpackage.bp2;
import defpackage.c24;
import defpackage.f88;
import defpackage.js3;
import defpackage.ok4;
import java.util.List;
import kotlin.a;
import kotlin.jvm.internal.Ref$LongRef;

/* JADX INFO: loaded from: classes3.dex */
public final class SerializedSessionPayload {
    private final c24 duration$delegate;
    private final List<String> events;
    private final List<String> frames;
    private final int pageNum;
    private final int sequence;
    private final long start;

    public SerializedSessionPayload(List<String> list, List<String> list2, int i, int i2, long j) {
        js3.p(list, "frames");
        js3.p(list2, "events");
        this.frames = list;
        this.events = list2;
        this.pageNum = i;
        this.sequence = i2;
        this.start = j;
        this.duration$delegate = a.a(new bp2() { // from class: com.microsoft.clarity.models.ingest.SerializedSessionPayload$duration$2
            {
                super(0);
            }

            private static final void invoke$updateTimestamps(Ref$LongRef ref$LongRef, List<String> list3) {
                for (String str : list3) {
                    js3.p(str, "event");
                    ref$LongRef.a = Math.max(ref$LongRef.a, Long.parseLong(f88.B0(str, ok4.Z(f88.k0('[', 0, 6, str) + 1, f88.k0(',', 0, 6, str)))));
                }
            }

            @Override // defpackage.bp2
            public final Long invoke() {
                Ref$LongRef ref$LongRef = new Ref$LongRef();
                invoke$updateTimestamps(ref$LongRef, this.this$0.getFrames());
                invoke$updateTimestamps(ref$LongRef, this.this$0.getEvents());
                return Long.valueOf(ref$LongRef.a - this.this$0.getStart());
            }
        });
    }

    public final long getDuration() {
        return ((Number) this.duration$delegate.getValue()).longValue();
    }

    public final List<String> getEvents() {
        return this.events;
    }

    public final List<String> getFrames() {
        return this.frames;
    }

    public final int getPageNum() {
        return this.pageNum;
    }

    public final int getSequence() {
        return this.sequence;
    }

    public final long getStart() {
        return this.start;
    }
}
