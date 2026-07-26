package ir.mservices.market.app.detail.developer.data;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.BadgeDTO;
import ir.mservices.market.version2.webapi.responsedto.PaymentRequiredBindingDto;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class AppDeveloperDto implements Serializable {

    @vo7("badge")
    private final BadgeDTO badge;

    @vo7("email")
    private final String email;

    @vo7("id")
    private final String id;

    @vo7(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @vo7(PaymentRequiredBindingDto.BINDING_PHONE)
    private final String phone;

    @vo7("website")
    private final String website;

    public AppDeveloperDto(String str, String str2, String str3, String str4, String str5, BadgeDTO badgeDTO) {
        this.id = str;
        this.email = str2;
        this.name = str3;
        this.website = str4;
        this.phone = str5;
        this.badge = badgeDTO;
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getWebsite() {
        return this.website;
    }
}
