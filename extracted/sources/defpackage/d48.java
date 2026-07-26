package defpackage;

import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d48 {
    public static final /* synthetic */ int a = 0;

    static {
        Object objA;
        Object objA2;
        Exception exc = new Exception();
        String simpleName = vy2.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objA = BaseContinuationImpl.class.getCanonicalName();
        } catch (Throwable th) {
            objA = b.a(th);
        }
        if (Result.a(objA) != null) {
            objA = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objA2 = d48.class.getCanonicalName();
        } catch (Throwable th2) {
            objA2 = b.a(th2);
        }
        if (Result.a(objA2) != null) {
            objA2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
