package defpackage;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class vx implements rm4 {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public hd c;
    public final AtomicReference d;
    public final b11 e;
    public boolean f;

    public vx(MediaCodec mediaCodec, HandlerThread handlerThread) {
        b11 b11Var = new b11();
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = b11Var;
        this.d = new AtomicReference();
    }

    public static ux e() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new ux();
                }
                return (ux) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void f(ux uxVar) {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            arrayDeque.add(uxVar);
        }
    }

    @Override // defpackage.rm4
    public final void a() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // defpackage.rm4
    public final void b(Bundle bundle) {
        a();
        hd hdVar = this.c;
        String str = j29.a;
        hdVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // defpackage.rm4
    public final void c(int i, d81 d81Var, long j, int i2) {
        a();
        ux uxVarE = e();
        uxVarE.a = i;
        uxVarE.b = 0;
        uxVarE.d = j;
        uxVarE.e = i2;
        MediaCodec.CryptoInfo cryptoInfo = uxVarE.c;
        cryptoInfo.numSubSamples = d81Var.f;
        int[] iArr = d81Var.d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = d81Var.e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = d81Var.b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = d81Var.a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = d81Var.c;
        if (Build.VERSION.SDK_INT >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(d81Var.g, d81Var.h));
        }
        hd hdVar = this.c;
        String str = j29.a;
        hdVar.obtainMessage(2, uxVarE).sendToTarget();
    }

    @Override // defpackage.rm4
    public final void d(int i, int i2, int i3, long j) {
        a();
        ux uxVarE = e();
        uxVarE.a = i;
        uxVarE.b = i2;
        uxVarE.d = j;
        uxVarE.e = i3;
        hd hdVar = this.c;
        String str = j29.a;
        hdVar.obtainMessage(1, uxVarE).sendToTarget();
    }

    @Override // defpackage.rm4
    public final void flush() {
        if (this.f) {
            try {
                hd hdVar = this.c;
                hdVar.getClass();
                hdVar.removeCallbacksAndMessages(null);
                b11 b11Var = this.e;
                synchronized (b11Var) {
                    b11Var.b = false;
                }
                hd hdVar2 = this.c;
                hdVar2.getClass();
                hdVar2.obtainMessage(3).sendToTarget();
                b11Var.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // defpackage.rm4
    public final void shutdown() {
        if (this.f) {
            flush();
            this.b.quit();
        }
        this.f = false;
    }

    @Override // defpackage.rm4
    public final void start() {
        if (this.f) {
            return;
        }
        HandlerThread handlerThread = this.b;
        handlerThread.start();
        this.c = new hd(this, handlerThread.getLooper(), 1);
        this.f = true;
    }
}
