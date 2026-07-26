package io.sentry.android.replay.video;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.view.Surface;
import defpackage.bp2;
import defpackage.c24;
import defpackage.f88;
import defpackage.js3;
import io.sentry.SentryLevel;
import io.sentry.b6;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public final b6 a;
    public final a b;
    public final Object c;
    public final MediaCodec d;
    public final Object e;
    public final MediaCodec.BufferInfo f;
    public final b g;
    public Surface h;

    public c(b6 b6Var, a aVar) {
        js3.p(b6Var, "options");
        this.a = b6Var;
        this.b = aVar;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.c;
        c24 c24VarB = kotlin.a.b(lazyThreadSafetyMode, new bp2() { // from class: io.sentry.android.replay.video.SimpleVideoEncoder$hasExynosCodec$2
            @Override // defpackage.bp2
            public final Object invoke() {
                boolean z = false;
                MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
                js3.o(codecInfos, "getCodecInfos(...)");
                int length = codecInfos.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    String name = codecInfos[i].getName();
                    js3.o(name, "getName(...)");
                    if (f88.c0(name, "c2.exynos", false)) {
                        z = true;
                        break;
                    }
                    i++;
                }
                return Boolean.valueOf(z);
            }
        });
        this.c = c24VarB;
        MediaCodec mediaCodecCreateByCodecName = ((Boolean) c24VarB.getValue()).booleanValue() ? MediaCodec.createByCodecName("c2.android.avc.encoder") : MediaCodec.createEncoderByType(aVar.f);
        js3.m(mediaCodecCreateByCodecName);
        this.d = mediaCodecCreateByCodecName;
        this.e = kotlin.a.b(lazyThreadSafetyMode, new bp2() { // from class: io.sentry.android.replay.video.SimpleVideoEncoder$mediaFormat$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                c cVar = this.g;
                a aVar2 = cVar.b;
                b6 b6Var2 = cVar.a;
                a aVar3 = cVar.b;
                int iIntValue = aVar2.e;
                try {
                    MediaCodecInfo.VideoCapabilities videoCapabilities = cVar.d.getCodecInfo().getCapabilitiesForType(aVar3.f).getVideoCapabilities();
                    if (!videoCapabilities.getBitrateRange().contains(Integer.valueOf(iIntValue))) {
                        b6Var2.getLogger().i(SentryLevel.DEBUG, "Encoder doesn't support the provided bitRate: " + iIntValue + ", the value will be clamped to the closest one", new Object[0]);
                        Object objClamp = videoCapabilities.getBitrateRange().clamp(Integer.valueOf(iIntValue));
                        js3.o(objClamp, "clamp(...)");
                        iIntValue = ((Number) objClamp).intValue();
                    }
                } catch (Throwable th) {
                    b6Var2.getLogger().f(SentryLevel.DEBUG, "Could not retrieve MediaCodec info", th);
                }
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(aVar3.f, aVar3.b, aVar3.c);
                js3.o(mediaFormatCreateVideoFormat, "createVideoFormat(...)");
                mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
                mediaFormatCreateVideoFormat.setInteger("bitrate", iIntValue);
                mediaFormatCreateVideoFormat.setFloat("frame-rate", aVar3.d);
                mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 6);
                return mediaFormatCreateVideoFormat;
            }
        });
        this.f = new MediaCodec.BufferInfo();
        String absolutePath = aVar.a.getAbsolutePath();
        js3.o(absolutePath, "getAbsolutePath(...)");
        this.g = new b(absolutePath, aVar.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0185, code lost:
    
        throw new java.lang.RuntimeException(defpackage.bl4.q(r4, "encoderOutputBuffer ", " was null"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r13) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.video.c.a(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.graphics.Bitmap r5) {
        /*
            r4 = this;
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "MANUFACTURER"
            defpackage.js3.o(r0, r1)
            java.lang.String r1 = "xiaomi"
            r2 = 1
            boolean r1 = defpackage.f88.c0(r0, r1, r2)
            r3 = 0
            if (r1 != 0) goto L3f
            java.lang.String r1 = "motorola"
            boolean r0 = defpackage.f88.c0(r0, r1, r2)
            if (r0 != 0) goto L3f
            io.sentry.android.replay.util.SystemProperties$Property r0 = io.sentry.android.replay.util.SystemProperties$Property.SOC_MANUFACTURER
            java.lang.String r1 = io.sentry.android.replay.util.g.a(r0)
            java.lang.String r2 = "spreadtrum"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 != 0) goto L3f
            java.lang.String r0 = io.sentry.android.replay.util.g.a(r0)
            java.lang.String r1 = "unisoc"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L34
            goto L3f
        L34:
            android.view.Surface r0 = r4.h
            if (r0 == 0) goto L3d
            android.graphics.Canvas r0 = r0.lockHardwareCanvas()
            goto L47
        L3d:
            r0 = r3
            goto L47
        L3f:
            android.view.Surface r0 = r4.h
            if (r0 == 0) goto L3d
            android.graphics.Canvas r0 = r0.lockCanvas(r3)
        L47:
            if (r0 == 0) goto L4d
            r1 = 0
            r0.drawBitmap(r5, r1, r1, r3)
        L4d:
            android.view.Surface r5 = r4.h
            if (r5 == 0) goto L54
            r5.unlockCanvasAndPost(r0)
        L54:
            r5 = 0
            r4.a(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.video.c.b(android.graphics.Bitmap):void");
    }

    public final void c() {
        MediaCodec mediaCodec = this.d;
        try {
            a(true);
            mediaCodec.stop();
            mediaCodec.release();
            Surface surface = this.h;
            if (surface != null) {
                surface.release();
            }
            MediaMuxer mediaMuxer = this.g.b;
            mediaMuxer.stop();
            mediaMuxer.release();
        } catch (Throwable th) {
            this.a.getLogger().f(SentryLevel.DEBUG, "Failed to properly release video encoder", th);
        }
    }
}
