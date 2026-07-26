package ir.mservices.market.appDetail;

import defpackage.js3;
import ir.mservices.market.app.detail.data.AppDataDto;
import ir.mservices.market.app.detail.data.AppRateDto;
import ir.mservices.market.app.detail.data.ApplicationFullDto;
import ir.mservices.market.common.data.ForceUpdateDto;
import ir.mservices.market.version2.webapi.responsedto.InCompleteReviewDto;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ToolbarData implements Serializable {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final long f;
    public final boolean g;
    public final String h;
    public final float i;
    public final Boolean j;
    public final Boolean k;
    public final Boolean l;
    public final ForceUpdateDto m;
    public final String n;
    public final String o;

    public /* synthetic */ ToolbarData(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, 0, 0L, false, null, 0.0f, null, null, null, null, null, null);
    }

    public ToolbarData(String str, String str2, String str3, String str4, int i, long j, boolean z, String str5, float f, Boolean bool, Boolean bool2, Boolean bool3, ForceUpdateDto forceUpdateDto, String str6, String str7) {
        js3.p(str4, "refId");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = j;
        this.g = z;
        this.h = str5;
        this.i = f;
        this.j = bool;
        this.k = bool2;
        this.l = bool3;
        this.m = forceUpdateDto;
        this.n = str6;
        this.o = str7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ToolbarData(ApplicationFullDto applicationFullDto, String str, String str2, String str3) {
        Boolean hasPatch;
        Boolean hasMain;
        js3.p(applicationFullDto, "app");
        js3.p(str, "refId");
        js3.p(str2, "installCallbackUrl");
        js3.p(str3, "callbackUrl");
        String packageName = applicationFullDto.getPackageName();
        String url = applicationFullDto.getIcon().getUrl();
        String title = applicationFullDto.getTitle();
        int code = applicationFullDto.getVersion().getCode();
        long length = applicationFullDto.getSize().getLength();
        boolean zIsIncompatible = applicationFullDto.getVersion().isIncompatible();
        String buttonText = applicationFullDto.getButtonText();
        AppRateDto rate = applicationFullDto.getRate();
        float total = rate != null ? rate.getTotal() : 0.0f;
        Boolean boolValueOf = Boolean.valueOf(applicationFullDto.getPrice().isFree());
        AppDataDto appData = applicationFullDto.getAppData();
        boolean zBooleanValue = false;
        Boolean boolValueOf2 = Boolean.valueOf((appData == null || (hasMain = appData.getHasMain()) == null) ? false : hasMain.booleanValue());
        AppDataDto appData2 = applicationFullDto.getAppData();
        if (appData2 != null && (hasPatch = appData2.getHasPatch()) != null) {
            zBooleanValue = hasPatch.booleanValue();
        }
        Boolean boolValueOf3 = Boolean.valueOf(zBooleanValue);
        applicationFullDto.getCategoryName();
        this(packageName, url, title, str, code, length, zIsIncompatible, buttonText, total, boolValueOf, boolValueOf2, boolValueOf3, applicationFullDto.getForceUpdate(), str2, str3);
    }

    public ToolbarData(InCompleteReviewDto inCompleteReviewDto) {
        this(inCompleteReviewDto.getPackageName(), inCompleteReviewDto.getIconPath(), inCompleteReviewDto.getTitle(), "ReviewIncomplete");
    }
}
