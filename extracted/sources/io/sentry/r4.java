package io.sentry;

import defpackage.o40;
import defpackage.za1;
import io.sentry.exception.SentryEnvelopeException;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r4 implements Callable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ i1 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r4(a aVar, long j, i1 i1Var, u0 u0Var) {
        this.d = aVar;
        this.b = j;
        this.c = i1Var;
        this.e = u0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws SentryEnvelopeException {
        int i = this.a;
        i1 i1Var = this.c;
        Object obj = this.e;
        long j = this.b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                a aVar = (a) obj2;
                u0 u0Var = (u0) obj;
                byte[] byteArray = aVar.a;
                String str = aVar.d;
                if (byteArray == null) {
                    io.sentry.protocol.h0 h0Var = aVar.b;
                    if (h0Var == null) {
                        za1 za1Var = aVar.c;
                        if (za1Var != null && (byteArray = (byte[]) za1Var.call()) != null) {
                            u4.a(byteArray.length, j, str);
                        }
                        throw new SentryEnvelopeException(o40.y("Couldn't attach the attachment ", str, ".\nPlease check that either bytes, serializable, path or provider is set."));
                    }
                    Charset charset = io.sentry.util.c.a;
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, io.sentry.util.c.a));
                            try {
                                i1Var.a(h0Var, bufferedWriter);
                                byteArray = byteArrayOutputStream.toByteArray();
                                bufferedWriter.close();
                                byteArrayOutputStream.close();
                            } finally {
                                try {
                                    break;
                                } catch (Throwable th) {
                                }
                            }
                        } finally {
                            try {
                                break;
                            } catch (Throwable th2) {
                            }
                        }
                    } catch (Throwable th3) {
                        u0Var.f(SentryLevel.ERROR, "Could not serialize serializable", th3);
                        byteArray = null;
                    }
                    if (byteArray != null) {
                        u4.a(byteArray.length, j, str);
                    }
                    throw new SentryEnvelopeException(o40.y("Couldn't attach the attachment ", str, ".\nPlease check that either bytes, serializable, path or provider is set."));
                }
                u4.a(byteArray.length, j, str);
                return byteArray;
            default:
                File file = (File) obj2;
                p3 p3Var = (p3) obj;
                if (!file.exists()) {
                    throw new SentryEnvelopeException(o40.y("Dropping profiling trace data, because the file '", file.getName(), "' doesn't exists"));
                }
                try {
                    String str2 = new String(io.sentry.vendor.a.a(io.sentry.config.a.U(j, file.getPath())), "US-ASCII");
                    if (str2.isEmpty()) {
                        throw new SentryEnvelopeException("Profiling trace file is empty");
                    }
                    p3Var.B = str2;
                    try {
                        p3Var.l = (List) p3Var.b.call();
                        break;
                    } catch (Throwable unused) {
                    }
                    try {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            try {
                                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, u4.d));
                                try {
                                    i1Var.a(p3Var, bufferedWriter2);
                                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                    bufferedWriter2.close();
                                    byteArrayOutputStream2.close();
                                    return byteArray2;
                                } finally {
                                    try {
                                        break;
                                    } catch (Throwable th4) {
                                    }
                                }
                            } catch (Throwable th5) {
                                try {
                                    byteArrayOutputStream2.close();
                                    break;
                                } catch (Throwable th6) {
                                    th5.addSuppressed(th6);
                                }
                                throw th5;
                            }
                        } finally {
                            file.delete();
                        }
                    } catch (IOException e) {
                        throw new SentryEnvelopeException("Failed to serialize profiling trace data\n" + e.getMessage());
                    }
                } catch (UnsupportedEncodingException e2) {
                    throw new AssertionError(e2);
                }
        }
    }

    public /* synthetic */ r4(File file, long j, p3 p3Var, i1 i1Var) {
        this.d = file;
        this.b = j;
        this.e = p3Var;
        this.c = i1Var;
    }
}
