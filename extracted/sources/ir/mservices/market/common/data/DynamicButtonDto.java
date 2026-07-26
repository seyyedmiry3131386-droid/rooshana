package ir.mservices.market.common.data;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class DynamicButtonDto implements Serializable {

    @vo7(PackageListMetaDataDTO.KEY_ACTION)
    private final String action;

    @vo7("animationUrl")
    private final String animationUrl;

    @vo7("iconUrl")
    private final String iconUrl;

    @vo7("id")
    private final String id;

    @vo7(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    public DynamicButtonDto(String str, String str2, String str3, String str4, String str5) {
        js3.p(str4, PackageListMetaDataDTO.KEY_ACTION);
        this.id = str;
        this.iconUrl = str2;
        this.name = str3;
        this.action = str4;
        this.animationUrl = str5;
    }

    public final String getAction() {
        return this.action;
    }

    public final String getAnimationUrl() {
        return this.animationUrl;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }
}
