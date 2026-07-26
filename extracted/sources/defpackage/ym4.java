package defpackage;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import androidx.media3.common.b;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ym4 {
    public static final HashMap a = new HashMap();

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((sm4) arrayList.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(sm4.i("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new ex0(3, new vj3(16)));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((sm4) arrayList.get(0)).a)) {
            return;
        }
        arrayList.add((sm4) arrayList.remove(0));
    }

    public static String b(b bVar) {
        Pair pairB;
        String str = bVar.n;
        String str2 = bVar.n;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (pairB = ku0.b(bVar)) != null) {
            int iIntValue = ((Integer) pairB.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    public static synchronized List d(String str, boolean z, boolean z2) {
        try {
            vm4 vm4Var = new vm4(str, z, z2);
            HashMap map = a;
            List list = (List) map.get(vm4Var);
            if (list != null) {
                return list;
            }
            ArrayList arrayListE = e(vm4Var, new dc0(z, z2, str.equals("video/mv-hevc")));
            if (z && arrayListE.isEmpty() && Build.VERSION.SDK_INT <= 23) {
                arrayListE = e(vm4Var, new rl3());
                if (!arrayListE.isEmpty()) {
                    wn5.k0("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((sm4) arrayListE.get(0)).a);
                }
            }
            a(str, arrayListE);
            ImmutableList immutableListN = ImmutableList.n(arrayListE);
            map.put(vm4Var, immutableListN);
            return immutableListN;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0119 A[Catch: Exception -> 0x0163, TRY_ENTER, TryCatch #4 {Exception -> 0x0163, blocks: (B:3:0x000a, B:5:0x001f, B:7:0x0029, B:77:0x0138, B:10:0x0035, B:13:0x0040, B:71:0x0111, B:74:0x0119, B:76:0x011f, B:78:0x0140, B:79:0x0161), top: B:92:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0140 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList e(defpackage.vm4 r20, defpackage.wm4 r21) throws androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ym4.e(vm4, wm4):java.util.ArrayList");
    }

    public static List f(y32 y32Var, b bVar, boolean z, boolean z2) {
        List listA = y32Var.a(bVar.n, z, z2);
        String strB = b(bVar);
        List listQ = strB == null ? ImmutableList.q() : y32Var.a(strB, z, z2);
        lj3 lj3VarM = ImmutableList.m();
        lj3VarM.Q(listA);
        lj3VarM.Q(listQ);
        return lj3VarM.S();
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z && str.endsWith(".secure")) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Build.MANUFACTURER))) {
            String str3 = Build.DEVICE;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        return (i <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (tv4.i(str)) {
            return true;
        }
        String strL = wu8.L(mediaCodecInfo.getName());
        if (strL.startsWith("arc.")) {
            return false;
        }
        if (strL.startsWith("omx.google.") || strL.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strL.startsWith("omx.sec.") && strL.contains(".sw.")) || strL.equals("omx.qcom.video.decoder.hevcswvdec") || strL.startsWith("c2.android.") || strL.startsWith("c2.google.")) {
            return true;
        }
        return (strL.startsWith("omx.") || strL.startsWith("c2.")) ? false : true;
    }
}
