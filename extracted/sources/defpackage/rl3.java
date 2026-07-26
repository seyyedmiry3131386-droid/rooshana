package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.compose.ui.window.PopupLayout;
import androidx.core.widget.NestedScrollView;
import com.bumptech.glide.load.DataSource;
import io.sentry.android.core.t0;
import ir.mservices.market.movie.ui.search.result.MovieSearchRecyclerListFragment;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.Protocol;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public class rl3 implements h32, ax2, wm4, lr8, rr5, fx8, cl6, RequestDTO, f82, mg7, as5, im5 {
    public static MovieSearchRecyclerListFragment A(String str, String str2, String str3) {
        int i = MovieSearchRecyclerListFragment.b1;
        MovieSearchRecyclerListFragment movieSearchRecyclerListFragment = new MovieSearchRecyclerListFragment();
        Bundle bundle = new Bundle();
        bundle.putString("BUNDLE_KEY_QUERY", str);
        bundle.putString("BUNDLE_KEY_QUERY_SOURCE", str2);
        if (str3 != null) {
            bundle.putString("BUNDLE_KEY_TAB", str3);
        }
        movieSearchRecyclerListFragment.u0(bundle);
        return movieSearchRecyclerListFragment;
    }

    public static ArrayList u(List list) {
        js3.p(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Protocol) obj) != Protocol.c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Protocol) it.next()).a);
        }
        return arrayList2;
    }

    public static byte[] w(List list) {
        js3.p(list, "protocols");
        gh0 gh0Var = new gh0();
        for (String str : u(list)) {
            gh0Var.R0(str.length());
            gh0Var.h1(str);
        }
        return gh0Var.P(gh0Var.b);
    }

    public static s26 x(String str) {
        js3.p(str, "<this>");
        ByteString byteString = c.a;
        gh0 gh0Var = new gh0();
        gh0Var.h1(str);
        return c.d(gh0Var, false);
    }

    public static Protocol y(String str) throws IOException {
        Protocol protocol = Protocol.c;
        if (str.equals("http/1.0")) {
            return protocol;
        }
        Protocol protocol2 = Protocol.d;
        if (str.equals("http/1.1")) {
            return protocol2;
        }
        Protocol protocol3 = Protocol.g;
        if (str.equals("h2_prior_knowledge")) {
            return protocol3;
        }
        Protocol protocol4 = Protocol.f;
        if (str.equals("h2")) {
            return protocol4;
        }
        Protocol protocol5 = Protocol.e;
        if (str.equals("spdy/3.1")) {
            return protocol5;
        }
        Protocol protocol6 = Protocol.h;
        if (str.equals("quic")) {
            return protocol6;
        }
        Protocol protocol7 = Protocol.i;
        if (m88.Z(str, "h3", false)) {
            return protocol7;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public static s26 z(File file) {
        String str = s26.b;
        String string = file.toString();
        js3.o(string, "toString(...)");
        return x(string);
    }

    @Override // defpackage.ax2
    public boolean b(dy7 dy7Var) {
        no1 no1Var = dy7Var.a;
        if ((no1Var instanceof lo1 ? ((lo1) no1Var).a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        no1 no1Var2 = dy7Var.b;
        return (no1Var2 instanceof lo1 ? ((lo1) no1Var2).a : Integer.MAX_VALUE) > 100;
    }

    @Override // defpackage.wm4
    public MediaCodecInfo c(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // defpackage.as5
    public long d(w72 w72Var) {
        return -1L;
    }

    @Override // defpackage.lr8
    public ir8 e(DataSource dataSource) {
        return ao5.a;
    }

    @Override // defpackage.cl6
    public void f(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            t0.e("ProfileInstaller", str, (Throwable) obj);
        }
    }

    @Override // defpackage.f82
    public Object g() {
        try {
            return new bc7(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.wm4
    public boolean i(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // defpackage.h32
    public void j(Serializable serializable) {
        lw.g((SQLException) serializable, "Cannot load unread messages from inbox database", null);
    }

    @Override // defpackage.as5
    public kl7 m() {
        return new x30(-9223372036854775807L);
    }

    @Override // defpackage.ax2
    public boolean n() {
        boolean z;
        synchronized (hb2.a) {
            try {
                int i = hb2.c;
                hb2.c = i + 1;
                if (i >= 30 || SystemClock.uptimeMillis() > hb2.d + ((long) 30000)) {
                    hb2.c = 0;
                    hb2.d = SystemClock.uptimeMillis();
                    String[] list = hb2.b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    hb2.e = list.length < 800;
                }
                z = hb2.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.wm4
    public boolean o(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // defpackage.wm4
    public int p() {
        return MediaCodecList.getCodecCount();
    }

    @Override // defpackage.wm4
    public boolean s() {
        return false;
    }

    public float v(float f) {
        return 1.0f;
    }

    @Override // defpackage.fx8
    public void a() {
    }

    @Override // defpackage.fx8
    public void k() {
    }

    @Override // defpackage.rr5
    public int h(int i) {
        return i;
    }

    @Override // defpackage.im5
    public void l(NestedScrollView nestedScrollView) {
    }

    @Override // defpackage.rr5
    public int q(int i) {
        return i;
    }

    @Override // defpackage.as5
    public void t(long j) {
    }

    public void B(PopupLayout popupLayout, int i, int i2) {
    }

    @Override // defpackage.mg7
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }

    @Override // defpackage.mg7
    public void r(int i, int i2, boolean z, int i3) {
    }
}
