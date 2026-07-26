package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.compose.foundation.layout.b;
import androidx.compose.runtime.internal.a;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.h;
import androidx.compose.ui.node.m;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.gms.common.Feature;
import ir.mservices.market.movie.data.webapi.PlayerMovieDto;
import ir.mservices.market.movie.data.webapi.ShareModelDto;
import ir.mservices.market.purchaseTransaction.data.PurchaseTransactionDTO;
import ir.myket.movie.common.domain.models.MovieType;
import ir.myket.player.domain.models.PlayerMovie;
import ir.myket.player.domain.models.PlayerMovieData;
import ir.myket.player.domain.models.ShareModel;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlinx.serialization.json.internal.WriteMode;

/* JADX INFO: loaded from: classes.dex */
public abstract class y40 {
    public static ExecutorService a;
    public static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final a c = new a(-1798086475, new yf(8), false);
    public static final Object d = new Object();
    public static final Feature e = new Feature(3, "nearby_connections");
    public static final Feature f = new Feature(2, "nearby_connections_v2");
    public static final Feature g = new Feature(1, "nearby_connections_v3");
    public static final Feature h = new Feature(1, "nearby_connections_get_local_endpoint_id");
    public static final Feature i = new Feature(2, "nearby_connections_register_device_provider");
    public static final Feature j = new Feature(1, "nearby_connections_update_advertising_options");
    public static final Feature k = new Feature(1, "nearby_connections_update_connection_options");
    public static final Feature l = new Feature(1, "nearby_connections_update_discovery_options");
    public static final Feature m = new Feature(1, "nearby_connections_setting");
    public static final Feature n = new Feature(1, "nearby_connections_set_downloads_directory");
    public static final /* synthetic */ int o = 0;
    public static final /* synthetic */ int p = 0;
    public static final /* synthetic */ int q = 0;
    public static final /* synthetic */ int r = 0;

    public static final hx4 C(hx4 hx4Var, dp2 dp2Var) {
        return hx4Var.d(new rt5(dp2Var));
    }

    public static final m E(ri1 ri1Var, int i2) {
        m mVar = ((gx4) ri1Var).a.h;
        js3.m(mVar);
        if (mVar.J0() != ri1Var || !ho5.g(i2)) {
            return mVar;
        }
        m mVar2 = mVar.r;
        js3.m(mVar2);
        return mVar2;
    }

    public static final ev2 F(gx4 gx4Var) {
        return I(gx4Var).getGraphicsContext();
    }

