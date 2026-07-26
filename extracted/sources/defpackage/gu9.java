package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.inputmethod.ExtractedText;
import androidx.compose.foundation.layout.b;
import androidx.compose.runtime.i;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.node.d;
import androidx.media3.common.ParserException;
import com.google.android.gms.common.Feature;
import com.google.gson.JsonParseException;
import com.google.gson.Strictness;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.myket.player.domain.models.PlayerMovieData;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class gu9 {
    public static ry0 a;
    public static final a b = new a(-505918774, new yf(7), false);
    public static final Object c = new Object();
    public static final Feature d;
    public static final Feature e;
    public static final Feature[] f;
    public static final /* synthetic */ int g = 0;
    public static final /* synthetic */ int h = 0;
    public static final /* synthetic */ int i = 0;
    public static final /* synthetic */ int j = 0;
    public static final /* synthetic */ int k = 0;
    public static final /* synthetic */ int l = 0;

    static {
        Feature feature = new Feature(1L, "CLIENT_TELEMETRY");
        d = feature;
        Feature feature2 = new Feature(1L, "CLIENT_NOTIFICATION_TELEMETRY");
        e = feature2;
        f = new Feature[]{feature, feature2};
    }

    public static lv3 A(mw3 mw3Var) {
        Strictness strictness = mw3Var.b;
        if (strictness == Strictness.b) {
            mw3Var.b = Strictness.a;
        }
        try {
            try {
                return ia7.l(mw3Var);
            } finally {
                mw3Var.l0(strictness);
            }
        } catch (OutOfMemoryError | StackOverflowError e2) {
            throw new JsonParseException("Failed parsing JSON source: " + mw3Var + " to Json", e2);
        }
    }

    public static final rz5 B() {
        return new rz5(0, 0, 0, 62);
    }

    public static ArrayList C(ByteBuffer byteBuffer) {
        int iRemaining;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            byte b2 = byteBufferAsReadOnlyBuffer.get();
            int i2 = (b2 >> 3) & 15;
            if (((b2 >> 2) & 1) != 0) {
                byteBufferAsReadOnlyBuffer.get();
            }
            if (((b2 >> 1) & 1) != 0) {
                iRemaining = 0;
                for (int i3 = 0; i3 < 8; i3++) {
                    byte b3 = byteBufferAsReadOnlyBuffer.get();
                    iRemaining |= (b3 & 127) << (i3 * 7);
                    if ((b3 & 128) == 0) {
                        break;
                    }
                }
            } else {
                iRemaining = byteBufferAsReadOnlyBuffer.remaining();
            }
            ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
            byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iRemaining);
            arrayList.add(new lr5(i2, byteBufferDuplicate));
            byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iRemaining);
        }
        return arrayList;
    }

    public static int D(Context context, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i2});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final int E(long j2) {
        float[] fArr = pv0.a;
        return (int) (zu0.a(j2, pv0.e) >>> 32);
    }

    public static pa2 F(Object obj) {
        return new pa2(obj.getClass().getSimpleName(), 18);
    }

    public static final void G() {
        throw new UnsupportedOperationException();
    }

    public static synchronized void H(ry0 ry0Var) {
        if (a != null) {
            throw new IllegalStateException("init() already called");
        }
        a = ry0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(hx4 hx4Var, boolean z, xc6 xc6Var, PlayerMovieData playerMovieData, dl5 dl5Var, dp2 dp2Var, dp2 dp2Var2, qz0 qz0Var, int i2) {
        PlayerMovieData playerMovieData2;
        dl5 dl5Var2;
        hx4 hx4Var2;
        dv dvVar;
        ex4 ex4Var;
        boolean z2;
        boolean z3;
        qz0 qz0Var2 = qz0Var;
        qz0Var2.c0(-2089252909);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= qz0Var2.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= qz0Var2.f(xc6Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= qz0Var2.h(playerMovieData) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (i2 & 32768) == 0 ? qz0Var2.f(dl5Var) : qz0Var2.h(dl5Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= qz0Var2.h(dp2Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= qz0Var2.h(dp2Var2) ? 1048576 : 524288;
        }
        if (qz0Var2.R(i3 & 1, (599187 & i3) != 599186)) {
            zu0 zu0Var = new zu0(zu0.g);
            u58 u58Var = uj8.a;
            Object objJ = qz0Var2.j(u58Var);
            js3.m(objJ);
            g74 g74VarD = fv.D(br9.C(zu0Var, new zu0(((tj8) objJ).J.e)));
            ex4 ex4Var2 = ex4.b;
            hx4 hx4VarC = yh0.C(rq4.e(b.c(ex4Var2, 1.0f), g74VarD), ml9.q(hq6.space_16, qz0Var2), ml9.q(hq6.space_12, qz0Var2), ml9.q(hq6.space_16, qz0Var2), ml9.q(hq6.space_16, qz0Var2));
            bb0 bb0Var = eq.n;
            if (z) {
                qz0Var2.a0(1733454900);
                qz0Var2.q(false);
                dvVar = jv.d;
            } else {
                qz0Var2.a0(1733490674);
                ev evVar = new ev(ml9.q(hq6.space_8, qz0Var2), false, new ae(6));
                qz0Var2.q(false);
                dvVar = evVar;
            }
            cb7 cb7VarA = bb7.a(dvVar, bb0Var, qz0Var2, 48);
            long j2 = qz0Var2.T;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            j56 j56VarL = qz0Var2.l();
            hx4 hx4VarC2 = androidx.compose.ui.b.c(qz0Var2, hx4VarC);
            hz0.d0.getClass();
            bp2 bp2Var = d.b;
            qz0Var2.e0();
            if (qz0Var2.S) {
                qz0Var2.k(bp2Var);
            } else {
                qz0Var2.o0();
            }
            ia7.o(qz0Var2, d.f, cb7VarA);
            ia7.o(qz0Var2, d.e, j56VarL);
            ia7.g(qz0Var2, Integer.valueOf(i4), d.g);
            ia7.n(qz0Var2, d.h);
            ia7.o(qz0Var2, d.d, hx4VarC2);
            av avVar = jz0.a;
            if (z) {
                qz0Var2.a0(1260847766);
                String strF = ln2.f(vs6.player_unlock, qz0Var2);
                wy5 wy5Var = ci0.a;
                Object objJ2 = qz0Var2.j(u58Var);
                js3.m(objJ2);
                long j3 = ((tj8) objJ2).J.a;
                Object objJ3 = qz0Var2.j(u58Var);
                js3.m(objJ3);
                ex4Var = ex4Var2;
                bi0 bi0VarA = ci0.a(((tj8) objJ3).I.a, j3, 0L, 0L, qz0Var, 12);
                Integer numValueOf = Integer.valueOf(br6.player_ic_lock);
                boolean z4 = (i3 & 458752) == 131072;
                Object objM = qz0Var.M();
                if (z4 || objM == avVar) {
                    objM = new ba(2, dp2Var);
                    qz0Var.l0(objM);
                }
                wu8.a(null, strF, bi0VarA, numValueOf, (bp2) objM, qz0Var, 0, 1);
                qz0Var2 = qz0Var;
                qz0Var2.q(false);
                playerMovieData2 = playerMovieData;
                dl5Var2 = dl5Var;
                z3 = true;
            } else {
                ex4Var = ex4Var2;
                qz0Var2.a0(1261319028);
                int i5 = i3 >> 3;
                int i6 = i3 & 57344;
                hs9.j(null, xc6Var, playerMovieData, dp2Var, dl5Var, dp2Var2, qz0Var2, (i5 & 1008) | ((i3 >> 6) & 7168) | i6 | (i5 & 458752));
                playerMovieData2 = playerMovieData;
                qz0Var2 = qz0Var2;
                if (playerMovieData2.b()) {
                    qz0Var2.a0(1261704110);
                    String strF2 = ln2.f(vs6.player_movie_change_episode_title, qz0Var2);
                    wy5 wy5Var2 = ci0.a;
                    Object objJ4 = qz0Var2.j(u58Var);
                    js3.m(objJ4);
                    long j4 = ((tj8) objJ4).I.a;
                    Object objJ5 = qz0Var2.j(u58Var);
                    js3.m(objJ5);
                    dl5Var2 = dl5Var;
                    bi0 bi0VarA2 = ci0.a(((tj8) objJ5).l, j4, 0L, 0L, qz0Var, 12);
                    qz0Var2 = qz0Var;
                    Integer numValueOf2 = Integer.valueOf(br6.player_ic_playlist);
                    boolean zH = (i6 == 16384 || ((i3 & 32768) != 0 && qz0Var2.h(dl5Var2))) | qz0Var2.h(playerMovieData2);
                    Object objM2 = qz0Var2.M();
                    if (zH || objM2 == avVar) {
                        z2 = false;
                        objM2 = new ty(dl5Var2, playerMovieData2, 0 == true ? 1 : 0);
                        qz0Var2.l0(objM2);
                    } else {
                        z2 = false;
                    }
                    wu8.a(null, strF2, bi0VarA2, numValueOf2, (bp2) objM2, qz0Var2, 0, 1);
                } else {
                    dl5Var2 = dl5Var;
                    z2 = false;
                    qz0Var2.a0(1256305491);
                }
                qz0Var2.q(z2);
                qz0Var2.q(z2);
                z3 = true;
            }
            qz0Var2.q(z3);
            hx4Var2 = ex4Var;
        } else {
            playerMovieData2 = playerMovieData;
            dl5Var2 = dl5Var;
            qz0Var2.U();
            hx4Var2 = hx4Var;
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new uy(hx4Var2, z, xc6Var, playerMovieData2, dl5Var2, dp2Var, dp2Var2, i2);
        }
    }

    public static final void b(hx4 hx4Var, wd6 wd6Var, PlayerMovieData playerMovieData, xc6 xc6Var, bp2 bp2Var, dl5 dl5Var, dp2 dp2Var, dp2 dp2Var2, qz0 qz0Var, int i2) {
        int i3;
        ex4 ex4Var;
        boolean z;
        boolean z2;
        qz0 qz0Var2 = qz0Var;
        js3.p(wd6Var, "playerControllerState");
        boolean z3 = wd6Var.g;
        js3.p(playerMovieData, "playerMovieData");
        js3.p(xc6Var, "playerConfig");
        js3.p(bp2Var, "progressBarTimeState");
        js3.p(dl5Var, "navigationStateManager");
        qz0Var2.c0(1668993029);
        if ((i2 & 6) == 0) {
            i3 = (qz0Var2.f(hx4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qz0Var2.f(wd6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= qz0Var2.h(playerMovieData) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= qz0Var2.f(xc6Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= qz0Var2.h(bp2Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= (262144 & i2) == 0 ? qz0Var2.f(dl5Var) : qz0Var2.h(dl5Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= qz0Var2.h(dp2Var) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= qz0Var2.h(dp2Var2) ? 8388608 : 4194304;
        }
        int i4 = i3;
        if (qz0Var2.R(i4 & 1, (i4 & 4793491) != 4793490)) {
            hx4 hx4VarC = b.c(hx4Var, 1.0f);
            vv0 vv0VarA = tv0.a(jv.c, eq.o, qz0Var2, 0);
            long j2 = qz0Var2.T;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            j56 j56VarL = qz0Var2.l();
            hx4 hx4VarC2 = androidx.compose.ui.b.c(qz0Var2, hx4VarC);
            hz0.d0.getClass();
            bp2 bp2Var2 = d.b;
            qz0Var2.e0();
            if (qz0Var2.S) {
                qz0Var2.k(bp2Var2);
            } else {
                qz0Var2.o0();
            }
            ia7.o(qz0Var2, d.f, vv0VarA);
            ia7.o(qz0Var2, d.e, j56VarL);
            ia7.g(qz0Var2, Integer.valueOf(i5), d.g);
            ia7.n(qz0Var2, d.h);
            ia7.o(qz0Var2, d.d, hx4VarC2);
            boolean z4 = wd6Var.f;
            ex4 ex4Var2 = ex4.b;
            if (!z4 || z3) {
                qz0Var2.a0(1465848249);
                ex4Var = ex4Var2;
                z = false;
                yh0.h(yh0.B(ex4Var2, ml9.q(hq6.space_16, qz0Var2), 0.0f, 2), bp2Var, playerMovieData.a.k, dp2Var, 0L, 0L, 0L, 0L, 0.0f, 0.0f, qz0Var2, (i4 >> 9) & 7280);
                qz0Var2 = qz0Var2;
                qz0Var2.q(false);
            } else {
                qz0Var2.a0(1463113491);
                qz0Var2.q(false);
                ex4Var = ex4Var2;
                z = false;
            }
            if (z3) {
                z2 = true;
                qz0Var2.a0(1466521135);
                z27.a(qz0Var2, b.d(ex4Var, ml9.q(hq6.bottom_bar_height_landscape, qz0Var2)));
                qz0Var2.q(z);
            } else {
                qz0Var2.a0(1466212127);
                int i6 = i4 >> 3;
                z2 = true;
                a(null, wd6Var.f, xc6Var, playerMovieData, dl5Var, dp2Var, dp2Var2, qz0Var2, (i6 & 896) | ((i4 << 3) & 7168) | (57344 & i6) | (458752 & i6) | (i6 & 3670016));
                qz0Var2.q(z);
            }
            qz0Var2.q(z2);
        } else {
            qz0Var2.U();
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new sy(hx4Var, wd6Var, playerMovieData, xc6Var, bp2Var, dl5Var, dp2Var, dp2Var2, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long c(float r21, float r22, float r23, float r24, defpackage.nv0 r25) {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gu9.c(float, float, float, float, nv0):long");
    }

    public static final long d(int i2) {
        long j2 = ((long) i2) << 32;
        int i3 = zu0.i;
        return j2;
    }

    public static final long e(int i2, int i3, int i4, int i5) {
        return d(((i2 & 255) << 16) | ((i5 & 255) << 24) | ((i3 & 255) << 8) | (i4 & 255));
    }

    public static final long f(long j2) {
        long j3 = j2 << 32;
        int i2 = zu0.i;
        return j3;
    }

    public static final void h(Object obj, int i2, d34 d34Var, a aVar, qz0 qz0Var, int i3) {
        int i4;
        qz0Var.c0(872548579);
        if ((i3 & 6) == 0) {
            i4 = (qz0Var.h(obj) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= qz0Var.d(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= qz0Var.h(d34Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= qz0Var.h(aVar) ? 2048 : 1024;
        }
        if (qz0Var.R(i4 & 1, (i4 & 1171) != 1170)) {
            boolean zF = qz0Var.f(obj) | qz0Var.f(d34Var);
            Object objM = qz0Var.M();
            Object obj2 = jz0.a;
            if (zF || objM == obj2) {
                objM = new c34(obj, d34Var);
                qz0Var.l0(objM);
            }
            c34 c34Var = (c34) objM;
            c34Var.c = i2;
            wb5 wb5Var = c34Var.g;
            i iVar = j.a;
            c34 c34Var2 = (c34) qz0Var.j(iVar);
            c08 c08VarK = ql3.k();
            dp2 dp2VarE = c08VarK != null ? c08VarK.e() : null;
            c08 c08VarM = ql3.m(c08VarK);
            try {
                if (c34Var2 != ((c34) ((s08) wb5Var).getValue())) {
                    ((s08) wb5Var).setValue(c34Var2);
                    if (c34Var.d > 0) {
                        c34 c34Var3 = c34Var.e;
                        if (c34Var3 != null) {
                            c34Var3.b();
                        }
                        if (c34Var2 != null) {
                            c34Var2.a();
                        } else {
                            c34Var2 = null;
                        }
                        c34Var.e = c34Var2;
                    }
                }
                ql3.u(c08VarK, c08VarM, dp2VarE);
                boolean zF2 = qz0Var.f(c34Var);
                Object objM2 = qz0Var.M();
                if (zF2 || objM2 == obj2) {
                    objM2 = new m22(12, c34Var);
                    qz0Var.l0(objM2);
                }
                zk8.d(c34Var, (dp2) objM2, qz0Var);
                zk8.b(iVar.a(c34Var), aVar, qz0Var, ((i4 >> 6) & 112) | 8);
            } catch (Throwable th) {
                ql3.u(c08VarK, c08VarM, dp2VarE);
                throw th;
            }
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new og0(obj, i2, d34Var, aVar, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long i(float r17, float r18, float r19, float r20, defpackage.nv0 r21) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gu9.i(float, float, float, float, nv0):long");
    }

    public static final ExtractedText j(zh8 zh8Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = zh8Var.a.b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j2 = zh8Var.b;
        extractedText.selectionStart = zi8.g(j2);
        extractedText.selectionEnd = zi8.f(j2);
        extractedText.flags = !f88.d0(zh8Var.a.b, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final void k(xf8 xf8Var, Context context, final boolean z, final String str, final long j2) {
        if (zi8.d(j2) || str.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        final Context context2 = context;
        List list = (List) ct2.i.invoke(context2);
        if (list.isEmpty()) {
            return;
        }
        mb5 mb5Var = xf8Var.a;
        mb5 mb5Var2 = xf8Var.a;
        lg8 lg8Var = lg8.b;
        mb5Var.g(lg8Var);
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i2);
            mb5Var2.g(new ig8(new nk6(i2), resolveInfo.loadLabel(packageManager).toString(), 0, new dp2() { // from class: ok6
                @Override // defpackage.dp2
                public final Object invoke(Object obj) {
                    ct2.j.invoke(context2, resolveInfo, Boolean.valueOf(z), str, new zi8(j2));
                    ((mg8) obj).close();
                    return tx8.a;
                }
            }));
            i2++;
            context2 = context;
        }
        mb5Var2.g(lg8Var);
    }

    public static final long l(long j2, long j3) {
        float f2;
        float f3;
        long jA = zu0.a(j2, zu0.f(j3));
        float fD = zu0.d(j3);
        float fD2 = zu0.d(jA);
        float f4 = 1.0f - fD2;
        float f5 = (fD * f4) + fD2;
        float fH = zu0.h(jA);
        float fH2 = zu0.h(j3);
        float f6 = 0.0f;
        if (f5 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((fH2 * fD) * f4) + (fH * fD2)) / f5;
        }
        float fG = zu0.g(jA);
        float fG2 = zu0.g(j3);
        if (f5 == 0.0f) {
            f3 = 0.0f;
        } else {
            f3 = (((fG2 * fD) * f4) + (fG * fD2)) / f5;
        }
        float fE = zu0.e(jA);
        float fE2 = zu0.e(j3);
        if (f5 != 0.0f) {
            f6 = (((fE2 * fD) * f4) + (fE * fD2)) / f5;
        }
        return i(f2, f3, f6, f5, zu0.f(j3));
    }

    public static Bitmap m(byte[] bArr, int i2, int i3) throws IOException {
        BitmapFactory.Options options;
        int i4 = 0;
        if (i3 != -1) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, i2, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int iMax = Math.max(options.outWidth, options.outHeight); iMax > i3; iMax /= 2) {
                options.inSampleSize *= 2;
            }
        } else {
            options = null;
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i2, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (bitmapDecodeByteArray == null) {
            throw ParserException.a(new IllegalStateException(), "Could not decode image data");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            e52 e52Var = new e52(byteArrayInputStream);
            byteArrayInputStream.close();
            switch (e52Var.c()) {
                case 3:
                case 4:
                    i4 = 180;
                    break;
                case 5:
                case 8:
                    i4 = 270;
                    break;
                case 6:
                case 7:
                    i4 = 90;
                    break;
            }
            if (i4 == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i4);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } finally {
        }
    }

    public static final rz5 n(boolean z) {
        return new rz5(ApplicationLauncher.o.getApplicationContext().getResources().getInteger(ds6.collection_limit_movie), ApplicationLauncher.o.getApplicationContext().getResources().getInteger(z ? ds6.nested_collection_prefetch_size : ds6.collection_prefetch_size), ApplicationLauncher.o.getApplicationContext().getResources().getInteger(ds6.collection_limit_movie), 52);
    }

    public static final rz5 o(boolean z) {
        return new rz5(ApplicationLauncher.o.getApplicationContext().getResources().getInteger(ds6.collection_limit), ApplicationLauncher.o.getApplicationContext().getResources().getInteger(z ? ds6.nested_collection_prefetch_size : ds6.collection_prefetch_size), ApplicationLauncher.o.getApplicationContext().getResources().getInteger(ds6.collection_limit), 52);
    }

    public static Object p(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static final Object q(pi3 pi3Var, zn5 zn5Var) {
        Object obj = pi3Var.s.a.get(zn5Var);
        if (obj != null) {
            return obj;
        }
        Object obj2 = pi3Var.u.n.a.get(zn5Var);
        return obj2 == null ? zn5Var.a : obj2;
    }

    public static final Object r(uv5 uv5Var, zn5 zn5Var) {
        Object obj = uv5Var.j.a.get(zn5Var);
        return obj == null ? zn5Var.a : obj;
    }

    public static yy2 s(androidx.fragment.app.d dVar, q79 q79Var) {
        do3 do3VarA = ((t91) ((ki1) rq4.x(ki1.class, dVar))).b.a();
        f24 f24Var = (f24) do3VarA.a;
        q79Var.getClass();
        return new yy2(f24Var, q79Var, (qq4) do3VarA.b);
    }

    public static final PlayerMovieData t(Bundle bundle) {
        if (bundle != null) {
            return (PlayerMovieData) dt2.p(bundle, "KEY_PLAYER_MOVIE_DATA", PlayerMovieData.class);
        }
        return null;
    }

    public static final long u(gu1 gu1Var) {
        DragEvent dragEvent = gu1Var.a;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
    }

    public static final Intent v(Context context, Intent... intentArr) {
        int length = intentArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                return null;
            }
            Intent intent = intentArr[i2];
            if ((intent != null ? intent.resolveActivity(context.getPackageManager()) : null) != null) {
                return intent;
            }
            i2++;
        }
    }

    public static final long w(long j2, long j3, float f2) {
        ls5 ls5Var = pv0.x;
        long jA = zu0.a(j2, ls5Var);
        long jA2 = zu0.a(j3, ls5Var);
        float fD = zu0.d(jA);
        float fH = zu0.h(jA);
        float fG = zu0.g(jA);
        float fE = zu0.e(jA);
        float fD2 = zu0.d(jA2);
        float fH2 = zu0.h(jA2);
        float fG2 = zu0.g(jA2);
        float fE2 = zu0.e(jA2);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return zu0.a(i(wq2.L(fH, fH2, f2), wq2.L(fG, fG2, f2), wq2.L(fE, fE2, f2), wq2.L(fD, fD2, f2), ls5Var), zu0.f(j3));
    }

    public static final sz5 x(xe2 xe2Var, dp2 dp2Var) {
        js3.p(xe2Var, "<this>");
        return new sz5(xe2Var, dp2Var, 1);
    }

    public static final hx4 y(hx4 hx4Var, dp2 dp2Var) {
        return hx4Var.d(new cg2(dp2Var));
    }

    public static final hx4 z(hx4 hx4Var, dp2 dp2Var) {
        return hx4Var.d(new mt5(dp2Var));
    }
}
