package kotlinx.serialization.json.internal;

import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class JsonDecodingException extends JsonException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonDecodingException(String str) {
        super(str);
        js3.p(str, "message");
    }
}
