package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.common.b;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import com.google.common.collect.ImmutableList;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes.dex */
public final class rd1 {
    public static final Object n0 = new Object();
    public static ScheduledExecutorService o0;
    public static int p0;
    public ly A;
    public ld1 B;
    public ld1 C;
    public ua6 D;
    public boolean E;
    public ByteBuffer F;
    public int G;
    public long H;
    public long I;
    public long J;
    public long K;
    public int L;
    public boolean M;
    public boolean N;
    public long O;
    public float P;
    public ByteBuffer Q;
    public int R;
    public ByteBuffer S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public boolean Z;
    public final Context a;
    public n30 a0;
    public final wv8 b;
    public r79 b0;
    public final gp0 c;
    public boolean c0;
    public final ys8 d;
    public long d0;
    public final nm8 e;
    public long e0;
    public final mm8 f;
    public boolean f0;
    public final ImmutableList g;
    public boolean g0;
    public final t00 h;
    public Looper h0;
    public final ArrayDeque i;
    public long i0;
    public int j;
    public long j0;
    public qd1 k;
    public Handler k0;
    public final nd1 l;
    public Context l0;
    public final nd1 m;
    public final boolean m0;
    public final hy2 n;
    public final qq4 o;
    public final sj1 p;
    public final int q;
    public ee6 r;
    public qm5 s;
    public kd1 t;
    public kd1 u;
    public e00 v;
    public AudioTrack w;
    public wy x;
    public zy y;
    public sg z;

    public rd1(jd1 jd1Var) {
        int deviceId;
        Context context = jd1Var.a;
        Context applicationContext = context == null ? null : context.getApplicationContext();
        this.a = applicationContext;
        this.A = ly.h;
        this.x = applicationContext == null ? jd1Var.b : null;
        this.b = jd1Var.c;
        int i = Build.VERSION.SDK_INT;
        this.j = 0;
        this.n = jd1Var.e;
        qq4 qq4Var = jd1Var.g;
        qq4Var.getClass();
        this.o = qq4Var;
        this.h = new t00(new r79(15, this));
        gp0 gp0Var = new gp0();
        this.c = gp0Var;
        ys8 ys8Var = new ys8();
        ys8Var.m = j29.b;
        this.d = ys8Var;
        this.e = new nm8();
        this.f = new mm8();
        this.g = ImmutableList.t(ys8Var, gp0Var);
        this.P = 1.0f;
        this.Y = 0;
        this.a0 = new n30();
        ua6 ua6Var = ua6.d;
        this.C = new ld1(ua6Var, 0L, 0L);
        this.D = ua6Var;
        this.E = false;
        this.i = new ArrayDeque();
        this.l = new nd1();
        this.m = new nd1();
        this.p = jd1Var.f;
        int i2 = -1;
        if (i >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i2 = deviceId;
        }
        this.q = i2;
        this.m0 = true;
    }