    public static final m G(ri1 ri1Var) {
        if (!((gx4) ri1Var).a.n) {
            rn3.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        m mVarE = E(ri1Var, 2);
        if (!mVarE.J0().n) {
            rn3.b("LayoutCoordinates is not attached.");
        }
        return mVarE;
    }

    public static final h H(ri1 ri1Var) {
        m mVar = ((gx4) ri1Var).a.h;
        if (mVar != null) {
            return mVar.p;
        }
        throw t61.r("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final Owner I(ri1 ri1Var) {
        Owner owner = H(ri1Var).p;
        if (owner != null) {
            return owner;
        }
        throw t61.r("This node does not have an owner.");
    }

    public static String J(int i2) {
        Object[] objArr = {Integer.valueOf(Color.red(i2)), Integer.valueOf(Color.green(i2)), Integer.valueOf(Color.blue(i2)), Double.valueOf(((double) Color.alpha(i2)) / 255.0d)};
        String str = j29.a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public static final PlayerMovie K(PlayerMovieDto playerMovieDto) {
        Object next;
        js3.p(playerMovieDto, "<this>");
        String id = playerMovieDto.getId();
        String playId = playerMovieDto.getPlayId();
        String title = playerMovieDto.getTitle();
        String posterUrl = playerMovieDto.getPosterUrl();
        String type = playerMovieDto.getType();
        Enum r1 = MovieType.d;
        Iterator<E> it = MovieType.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (m88.T(((Enum) next).name(), type, true)) {
                break;
            }
        }
        Enum r7 = (Enum) next;
        if (r7 != null) {
            r1 = r7;
        }
        MovieType movieType = (MovieType) r1;
        ShareModelDto shareModel = playerMovieDto.getShareModel();
        return new PlayerMovie(id, playId, title, posterUrl, movieType, shareModel != null ? new ShareModel(shareModel.getUrl(), shareModel.getTitle()) : null);
    }

    public static String L(int i2) {
        return i2 == 0 ? "Clear" : i2 == 1 ? "Src" : i2 == 2 ? "Dst" : i2 == 3 ? "SrcOver" : i2 == 4 ? "DstOver" : i2 == 5 ? "SrcIn" : i2 == 6 ? "DstIn" : i2 == 7 ? "SrcOut" : i2 == 8 ? "DstOut" : i2 == 9 ? "SrcAtop" : i2 == 10 ? "DstAtop" : i2 == 11 ? "Xor" : i2 == 12 ? "Plus" : i2 == 13 ? "Modulate" : i2 == 14 ? "Screen" : i2 == 15 ? "Overlay" : i2 == 16 ? "Darken" : i2 == 17 ? "Lighten" : i2 == 18 ? "ColorDodge" : i2 == 19 ? "ColorBurn" : i2 == 20 ? "HardLight" : i2 == 21 ? "Softlight" : i2 == 22 ? "Difference" : i2 == 23 ? "Exclusion" : i2 == 24 ? "Multiply" : i2 == 25 ? "Hue" : i2 == 26 ? "Saturation" : i2 == 27 ? "Color" : i2 == 28 ? "Luminosity" : PurchaseTransactionDTO.PURCHASE_STATUS_UNKNOWN;
    }

    public static final void b(dl5 dl5Var, ExoPlayer exoPlayer, PlayerMovieData playerMovieData, qz0 qz0Var, int i2) {
        qz0Var.c0(-1242239315);
        int i3 = (qz0Var.f(dl5Var) ? 4 : 2) | i2 | (qz0Var.h(exoPlayer) ? 32 : 16) | (qz0Var.h(playerMovieData) ? 256 : 128);
        if (qz0Var.R(i3 & 1, (i3 & 147) != 146)) {
            a88 a88Var = new a88("AUDIO_PLAYER");
            qz0Var.a0(-1168520582);
            lf7 lf7VarA = oz3.a(qz0Var);
            qz0Var.a0(-1633490746);
            boolean zF = qz0Var.f(a88Var) | qz0Var.f(lf7VarA);
            Object objM = qz0Var.M();
            if (zF || objM == jz0.a) {
                objM = lf7VarA.b(g27.a(of6.class), null, a88Var);
                qz0Var.l0(objM);
            }
            qz0Var.q(false);
            qz0Var.q(false);
            int i4 = i3 << 3;
            ((of6) objM).a(b.c, dl5Var, exoPlayer, playerMovieData, qz0Var, (i4 & 112) | 6 | (i4 & 896) | (i4 & 7168));
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new kz(dl5Var, exoPlayer, playerMovieData, i2, 0);
        }
    }

    public static final void d(a aVar, qz0 qz0Var, int i2) {
        qz0Var.c0(-709502251);
        int i3 = 2;
        int i4 = 1;
        if (qz0Var.R(i2 & 1, (i2 & 3) != 2)) {
            u58 u58Var = hd7.a;
            fd7 fd7Var = (fd7) qz0Var.j(u58Var);
            cd7 cd7VarI = w07.i(qz0Var);
            Object[] objArr = {fd7Var};
            bn6 bn6Var = new bn6(new sy0(14), new m(fd7Var, cd7VarI, 27), 5);
            boolean zH = qz0Var.h(fd7Var) | qz0Var.h(cd7VarI);
            Object objM = qz0Var.M();
            if (zH || objM == jz0.a) {
                objM = new xv3(fd7Var, cd7VarI, i3);
                qz0Var.l0(objM);
            }
            c44 c44Var = (c44) o37.B(objArr, bn6Var, (bp2) objM, qz0Var, 0);
            zk8.b(u58Var.a(c44Var), s7.X(-412824043, new iz(aVar, c44Var, 11), qz0Var), qz0Var, 56);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new qf2(aVar, i2, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(defpackage.hx4 r38, defpackage.ve6 r39, androidx.compose.material3.n r40, defpackage.dl5 r41, defpackage.dp2 r42, defpackage.bp2 r43, defpackage.qz0 r44, int r45, int r46) {
        /*
            Method dump skipped, instruction units count: 690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y40.e(hx4, ve6, androidx.compose.material3.n, dl5, dp2, bp2, qz0, int, int):void");
    }

    public static final long f(float f2, float f3) {
        return (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final void g(zb5 zb5Var, gx4 gx4Var) {
        zb5 zb5VarL = H(gx4Var).L();
        int i2 = zb5VarL.c - 1;
        Object[] objArr = zb5VarL.a;
        if (i2 < objArr.length) {
            while (i2 >= 0) {
                zb5Var.b((gx4) ((h) objArr[i2]).H.g);
                i2--;
            }
        }
    }

    public static final long h(int i2, int i3, Resources resources) {
        ThreadLocal threadLocal = b77.a;
        return gu9.d(Color.parseColor(String.format("#%02x%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i3 & 255), Integer.valueOf(resources.getColor(i2, null) & 16777215)}, 2))));
    }

    public static final long i(int i2, Resources resources, float f2) {
        return y(i2, resources, f2 < 0.0f ? fq6.black : fq6.white, f2);
    }

    public static final gx4 j(zb5 zb5Var) {
        int i2;
        if (zb5Var == null || (i2 = zb5Var.c) == 0) {
            return null;
        }
        return (gx4) zb5Var.l(i2 - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final f14 k(gx4 gx4Var) {
        if ((gx4Var.c & 2) != 0) {
            if (gx4Var instanceof f14) {
                return (f14) gx4Var;
            }
            if (gx4Var instanceof ti1) {
                gx4 gx4Var2 = ((ti1) gx4Var).p;
                while (gx4Var2 != 0) {
                    if (gx4Var2 instanceof f14) {
                        return (f14) gx4Var2;
                    }
                    gx4Var2 = (!(gx4Var2 instanceof ti1) || (gx4Var2.c & 2) == 0) ? gx4Var2.f : ((ti1) gx4Var2).p;
                }
            }
        }
        return null;
    }

    public static final boolean l(l58 l58Var, int i2, o66 o66Var) {
        boolean z;
        synchronized (d) {
            int i3 = l58Var.d;
            if (i3 == i2) {
                l58Var.c = o66Var;
                z = true;
                l58Var.d = i3 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    public static void n(float f2, float[] fArr) {
        if (f2 <= 0.5f) {
            fArr[0] = 1.0f - (f2 * 2.0f);
            fArr[1] = 0.0f;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = (f2 * 2.0f) - 1.0f;
        }
    }

    public static final void p(pu3 pu3Var, yr3 yr3Var, px3 px3Var, Object obj) {
        js3.p(px3Var, "serializer");
        new n78(new xe1(yr3Var), pu3Var, WriteMode.c, new qv3[((o) WriteMode.h).a()]).g(px3Var, obj);
    }

    public static final FragmentActivity q(Context context) {
        js3.p(context, "<this>");
        if (context instanceof FragmentActivity) {
            return (FragmentActivity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        js3.o(baseContext, "getBaseContext(...)");
        return q(baseContext);
    }

    public static final hx4 r(hx4 hx4Var, qg2 qg2Var) {
        return hx4Var.d(new rg2(qg2Var));
    }

    public static synchronized Executor s() {
        try {
            if (a == null) {
                String str = j29.a;
                a = Executors.newSingleThreadExecutor(new v01("ExoPlayer:BackgroundExecutor", 1));
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    public static final Rect t(TextPaint textPaint, CharSequence charSequence, int i2, int i3) {
        int i4 = i2;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i4 - 1, i3, MetricAffectingSpan.class) != i3) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i4 < i3) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i4, i3, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i4, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        te.z(textPaint2, charSequence, i4, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i4, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i4 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            te.z(textPaint, charSequence, i4, i3, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i4, i3, rect3);
        return rect3;
    }

    public static final int u(SnapshotStateSet snapshotStateSet) {
        l58 l58Var = snapshotStateSet.a;
        js3.n(l58Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
        return ((l58) g08.h(l58Var)).d;
    }

    public static final l58 x(SnapshotStateSet snapshotStateSet) {
        l58 l58Var = snapshotStateSet.a;
        js3.n(l58Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.<get-readable>>");
        return (l58) g08.u(l58Var, snapshotStateSet);
    }

    public static final long y(int i2, Resources resources, int i3, float f2) {
        ThreadLocal threadLocal = b77.a;
        return gu9.d(sv0.b(Math.abs(f2), resources.getColor(i2, null), resources.getColor(i3, null)));
    }

    public static void z(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public abstract View A(int i2);

    public abstract boolean B();
}
