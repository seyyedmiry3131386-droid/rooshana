package com.microsoft.clarity.models.ingest;

import com.microsoft.clarity.models.observers.ScreenMetadata;
import defpackage.f88;
import defpackage.js3;
import defpackage.ok4;
import defpackage.uq3;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseWebViewEvent extends SessionEvent {
    private final String data;
    private final ScreenMetadata screenMetadata;
    private final EventType type;
    private final int webViewHashCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseWebViewEvent(long j, String str, int i, ScreenMetadata screenMetadata, int i2) {
        super(j);
        js3.p(str, "data");
        js3.p(screenMetadata, "screenMetadata");
        this.data = str;
        this.webViewHashCode = i;
        this.screenMetadata = screenMetadata;
        for (EventType eventType : EventType.values()) {
            if (eventType.getCustomOrdinal() == i2) {
                this.type = eventType;
                return;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public final String copyDataWithNewTimestamp(long j) {
        String str = this.data;
        js3.p(str, "event");
        uq3 uq3VarZ = ok4.Z(f88.k0('[', 0, 6, str) + 1, f88.k0(',', 0, 6, str));
        String strValueOf = String.valueOf(j);
        js3.p(uq3VarZ, "range");
        js3.p(strValueOf, "replacement");
        return f88.v0(str, uq3VarZ.a, uq3VarZ.b + 1, strValueOf).toString();
    }

    public abstract BaseWebViewEvent copyWithNewTimestamp(long j);

    public final String getData() {
        return this.data;
    }

    public final ScreenMetadata getScreenMetadata() {
        return this.screenMetadata;
    }

    @Override // com.microsoft.clarity.models.ingest.SessionEvent
    public EventType getType() {
        return this.type;
    }

    public final int getWebViewHashCode() {
        return this.webViewHashCode;
    }

    @Override // com.microsoft.clarity.models.ingest.SessionEvent
    public String serialize(long j) {
        return copyDataWithNewTimestamp(getTimestamp() - j);
    }
}