    public static boolean p(AudioTrack audioTrack) {
        return Build.VERSION.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    public final void a(long j) {
        ua6 ua6Var;
        kd1 kd1Var = this.u;
        boolean z = false;
        wv8 wv8Var = this.b;
        if (kd1Var == null || !kd1Var.j) {
            if (this.c0 || kd1Var.c != 0) {
                ua6Var = ua6.d;
            } else {
                int i = kd1Var.a.H;
                ua6Var = this.D;
                o18 o18Var = (o18) wv8Var.d;
                float f = ua6Var.a;
                o18Var.getClass();
                vy2.j(f > 0.0f);
                if (o18Var.c != f) {
                    o18Var.c = f;
                    o18Var.i = true;
                }
                float f2 = ua6Var.b;
                vy2.j(f2 > 0.0f);
                if (o18Var.d != f2) {
                    o18Var.d = f2;
                    o18Var.i = true;
                }
            }
            this.D = ua6Var;
        } else {
            ua6Var = ua6.d;
        }
        ua6 ua6Var2 = ua6Var;
        if (!this.c0) {
            kd1 kd1Var2 = this.u;
            if (kd1Var2.c == 0) {
                int i2 = kd1Var2.a.H;
                z = this.E;
                ((dw7) wv8Var.c).o = z;
            }
        }
        this.E = z;
        this.i.add(new ld1(ua6Var2, Math.max(0L, j), j29.b0(this.u.e, k())));
        e00 e00Var = this.u.i;
        this.v = e00Var;
        e00Var.a();
        qm5 qm5Var = this.s;
        if (qm5Var != null) {
            boolean z2 = this.E;
            n00 n00Var = ((qm4) qm5Var.b).f1;
            Handler handler = n00Var.b;
            if (handler != null) {
                handler.post(new ep(n00Var, z2));
            }
        }
    }

    public final AudioTrack b(o00 o00Var, ly lyVar, int i, b bVar, Context context) throws AudioSink$InitializationException {
        try {
            AudioTrack audioTrackC = this.p.c(o00Var, lyVar, i, context);
            int state = audioTrackC.getState();
            if (state == 1) {
                return audioTrackC;
            }
            try {
                audioTrackC.release();
            } catch (Exception unused) {
            }
            throw new AudioSink$InitializationException(state, o00Var.b, o00Var.c, o00Var.a, o00Var.f, bVar, o00Var.e, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new AudioSink$InitializationException(0, o00Var.b, o00Var.c, o00Var.a, o00Var.f, bVar, o00Var.e, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.media.AudioTrack c(defpackage.kd1 r9) throws androidx.media3.exoplayer.audio.AudioSink$InitializationException {
        /*
            r8 = this;
            int r0 = r8.Y     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L3a
            int r1 = r8.q     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L3a
            r2 = -1
            if (r1 == r2) goto L26
            android.content.Context r2 = r8.a     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L1c
            if (r2 == 0) goto L26
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L1c
            r4 = 34
            if (r3 < r4) goto L26
            android.content.Context r0 = r8.l0     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L1c
            if (r0 != 0) goto L20
            android.content.Context r0 = r2.createDeviceContext(r1)     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L1c
            r8.l0 = r0     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L1c
            goto L20
        L1c:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L3d
        L20:
            android.content.Context r0 = r8.l0     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L1c
            r1 = 0
            r7 = r0
            r5 = r1
            goto L29
        L26:
            r1 = 0
            r5 = r0
            r7 = r1
        L29:
            o00 r3 = r9.a()     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L3a
            ly r4 = r8.A     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L3a
            androidx.media3.common.b r6 = r9.a     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L3a
            r2 = r8
            android.media.AudioTrack r9 = r2.b(r3, r4, r5, r6, r7)     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L37
            return r9
        L37:
            r0 = move-exception
        L38:
            r9 = r0
            goto L3d
        L3a:
            r0 = move-exception
            r2 = r8
            goto L38
        L3d:
            qm5 r0 = r2.s
            if (r0 == 0) goto L44
            r0.r(r9)
        L44:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rd1.c(kd1):android.media.AudioTrack");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(androidx.media3.common.b r26, int[] r27) throws androidx.media3.exoplayer.audio.AudioSink$ConfigurationException {
        /*
            Method dump skipped, instruction units count: 704
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rd1.d(androidx.media3.common.b, int[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(long r13) throws androidx.media3.exoplayer.audio.AudioSink$WriteException {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rd1.e(long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f() throws androidx.media3.exoplayer.audio.AudioSink$WriteException {
        /*
            r6 = this;
            e00 r0 = r6.v
            boolean r0 = r0.d()
            r1 = -9223372036854775808
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L14
            r6.e(r1)
            java.nio.ByteBuffer r0 = r6.S
            if (r0 != 0) goto L44
            goto L43
        L14:
            e00 r0 = r6.v
            boolean r5 = r0.d()
            if (r5 == 0) goto L2e
            boolean r5 = r0.d
            if (r5 == 0) goto L21
            goto L2e
        L21:
            r0.d = r4
            java.util.ArrayList r0 = r0.b
            java.lang.Object r0 = r0.get(r3)
            g00 r0 = (defpackage.g00) r0
            r0.g()
        L2e:
            r6.t(r1)
            e00 r0 = r6.v
            boolean r0 = r0.c()
            if (r0 == 0) goto L44
            java.nio.ByteBuffer r0 = r6.S
            if (r0 == 0) goto L43
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L44
        L43:
            return r4
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rd1.f():boolean");
    }

    public final void g() {
        sg sgVar;
        if (o()) {
            this.H = 0L;
            this.I = 0L;
            this.J = 0L;
            this.K = 0L;
            this.g0 = false;
            this.L = 0;
            this.C = new ld1(this.D, 0L, 0L);
            this.O = 0L;
            this.B = null;
            this.i.clear();
            this.Q = null;
            this.R = 0;
            this.S = null;
            this.U = false;
            this.T = false;
            this.V = false;
            this.F = null;
            this.G = 0;
            this.d.o = 0L;
            e00 e00Var = this.u.i;
            this.v = e00Var;
            e00Var.a();
            AudioTrack audioTrack = this.h.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.w.pause();
            }
            if (p(this.w)) {
                qd1 qd1Var = this.k;
                qd1Var.getClass();
                qd1Var.a(this.w);
            }
            o00 o00VarA = this.u.a();
            kd1 kd1Var = this.t;
            if (kd1Var != null) {
                this.u = kd1Var;
                this.t = null;
            }
            t00 t00Var = this.h;
            t00Var.f();
            t00Var.c = null;
            t00Var.e = null;
            if (Build.VERSION.SDK_INT >= 24 && (sgVar = this.z) != null) {
                sgVar.c();
                this.z = null;
            }
            AudioTrack audioTrack2 = this.w;
            qm5 qm5Var = this.s;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (n0) {
                try {
                    if (o0 == null) {
                        String str = j29.a;
                        o0 = Executors.newSingleThreadScheduledExecutor(new f29());
                    }
                    p0++;
                    o0.schedule(new m11(audioTrack2, qm5Var, handler, o00VarA, 1), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.w = null;
        }
        nd1 nd1Var = this.m;
        nd1Var.c = null;
        nd1Var.a = -9223372036854775807L;
        nd1Var.b = -9223372036854775807L;
        nd1 nd1Var2 = this.l;
        nd1Var2.c = null;
        nd1Var2.a = -9223372036854775807L;
        nd1Var2.b = -9223372036854775807L;
        this.i0 = 0L;
        this.j0 = 0L;
        Handler handler2 = this.k0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final hz h(b bVar) {
        boolean zBooleanValue;
        if (this.f0) {
            return hz.d;
        }
        ly lyVar = this.A;
        qq4 qq4Var = this.o;
        qq4Var.getClass();
        bVar.getClass();
        int i = bVar.G;
        lyVar.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || i == -1) {
            return hz.d;
        }
        Context context = (Context) qq4Var.a;
        Boolean bool = (Boolean) qq4Var.b;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = fz.i(context).getParameters("offloadVariableRateSupported");
                qq4Var.b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                qq4Var.b = Boolean.FALSE;
            }
            zBooleanValue = ((Boolean) qq4Var.b).booleanValue();
        }
        String str = bVar.n;
        str.getClass();
        int iC = tv4.c(str, bVar.k);
        if (iC == 0 || i2 < j29.r(iC)) {
            return hz.d;
        }
        int iS = j29.s(bVar.F);
        if (iS == 0) {
            return hz.d;
        }
        try {
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i).setChannelMask(iS).setEncoding(iC).build();
            return i2 >= 31 ? zc.k(audioFormatBuild, (AudioAttributes) lyVar.b().b, zBooleanValue) : te.x(audioFormatBuild, (AudioAttributes) lyVar.b().b, zBooleanValue);
        } catch (IllegalArgumentException unused) {
            return hz.d;
        }
    }

    public final int i(b bVar) {
        q();
        String str = bVar.n;
        int i = bVar.H;
        if ("audio/raw".equals(str)) {
            if (!j29.Q(i)) {
                o40.E(i, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            }
            if (i != 2) {
                return 1;
            }
        } else if (this.x.d(this.A, bVar) == null) {
            return 0;
        }
        return 2;
    }

    public final long j() {
        kd1 kd1Var = this.u;
        return kd1Var.c == 0 ? this.H / ((long) kd1Var.b) : this.I;
    }

    public final long k() {
        kd1 kd1Var = this.u;
        if (kd1Var.c != 0) {
            return this.K;
        }
        long j = this.J;
        long j2 = kd1Var.d;
        String str = j29.a;
        return ((j + j2) - 1) / j2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x03c8, code lost:
    
        if (r15 == 0) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b3, code lost:
    
        if (n() == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(java.nio.ByteBuffer r29, long r30, int r32) throws androidx.media3.exoplayer.audio.AudioSink$WriteException, androidx.media3.exoplayer.audio.AudioSink$InitializationException {
        /*
            Method dump skipped, instruction units count: 1230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rd1.l(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean m() {
        if (!o()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.w.isOffloadedPlayback() && this.V) {
            return false;
        }
        long jK = k();
        t00 t00Var = this.h;
        long jA = t00Var.a();
        int i = t00Var.f;
        String str = j29.a;
        return jK > j29.d0(jA, (long) i, 1000000L, RoundingMode.UP);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n() throws androidx.media3.exoplayer.audio.AudioSink$InitializationException {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rd1.n():boolean");
    }

    public final boolean o() {
        return this.w != null;
    }

    public final void q() {
        Context context;
        wy wyVar;
        Looper looperMyLooper = Looper.myLooper();
        boolean z = this.y == null || this.h0 == looperMyLooper;
        StringBuilder sb = new StringBuilder("DefaultAudioSink accessed on multiple threads: ");
        Looper looper = this.h0;
        String name = Ssh2PublicKeyAlgorithmName.NULL;
        sb.append(looper == null ? Ssh2PublicKeyAlgorithmName.NULL : looper.getThread().getName());
        sb.append(" and ");
        if (looperMyLooper != null) {
            name = looperMyLooper.getThread().getName();
        }
        sb.append(name);
        vy2.r(sb.toString(), z);
        if (this.y == null && (context = this.a) != null) {
            this.h0 = looperMyLooper;
            zy zyVar = new zy(context, new v4(16, this), this.A, this.b0);
            this.y = zyVar;
            if (zyVar.j) {
                wyVar = zyVar.g;
                wyVar.getClass();
            } else {
                zyVar.j = true;
                yy yyVar = zyVar.f;
                if (yyVar != null) {
                    yyVar.a.registerContentObserver(yyVar.b, false, yyVar);
                }
                Handler handler = zyVar.c;
                Context context2 = zyVar.a;
                xy xyVar = zyVar.d;
                if (xyVar != null) {
                    fz.i(context2).registerAudioDeviceCallback(xyVar, handler);
                }
                wy wyVarC = wy.c(context2, context2.registerReceiver(zyVar.e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), zyVar.i, zyVar.h);
                zyVar.g = wyVarC;
                wyVar = wyVarC;
            }
            this.x = wyVar;
        }
        this.x.getClass();
    }

    public final void r() {
        this.W = true;
        if (o()) {
            t00 t00Var = this.h;
            if (t00Var.x != -9223372036854775807L) {
                t00Var.G.getClass();
                t00Var.x = j29.V(SystemClock.elapsedRealtime());
            }
            t00Var.j = j29.b0(t00Var.f, t00Var.b());
            r00 r00Var = t00Var.e;
            r00Var.getClass();
            r00Var.a(0);
            if (!this.U || p(this.w)) {
                this.w.play();
            }
        }
    }

    public final void s() {
        if (this.U) {
            return;
        }
        this.U = true;
        long jK = k();
        t00 t00Var = this.h;
        t00Var.z = t00Var.b();
        t00Var.G.getClass();
        t00Var.x = j29.V(SystemClock.elapsedRealtime());
        t00Var.A = jK;
        if (p(this.w)) {
            this.V = false;
        }
        this.w.stop();
        this.G = 0;
    }

    public final void t(long j) throws AudioSink$WriteException {
        ByteBuffer byteBuffer;
        e(j);
        if (this.S != null) {
            return;
        }
        if (!this.v.d()) {
            ByteBuffer byteBuffer2 = this.Q;
            if (byteBuffer2 != null) {
                x(byteBuffer2);
                e(j);
                return;
            }
            return;
        }
        while (!this.v.c()) {
            do {
                e00 e00Var = this.v;
                if (e00Var.d()) {
                    ByteBuffer byteBuffer3 = e00Var.c[e00Var.b()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        e00Var.e(g00.a);
                        byteBuffer = e00Var.c[e00Var.b()];
                    }
                } else {
                    byteBuffer = g00.a;
                }
                if (byteBuffer.hasRemaining()) {
                    x(byteBuffer);
                    e(j);
                } else {
                    ByteBuffer byteBuffer4 = this.Q;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    e00 e00Var2 = this.v;
                    ByteBuffer byteBuffer5 = this.Q;
                    if (e00Var2.d() && !e00Var2.d) {
                        e00Var2.e(byteBuffer5);
                    }
                }
            } while (this.S == null);
            return;
        }
    }

    public final void u() {
        g();
        p0 p0VarListIterator = this.g.listIterator(0);
        while (p0VarListIterator.hasNext()) {
            ((g00) p0VarListIterator.next()).reset();
        }
        this.e.reset();
        this.f.reset();
        e00 e00Var = this.v;
        if (e00Var != null) {
            ImmutableList immutableList = e00Var.a;
            for (int i = 0; i < immutableList.size(); i++) {
                g00 g00Var = (g00) immutableList.get(i);
                g00Var.flush();
                g00Var.reset();
            }
            e00Var.c = new ByteBuffer[0];
            f00 f00Var = f00.e;
            e00Var.d = false;
        }
        this.W = false;
        this.f0 = false;
    }

    public final void v() {
        if (o()) {
            try {
                this.w.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.D.a).setPitch(this.D.b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                wn5.l0("DefaultAudioSink", "Failed to set playback params", e);
            }
            ua6 ua6Var = new ua6(this.w.getPlaybackParams().getSpeed(), this.w.getPlaybackParams().getPitch());
            this.D = ua6Var;
            float f = ua6Var.a;
            t00 t00Var = this.h;
            t00Var.h = f;
            r00 r00Var = t00Var.e;
            if (r00Var != null) {
                r00Var.a(0);
            }
            t00Var.f();
        }
    }

    public final void w(int i, int i2) {
        kd1 kd1Var;
        AudioTrack audioTrack = this.w;
        if (audioTrack == null || !p(audioTrack) || (kd1Var = this.u) == null || !kd1Var.k) {
            return;
        }
        this.w.setOffloadDelayPadding(i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0057 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(java.nio.ByteBuffer r19) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rd1.x(java.nio.ByteBuffer):void");
    }
}
