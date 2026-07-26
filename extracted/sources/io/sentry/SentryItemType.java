package io.sentry;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public enum SentryItemType implements g2 {
    Session("session"),
    Event("event"),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile("profile"),
    ProfileChunk("profile_chunk"),
    ClientReport("client_report"),
    ReplayEvent("replay_event"),
    ReplayRecording("replay_recording"),
    ReplayVideo("replay_video"),
    CheckIn("check_in"),
    Feedback("feedback"),
    Log("log"),
    TraceMetric("trace_metric"),
    Span("span"),
    Unknown("__unknown__");

    private final String itemType;

    SentryItemType(String str) {
        this.itemType = str;
    }

    public static SentryItemType resolve(Object obj) {
        return obj instanceof w4 ? ((io.sentry.protocol.j) ((w4) obj).b.w("feedback", io.sentry.protocol.j.class)) == null ? Event : Feedback : obj instanceof io.sentry.protocol.d0 ? Transaction : obj instanceof i6 ? Session : obj instanceof io.sentry.clientreport.b ? ClientReport : Attachment;
    }

    public static SentryItemType valueOfLabel(String str) {
        for (SentryItemType sentryItemType : values()) {
            if (sentryItemType.itemType.equals(str)) {
                return sentryItemType;
            }
        }
        return Unknown;
    }

    public String getItemType() {
        return this.itemType;
    }

    @Override // io.sentry.g2
    public void serialize(i3 i3Var, u0 u0Var) throws IOException {
        ((io.sentry.internal.debugmeta.c) i3Var).z(this.itemType);
    }
}
