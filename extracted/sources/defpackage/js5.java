package defpackage;

import android.os.Build;
import coil3.network.okhttp.internal.a;
import ir.mservices.market.pika.home.PikaHomeFragment;
import ir.myket.movie.common.domain.common.ItemType;
import ir.myket.movie.common.domain.models.MovieType;
import ir.myket.player.domain.models.PlayerMovie;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ServiceConfigurationError;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class js5 implements bp2 {
    public final /* synthetic */ int a;

    public /* synthetic */ js5(int i) {
        this.a = i;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        ServiceConfigurationError serviceConfigurationError;
        int i = 2;
        int i2 = 1;
        int i3 = 0;
        switch (this.a) {
            case 0:
                return new a(new hs5());
            case 1:
                return new lx5();
            case 2:
                int i4 = PikaHomeFragment.a1;
                int i5 = Build.VERSION.SDK_INT;
                return i5 >= 33 ? new String[]{"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_ADVERTISE", "android.permission.BLUETOOTH_CONNECT", "android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.NEARBY_WIFI_DEVICES"} : i5 >= 31 ? new String[]{"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_ADVERTISE", "android.permission.BLUETOOTH_CONNECT", "android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.READ_EXTERNAL_STORAGE"} : new String[]{"android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN", "android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.READ_EXTERNAL_STORAGE"};
            case 3:
                ug1 ug1Var = up1.a;
                return kf1.c;
            case 4:
                ne6 ne6Var = PlayerMovie.Companion;
                return wn5.v("ir.myket.movie.common.domain.models.MovieType", MovieType.values());
            case 5:
                return new qv(rk7.a, 0);
            case 6:
                return new br5("ir.myket.player.ui.client.navkeys.PlayerNavKey.PlayerScreen", df6.INSTANCE, new Annotation[0]);
            case 7:
                List listJ0 = kotlin.collections.a.J0((List) op7.a.getValue(), new ek6(i2));
                ArrayList arrayList = new ArrayList();
                int size = listJ0.size();
                for (int i6 = 0; i6 < size; i6++) {
                    js3.n((ks5) listJ0.get(i6), "null cannot be cast to non-null type coil3.util.FetcherServiceLoaderTarget<kotlin.Any>");
                    arrayList.add(new Pair(new coil3.network.a(new js5(i3)), g27.a(h09.class)));
                }
                return arrayList;
            case 8:
                List listJ02 = kotlin.collections.a.J0((List) op7.b.getValue(), new ek6(i));
                ArrayList arrayList2 = new ArrayList();
                if (listJ02.size() <= 0) {
                    return arrayList2;
                }
                listJ02.get(0).getClass();
                throw new ClassCastException();
            case 9:
                return new qv(x25.a, 0);
            case 10:
                return new qv(rk7.a, 0);
            case 11:
                return new qv(rx6.a, 0);
            case 12:
                return new q97();
            case 13:
                return new cd7(new LinkedHashMap());
            case 14:
                u58 u58Var = hd7.a;
                return null;
            case 15:
                return new HashSet();
            case 16:
                return new tg7(0);
            case 17:
                return new qh6(g27.a(pj3.class), new Annotation[0]);
            case 18:
                return wn5.v("ir.myket.movie.common.domain.common.ItemType", ItemType.values());
            case 19:
                return new qv(d32.a, 0);
            case 20:
                s01 s01Var = cn7.a;
                return null;
            case 21:
                return new qv(b88.a, 0);
            case 22:
                return new qv(b88.a, 0);
            case 23:
                return new qv(sp7.a, 0);
            case 24:
                try {
                    return hs9.T(mo7.w(mo7.p(Arrays.asList(new ks5()).iterator())));
                } finally {
                }
            case 25:
                try {
                    return hs9.T(mo7.w(mo7.p(Arrays.asList(new ic1[0]).iterator())));
                } finally {
                }
            case 26:
                return new qv(b88.a, 0);
            case 27:
                return new qv(b88.a, 0);
            case 28:
                return new qv(b88.a, 0);
            default:
                return new it7();
        }
    }
}
