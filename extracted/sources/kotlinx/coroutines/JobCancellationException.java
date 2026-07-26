package kotlinx.coroutines;

import defpackage.js3;
import defpackage.ko5;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class JobCancellationException extends CancellationException {
    public final transient c a;

    public JobCancellationException(String str, Throwable th, c cVar) {
        super(str);
        this.a = cVar;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JobCancellationException)) {
            return false;
        }
        JobCancellationException jobCancellationException = (JobCancellationException) obj;
        if (!js3.i(jobCancellationException.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = jobCancellationException.a;
        if (obj2 == null) {
            obj2 = ko5.b;
        }
        Object obj3 = this.a;
        if (obj3 == null) {
            obj3 = ko5.b;
        }
        return js3.i(obj2, obj3) && js3.i(jobCancellationException.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        js3.m(message);
        int iHashCode = message.hashCode() * 31;
        Object obj = this.a;
        if (obj == null) {
            obj = ko5.b;
        }
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.a;
        if (obj == null) {
            obj = ko5.b;
        }
        sb.append(obj);
        return sb.toString();
    }
}
