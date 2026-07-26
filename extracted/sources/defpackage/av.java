package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import android.util.Log;
import androidx.cardview.widget.CardView;
import androidx.media3.common.b;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import com.bumptech.glide.load.EncodeStrategy;
import io.sentry.android.core.t0;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import org.koin.core.logger.Level;

/* JADX INFO: loaded from: classes.dex */
public class av implements hv, wi0, tj0, uj0, q41, ab8, pq1, vw1, h82, mb2, m67, k71 {
    public final /* synthetic */ int a;

    public /* synthetic */ av(int i) {
        this.a = i;
    }

    public static ByteArrayInputStream v(String str) {
        if (!str.startsWith("data:image")) {
            throw new IllegalArgumentException("Not a valid image data URL.");
        }
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Missing comma in data URL.");
        }
        if (str.substring(0, iIndexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
        }
        throw new IllegalArgumentException("Not a base64 image data URL.");
    }

    @Override // defpackage.vw1
    public /* synthetic */ void a() {
    }

    @Override // defpackage.tj0, defpackage.uj0
    public byte[] b(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 5:
                return Arrays.copyOfRange(bArr, i, i2 + i);
            default:
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, i, bArr2, 0, i2);
                return bArr2;
        }
    }

    @Override // defpackage.vw1
    public /* synthetic */ void c() {
    }

    @Override // defpackage.q41
    public long d(long j, long j2) {
        float fMax = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
        int i = ae7.a;
        return jFloatToRawIntBits;
    }

    @Override // defpackage.hv
    public float e() {
        return 0;
    }

    @Override // defpackage.vw1
    public /* synthetic */ uw1 f(sw1 sw1Var, b bVar) {
        return uw1.h0;
    }

    @Override // defpackage.pq1
    public List g(String str) throws UnknownHostException {
        js3.p(str, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            js3.o(allByName, "getAllByName(...)");
            return ew.X0(allByName);
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }

    @Override // defpackage.wi0, defpackage.mb2
    public Class getDataClass() {
        switch (this.a) {
            case 4:
                return ByteBuffer.class;
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // defpackage.ab8
    public int h(b bVar) {
        String str = bVar.n;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException(dw1.n("Unsupported MIME type: ", str));
    }

    @Override // defpackage.vw1
    public pw1 i(sw1 sw1Var, b bVar) {
        if (bVar.r == null) {
            return null;
        }
        return new q32(new DrmSession$DrmSessionException(new UnsupportedDrmException(), 6001));
    }

    @Override // defpackage.mb2
    public Object j(File file) {
        return ParcelFileDescriptor.open(file, 268435456);
    }

    @Override // defpackage.vw1
    public int l(b bVar) {
        return bVar.r != null ? 1 : 0;
    }

    @Override // defpackage.wi0
    public Object n(byte[] bArr) {
        return ByteBuffer.wrap(bArr);
    }

    @Override // defpackage.hv
    public void o(int i, el4 el4Var, int[] iArr, int[] iArr2) {
        jv.c(i, iArr, iArr2, false);
    }

    @Override // defpackage.ab8
    public cb8 p(b bVar) {
        int i;
        String str = bVar.n;
        List list = bVar.q;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new ry0(list);
                case "application/pgs":
                    return new vp7(27);
                case "application/x-mp4-vtt":
                    return new sh3(1);
                case "text/vtt":
                    return new bn6(18);
                case "application/x-quicktime-tx3g":
                    return new nt8(list);
                case "text/x-ssa":
                    return new y38(list);
                case "application/vobsub":
                    o77 o77Var = new o77();
                    o77Var.a = new h26();
                    o77Var.b = new h26();
                    xa9 xa9Var = new xa9();
                    o77Var.c = xa9Var;
                    String strTrim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
                    String str2 = j29.a;
                    for (String str3 : strTrim.split("\\r?\\n", -1)) {
                        if (str3.startsWith("palette: ")) {
                            String[] strArrSplit = str3.substring(9).split(",", -1);
                            xa9Var.d = new int[strArrSplit.length];
                            for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                                int[] iArr = xa9Var.d;
                                try {
                                    i = Integer.parseInt(strArrSplit[i2].trim(), 16);
                                } catch (RuntimeException unused) {
                                    i = 0;
                                }
                                iArr[i2] = i;
                            }
                        } else if (str3.startsWith("size: ")) {
                            String[] strArrSplit2 = str3.substring(6).trim().split("x", -1);
                            if (strArrSplit2.length == 2) {
                                try {
                                    xa9Var.e = Integer.parseInt(strArrSplit2[0]);
                                    xa9Var.f = Integer.parseInt(strArrSplit2[1]);
                                    xa9Var.b = true;
                                } catch (RuntimeException e) {
                                    wn5.l0("VobsubParser", "Parsing IDX failed", e);
                                }
                            }
                        }
                    }
                    return o77Var;
                case "application/x-subrip":
                    return new ca8();
                case "application/ttml+xml":
                    return new it8();
            }
        }
        throw new IllegalArgumentException(dw1.n("Unsupported MIME type: ", str));
    }

    @Override // defpackage.m67
    public EncodeStrategy q(sv5 sv5Var) {
        return EncodeStrategy.a;
    }

    @Override // defpackage.ab8
    public boolean r(b bVar) {
        String str = bVar.n;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // defpackage.r12
    public boolean s(Object obj, File file, sv5 sv5Var) throws Throwable {
        try {
            lj0.d(((us2) ((ns2) ((g67) obj).get()).a.b).a.d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            t0.n("GifEncoder", "Failed to encode GIF drawable data", e);
            return false;
        }
    }

    public void t(String str) {
        js3.p(str, "msg");
        x(Level.a, str);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "Arrangement#Bottom";
            case 8:
                return "Empty";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.mb2
    public void u(Object obj) throws IOException {
        ((ParcelFileDescriptor) obj).close();
    }

    public Signature[] w(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public void x(Level level, String str) {
        js3.p(str, "msg");
        Level.e.compareTo(level);
    }

    public void y(do3 do3Var, float f) {
        ga7 ga7Var = (ga7) ((Drawable) do3Var.a);
        CardView cardView = (CardView) do3Var.b;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f != ga7Var.e || ga7Var.f != useCompatPadding || ga7Var.g != preventCornerOverlap) {
            ga7Var.e = f;
            ga7Var.f = useCompatPadding;
            ga7Var.g = preventCornerOverlap;
            ga7Var.b(null);
            ga7Var.invalidateSelf();
        }
        z(do3Var);
    }

    public void z(do3 do3Var) {
        CardView cardView = (CardView) do3Var.b;
        CardView cardView2 = (CardView) do3Var.b;
        if (!cardView.getUseCompatPadding()) {
            do3Var.D(0, 0, 0, 0);
            return;
        }
        Drawable drawable = (Drawable) do3Var.a;
        float f = ((ga7) drawable).e;
        float f2 = ((ga7) drawable).a;
        int iCeil = (int) Math.ceil(ha7.a(f, f2, cardView2.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(ha7.b(f, f2, cardView2.getPreventCornerOverlap()));
        do3Var.D(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // defpackage.h82
    public void m(Object obj) {
    }

    @Override // defpackage.vw1
    public void k(Looper looper, ee6 ee6Var) {
    }
}
