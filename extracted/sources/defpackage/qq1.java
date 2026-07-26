package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.foundation.gestures.d;
import androidx.compose.foundation.lazy.b;
import androidx.compose.material3.e;
import androidx.room.a;
import ir.mservices.market.download.common.data.DownloadUrlDto;
import ir.mservices.market.social.level.data.LevelDetailDto;
import ir.mservices.market.views.DownloadProgressBar;
import ir.myket.movie.common.domain.models.EpisodeBannerType;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qq1 implements bp2 {
    public final /* synthetic */ int a;

    public /* synthetic */ qq1(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [c24, java.lang.Object] */
    @Override // defpackage.bp2
    public final Object invoke() {
        Class<?> returnType;
        int i = 1;
        switch (this.a) {
            case 0:
                Iterable iterable = (Iterable) mb9.b.a.getValue();
                ArrayList arrayList = new ArrayList(wu0.V(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    String lowerCase = f88.J0((String) it.next()).toString().toLowerCase(Locale.ROOT);
                    js3.o(lowerCase, "toLowerCase(...)");
                    arrayList.add(lowerCase);
                }
                return new HashSet(arrayList);
            case 1:
                int i2 = DownloadProgressBar.c;
                return Boolean.TRUE;
            case 2:
                return DownloadUrlDto.getPostInstall$lambda$0();
            case 3:
                return DownloadUrlDto.getPreInstall$lambda$0();
            case 4:
                float f = d.a;
                return Boolean.TRUE;
            case 5:
                return new Handler(Looper.getMainLooper());
            case 6:
                return wn5.v("ir.myket.movie.common.domain.models.EpisodeBannerType", EpisodeBannerType.values());
            case 7:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 8:
                try {
                    Method method = (Method) oo2.c.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class<?> cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 9:
                ug1 ug1Var = up1.a;
                return sg4.a.f;
            case 10:
                return (aw6) r29.a.getValue();
            case 11:
                try {
                    Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                    declaredField.setAccessible(true);
                    Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                    declaredField2.setAccessible(true);
                    Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                    declaredField3.setAccessible(true);
                    return new fj3(declaredField3, declaredField, declaredField2);
                } catch (NoSuchFieldException unused3) {
                    return ej3.a;
                }
            case 12:
                s01 s01Var = qm3.a;
                return de1.a;
            case 13:
                u58 u58Var = xo3.a;
                return null;
            case 14:
                pc3 pc3Var = e.a;
                return Boolean.TRUE;
            case 15:
                return new au1(48);
            case 16:
                return new ts3(i);
            case 17:
                return tx8.a;
            case 18:
                return lw3.b;
            case 19:
                return aw3.b;
            case 20:
                return vv3.b;
            case 21:
                return fw3.b;
            case 22:
                return xu3.b;
            case 23:
                mz3 mz3Var = eq.B;
                if (mz3Var != null) {
                    return new zy0(mz3Var, new qq1(26));
                }
                throw new IllegalStateException("KoinApplication has not been started");
            case 24:
                mz3 mz3Var2 = eq.B;
                if (mz3Var2 != null) {
                    return new zy0((lf7) mz3Var2.c.e, new qq1(25));
                }
                throw new IllegalStateException("KoinApplication has not been started");
            case 25:
                mz3 mz3Var3 = eq.B;
                if (mz3Var3 != null) {
                    return (lf7) mz3Var3.c.e;
                }
                throw new IllegalStateException("KoinApplication has not been started");
            case 26:
                mz3 mz3Var4 = eq.B;
                if (mz3Var4 != null) {
                    return mz3Var4;
                }
                throw new IllegalStateException("KoinApplication has not been started");
            case 27:
                return new b(0, 0);
            case 28:
                return LevelDetailDto._childSerializers$_anonymous_();
            default:
                u58 u58Var2 = nb4.a;
                return ww.a;
        }
    }

    public /* synthetic */ qq1(a aVar) {
        this.a = 17;
    }
}
