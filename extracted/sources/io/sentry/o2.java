package io.sentry;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o2 implements q0, s0, s3, n1, o1, u0 {
    public static final o2 a = new o2();
    public static final o2 b = new o2();
    public static final o2 c = new o2();
    public static final o2 d = new o2();

    @Override // io.sentry.s3
    public r3 P() {
        return t2.a;
    }

    @Override // io.sentry.s0
    public io.sentry.protocol.v c(io.sentry.protocol.j jVar) {
        return io.sentry.protocol.v.b;
    }

    @Override // io.sentry.u0
    public void e(SentryLevel sentryLevel, Throwable th, String str, Object... objArr) {
        PrintStream printStream = System.out;
        String str2 = String.format(str, objArr);
        String string = th.toString();
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        printStream.println(sentryLevel + ": " + str2 + " \n " + string + "\n" + stringWriter.toString());
    }

    @Override // io.sentry.u0
    public void f(SentryLevel sentryLevel, String str, Throwable th) {
        if (th == null) {
            i(sentryLevel, str, new Object[0]);
            return;
        }
        PrintStream printStream = System.out;
        String str2 = String.format(str, th.toString());
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        printStream.println(sentryLevel + ": " + str2 + "\n" + stringWriter.toString());
    }

    @Override // io.sentry.n1
    public p3 h(h6 h6Var, List list, b6 b6Var) {
        return null;
    }

    @Override // io.sentry.u0
    public void i(SentryLevel sentryLevel, String str, Object... objArr) {
        System.out.println(sentryLevel + ": " + String.format(str, objArr));
    }

    @Override // io.sentry.n1
    public boolean isRunning() {
        return false;
    }

    @Override // io.sentry.o1
    public io.sentry.transport.g j(b6 b6Var, io.sentry.internal.debugmeta.c cVar) {
        return new io.sentry.transport.c(b6Var, new io.sentry.transport.p(b6Var), b6Var.getTransportGate(), cVar);
    }

    @Override // io.sentry.s3
    public io.sentry.protocol.v k() {
        return io.sentry.protocol.v.b;
    }

    @Override // io.sentry.u0
    public boolean l(SentryLevel sentryLevel) {
        return true;
    }

    @Override // io.sentry.s3
    public void K() {
    }

    @Override // io.sentry.s0
    public void a() {
    }

    @Override // io.sentry.s3
    public void b() {
    }

    @Override // io.sentry.n1
    public void close() {
    }

    @Override // io.sentry.n1
    public void start() {
    }

    @Override // io.sentry.s3
    public void stop() {
    }

    @Override // io.sentry.s3
    public void u() {
    }

    @Override // io.sentry.s3
    public void D(io.sentry.android.replay.a aVar) {
    }

    @Override // io.sentry.s3
    public void d(Boolean bool) {
    }

    @Override // io.sentry.n1
    public void g(m1 m1Var) {
    }

    @Override // io.sentry.s3
    public void y(io.sentry.protocol.v vVar) {
    }
}
