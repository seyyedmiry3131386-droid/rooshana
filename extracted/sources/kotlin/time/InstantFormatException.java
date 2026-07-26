package kotlin.time;

import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
final class InstantFormatException extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstantFormatException(String str) {
        super(str);
        js3.p(str, "message");
    }
}
