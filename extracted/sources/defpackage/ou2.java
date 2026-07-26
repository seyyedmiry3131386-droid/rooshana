package defpackage;

import android.content.SharedPreferences;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import j$.util.Objects;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class ou2 extends lx {
    public final /* synthetic */ qu2 i;

    public ou2(qu2 qu2Var) {
        this.i = qu2Var;
    }

    @Override // defpackage.lx
    public final Object a(Object[] objArr) {
        js3.p((Void[]) objArr, "params");
        System.currentTimeMillis();
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.i.a);
            js3.o(advertisingIdInfo, "getAdvertisingIdInfo(...)");
            advertisingIdInfo.getId();
            System.currentTimeMillis();
            String id = advertisingIdInfo.getId();
            return id == null ? "" : id;
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException unused) {
            return "";
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                return "";
            }
            if (e instanceof SecurityException) {
                Locale locale = Locale.ENGLISH;
                js3.o(locale, "ENGLISH");
                String lowerCase = message.toLowerCase(locale);
                js3.o(lowerCase, "toLowerCase(...)");
                if (m88.Z(lowerCase, "attempting to read gservices without permission", false)) {
                    return "";
                }
            }
            lw.g(e, null, null);
            return "";
        }
    }

    @Override // defpackage.lx
    public final void c(Object obj) {
        String str = (String) obj;
        boolean zEquals = Objects.equals(str, "");
        qu2 qu2Var = this.i;
        if (!zEquals) {
            SharedPreferences sharedPreferences = qu2Var.a.getSharedPreferences("google_utils", 0);
            js3.o(sharedPreferences, "getSharedPreferences(...)");
            sharedPreferences.edit().putString("KEY_GOOGLE_AD_ID", str).apply();
        }
        qu2Var.b = null;
    }
}
