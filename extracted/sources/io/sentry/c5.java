package io.sentry;

import j$.time.Instant;

/* JADX INFO: loaded from: classes3.dex */
public final class c5 extends n4 {
    public final Instant a = Instant.now();

    @Override // io.sentry.n4
    public final long d() {
        Instant instant = this.a;
        return (instant.getEpochSecond() * 1000000000) + ((long) instant.getNano());
    }
}
