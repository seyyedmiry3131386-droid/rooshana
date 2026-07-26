package io.sentry.clientreport;

import io.sentry.DataCategory;
import io.sentry.u4;

/* JADX INFO: loaded from: classes3.dex */
public interface e {
    void a(DiscardReason discardReason, DataCategory dataCategory);

    void g(DiscardReason discardReason, io.sentry.internal.debugmeta.c cVar);

    void h(DiscardReason discardReason, DataCategory dataCategory, long j);

    void j(DiscardReason discardReason, u4 u4Var);

    io.sentry.internal.debugmeta.c k(io.sentry.internal.debugmeta.c cVar);
}
