package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class yg1 implements by7 {
    public final OutputStream a;
    public final e18 b;
    public final /* synthetic */ vp7 c;

    public yg1(vp7 vp7Var) {
        this.c = vp7Var;
        Socket socket = (Socket) vp7Var.b;
        this.a = socket.getOutputStream();
        this.b = new e18(socket);
    }

    @Override // defpackage.by7
    public final void X0(gh0 gh0Var, long j) throws IOException {
        wq2.m(gh0Var.b, 0L, j);
        while (j > 0) {
            e18 e18Var = this.b;
            e18Var.f();
            vl7 vl7Var = gh0Var.a;
            js3.m(vl7Var);
            int iMin = (int) Math.min(j, vl7Var.c - vl7Var.b);
            e18Var.h();
            try {
                try {
                    this.a.write(vl7Var.a, vl7Var.b, iMin);
                    if (e18Var.i()) {
                        throw e18Var.j(null);
                    }
                    int i = vl7Var.b + iMin;
                    vl7Var.b = i;
                    long j2 = iMin;
                    j -= j2;
                    gh0Var.b -= j2;
                    if (i == vl7Var.c) {
                        gh0Var.a = vl7Var.a();
                        am7.a(vl7Var);
                    }
                } catch (IOException e) {
                    if (!e18Var.i()) {
                        throw e;
                    }
                    throw e18Var.j(e);
                }
            } catch (Throwable th) {
                e18Var.i();
                throw th;
            }
        }
    }

    @Override // defpackage.by7, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        OutputStream outputStream = this.a;
        vp7 vp7Var = this.c;
        e18 e18Var = this.b;
        e18Var.h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) vp7Var.c;
            Socket socket = (Socket) vp7Var.b;
            js3.p(atomicInteger, "<this>");
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 1) != 0) {
                    i = 0;
                    break;
                }
                int i3 = i2 | 1;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    i = i3;
                    break;
                }
            }
            if (i != 0) {
                if (i != 3) {
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        outputStream.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            outputStream.close();
                        }
                    }
                    return;
                }
                socket.close();
                if (e18Var.i()) {
                    throw e18Var.j(null);
                }
            }
        } catch (IOException e) {
            if (!e18Var.i()) {
                throw e;
            }
            throw e18Var.j(e);
        } finally {
            e18Var.i();
        }
    }

    @Override // defpackage.by7, java.io.Flushable
    public final void flush() throws IOException {
        e18 e18Var = this.b;
        e18Var.h();
        try {
            this.a.flush();
            if (e18Var.i()) {
                throw e18Var.j(null);
            }
        } catch (IOException e) {
            if (!e18Var.i()) {
                throw e;
            }
            throw e18Var.j(e);
        } finally {
            e18Var.i();
        }
    }

    @Override // defpackage.by7
    public final dm8 i() {
        return this.b;
    }

    public final String toString() {
        return "sink(" + ((Socket) this.c.b) + ')';
    }
}
