package io.sentry;

import defpackage.o40;
import defpackage.za1;
import io.sentry.exception.SentryEnvelopeException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class u4 {
    public static final Charset d = Charset.forName("UTF-8");
    public final v4 a;
    public final Callable b;
    public byte[] c;

    public u4(v4 v4Var, byte[] bArr) {
        this.a = v4Var;
        this.c = bArr;
        this.b = null;
    }

    public static void a(long j, long j2, String str) throws SentryEnvelopeException {
        if (j > j2) {
            throw new SentryEnvelopeException(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(j), Long.valueOf(j2)));
        }
    }

    public static u4 b(i1 i1Var, io.sentry.clientreport.b bVar) {
        io.sentry.config.a.W(i1Var, "ISerializer is required.");
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new za1(i1Var, bVar, 8));
        return new u4(new v4(SentryItemType.resolve(bVar), new q4(cVar, 9), "application/json", null, null), new q4(cVar, 10));
    }

    public static u4 c(final n3 n3Var, final i1 i1Var, final z0 z0Var) {
        final File file = n3Var.k;
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new Callable() { // from class: io.sentry.t4
            @Override // java.util.concurrent.Callable
            public final Object call() throws SentryEnvelopeException {
                i1 i1Var2 = i1Var;
                File file2 = file;
                n3 n3Var2 = n3Var;
                if (file2 != null) {
                    if (!file2.exists()) {
                        throw new SentryEnvelopeException(o40.y("Dropping profile chunk, because the file '", file2.getName(), "' doesn't exists"));
                    }
                    if ("java".equals(n3Var2.f)) {
                        s2 s2Var = s2.a;
                        z0 z0Var2 = z0Var;
                        if (s2Var.equals(z0Var2)) {
                            throw new SentryEnvelopeException("No ProfileConverter available, dropping chunk.");
                        }
                        try {
                            file2.getAbsolutePath();
                            ((s2) z0Var2).getClass();
                            n3Var2.m = new io.sentry.protocol.profiling.a();
                        } catch (Exception e) {
                            throw new SentryEnvelopeException("Profile conversion failed", e);
                        }
                    } else {
                        try {
                            String str = new String(io.sentry.vendor.a.a(io.sentry.config.a.U(52428800L, file2.getPath())), "US-ASCII");
                            if (str.isEmpty()) {
                                throw new SentryEnvelopeException("Profiling trace file is empty");
                            }
                            n3Var2.l = str;
                        } catch (UnsupportedEncodingException e2) {
                            throw new AssertionError(e2);
                        }
                    }
                }
                try {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, u4.d));
                            try {
                                i1Var2.a(n3Var2, bufferedWriter);
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                bufferedWriter.close();
                                byteArrayOutputStream.close();
                                return byteArray;
                            } finally {
                            }
                        } catch (Throwable th) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } finally {
                        if (file2 != null) {
                            file2.delete();
                        }
                    }
                } catch (IOException e3) {
                    throw new SentryEnvelopeException("Failed to serialize profile chunk\n" + e3.getMessage());
                }
            }
        });
        return new u4(new v4(SentryItemType.ProfileChunk, new q4(cVar, 14), "application-json", file != null ? file.getName() : null, (String) null, n3Var.f, (Integer) null), new q4(cVar, 15));
    }

    public static u4 d(i1 i1Var, i6 i6Var) {
        io.sentry.config.a.W(i1Var, "ISerializer is required.");
        io.sentry.config.a.W(i6Var, "Session is required.");
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new za1(i1Var, i6Var, 9));
        return new u4(new v4(SentryItemType.Session, new q4(cVar, 16), "application/json", null, null), new q4(cVar, 17));
    }

    public static byte[] j(LinkedHashMap linkedHashMap) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write((byte) (linkedHashMap.size() | 128));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                byte[] bytes = ((String) entry.getKey()).getBytes(d);
                int length = bytes.length;
                byteArrayOutputStream.write(-39);
                byteArrayOutputStream.write((byte) length);
                byteArrayOutputStream.write(bytes);
                byte[] bArr = (byte[]) entry.getValue();
                int length2 = bArr.length;
                byteArrayOutputStream.write(-58);
                byteArrayOutputStream.write(ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(length2).array());
                byteArrayOutputStream.write(bArr);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final io.sentry.clientreport.b e(i1 i1Var) throws IOException {
        v4 v4Var = this.a;
        if (v4Var == null || v4Var.e != SentryItemType.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(f()), d));
        try {
            io.sentry.clientreport.b bVar = (io.sentry.clientreport.b) i1Var.c(bufferedReader, io.sentry.clientreport.b.class);
            bufferedReader.close();
            return bVar;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final byte[] f() {
        Callable callable;
        if (this.c == null && (callable = this.b) != null) {
            this.c = (byte[]) callable.call();
        }
        return this.c;
    }

    public final h5 g(i1 i1Var) throws IOException {
        v4 v4Var = this.a;
        if (v4Var == null || v4Var.e != SentryItemType.Log) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(f()), d));
        try {
            h5 h5Var = (h5) i1Var.c(bufferedReader, h5.class);
            bufferedReader.close();
            return h5Var;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final k5 h(i1 i1Var) throws IOException {
        v4 v4Var = this.a;
        if (v4Var == null || v4Var.e != SentryItemType.TraceMetric) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(f()), d));
        try {
            k5 k5Var = (k5) i1Var.c(bufferedReader, k5.class);
            bufferedReader.close();
            return k5Var;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final io.sentry.protocol.d0 i(i1 i1Var) throws IOException {
        v4 v4Var = this.a;
        if (v4Var == null || v4Var.e != SentryItemType.Transaction) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(f()), d));
        try {
            io.sentry.protocol.d0 d0Var = (io.sentry.protocol.d0) i1Var.c(bufferedReader, io.sentry.protocol.d0.class);
            bufferedReader.close();
            return d0Var;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public u4(v4 v4Var, Callable callable) {
        this.a = v4Var;
        this.b = callable;
        this.c = null;
    }
}
