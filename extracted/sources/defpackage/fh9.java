package defpackage;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fh9 {
    public static final Logger a = Logger.getLogger("okio.Okio");

    public static final boolean a(AssertionError assertionError) {
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? f88.c0(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }
}
