package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class zg1 implements t18 {
    public final InputStream a;
    public final e18 b;
    public final /* synthetic */ vp7 c;

    public zg1(vp7 vp7Var) {
        this.c = vp7Var;
        Socket socket = (Socket) vp7Var.b;
        this.a = socket.getInputStream();
        this.b = new e18(socket);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        vp7 vp7Var = this.c;
        e18 e18Var = this.b;
        e18Var.h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) vp7Var.c;
            Socket socket = (Socket) vp7Var.b;
            js3.p(atomicInteger, "<this>");
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 2) != 0) {
                    i = 0;
                    break;
                }
                int i3 = i2 | 2;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    i = i3;
                    break;
                }
            }
            if (i != 0) {
                if (i == 3) {
                    socket.close();
                } else {
                    if (socket.isClosed() || socket.isInputShutdown()) {
                        return;
                    }
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.a.close();
                    }
                }
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

    @Override // defpackage.t18
    public final long f0(gh0 gh0Var, long j) throws IOException {
        js3.p(gh0Var, "sink");
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            throw new IllegalArgumentException(bl4.r(j, "byteCount < 0: ").toString());
        }
        e18 e18Var = this.b;
        e18Var.f();
        vl7 vl7VarF0 = gh0Var.F0(1);
        int iMin = (int) Math.min(j, 8192 - vl7VarF0.c);
        try {
            e18Var.h();
            try {
                int i = this.a.read(vl7VarF0.a, vl7VarF0.c, iMin);
                if (e18Var.i()) {
                    throw e18Var.j(null);
                }
                if (i != -1) {
                    vl7VarF0.c += i;
                    long j2 = i;
                    gh0Var.b += j2;
                    return j2;
                }
                if (vl7VarF0.b != vl7VarF0.c) {
                    return -1L;
                }
                gh0Var.a = vl7VarF0.a();
                am7.a(vl7VarF0);
                return -1L;
            } catch (IOException e) {
                if (e18Var.i()) {
                    throw e18Var.j(e);
                }
                throw e;
            } finally {
                e18Var.i();
            }
        } catch (AssertionError e2) {
            if (fh9.a(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // defpackage.t18
    public final dm8 i() {
        return this.b;
    }

    public final String toString() {
        return "source(" + ((Socket) this.c.b) + ')';
    }
}
