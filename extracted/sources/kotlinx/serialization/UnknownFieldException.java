package kotlinx.serialization;

import defpackage.rm7;

/* JADX INFO: loaded from: classes3.dex */
public final class UnknownFieldException extends SerializationException {
    public UnknownFieldException(int i) {
        super(rm7.n(i, "An unknown field for index "));
    }
}
