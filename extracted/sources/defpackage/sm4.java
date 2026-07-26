package defpackage;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import androidx.media3.common.b;
import j$.util.Objects;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class sm4 {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public int k;
    public float l;

    public sm4(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z4;
        this.f = z5;
        this.h = z6;
        this.i = tv4.l(str2);
        this.l = -3.4028235E38f;
        this.j = -1;
        this.k = -1;
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Range<Double> achievableFrameRatesFor;
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(j29.f(i, widthAlignment) * widthAlignment, j29.f(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double dFloor = Math.floor(d);
        if (videoCapabilities.areSizeAndRateSupported(i3, i4, dFloor)) {
            return Build.VERSION.SDK_INT < 24 || (achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4)) == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.sm4 i(java.lang.String r11, java.lang.String r12, java.lang.String r13, android.media.MediaCodecInfo.CodecCapabilities r14, boolean r15, boolean r16, boolean r17, boolean r18) {
        /*
            sm4 r0 = new sm4
            r1 = 0
            r2 = 1
            if (r14 == 0) goto L10
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r14.isFeatureSupported(r3)
            if (r3 == 0) goto L10
            r8 = r2
            goto L11
        L10:
            r8 = r1
        L11:
            if (r14 == 0) goto L19
            java.lang.String r3 = "tunneled-playback"
            boolean r3 = r14.isFeatureSupported(r3)
        L19:
            if (r18 != 0) goto L28
            if (r14 == 0) goto L26
            java.lang.String r3 = "secure-playback"
            boolean r3 = r14.isFeatureSupported(r3)
            if (r3 == 0) goto L26
            goto L28
        L26:
            r9 = r1
            goto L29
        L28:
            r9 = r2
        L29:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 35
            if (r3 < r4) goto L6f
            if (r14 == 0) goto L6f
            java.lang.String r3 = "detached-surface"
            boolean r3 = r14.isFeatureSupported(r3)
            if (r3 == 0) goto L6f
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r4 = "Xiaomi"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L6f
            java.lang.String r4 = "OPPO"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L6f
            java.lang.String r4 = "realme"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L6f
            java.lang.String r4 = "motorola"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L6f
            java.lang.String r4 = "LENOVO"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L64
            goto L6f
        L64:
            r10 = r2
            r1 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r2 = r12
            goto L79
        L6f:
            r10 = r1
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r1 = r11
        L79:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sm4.i(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):sm4");
    }

    public final hc1 b(b bVar, b bVar2) {
        b bVar3;
        b bVar4;
        int i;
        String str = bVar.n;
        cv0 cv0Var = bVar.D;
        String str2 = bVar2.n;
        cv0 cv0Var2 = bVar2.D;
        int i2 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.i) {
            if (bVar.z != bVar2.z) {
                i2 |= 1024;
            }
            boolean z = (bVar.u == bVar2.u && bVar.v == bVar2.v) ? false : true;
            if (!this.e && z) {
                i2 |= 512;
            }
            if ((!cv0.e(cv0Var) || !cv0.e(cv0Var2)) && !Objects.equals(cv0Var, cv0Var2)) {
                i2 |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !bVar.b(bVar2)) {
                i2 |= 2;
            }
            int i3 = bVar.w;
            if (i3 != -1 && (i = bVar.x) != -1 && i3 == bVar2.w && i == bVar2.x && z) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new hc1(this.a, bVar, bVar2, bVar.b(bVar2) ? 3 : 2, 0);
            }
            bVar3 = bVar;
            bVar4 = bVar2;
        } else {
            bVar3 = bVar;
            bVar4 = bVar2;
            if (bVar3.F != bVar4.F) {
                i2 |= 4096;
            }
            if (bVar3.G != bVar4.G) {
                i2 |= 8192;
            }
            if (bVar3.H != bVar4.H) {
                i2 |= 16384;
            }
            String str3 = this.b;
            if (i2 == 0 && "audio/mp4a-latm".equals(str3)) {
                HashMap map = ym4.a;
                Pair pairB = ku0.b(bVar3);
                Pair pairB2 = ku0.b(bVar4);
                if (pairB != null && pairB2 != null) {
                    int iIntValue = ((Integer) pairB.first).intValue();
                    int iIntValue2 = ((Integer) pairB2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new hc1(this.a, bVar3, bVar4, 3, 0);
                    }
                }
            }
            if (!bVar3.b(bVar4)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new hc1(this.a, bVar3, bVar4, 1, 0);
            }
        }
        return new hc1(this.a, bVar3, bVar4, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(androidx.media3.common.b r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sm4.c(androidx.media3.common.b, boolean):boolean");
    }

    public final boolean d(b bVar) {
        return (Objects.equals(bVar.n, "audio/flac") && bVar.H == 22 && Build.VERSION.SDK_INT < 34 && this.a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final boolean e(b bVar) {
        int i;
        String str = bVar.n;
        String str2 = this.b;
        if ((!str2.equals(str) && !str2.equals(ym4.b(bVar))) || !c(bVar, true) || !d(bVar)) {
            return false;
        }
        if (this.i) {
            int i2 = bVar.u;
            if (i2 > 0 && (i = bVar.v) > 0) {
                return g(i2, i, bVar.y);
            }
        } else {
            int i3 = bVar.G;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (i3 != -1) {
                if (codecCapabilities == null) {
                    h("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i3)) {
                    h("sampleRate.support, " + i3);
                    return false;
                }
            }
            int i4 = bVar.F;
            if (i4 != -1) {
                if (codecCapabilities == null) {
                    h("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    h("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    int i5 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    StringBuilder sbB = o40.B(maxInputChannelCount, "AssumedMaxChannelAdjustment: ", this.a, ", [", " to ");
                    sbB.append(i5);
                    sbB.append("]");
                    wn5.k0("MediaCodecInfo", sbB.toString());
                    maxInputChannelCount = i5;
                }
                if (maxInputChannelCount < i4) {
                    h("channelCount.support, " + i4);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f(b bVar) {
        if (this.i) {
            return this.e;
        }
        HashMap map = ym4.a;
        Pair pairB = ku0.b(bVar);
        return pairB != null && ((Integer) pairB.first).intValue() == 42;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(int r9, int r10, double r11) {
        /*
            r8 = this;
            r0 = 0
            android.media.MediaCodecInfo$CodecCapabilities r1 = r8.d
            if (r1 != 0) goto Lb
            java.lang.String r9 = "sizeAndRate.caps"
            r8.h(r9)
            return r0
        Lb:
            android.media.MediaCodecInfo$VideoCapabilities r1 = r1.getVideoCapabilities()
            if (r1 != 0) goto L17
            java.lang.String r9 = "sizeAndRate.vCaps"
            r8.h(r9)
            return r0
        L17:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            java.lang.String r4 = "@"
            java.lang.String r5 = "x"
            r6 = 1
            if (r2 < r3) goto L4d
            if (r2 < r3) goto L34
            java.lang.Boolean r2 = defpackage.tt3.h
            if (r2 == 0) goto L2f
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L2f
            goto L34
        L2f:
            int r2 = defpackage.te.b(r1, r9, r10, r11)
            goto L35
        L34:
            r2 = r0
        L35:
            r3 = 2
            if (r2 != r3) goto L3a
            goto Lb3
        L3a:
            if (r2 != r6) goto L4d
            java.lang.String r1 = "sizeAndRate.cover, "
            java.lang.StringBuilder r9 = defpackage.bl4.B(r9, r10, r1, r5, r4)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            r8.h(r9)
            return r0
        L4d:
            boolean r2 = a(r1, r9, r10, r11)
            if (r2 != 0) goto Lb3
            if (r9 >= r10) goto La2
            java.lang.String r2 = "OMX.MTK.VIDEO.DECODER.HEVC"
            java.lang.String r3 = r8.a
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L6a
            java.lang.String r2 = "mcv5a"
            java.lang.String r7 = android.os.Build.DEVICE
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L6a
            goto La2
        L6a:
            boolean r1 = a(r1, r10, r9, r11)
            if (r1 != 0) goto L71
            goto La2
        L71:
            java.lang.String r0 = "sizeAndRate.rotated, "
            java.lang.StringBuilder r9 = defpackage.bl4.B(r9, r10, r0, r5, r4)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = ", "
            java.lang.String r11 = "AssumedSupport ["
            java.lang.String r12 = "] ["
            java.lang.StringBuilder r9 = defpackage.rm7.t(r11, r9, r12, r3, r10)
            java.lang.String r10 = r8.b
            r9.append(r10)
            r9.append(r12)
            java.lang.String r10 = defpackage.j29.a
            r9.append(r10)
            java.lang.String r10 = "]"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            defpackage.wn5.w(r9)
            return r6
        La2:
            java.lang.String r1 = "sizeAndRate.support, "
            java.lang.StringBuilder r9 = defpackage.bl4.B(r9, r10, r1, r5, r4)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            r8.h(r9)
            return r0
        Lb3:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sm4.g(int, int, double):boolean");
    }

    public final void h(String str) {
        StringBuilder sbN = t61.n("NoSupport [", str, "] [");
        sbN.append(this.a);
        sbN.append(", ");
        sbN.append(this.b);
        sbN.append("] [");
        sbN.append(j29.a);
        sbN.append("]");
        wn5.w(sbN.toString());
    }

    public final String toString() {
        return this.a;
    }
}
