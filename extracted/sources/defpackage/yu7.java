package defpackage;

import android.app.Activity;
import android.app.RemoteAction;
import android.content.Context;
import androidx.compose.foundation.text.contextmenu.modifier.b;
import androidx.compose.material3.n;
import ir.mservices.market.movie.streamers.StreamerProfileFragment;
import ir.mservices.market.setting.themeStyle.ThemeStyleFragment;
import ir.mservices.market.social.profile.user.UserProfileHeaderFragment;
import ir.mservices.market.webview.WebViewFragment;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yu7 implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yu7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        int i;
        int i2;
        boolean z = true;
        switch (this.a) {
            case 0:
                return ((n) this.b).c;
            case 1:
                a18 a18Var = (a18) this.b;
                while (true) {
                    synchronized (a18Var.g) {
                        try {
                            if (!a18Var.c) {
                                a18Var.c = z;
                                try {
                                    zb5 zb5Var = a18Var.f;
                                    Object[] objArr = zb5Var.a;
                                    int i3 = zb5Var.c;
                                    int i4 = 0;
                                    while (i4 < i3) {
                                        z08 z08Var = (z08) objArr[i4];
                                        sb5 sb5Var = z08Var.g;
                                        dp2 dp2Var = z08Var.a;
                                        Object[] objArr2 = sb5Var.b;
                                        long[] jArr = sb5Var.a;
                                        int length = jArr.length - 2;
                                        if (length >= 0) {
                                            int i5 = 0;
                                            while (true) {
                                                long j = jArr[i5];
                                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                                                    int i7 = 0;
                                                    while (i7 < i6) {
                                                        if ((j & 255) < 128) {
                                                            i2 = i3;
                                                            dp2Var.invoke(objArr2[(i5 << 3) + i7]);
                                                        } else {
                                                            i2 = i3;
                                                        }
                                                        j >>= 8;
                                                        i7++;
                                                        i3 = i2;
                                                    }
                                                    i = i3;
                                                    if (i6 == 8) {
                                                    }
                                                } else {
                                                    i = i3;
                                                }
                                                if (i5 != length) {
                                                    i5++;
                                                    i3 = i;
                                                }
                                            }
                                        } else {
                                            i = i3;
                                        }
                                        sb5Var.e();
                                        i4++;
                                        i3 = i;
                                    }
                                    a18Var.c = false;
                                } catch (Throwable th) {
                                    a18Var.c = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (!a18Var.c()) {
                        return tx8.a;
                    }
                    z = true;
                }
                break;
            case 2:
                StreamerProfileFragment streamerProfileFragment = (StreamerProfileFragment) this.b;
                int i8 = StreamerProfileFragment.s1;
                return Boolean.valueOf(streamerProfileFragment.K().getBoolean(yp6.movie_detail_tablet));
            case 3:
                tf8 tf8Var = (tf8) this.b;
                tf8Var.D = null;
                t17.f(tf8Var);
                zk8.J(tf8Var);
                rf0.z(tf8Var);
                return Boolean.TRUE;
            case 4:
                u96.d((RemoteAction) this.b);
                return tx8.a;
            case 5:
                pg8 pg8Var = (pg8) this.b;
                return pg8Var.n ? b.a(pg8Var) : zf8.b;
            case 6:
                return (bi8) this.b;
            case 7:
                fj8 fj8Var = (fj8) this.b;
                fj8Var.z = null;
                t17.f(fj8Var);
                zk8.J(fj8Var);
                rf0.z(fj8Var);
                return Boolean.TRUE;
            case 8:
                ThemeStyleFragment themeStyleFragment = (ThemeStyleFragment) this.b;
                int i9 = ThemeStyleFragment.Z0;
                return Integer.valueOf(themeStyleFragment.K().getInteger(ds6.theme_style_max_span));
            case 9:
                UserProfileHeaderFragment userProfileHeaderFragment = (UserProfileHeaderFragment) this.b;
                int i10 = UserProfileHeaderFragment.Z0;
                return userProfileHeaderFragment.r0();
            case 10:
                j49 j49Var = (j49) this.b;
                return BigInteger.valueOf(j49Var.a).shiftLeft(32).or(BigInteger.valueOf(j49Var.b)).shiftLeft(32).or(BigInteger.valueOf(j49Var.c));
            case 11:
                bn6 bn6Var = (bn6) this.b;
                return new wj8((Context) bn6Var.b, (lu7) bn6Var.c);
            case 12:
                Activity activity2 = (Activity) this.b;
                return Boolean.valueOf(!(activity2 != null && activity2.isChangingConfigurations()));
            default:
                WebViewFragment webViewFragment = (WebViewFragment) this.b;
                int i11 = WebViewFragment.c1;
                Context contextH = webViewFragment.H();
                hh2.H(new hh2(contextH, contextH != null ? contextH.getString(rs6.uncatchable_intent) : null));
                return tx8.a;
        }
    }
}
