package kotlinx.serialization;

import defpackage.js3;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MissingFieldException extends SerializationException {
    public final List a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(List list, String str, MissingFieldException missingFieldException) {
        super(str, missingFieldException);
        js3.p(list, "missingFields");
        this.a = list;
    }
}
