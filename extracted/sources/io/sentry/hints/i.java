package io.sentry.hints;

import defpackage.o40;
import io.sentry.DataCategory;
import io.sentry.SentryLevel;
import io.sentry.android.core.i0;
import io.sentry.b6;
import io.sentry.clientreport.DiscardReason;
import io.sentry.u0;
import io.sentry.u4;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements io.sentry.cache.tape.f, io.sentry.util.d, io.sentry.clientreport.e, h {
    public static final Field e(u0 u0Var, String str) {
        try {
            Field declaredField = Class.forName(str).getDeclaredField("tag");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Exception unused) {
            u0Var.i(SentryLevel.WARNING, o40.y("Could not load ", str, ".tag field"), new Object[0]);
            return null;
        }
    }

    public static boolean f(u0 u0Var, String str) {
        return l(u0Var, str) != null;
    }

    public static boolean i(b6 b6Var, String str) {
        return f(b6Var != null ? b6Var.getLogger() : null, str);
    }

    public static Class l(u0 u0Var, String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            if (u0Var == null) {
                return null;
            }
            u0Var.i(SentryLevel.INFO, "Class not available: ".concat(str), new Object[0]);
            return null;
        } catch (UnsatisfiedLinkError e) {
            if (u0Var == null) {
                return null;
            }
            u0Var.f(SentryLevel.ERROR, "Failed to load (UnsatisfiedLinkError) ".concat(str), e);
            return null;
        } catch (Throwable th) {
            if (u0Var == null) {
                return null;
            }
            u0Var.f(SentryLevel.ERROR, "Failed to initialize ".concat(str), th);
            return null;
        }
    }

    @Override // io.sentry.cache.tape.f
    public void b(Object obj, OutputStream outputStream) throws IOException {
        io.sentry.android.core.anr.f fVar = (io.sentry.android.core.anr.f) obj;
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        try {
            fVar.a(dataOutputStream);
            dataOutputStream.flush();
            outputStream.flush();
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.util.d
    public Object c() {
        return Boolean.valueOf(i0.i());
    }

    @Override // io.sentry.cache.tape.f
    public Object d(byte[] bArr) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        try {
            if (dataInputStream.readShort() == 1) {
                long j = dataInputStream.readLong();
                int i = dataInputStream.readInt();
                if (i >= 0 && i <= 1000) {
                    StackTraceElement[] stackTraceElementArr = new StackTraceElement[i];
                    for (int i2 = 0; i2 < i; i2++) {
                        String utf = dataInputStream.readUTF();
                        String utf2 = dataInputStream.readUTF();
                        boolean z = dataInputStream.readBoolean();
                        String utf3 = dataInputStream.readUTF();
                        if (z) {
                            utf3 = null;
                        }
                        stackTraceElementArr[i2] = new StackTraceElement(utf, utf2, utf3, dataInputStream.readInt());
                    }
                    return new io.sentry.android.core.anr.f(j, stackTraceElementArr);
                }
            }
        } catch (EOFException unused) {
        }
        return null;
    }

    @Override // io.sentry.clientreport.e
    public io.sentry.internal.debugmeta.c k(io.sentry.internal.debugmeta.c cVar) {
        return cVar;
    }

    @Override // io.sentry.clientreport.e
    public void a(DiscardReason discardReason, DataCategory dataCategory) {
    }

    @Override // io.sentry.clientreport.e
    public void g(DiscardReason discardReason, io.sentry.internal.debugmeta.c cVar) {
    }

    @Override // io.sentry.clientreport.e
    public void j(DiscardReason discardReason, u4 u4Var) {
    }

    @Override // io.sentry.clientreport.e
    public void h(DiscardReason discardReason, DataCategory dataCategory, long j) {
    }
}
